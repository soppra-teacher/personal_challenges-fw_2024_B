package cashbook.dao.qa;

import java.util.Map;

import cashbook.dao.common.BaseDaoImpl;

public class QaDaoImpl extends BaseDaoImpl implements QaDao {

	/**
	 * 引数IDの問題と対応する解答を取得
	 * @param 問題ID
	 * @return　問題と解答
	 */
	public Map<String, String> findQuestionAnswer(String questionId) {
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
		sql.append("  WHERE A.QUESTION_ID = '").append(questionId).append("'");
		sql.append("  AND A.DEL_FLG = '0' ");

		return super.find(sql.toString());
	}
}
