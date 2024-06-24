package cashbook.dao.qa;

import java.util.List;
import java.util.Map;

import cashbook.dao.common.BaseDaoImpl;

public class QaDaoImpl extends BaseDaoImpl implements QaDao {

	/**
	 * 引数の問題IDを持つJavaの問題を取得
	 * @param questionId
	 * @return Map<String, String>
	 */
	public Map<String, String> findJavaQA(String questionId) {
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
	 * 引数の問題IDを持つSQLの問題を取得
	 * @param questionId
	 * @return Map<String, String>
	 */
	public Map<String, String> findSqlQA(String questionId) {
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
	 * 出題可能なJavaの問題IDを取得
	 * @return List<Map<String, String>>
	 */
	public List<Map<String, String>> getJavaQuestionId() {
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT A.QUESTION_ID");
		sql.append("  FROM MST_QUESTION A ");
		sql.append("  INNER JOIN MST_CATEGORY B ");
		sql.append("    ON A.CATEGORY_ID = B.CATEGORY_ID ");
		sql.append("  WHERE B.SUBJECT = 'Java' ");
		sql.append("  AND A.DEL_FLG = '0' ");

		return super.search(sql.toString());
	}

	/**
	 * 出題可能なSQLの問題IDを取得
	 * @return List<Map<String, String>>
	 */
	public List<Map<String, String>> getSQLQuestionId() {
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT A.QUESTION_ID");
		sql.append("  FROM MST_QUESTION A ");
		sql.append("  INNER JOIN MST_CATEGORY B ");
		sql.append("    ON A.CATEGORY_ID = B.CATEGORY_ID ");
		sql.append("  WHERE B.SUBJECT = 'SQL' ");
		sql.append("  AND A.DEL_FLG = '0' ");

		return super.search(sql.toString());
	}
}
