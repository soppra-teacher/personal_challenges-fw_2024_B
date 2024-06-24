package cashbook.dao.menu;

import java.util.Map;

import cashbook.dao.common.BaseDaoImpl;

public class JukenshaMenuDaoImpl extends BaseDaoImpl implements JukenshaMenuDao {

	/**
	 * Javaの問題件数を取得
	 * @return Javaの問題数
	 */
	public int getJavaQuestionCount() {
		// SQLを組み立てる
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT COUNT(A.QUESTION_ID) ");
		sql.append("  FROM MST_QUESTION A ");
		sql.append("  INNER JOIN MST_CATEGORY B ");
		sql.append("     ON A.CATEGORY_ID = B.CATEGORY_ID ");
		sql.append("  WHERE B.SUBJECT = 'Java' ");
		sql.append("    AND A.DEL_FLG = '0' ");

		// SQLを実行
		Map<String, String> result = super.find(sql.toString());

		// データ件数を取得し、返却
		return Integer.parseInt(result.get("COUNT(A.QUESTION_ID)"));
	}

	/**
	 * SQLの問題件数を取得
	 * @return SQLの問題数
	 */
	public int getSQLQuestionCount() {
		// SQLを組み立てる
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT COUNT(A.QUESTION_ID) ");
		sql.append("  FROM MST_QUESTION A ");
		sql.append("  INNER JOIN MST_CATEGORY B ");
		sql.append("     ON A.CATEGORY_ID = B.CATEGORY_ID ");
		sql.append("  WHERE B.SUBJECT = 'SQL' ");
		sql.append("    AND A.DEL_FLG = '0' ");

		// SQLを実行
		Map<String, String> result = super.find(sql.toString());

		// データ件数を取得し、返却
		return Integer.parseInt(result.get("COUNT(A.QUESTION_ID)"));
	}
}
