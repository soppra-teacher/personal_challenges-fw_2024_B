package cashbook.dao.common;

import java.util.Map;

/**
 * ログインDAOクラス
 * @author soppra
 */
public interface LoginDao {

	/**
	 * ログイン情報を取得する
	 * @param formMap フォーム項目
	 * @return ユーザID
	 */
	public Map<String, String> findUser(Map<String, Object> formMap);
	
	/**
	 * ログイン日を更新する
	 * @param formMap フォーム項目
	 */
	public void updateLoginDate(Map<String, Object> formMap);
}
