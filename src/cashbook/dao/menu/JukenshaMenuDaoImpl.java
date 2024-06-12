package cashbook.dao.menu;

import java.util.Map;

import cashbook.dao.common.BaseDaoImpl;

public class JukenshaMenuDaoImpl extends BaseDaoImpl implements JukenshaMenuDao {

	/**
	 * Javaの問題件数を取得
	 * @param formMap フォーム項目
	 * @return 問題数
	 */
	public int getJavaQuestionCount(Map<String, Object> formMap) {
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT COUNT(QUESTION_ID) ");
		sql.append("  FROM MST_QUESTION ");
		sql.append(" WHERE CATEGORY_ID IN (( ");
		sql.append("       SELECT CATEGORY_ID  ");
		sql.append("        FROM MST_CATEGORY  ");
		sql.append("       WHERE SUBJECT = 'Java' ");
		sql.append("      )) ");
		sql.append(" AND DEL_FLG = '0' ");

		Map<String, String> result = super.find(sql.toString());

		return Integer.parseInt(result.get("COUNT(QUESTION_ID)"));
	}

	/**
	 * SQLの問題件数を取得
	 * @param formMap フォーム項目
	 * @return 問題数
	 */
	public int getSQLQuestionCount(Map<String, Object> formMap) {
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT COUNT(QUESTION_ID) ");
		sql.append("  FROM MST_QUESTION ");
		sql.append(" WHERE CATEGORY_ID IN (( ");
		sql.append("       SELECT CATEGORY_ID  ");
		sql.append("        FROM MST_CATEGORY  ");
		sql.append("       WHERE SUBJECT = 'SQL' ");
		sql.append("      )) ");
		sql.append(" AND DEL_FLG = '0' ");

		Map<String, String> result = super.find(sql.toString());

		return Integer.parseInt(result.get("COUNT(QUESTION_ID)"));
	}
}
