package cashbook.service.qa;

import static cashbook.util.Const.*;

import java.util.List;
import java.util.Map;
import java.util.Random;

import cashbook.dao.qa.QaDao;
import cashbook.dto.common.LoginDto;
import cashbook.dto.qa.QaDto;
import cashbook.dto.qa.QaHistoryDto;
import cashbook.dto.qa.QaSettingDto;
import cashbook.util.CommonUtil;
import cashbook.util.JukenshaMenuConst;

public class QaServiceImpl implements QaService {

	/** 問題解答Dao */
	private QaDao qaDao;

	/**
	 * 問題解答DAOを設定します。
	 * @param QaDao 問題解答Dao
	 */
	public void setQaDao(QaDao qaDao) {
		this.qaDao = qaDao;
	}

	/**
	 * 引数の出題設定をもとに問題と解答を取得する
	 * @param QASettingDto
	 * @return QaDto
	 */
	public QaDto getQA(QaSettingDto qaSetting) {

		QaDto result = new QaDto();

		// 問題を選出
		Map<String, String> question = getQuestionInfo(qaSetting);

		if (question != null) {

			// 問題マスタ、解答マスタより取得したデータを返却用変数に格納
			result.setQuestion(CommonUtil.getStr(question.get("QUESTION")));
			result.setSentakuA(CommonUtil.getStr(question.get("SENTAKU_A")));
			result.setSentakuB(CommonUtil.getStr(question.get("SENTAKU_B")));
			result.setSentakuC(CommonUtil.getStr(question.get("SENTAKU_C")));
			result.setSentakuD(CommonUtil.getStr(question.get("SENTAKU_D")));
			result.setAnswer(CommonUtil.getStr(question.get("ANSWER")));
			result.setKaisetsu(CommonUtil.getStr(question.get("KAISETSU")));

			// 前回の問題IDに値を設定
			qaSetting.setBeforeQuestionId(CommonUtil.getStr(question.get("QUESTION_ID")));

			return result;

		} else {

			return null;

		}

	}

	/**
	 * 引数の登録データを解答履歴テーブルに登録
	 * @param formMap
	 * @param loginDto
	 * @param berforeQuestionId
	 */
	public void insHistory(Map<String, Object> formMap, LoginDto loginDto, String berforeQuestionId) {

		//
		//	解答履歴テーブルの更新データの設定
		//
		QaHistoryDto historyDto = new QaHistoryDto();
		// 登録ユーザを設定
		historyDto.setInsUser(loginDto.getUserId());
		// 問題IDを設定
		historyDto.setQuestionId(berforeQuestionId);
		// ユーザの解答を設定
		String userSelectAnswer = CommonUtil.getStr(formMap.get(JukenshaMenuConst.KEY_USER_SELECT_ANSWER));
		historyDto.setUserSelectAnswer(userSelectAnswer);

		// 引数データを解答履歴テーブルに登録
		qaDao.insertHistory(historyDto);

	}

	/**
	 * 引数データをもとに、出題する問題を選出する
	 * @param QaSetting 出題設定保持用DTO
	 * @return Map<String, String>
	 */
	private Map<String, String> getQuestionInfo(QaSettingDto qaSetting) {

		Random random = new Random();

		// 教科を取得
		String subject = qaSetting.getSubject();

		// 前回の問題IDを取得する
		String beforQuestionId = CommonUtil.getStr(qaSetting.getBeforeQuestionId());

		List<Map<String, String>> dbresult = null;
		if (subject.equals(SELECT_JAVA_ON)) {

			// 出題可能な問題IDを取得
			dbresult = qaDao.getQuestionId(SUBJECT_JAVA);

		} else if (subject.equals(SELECT_SQL_ON)) {

			// 出題可能な問題IDを取得
			dbresult = qaDao.getQuestionId(SUBJECT_SQL);

		}

		// 検索結果が0件の場合はNULLを返却
		if (dbresult.size() == 0) {
			return null;
		}

		// 出題問題を格納する変数
		Map<String, String> question = null;

		// データベースの検索結果から、問題IDを抽出
		int index = 0;
		String[] questionIdAry = new String[dbresult.size()];
		for (Map<String, String> map : dbresult) {
			questionIdAry[index] = map.get("QUESTION_ID");
			index++;
		}

		while (true) {

			// ランダムな問題IDを取得
			String questionId = questionIdAry[random.nextInt(questionIdAry.length)];

			// 取得した問題IDが前回出題した問題IDと同じ場合は再度取得
			if (questionId.equals(beforQuestionId)) {
				continue;
			}

			// 問題を取得
			question = qaDao.findQA(questionId);

			if (question.size() > 0) {
				break;
			}

		}

		return question;

	}

}
