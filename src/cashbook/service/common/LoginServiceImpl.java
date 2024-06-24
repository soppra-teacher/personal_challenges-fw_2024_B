package cashbook.service.common;

import java.util.Map;

import cashbook.dao.common.LoginDao;
import cashbook.dto.common.LoginDto;

/**
 * ログインサービス
 */
public class LoginServiceImpl implements LoginService {

	/** ログインDao */
	private LoginDao loginDao;

	/**
	 * DAOのsetter
	 * @param loginDao
	 */
	public void setLoginDao(LoginDao loginDao) {
		this.loginDao = loginDao;
	}

	/**
	 * ログイン日更新メソッド
	 * @param formMap
	 */
	public void updateLoginDate(Map<String, Object> formMap) {
		loginDao.updateLoginDate(formMap);
	}

	/**
	 * ログイン実行メソッド
	 * @param formMap
	 * @return LoginDto
	 */
	public LoginDto execute(Map<String, Object> formMap) {

		LoginDto result = new LoginDto();

		// ユーザマスタからデータを取得
		Map<String, String> map = loginDao.findUser(formMap);

		// 取得したデータを返却用変数の各項目に設定
		result.setUserId(map.get("USER_ID"));
		result.setTeacherFlg(map.get("TEACHER_FLG"));

		return result;
	}

}