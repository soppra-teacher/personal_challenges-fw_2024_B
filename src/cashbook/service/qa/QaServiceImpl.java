package cashbook.service.qa;

import static cashbook.util.Const.*;

import java.util.List;
import java.util.Map;
import java.util.Random;

import cashbook.dao.qa.QaDao;
import cashbook.dto.qa.QaDto;
import cashbook.dto.qa.QaSettingDto;
import cashbook.util.CommonUtil;

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

		// 教科を取得
		String subject = qaSetting.getSubject();

		Random random = new Random();

		// 出題問題を格納する変数
		Map<String, String> question = null;

		if (subject.equals(SELECT_JAVA_ON)) {

			//
			//	Javaの問題を出題
			//

			// 出題可能な問題IDを取得
			List<Map<String, String>> dbresult = qaDao.getQuestionId(SUBJECT_JAVA);

			// 前回の問題IDを取得する
			String beforQuestionId = CommonUtil.getStr(qaSetting.getBeforeQuestionId());

			// データベースの検索結果から、問題IDを抽出
			int index = 0;
			String[] questionIdAry = new String[dbresult.size()];
			for (Map<String, String> map : dbresult) {
				questionIdAry[index] = map.get("QUESTION_ID");
				index++;
			}

			String questionId;
			while (true) {

				// ランダムな問題IDを取得
				questionId = questionIdAry[random.nextInt(questionIdAry.length)];

				// 問題を取得
				question = qaDao.findQA(questionId);

				if (question.size() > 0 && !questionId.equals(beforQuestionId)) {
					break;
				}

			}

			// 前回の問題IDに値を設定
			qaSetting.setBeforeQuestionId(questionId);

		} else if (subject.equals(SELECT_SQL_ON)) {

			//
			//	SQLの問題を出題
			//

			// 出題可能な問題IDを取得
			List<Map<String, String>> dbresult = qaDao.getQuestionId(SUBJECT_SQL);

			// 前回の問題IDを取得する
			String beforQuestionId = CommonUtil.getStr(qaSetting.getBeforeQuestionId());

			// データベースの検索結果から、問題IDを抽出
			int index = 0;
			String[] questionIdAry = new String[dbresult.size()];
			for (Map<String, String> map : dbresult) {
				questionIdAry[index] = map.get("QUESTION_ID");
				index++;
			}

			String questionId;
			while (true) {

				// ランダムな問題IDを取得
				questionId = questionIdAry[random.nextInt(questionIdAry.length)];

				// 問題を取得
				question = qaDao.findQA(questionId);

				if (question.size() > 0 && !questionId.equals(beforQuestionId)) {
					break;
				}

			}

			// 前回の問題IDに値を設定
			qaSetting.setBeforeQuestionId(questionId);

		}

		// 問題マスタ、解答マスタより取得したデータを返却用変数に格納
		result.setQuestion(CommonUtil.getStr(question.get("QUESTION")));
		result.setSentakuA(CommonUtil.getStr(question.get("SENTAKU_A")));
		result.setSentakuB(CommonUtil.getStr(question.get("SENTAKU_B")));
		result.setSentakuC(CommonUtil.getStr(question.get("SENTAKU_C")));
		result.setSentakuD(CommonUtil.getStr(question.get("SENTAKU_D")));
		result.setAnswer(CommonUtil.getStr(question.get("ANSWER")));
		result.setKaisetsu(CommonUtil.getStr(question.get("KAISETSU")));

		return result;
	}

}
