package cashbook.service.menu;

import java.util.Map;

public interface JukenshaMenuService {
	
	/**
	 * Java問題数を取得
	 * @return Javaの問題数
	 */
	public Map<String, String> getJavaQuestionCount();
	
	/**
	 * SQL問題数を取得
	 * @return SQLの問題数
	 */
	public Map<String, String> getSQLQuestionCount();

}
