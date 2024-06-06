package cashbook.service.menu;

import java.util.Map;

public interface JukenshaMenuService {
	
	/**
	 * 問題数を取得
	 * @param formMap
	 * @return 
	 */
	public Map<String, String> getJavaQuestionCount(Map<String, Object> formMap);
	
	/**
	 * 問題数を取得
	 * @param formMap
	 * @return 
	 */
	public Map<String, String> getSQLQuestionCount(Map<String, Object> formMap);

}
