package cashbook.dao.qa;

import java.util.List;
import java.util.Map;


public interface QaDao {
	
	/**
	 * 出題可能なJavaの問題IDを取得
	 * @return List<Map<String, String>>
	 */
	public List<Map<String, String>> getJavaQuestionId();
	
	/**
	 * 出題可能なSQLの問題IDを取得
	 * @return List<Map<String, String>>
	 */
	public List<Map<String, String>> getSQLQuestionId();

	/**
	 * 引数の問題IDを持つJavaの問題を取得
	 * @param questionId
	 * @return Map<String, String>
	 */
	public Map<String, String> findJavaQA(String questionId);

	/**
	 * 引数の問題IDを持つSQLの問題を取得
	 * @param questionId
	 * @return Map<String, String>
	 */
	public Map<String, String> findSqlQA(String questionId);

}
