package cashbook.service.common;

import java.util.Map;

import cashbook.dto.common.LoginDto;

public interface LoginService {
	
	/**
	 * ログイン実行メソッド
	 * @param formMap
	 */
	public LoginDto execute(Map<String, Object> formMap);

	/**
	 * ログイン日更新メソッド
	 * @param formMap
	 */
	public void updateLoginDate(Map<String, Object> formMap);
}