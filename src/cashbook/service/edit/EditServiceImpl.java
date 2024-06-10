package cashbook.service.edit;

import static cashbook.util.Const.*;

import java.util.LinkedHashMap;
import java.util.Map;

import cashbook.dao.edit.EditDao;
import cashbook.dto.edit.EditDto;
import cashbook.util.CommonUtil;
import cashbook.util.TeacherMenuConst;

public class EditServiceImpl implements EditService {

	/** 登録・更新Dao */
	private EditDao editDao;

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

		//選択された問題IDを取得
		String questionId = CommonUtil.getStr(formMap.get(TeacherMenuConst.VIEW_TEACHER_QUESTION_ID));

		var dbResult = editDao.findQuestionAnswer(questionId);

		EditDto result = new EditDto();
		result.setQuestionId(dbResult.get("QUESTION_ID"));
		result.setSubject(dbResult.get("SUBJECT"));
		result.setQuestionTitle(dbResult.get("QUESTION_TITLE"));
		result.setQuestion(dbResult.get("QUESTION"));
		result.setSentakuA(dbResult.get("SENTAKU_A"));
		result.setSentakuB(dbResult.get("SENTAKU_B"));
		result.setSentakuC(dbResult.get("SENTAKU_C"));
		result.setSentakuD(dbResult.get("SENTAKU_D"));

		result.setKaisetsu(dbResult.get("KAISETSU"));

		return result;
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
		dto.setCategory(editDao.getJavaCategory());

		// どの選択肢が正解かを選択するドロップダウンに値を設定
		var answerDropDown = new LinkedHashMap<String, String>();
		answerDropDown.put("a", "a");
		answerDropDown.put("b", "b");
		answerDropDown.put("c", "c");
		answerDropDown.put("d", "d");
		dto.setAnswer(answerDropDown);
		
		return dto;
	}

}
