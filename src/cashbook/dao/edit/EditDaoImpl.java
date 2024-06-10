package cashbook.dao.edit;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import cashbook.dao.common.BaseDaoImpl;

public class EditDaoImpl extends BaseDaoImpl implements EditDao {

	/**
	 * Javaの分類を取得
	 * @param formMap
	 * @return 分類
	 */
	public Map<String, String> getJavaCategory() {
		// フォーム項目の入力値でSQLを組み立てる。
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT CATEGORY ");
		sql.append("  FROM MST_CATEGORY ");
		sql.append(" WHERE SUBJECT = 'Java'");

		// 組み立てたSQLで検索処理を行う。
		List<Map<String, String>> dbresult = super.search(sql.toString());
		Map<String, String> result = new LinkedHashMap<String, String>();
		
		for (int f = 0; f < dbresult.size(); f++) {
			result.put(String.valueOf(f), dbresult.get(f).get("CATEGORY"));
		}

		// 処理結果を返却する。
		return result;
	}

	/**
	 * SQLの分類を取得
	 * @param formMap
	 * @return 分類
	 */
	public Map<String, String> getSQLCategory() {
		// フォーム項目の入力値でSQLを組み立てる。
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT CATEGORY ");
		sql.append("  FROM MST_CATEGORY ");
		sql.append(" WHERE SUBJECT = 'SQL'");

		// 組み立てたSQLで検索処理を行う。
		Map<String, String> result = super.find(sql.toString());

		// 処理結果を返却する。
		return result;
	}

	/**
	 * 問題と解答の検索を行う
	 * @param formMap
	 * @return 問題と解答
	 */
	public Map<String, String> findQuestionAnswer(String questionId) {

		return null;
	}

}
