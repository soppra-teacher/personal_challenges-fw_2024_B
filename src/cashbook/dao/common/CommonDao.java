package cashbook.dao.common;

/**
 * 共通DAOクラス
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

}
