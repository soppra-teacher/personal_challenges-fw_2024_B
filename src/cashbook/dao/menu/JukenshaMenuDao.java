package cashbook.dao.menu;

public interface JukenshaMenuDao {
	
	/**
	 * Javaの問題件数を取得
	 * @return Javaの問題数
	 */
	public int getJavaQuestionCount();

	/**
	 * SQLの問題件数を取得
	 * @return SQLの問題数
	 */
	public int getSQLQuestionCount();
}
