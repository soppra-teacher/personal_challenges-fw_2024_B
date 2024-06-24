package cashbook.dto.common;

/**
 * ログイン情報DTOクラス
 */
public class LoginDto {

	/** ユーザＩＤ */
	private String userId;
	/** パスワード */
	private String password;
	/** ログイン日 */
	private String loginDate;
	/** 講師フラグ */
	private String teacherFlg;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLoginDate() {
		return loginDate;
	}

	public void setLoginDate(String loginDate) {
		this.loginDate = loginDate;
	}

	public String getTeacherFlg() {
		return teacherFlg;
	}

	public void setTeacherFlg(String teacherFlg) {
		this.teacherFlg = teacherFlg;
	}

}
