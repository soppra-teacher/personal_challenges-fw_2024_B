package cashbook.dao.menu;

import java.util.Map;

public interface JukenshaMenuDao {
	
	/**
	 * Javaの問題件数を取得
	 * @param formMap フォーム項目
	 * @return Javaの問題数
	 */
	public int getJavaQuestionCount(Map<String, Object> formMap);

	/**
	 * SQLの問題件数を取得
	 * @param formMap フォーム項目
	 * @return SQLの問題数
	 */
	public int getSQLQuestionCount(Map<String, Object> formMap);
}
