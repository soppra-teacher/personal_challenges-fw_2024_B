package cashbook.dto.common;

/**
 * DTO基底クラス
 * @author soppra
 */
public class BaseDto {
	
	/** 登録者 */
	private String insUser;
	
	/** 更新者 */
	private String updUser;

	public String getInsUser() {
		return insUser;
	}

	public void setInsUser(String insUser) {
		this.insUser = insUser;
	}

	public String getUpdUser() {
		return updUser;
	}

	public void setUpdUser(String updUser) {
		this.updUser = updUser;
	}
}
