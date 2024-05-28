package cashbook.dto.common;

/**
 * ログイン情報DTOクラス
 * @author soppra
 */
public class LoginDto {

	/** ユーザＩＤ */
	private String userId;
	/** ユーザ名 */
	private String userNm;
	/** パスワード */
	private String password;
	/** ログイン日 */
	private String loginDate;
	/** 講師フラグ */
	private String teacherFlg;

	/**
	 * ユーザＩＤを取得します。
	 * @return ユーザＩＤ
	 */
	public String getUserId() {
	    return userId;
	}

	/**
	 * ユーザＩＤを設定します。
	 * @param userId ユーザＩＤ
	 */
	public void setUserId(String userId) {
	    this.userId = userId;
	}

	/**
	 * ユーザ名を取得します。
	 * @return ユーザ名
	 */
	public String getUserNm() {
	    return userNm;
	}

	/**
	 * ユーザ名を設定します。
	 * @param userNm ユーザ名
	 */
	public void setUserNm(String userNm) {
	    this.userNm = userNm;
	}
	
	/**
	 * パスワードを取得します。
	 * @return ユーザ名
	 */
	public String getPassword() {
	    return password;
	}

	/**
	 * パスワードを設定します。
	 * @param userNm ユーザ名
	 */
	public void setPassword(String password) {
	    this.password = password;
	}
	
	
	/**
	 * ログイン日を取得します。
	 * @return ユーザ名
	 */
	public String getLoginDate() {
	    return loginDate;
	}

	/**
	 * パスワードを設定します。
	 * @param userNm ユーザ名
	 */
	public void setLoginDate(String logindate) {
	    this.loginDate = logindate;
	}
	
	/**
	 * 講師フラグを取得します。
	 * @return ユーザ名
	 */
	public String getTeacherFlg() {
	    return teacherFlg;
	}

	/**
	 * 講師フラグを設定します。
	 * @param userNm ユーザ名
	 */
	public void setTeacherFlg(String teacherFlg) {
	    this.teacherFlg = teacherFlg;
	}
}
