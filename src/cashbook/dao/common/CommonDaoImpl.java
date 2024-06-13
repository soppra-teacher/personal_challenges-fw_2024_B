package cashbook.dao.common;

import java.util.Map;

/**
 * 共通DAOクラス
 * @author soppra
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
	 * セーブポイントを作成
	 */
	public void savePoint() {
		super.savePoint();
	}
	
	/**
	 * コミットを実行
	 */
	public void commit() {
		super.commit();
	}
	
	/**
	 * ロールバックを実行
	 */
	public void rollback() {
		super.rollback();
	}
	
	/**
	 * 引数名のテーブルをロック
	 * @param ロック対象のテーブル
	 */
	public void lockTable(String tableName) {
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT * FROM ").append(tableName);
		sql.append("   FOR UPDATE ");
		super.search(sql.toString());
	}
}
