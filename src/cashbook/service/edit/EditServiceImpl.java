package cashbook.service.edit;

import static cashbook.util.Const.*;

import java.util.LinkedHashMap;
import java.util.Map;

import cashbook.dao.common.CommonDao;
import cashbook.dao.edit.EditDao;
import cashbook.dto.common.LoginDto;
import cashbook.dto.edit.AnswerDto;
import cashbook.dto.edit.EditDto;
import cashbook.dto.edit.QuestionDto;
import cashbook.util.CommonUtil;
import cashbook.util.EditConst;
import cashbook.util.TeacherMenuConst;

public class EditServiceImpl implements EditService {

	/** 登録・更新Dao */
	private EditDao editDao;

	/** 共通Dao */
	private CommonDao commonDao;

	/**
	 * 共通Daoを設定します。
	 * @param commonDao
	 */
	public void setCommonDao(CommonDao commonDao) {
		this.commonDao = commonDao;
	}

	/**
	 * 登録・更新Daoを設定します。
	 * @param editDao
	 */
	public void setEditDao(EditDao editDao) {
		this.editDao = editDao;
	}

	/**
	 * 登録・更新画面(更新モード)の初期表示を行う。
	 * @return 更新対象の問題・解答
	 */
	public EditDto updateInit(Map<String, Object> formMap) {

		// 選択された問題IDを取得
		String questionId = CommonUtil.getStr(formMap.get(TeacherMenuConst.VIEW_TEACHER_QUESTION_ID));

		// 選択された問題IDの問題と解答解説を取得
		var dbResult = editDao.findQuestionAnswer(questionId);

		EditDto dto = new EditDto();

		// Javaの分類を取得
		dto.setCategoryJava(editDao.getJavaCategory());
		// SQLの分類を取得
		dto.setCategorySql(editDao.getSQLCategory());
		// どの選択肢が正解かを選択するドロップダウンに値を設定
		var answerDropDown = new LinkedHashMap<String, String>();
		answerDropDown.put("a", "a");
		answerDropDown.put("b", "b");
		answerDropDown.put("c", "c");
		answerDropDown.put("d", "d");
		dto.setAnswer(answerDropDown);

		// テーブルから取得した情報をDTOの各項目に設定
		dto.setQuestionId(dbResult.get("QUESTION_ID"));
		dto.setAnswerId(dbResult.get("ANSWER_ID"));
		if (dbResult.get("SUBJECT").equals(SUBJECT_JAVA)) {
			dto.setSubject(SELECT_JAVA_ON);
			dto.setCategoryKeyJava(dbResult.get("CATEGORY_ID"));
		} else {
			dto.setSubject(SELECT_SQL_ON);
			dto.setCategoryKeySql(dbResult.get("CATEGORY_ID"));
		}
		dto.setQuestionTitle(dbResult.get("QUESTION_TITLE"));
		dto.setQuestion(dbResult.get("QUESTION"));
		dto.setSentakuA(dbResult.get("SENTAKU_A"));
		dto.setSentakuB(dbResult.get("SENTAKU_B"));
		dto.setSentakuC(dbResult.get("SENTAKU_C"));
		dto.setSentakuD(dbResult.get("SENTAKU_D"));
		dto.setAnswerKey(dbResult.get("ANSWER"));
		dto.setKaisetsu(dbResult.get("KAISETSU"));

		return dto;
	}

	/**
	 * 登録・更新画面(登録モード)の初期表示を行う。
	 * @return 初期値が格納されたDTO
	 */
	public EditDto registInit(Map<String, Object> formMap) {

		EditDto dto = new EditDto();

		// 教科のラジオボタンで、Javaが選択されているように設定
		dto.setSubject(SELECT_JAVA_ON);

		// Javaの分類を取得
		dto.setCategoryJava(editDao.getJavaCategory());
		// SQLの分類を取得
		dto.setCategorySql(editDao.getSQLCategory());

		// どの選択肢が正解かを選択するドロップダウンに値を設定
		var answerDropDown = new LinkedHashMap<String, String>();
		answerDropDown.put("a", "a");
		answerDropDown.put("b", "b");
		answerDropDown.put("c", "c");
		answerDropDown.put("d", "d");
		dto.setAnswer(answerDropDown);

		return dto;
	}

