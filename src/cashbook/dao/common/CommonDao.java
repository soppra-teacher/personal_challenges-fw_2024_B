package cashbook.dao.common;

/**
 * 共通DAOクラス
 * @author soppra
 */
public interface CommonDao {

	/**
	 * システム年(YYYY)を取得する
	 * @return システム年(YYYY)
	 */
	public String getYyyy();

	/**
	 * システム月(MM)を取得する
	 * @return システム月(MM)
	 */
	public String getMm();

	/**
	 * システム日(DD)を取得する
	 * @return システム日(DD)
	 */
	public String getDd();

	/**
	 * システム年月日(YYYY/MM/DD)を取得する
	 * @return システム年月日(YYYY/MM/DD)
	 */
	public String getYyyyMmDd();
	
	/**
	 * セーブポイントを作成
	 */
	public void savePoint();
	
	/**
	 * コミットを実行
	 */
	public void commit();
	
	/**
	 * ロールバックを実行
	 */
	public void rollback();
	
	/**
	 * 引数名のテーブルをロック
	 * @param ロック対象のテーブル
	 */
	public void lockTable(String tableName);

}
