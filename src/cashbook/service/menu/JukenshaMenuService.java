package cashbook.service.menu;

import java.util.Map;

public interface JukenshaMenuService {
	
	/**
	 * Java問題数を取得
	 * @param formMap
	 * @return Javaの問題数
	 */
	public Map<String, String> getJavaQuestionCount(Map<String, Object> formMap);
	
	/**
	 * SQL問題数を取得
	 * @param formMap
	 * @return SQLの問題数
	 */
	public Map<String, String> getSQLQuestionCount(Map<String, Object> formMap);

}
