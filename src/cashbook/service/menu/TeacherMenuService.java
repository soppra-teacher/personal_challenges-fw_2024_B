package cashbook.service.menu;

import java.util.List;

import cashbook.dto.common.LoginDto;
import cashbook.dto.menu.TeacherMenuDto;

/**
 * 講師メニューサービスインターフェース
 * @author soppra
 *
 */
public interface TeacherMenuService {

	/**
	 * 問題・解答一覧表示テーブル用検索メソッド
	 * @return 問題・解答
	 */
	public List<TeacherMenuDto> listSearch();
	
	/**
	 * 引数問題IDの問題を削除する
	 * @param 問題ID
	 * @param ログイン情報
	 */
	public void deleteQA(String questioId, LoginDto loginDto);
	
}
