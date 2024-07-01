package cashbook.dao.qa;

import java.util.List;
import java.util.Map;

import cashbook.dao.common.BaseDaoImpl;

public class QaDaoImpl extends BaseDaoImpl implements QaDao {

	/**
	 * 引数の問題IDの問題と解答解説を取得
	 * @param 問題ID
	 * @return 問題と解答解説
	 */
	public Map<String, String> findQA(String questionId) {
		// SQLを組み立てる
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT A.QUESTION");
		sql.append("     , A.SENTAKU_A");
		sql.append("     , A.SENTAKU_B");
		sql.append("     , A.SENTAKU_C");
		sql.append("     , A.SENTAKU_D");
		sql.append("     , B.ANSWER");
		sql.append("     , B.KAISETSU");
		sql.append("  FROM MST_QUESTION A ");
		sql.append("  INNER JOIN MST_ANSWER B ");
		sql.append("    ON A.ANSWER_ID = B.ANSWER_ID ");
		sql.append("  INNER JOIN MST_CATEGORY C ");
		sql.append("    ON A.CATEGORY_ID = C.CATEGORY_ID ");
		sql.append("  WHERE A.QUESTION_ID = '").append(questionId).append("'");
		sql.append("  AND A.DEL_FLG = '0' ");

		return super.find(sql.toString());
	}

	/**
	 * 引数教科の出題可能な問題IDを取得
	 * @param 教科
	 * @return 出題可能な問題ID
	 */
	public List<Map<String, String>> getQuestionId(String subject) {
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT A.QUESTION_ID");
		sql.append("  FROM MST_QUESTION A ");
		sql.append("  INNER JOIN MST_CATEGORY B ");
		sql.append("    ON A.CATEGORY_ID = B.CATEGORY_ID ");
		sql.append("  WHERE B.SUBJECT = '").append(subject).append("'");
		sql.append("  AND A.DEL_FLG = '0' ");

		return super.search(sql.toString());
	}
}
