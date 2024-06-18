package cashbook.dao.menu;

import java.util.List;
import java.util.Map;

public interface TeacherMenuDao {
	
	/**
	 * 講師メニュー画面用の一覧データを検索する
	 * @param formMap フォーム項目
	 * @return 一覧データ
	 */
	public List<Map<String, String>> searchQuestion(Map<String, Object> formMap);

}
