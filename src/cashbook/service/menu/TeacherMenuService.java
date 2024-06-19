package cashbook.service.menu;

import java.util.List;

import cashbook.dto.menu.TeacherMenuDto;

/**
 * 講師メニューサービスインターフェース
 * @author soppra
 *
 */
public interface TeacherMenuService {

	/**
	 * 問題・解答一覧表示テーブル用検索メソッド
	 */
	public List<TeacherMenuDto> listSearch();
}
