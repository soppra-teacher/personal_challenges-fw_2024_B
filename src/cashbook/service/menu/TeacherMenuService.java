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
	 * 問題・解答一覧表示テーブル用検索メソッド
	 * @param formMap
	 */
	public List<TeacherMenuDto> listSearch(Map<String, Object> formMap);
}