	/**
	 * 問題と解答解説を登録する
	 * @param formMap
	 * @param loginDto
	 */
	public void registQuestionAnswer(Map<String, Object> formMap, LoginDto loginDto) {

		try {

			// セーブポイントを作成
			commonDao.savePoint();

			// 解答解説マスタにロックをかける
			commonDao.lockTable("MST_ANSWER");
			// 問題マスタにロックをかける
			commonDao.lockTable("MST_QUESTION");

			//
			// 登録可能な解答解説IDを検索
			//
			int countAns = 0;
			do {
				countAns++;
			} while (editDao.isExistAnswerId(countAns));
			String answerId = "A" + (editDao.getAnswerCount() + countAns);

			//
			// 登録可能な問題IDを検索
			//
			int countQuestion = 0;
			do {
				countQuestion++;
			} while (editDao.isExistQuestionId(countQuestion));
			String questionId = "Q" + (editDao.getQuestionCount() + countQuestion);

			//
			// 解答解説マスタ登録用の値を設定
			//
			AnswerDto answerDto = new AnswerDto();
			// 解答解説ID
			answerDto.setAnswerId(answerId);
			// 解答
			answerDto.setAnswer(CommonUtil.getStr(formMap.get(EditConst.KEY_ANSWER_KEY_EDIT)));
			// 解説
			String kaisetuForm = CommonUtil.getStr(formMap.get(EditConst.KEY_KAISETSU_EDIT));
			answerDto.setKaisetsu(CommonUtil.addQuotation(kaisetuForm));
			// 登録ユーザ
			answerDto.setInsUser(loginDto.getUserId());

			String categoryId = "";
			if (CommonUtil.getStr(formMap.get(EditConst.KEY_SUBJECT_EDIT)).equals(SELECT_JAVA_ON)) {
				categoryId = CommonUtil.getStr(formMap.get(EditConst.KEY_CATEGORY_KEY_JAVA_EDIT));
			} else if (CommonUtil.getStr(formMap.get(EditConst.KEY_SUBJECT_EDIT)).equals(SELECT_SQL_ON)) {
				categoryId = CommonUtil.getStr(formMap.get(EditConst.KEY_CATEGORY_KEY_SQL_EDIT));
			}

			// 問題マスタ登録用の値を設定
			QuestionDto questionDto = new QuestionDto();
			// 問題ID
			questionDto.setQuestionId(questionId);
			// 分類ID
			questionDto.setCategoryId(categoryId);
			// 解答解説ID
			questionDto.setAnswerId(answerDto.getAnswerId());
			// 問題タイトル
			String questionTitleForm = CommonUtil.getStr(formMap.get(EditConst.KEY_QUESTIONTITLE_EDIT));
			questionDto.setQuestionTitle(CommonUtil.addQuotation(questionTitleForm));
			// 問題
			String question = CommonUtil.getStr(formMap.get(EditConst.KEY_QUESTIO_EDIT));
			questionDto.setQuestion(CommonUtil.addQuotation(question));
			// 選択肢A
			String sentakuA = CommonUtil.getStr(formMap.get(EditConst.KEY_SENTAKU_A_EDIT));
			questionDto.setSentakuA(CommonUtil.addQuotation(sentakuA));
			// 選択肢B
			String sentakuB = CommonUtil.getStr(formMap.get(EditConst.KEY_SENTAKU_B_EDIT));
			questionDto.setSentakuB(CommonUtil.addQuotation(sentakuB));
			// 選択肢C
			String sentakuC = CommonUtil.getStr(formMap.get(EditConst.KEY_SENTAKU_C_EDIT));
			questionDto.setSentakuC(CommonUtil.addQuotation(sentakuC));
			// 選択肢D
			String sentakuD = CommonUtil.getStr(formMap.get(EditConst.KEY_SENTAKU_D_EDIT));
			questionDto.setSentakuD(CommonUtil.addQuotation(sentakuD));
			// 登録ユーザ
			questionDto.setInsUser(loginDto.getUserId());

			//
			// 解答解説マスタに登録
			//
			editDao.registAnswer(answerDto);

			//
			// 問題マスタに登録
			//
			editDao.registQuestion(questionDto);

			// 処理をコミット
			commonDao.commit();

		} catch (Exception e) {

			// 処理をロールバック
			commonDao.rollback();

		}

	}

