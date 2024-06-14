package cashbook.service.common;

import java.util.Map;

import cashbook.dao.common.LoginDao;
import cashbook.dto.common.LoginDto;

/**
 * ログインサービス
 */
public class LoginServiceImpl implements LoginService{
	
	private LoginDao loginDao;

	/**
	 * ログイン実行メソッド
	 * @param formMap
	 */
	public LoginDto execute(Map<String, Object> formMap){
		LoginDto result = new LoginDto();
		Map<String, String> map = loginDao.find(formMap);
		result.setUserId(map.get("USER_ID"));
		result.setUserNm(map.get("USER_NAME"));
		result.setTeacherFlg(map.get("TEACHER_FLG"));
		return result;
	}
	
	/**
	 * ログイン日更新メソッド
	 * @param formMap
	 */
	public void updateLoginDate(Map<String, Object> formMap) {
		loginDao.updateLoginDate(formMap);
	}

	/**
	 * DAOのsetter
	 * @param loginDao
	 */
	public void setLoginDao(LoginDao loginDao){
		this.loginDao = loginDao;
	}

}