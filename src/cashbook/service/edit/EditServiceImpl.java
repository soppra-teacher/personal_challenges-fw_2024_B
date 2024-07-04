package cashbook.service.edit;

import static cashbook.util.Const.*;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

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
	private TransactionTemplate transactionTemplate;

	/**
	 * 登録・更新Daoを設定します。
	 * @param editDao
	 */
	public void setEditDao(EditDao editDao) {
		this.editDao = editDao;
	}

	/**
	 * トランザクションDAOを設定します。
	 * @param transactionTemplate
	 */
	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}

	/**
	 * 登録・更新画面の初期表示を行う。
	 * @param formMap
	 * @return EditDto 初期値が格納されたDTO
	 */
	public EditDto InsUpdInit(Map<String, Object> formMap) {

		// 選択された問題IDを取得
		String questionId = CommonUtil.getStr(formMap.get(TeacherMenuConst.VIEW_TEACHER_QUESTION_ID));

		EditDto dto = new EditDto();

		if (CommonUtil.isNull(questionId)) {

			//
			//	登録モード
			//

			// 教科のラジオボタンで、Javaが選択されているように設定
			dto.setSubject(SELECT_JAVA_ON);

		} else {

			//
			//	更新モード
			//

			// 選択された問題IDの問題と解答解説を取得
			Map<String, String> dbResult = editDao.findQuestionAnswer(questionId);

			// 抽出データが無い場合はNULLを返却
			if (dbResult.size() < 1) {
				return null;
			}

			//
			// 問題マスタ、分類マスタ、解答解説マスタから取得した情報をDTOの各項目に設定
			//

			// 問題ID
			dto.setQuestionId(dbResult.get("QUESTION_ID"));
			// 解答ID
			dto.setAnswerId(dbResult.get("ANSWER_ID"));
			// 分類
			if (dbResult.get("SUBJECT").equals(SUBJECT_JAVA)) {
				//
				// 教科ラジオボタンでJavaが選択された場合
				//
				dto.setSubject(SELECT_JAVA_ON);
				dto.setCategoryKeyJava(dbResult.get("CATEGORY_ID"));
			} else {
				//
				// 教科ラジオボタンでSQLが選択された場合
				//
				dto.setSubject(SELECT_SQL_ON);
				dto.setCategoryKeySql(dbResult.get("CATEGORY_ID"));
			}
			// 問題タイトル
			dto.setQuestionTitle(dbResult.get("QUESTION_TITLE"));
			// 問題
			dto.setQuestion(dbResult.get("QUESTION"));
			// 選択肢A
			dto.setSentakuA(dbResult.get("SENTAKU_A"));
			// 選択肢B
			dto.setSentakuB(dbResult.get("SENTAKU_B"));
			// 選択肢C
			dto.setSentakuC(dbResult.get("SENTAKU_C"));
			// 選択肢D
			dto.setSentakuD(dbResult.get("SENTAKU_D"));
			// 解答
			dto.setAnswerKey(dbResult.get("ANSWER"));
			// 解説
			dto.setKaisetsu(dbResult.get("KAISETSU"));

		}

		// 分類と解答ドロップダウンの値を設定
		setCategoryAndAnswer(dto);

		return dto;

	}

	/**
	 * 問題と解答解説を登録する
	 * @param formMap
	 * @param loginDto
	 */
	public void registQuestionAnswer(Map<String, Object> formMap, LoginDto loginDto) throws Exception {

		//
		//	トランザクションで登録処理を実行
		//
		transactionTemplate.execute(new TransactionCallbackWithoutResult() {

			@Override
			protected void doInTransactionWithoutResult(TransactionStatus arg0) {

				// 問題マスタにロックをかける
				editDao.lockMstQuestion();
				// 解答解説マスタにロックをかける
				editDao.lockMstAnswer();

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
				// 解答解説マスタ登録用に値を設定
				//
				AnswerDto answerDto = new AnswerDto();
				// 解答解説ID
				answerDto.setAnswerId(answerId);
				// 解答
				answerDto.setAnswer(CommonUtil.getStr(formMap.get(EditConst.KEY_ANSWER_KEY_EDIT)));
				// 解説
				String kaisetuForm = CommonUtil.getStr(formMap.get(EditConst.KEY_KAISETSU_EDIT));
				answerDto.setKaisetsu(CommonUtil.escapeQuotation(kaisetuForm));
				// 登録ユーザ
				answerDto.setInsUser(loginDto.getUserId());

				//
				// 問題マスタ登録用の値を設定
				//
				QuestionDto questionDto = new QuestionDto();
				// 問題ID
				questionDto.setQuestionId(questionId);
				// 解答解説ID
				questionDto.setAnswerId(answerId);
				// 分類ID
				if (CommonUtil.getStr(formMap.get(EditConst.KEY_SUBJECT_EDIT)).equals(SELECT_JAVA_ON)) {
					//
					// 教科ラジオボタンでJavaが選択された場合
					//
					// 選択されたJavaの分類を設定
					questionDto.setCategoryId(CommonUtil.getStr(formMap.get(EditConst.KEY_CATEGORY_KEY_JAVA_EDIT)));

				} else if (CommonUtil.getStr(formMap.get(EditConst.KEY_SUBJECT_EDIT)).equals(SELECT_SQL_ON)) {
					//
					// 教科ラジオボタンでSQLが選択された場合
					//
					// 選択されたSQLの分類を設定
					questionDto.setCategoryId(CommonUtil.getStr(formMap.get(EditConst.KEY_CATEGORY_KEY_SQL_EDIT)));
				}
				// 問題タイトル
				String questionTitleForm = CommonUtil.getStr(formMap.get(EditConst.KEY_QUESTIONTITLE_EDIT));
				questionDto.setQuestionTitle(CommonUtil.escapeQuotation(questionTitleForm));
				// 問題
				String question = CommonUtil.getStr(formMap.get(EditConst.KEY_QUESTIO_EDIT));
				questionDto.setQuestion(CommonUtil.escapeQuotation(question));
				// 選択肢A
				String sentakuA = CommonUtil.getStr(formMap.get(EditConst.KEY_SENTAKU_A_EDIT));
				questionDto.setSentakuA(CommonUtil.escapeQuotation(sentakuA));
				// 選択肢B
				String sentakuB = CommonUtil.getStr(formMap.get(EditConst.KEY_SENTAKU_B_EDIT));
				questionDto.setSentakuB(CommonUtil.escapeQuotation(sentakuB));
				// 選択肢C
				String sentakuC = CommonUtil.getStr(formMap.get(EditConst.KEY_SENTAKU_C_EDIT));
				questionDto.setSentakuC(CommonUtil.escapeQuotation(sentakuC));
				// 選択肢D
				String sentakuD = CommonUtil.getStr(formMap.get(EditConst.KEY_SENTAKU_D_EDIT));
				questionDto.setSentakuD(CommonUtil.escapeQuotation(sentakuD));
				// 登録ユーザ
				questionDto.setInsUser(loginDto.getUserId());

				//
				//	登録処理
				//

				// 解答解説マスタに登録
				editDao.registAnswer(answerDto);
				// 問題マスタに登録
				editDao.registQuestion(questionDto);

			}
		});

	}

	/**
	 * 問題と解答解説を更新する
	 * @param formMap
	 * @param loginDto
	 */
	public void updateQuestionAnswer(Map<String, Object> formMap, LoginDto loginDto) throws Exception {

		//
		//	トランザクションで更新処理を実行
		//
		transactionTemplate.execute(new TransactionCallbackWithoutResult() {

			@Override
			protected void doInTransactionWithoutResult(TransactionStatus arg0) {

				// 問題マスタにロックをかける
				editDao.lockMstQuestion();
				// 解答解説マスタにロックをかける
				editDao.lockMstAnswer();

				//
				// 解答解説マスタ登録用の値を設定
				//
				AnswerDto answerDto = new AnswerDto();
				// 解答解説ID
				answerDto.setAnswerId(CommonUtil.getStr(formMap.get(EditConst.KEY_ANSWER_ID_EDIT)));
				// 解答
				String answerForm = CommonUtil.getStr(formMap.get(EditConst.KEY_ANSWER_KEY_EDIT));
				answerDto.setAnswer(CommonUtil.escapeQuotation(answerForm));
				// 解説
				String kaisetuForm = CommonUtil.getStr(formMap.get(EditConst.KEY_KAISETSU_EDIT));
				answerDto.setKaisetsu(CommonUtil.escapeQuotation(kaisetuForm));
				// 更新ユーザ
				answerDto.setUpdUser(loginDto.getUserId());

				//
				// 問題マスタ登録用の値を設定
				//
				QuestionDto questionDto = new QuestionDto();
				// 問題ID
				questionDto.setQuestionId(CommonUtil.getStr(formMap.get(EditConst.KEY_QUESTION_ID_EDIT)));
				// 解答解説ID
				questionDto.setAnswerId(answerDto.getAnswerId());
				// 分類ID
				if (CommonUtil.getStr(formMap.get(EditConst.KEY_SUBJECT_EDIT)).equals(SELECT_JAVA_ON)) {
					//
					// 教科ラジオボタンでJavaが選択された場合
					//
					questionDto.setCategoryId(CommonUtil.getStr(formMap.get(EditConst.KEY_CATEGORY_KEY_JAVA_EDIT)));
				} else {
					//
					// 教科ラジオボタンでSQLが選択された場合
					//
					questionDto.setCategoryId(CommonUtil.getStr(formMap.get(EditConst.KEY_CATEGORY_KEY_SQL_EDIT)));
				}
				// 問題タイトル
				String questionTitleForm = CommonUtil.getStr(formMap.get(EditConst.KEY_QUESTIONTITLE_EDIT));
				questionDto.setQuestionTitle(CommonUtil.escapeQuotation(questionTitleForm));
				// 問題
				String question = CommonUtil.getStr(formMap.get(EditConst.KEY_QUESTIO_EDIT));
				questionDto.setQuestion(CommonUtil.escapeQuotation(question));
				// 選択肢A
				String sentakuA = CommonUtil.getStr(formMap.get(EditConst.KEY_SENTAKU_A_EDIT));
				questionDto.setSentakuA(CommonUtil.escapeQuotation(sentakuA));
				// 選択肢B
				String sentakuB = CommonUtil.getStr(formMap.get(EditConst.KEY_SENTAKU_B_EDIT));
				questionDto.setSentakuB(CommonUtil.escapeQuotation(sentakuB));
				// 選択肢C
				String sentakuC = CommonUtil.getStr(formMap.get(EditConst.KEY_SENTAKU_C_EDIT));
				questionDto.setSentakuC(CommonUtil.escapeQuotation(sentakuC));
				// 選択肢D
				String sentakuD = CommonUtil.getStr(formMap.get(EditConst.KEY_SENTAKU_D_EDIT));
				questionDto.setSentakuD(CommonUtil.escapeQuotation(sentakuD));
				// 更新ユーザ
				questionDto.setUpdUser(loginDto.getUserId());

				//
				//	更新処理
				//

				// 解答解説マスタを更新
				editDao.updateAnswer(answerDto);
				// 問題マスタを更新
				editDao.updateQuestion(questionDto);

			}
		});

	}

	/**
	 * 引数EditDtoの分類と解答ドロップダウン用の項目に値を設定する
	 * @param EditDto
	 * @return EditDto
	 */
	private EditDto setCategoryAndAnswer(EditDto dto) {
		// Javaの分類を取得
		dto.setCategoryJava(editDao.getCategory(SUBJECT_JAVA));
		// SQLの分類を取得
		dto.setCategorySql(editDao.getCategory(SUBJECT_SQL));

		// どの選択肢が正解かを選択するドロップダウンに値を設定
		Map<String, String> answerDropDown = new LinkedHashMap<String, String>();
		answerDropDown.put("", "");
		answerDropDown.put("a", "a");
		answerDropDown.put("b", "b");
		answerDropDown.put("c", "c");
		answerDropDown.put("d", "d");
		dto.setAnswer(answerDropDown);

		return dto;
	}
}
