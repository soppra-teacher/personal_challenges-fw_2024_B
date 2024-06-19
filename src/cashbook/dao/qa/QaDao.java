package cashbook.dao.qa;

import java.util.Map;

public interface QaDao {

	/**
	 * 引数IDの問題と対応する解答を取得
	 * @param 問題ID
	 * @return　データ件数
	 */
	public Map<String, String> findQuestionAnswer(String questionId);
	
}
