package cashbook.dao.menu;

import java.util.List;
import java.util.Map;

public interface TeacherMenuDao {
	
	/**
	 * 講師メニュー画面用の一覧データを検索する
	 * @return 一覧データ
	 */
	public List<Map<String, String>> searchQuestion();

}
