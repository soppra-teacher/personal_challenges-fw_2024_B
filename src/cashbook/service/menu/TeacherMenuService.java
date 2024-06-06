package cashbook.service.menu;

import java.util.List;
import java.util.Map;

import cashbook.dto.menu.TeacherMenuDto;

/**
 * 講師メニューサービスインターフェース
 * @author soppra
 *
 */
public interface TeacherMenuService {

	/**
	 * 問題解答一覧テーブル用にDBからデータを取得
	 * @param formMap
	 * @return 
	 */
	public List<TeacherMenuDto> listSearch(Map<String, Object> formMap);
}
