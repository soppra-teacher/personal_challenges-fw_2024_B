package cashbook.dao.common;

import java.util.Map;

/**
 * 共通DAOクラス
 */
public class CommonDaoImpl extends BaseDaoImpl implements CommonDao {

	/**
	 * システム年(YYYY)を取得する
	 * @return システム年(YYYY)
	 */
	public String getYyyy() {

		Map<String, String> result;
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT TO_CHAR(SYSDATE,'YYYY') AS YYYY ");
		sql.append("  FROM DUAL ");
		result = super.find(sql.toString());

		return result.get("YYYY");
	}

	/**
	 * システム月(MM)を取得する
	 * @return システム月(MM)
	 */
	public String getMm() {

		Map<String, String> result;
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT TO_CHAR(SYSDATE, 'MM') AS MM ");
		sql.append("  FROM DUAL ");
		result = super.find(sql.toString());

		return result.get("MM");
	}

	/**
	 * システム日(DD)を取得する
	 * @return システム日(DD)
	 */
	public String getDd() {

		Map<String, String> result;
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT TO_CHAR(SYSDATE, 'DD') AS DD ");
		sql.append("  FROM DUAL ");
		result = super.find(sql.toString());

		return result.get("DD");
	}

	/**
	 * システム年月日(YYYY/MM/DD)を取得する
	 * @return システム年月日(YYYY/MM/DD)
	 */
	public String getYyyyMmDd() {

		Map<String, String> result;
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT TO_CHAR(SYSDATE, 'YYYY/MM/DD') AS YYYMMDD ");
		sql.append("  FROM DUAL ");
		result = super.find(sql.toString());

		return result.get("YYYMMDD");
	}
	
	/**
	 * 問題マスタをロックする
	 */
	public void lockMstQuestion() {
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT * FROM MST_QUESTION");
		sql.append("   FOR UPDATE ");
		super.search(sql.toString());
	}
	
	/**
	 * 解答解説マスタをロックする
	 */
	public void lockMstAnswer() {
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT * FROM MST_ANSWER");
		sql.append("   FOR UPDATE ");
		super.search(sql.toString());
	}
}
