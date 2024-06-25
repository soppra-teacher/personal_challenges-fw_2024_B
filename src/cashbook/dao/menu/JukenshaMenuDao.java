package cashbook.dao.menu;

public interface JukenshaMenuDao {
	
	/**
	 * 引数教科の問題件数を取得
	 * @param 教科
	 * @return 引数教科の問題数
	 */
	public int getQuestionCount(String subject);
	
}
