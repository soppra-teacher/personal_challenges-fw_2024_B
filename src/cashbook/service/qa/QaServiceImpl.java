package cashbook.service.qa;

import java.util.Map;
import java.util.Random;

import cashbook.dao.menu.JukenshaMenuDao;
import cashbook.dao.qa.QaDao;
import cashbook.dto.qa.QaDto;
import cashbook.dto.qa.QaSettingDto;
import cashbook.util.CommonUtil;
import cashbook.util.Const;

public class QaServiceImpl implements QaService {

	/** 受験者メニューDao */
	private JukenshaMenuDao jukenshaMenuDao;

	/** 問題解答Dao */
	private QaDao qaDao;

	/**
	 * 受験者ニューDAOを設定します。
	 * @param JukenshaMenuDao 講師メニューDao
	 */
	public void setJukenshaMenuDao(JukenshaMenuDao jukenshaMenuDao) {
		this.jukenshaMenuDao = jukenshaMenuDao;
	}

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

		String questionId = "";
		
		Map<String, String> dbresult = null;

		Random rnd = new Random();

		if (subject.equals(Const.SELECT_JAVA_ON)) {

			// Javaの問題数を取得
			int javaQuestionCount = jukenshaMenuDao.getJavaQuestionCount();
			
			do {
				
				questionId = "Q" + rnd.nextInt(javaQuestionCount + 1);

				dbresult = qaDao.findQuestionAnswer(questionId);

			} while (dbresult.size() == 0 || questionId.equals(qaSetting.getBeforeQuestionId()));

		} else if (subject.equals(Const.SELECT_SQL_ON)) {

			//　SQLの問題数を取得
			int sqlQuestionCount = jukenshaMenuDao.getSQLQuestionCount();
			
			do {
				questionId = "Q" + rnd.nextInt(sqlQuestionCount + 1);

				dbresult = qaDao.findQuestionAnswer(questionId);

			} while (dbresult.size() == 0 || questionId.equals(qaSetting.getBeforeQuestionId()));

		}

		// 指定した問題IDの問題と解答を取得
		//Map<String, String> dbresult = qaDao.findQuestionAnswer(questionId);
		qaSetting.setBeforeQuestionId(questionId);

		// 問題マスタ、解答マスタより取得したデータを返却用変数に格納
		result.setQuestion(CommonUtil.getStr(dbresult.get("QUESTION")));
		result.setSentakuA(CommonUtil.getStr(dbresult.get("SENTAKU_A")));
		result.setSentakuB(CommonUtil.getStr(dbresult.get("SENTAKU_B")));
		result.setSentakuC(CommonUtil.getStr(dbresult.get("SENTAKU_C")));
		result.setSentakuD(CommonUtil.getStr(dbresult.get("SENTAKU_D")));
		result.setAnswer(CommonUtil.getStr(dbresult.get("ANSWER")));
		result.setKaisetsu(CommonUtil.getStr(dbresult.get("KAISETSU")));

		return result;
	}

}
