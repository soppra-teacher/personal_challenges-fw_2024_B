package cashbook.dao.menu;

import java.util.List;
import java.util.Map;

import cashbook.dto.common.LoginDto;

public interface TeacherMenuDao {
	
	/**
	 * 講師メニュー画面用の一覧データを検索する
	 * @return 問題・解答
	 */
	public List<Map<String, String>> searchQuestion();
	
	
	/**
	 * 引数問題IDの問題を論理削除する
	 * @param 削除対象の問題ID
	 */
	public void deleteQuestion(String questionId, LoginDto loginDto);

}