	/**
	 * 問題と解答解説を更新する
	 * @param formMap
	 * @param loginDto
	 */
	public void updateQuestionAnswer(Map<String, Object> formMap, LoginDto loginDto) {

		try {

			// セーブポイントを作成
			commonDao.savePoint();

			// 解答解説マスタにロックをかける
			commonDao.lockTable("MST_ANSWER");
			// 問題マスタにロックをかける
			commonDao.lockTable("MST_QUESTION");

			//
			// 解答解説マスタ登録用の値を設定
			//
			AnswerDto answerDto = new AnswerDto();
			// 解答解説ID
			answerDto.setAnswerId(CommonUtil.getStr(formMap.get(EditConst.KEY_ANSWER_ID_EDIT)));
			// 解答
			String answerForm = CommonUtil.getStr(formMap.get(EditConst.KEY_ANSWER_KEY_EDIT));
			answerDto.setAnswer(CommonUtil.addQuotation(answerForm));
			// 解説
			String kaisetuForm = CommonUtil.getStr(formMap.get(EditConst.KEY_KAISETSU_EDIT));
			answerDto.setKaisetsu(CommonUtil.addQuotation(kaisetuForm));
			// 更新ユーザ
			answerDto.setUpdUser(loginDto.getUserId());

			//
			// 問題マスタ登録用の値を設定
			//
			QuestionDto questionDto = new QuestionDto();
			// 問題ID
			questionDto.setQuestionId(CommonUtil.getStr(formMap.get(EditConst.KEY_QUESTION_ID_EDIT)).trim());
			// 解答解説ID
			questionDto.setAnswerId(answerDto.getAnswerId());
			// 分類ID
			if (CommonUtil.getStr(formMap.get(EditConst.KEY_SUBJECT_EDIT)).equals(SELECT_JAVA_ON)) {
				questionDto.setCategoryId(CommonUtil.getStr(formMap.get(EditConst.KEY_CATEGORY_KEY_JAVA_EDIT)));
			} else {
				questionDto.setCategoryId(CommonUtil.getStr(formMap.get(EditConst.KEY_CATEGORY_KEY_SQL_EDIT)));
			}
			// 問題タイトル
			String questionTitleForm = CommonUtil.getStr(formMap.get(EditConst.KEY_QUESTIONTITLE_EDIT));
			questionDto.setQuestionTitle(CommonUtil.addQuotation(questionTitleForm));
			// 問題
			String question = CommonUtil.getStr(formMap.get(EditConst.KEY_QUESTIO_EDIT));
			questionDto.setQuestion(CommonUtil.addQuotation(question));
			// 選択肢A
			String sentakuA = CommonUtil.getStr(formMap.get(EditConst.KEY_SENTAKU_A_EDIT));
			questionDto.setSentakuA(CommonUtil.addQuotation(sentakuA));
			// 選択肢B
			String sentakuB = CommonUtil.getStr(formMap.get(EditConst.KEY_SENTAKU_B_EDIT));
			questionDto.setSentakuB(CommonUtil.addQuotation(sentakuB));
			// 選択肢C
			String sentakuC = CommonUtil.getStr(formMap.get(EditConst.KEY_SENTAKU_C_EDIT));
			questionDto.setSentakuC(CommonUtil.addQuotation(sentakuC));
			// 選択肢D
			String sentakuD = CommonUtil.getStr(formMap.get(EditConst.KEY_SENTAKU_D_EDIT));
			questionDto.setSentakuD(CommonUtil.addQuotation(sentakuD));
			// 更新ユーザ
			questionDto.setUpdUser(loginDto.getUserId());

			//
			// 解答解説マスタを更新
			//
			editDao.updateAnswer(answerDto);

			//
			// 問題マスタを更新
			//
			editDao.updateQuestion(questionDto);

			// 処理をコミット
			commonDao.commit();

		} catch (Exception e) {

			// 処理をロールバック
			commonDao.rollback();

		}

	}
}
