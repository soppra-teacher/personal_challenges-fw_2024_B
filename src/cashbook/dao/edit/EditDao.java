package cashbook.dao.edit;

import java.util.Map;

/**
 * 登録・更新画面DAOインターフェース
 * @author soppra
 */
public interface EditDao {
	
	/**
	 * Javaの分類を取得
	 * @param formMap
	 * @return 分類
	 */
	public Map<String, String> getJavaCategory();
	
	/**
	 * SQLの分類を取得
	 * @param formMap
	 * @return 分類
	 */
	public Map<String, String> getSQLCategory();

	/**
	 * 問題と解答の検索を行う
	 * @param formMap
	 * @return　引数IDの問題と解答
	 */
	public Map<String, String> findQuestionAnswer(String questionId);

}
