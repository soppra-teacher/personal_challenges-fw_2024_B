package cashbook.service.menu;

import java.util.Map;

public interface JukenshaMenuService {
	
	/**
	 * 引数教科の問題数を取得
	 * @param 教科
	 * @return 問題数
	 */
	public Map<String, String> getQuestionCountDropDown(String subject);

}
