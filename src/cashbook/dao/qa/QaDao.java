package cashbook.dao.qa;

import java.util.List;
import java.util.Map;

import cashbook.dto.qa.QaHistoryDto;

public interface QaDao {

	/**
	 * 引数の問題IDの問題と解答解説を取得
	 * @param 問題ID
	 * @return 問題と解答解説
	 */
	public Map<String, String> findQA(String questionId);

	/**
	 * 引数教科の出題可能な問題IDを取得
	 * @param 教科
	 * @return 出題可能な問題ID
	 */
	public List<Map<String, String>> getQuestionId(String subject);

	/**
	 * 引数の登録データを解答履歴テーブルに登録
	 * @param QaHistoryDto
	 */
	public void insertHistory(QaHistoryDto dto);

}
