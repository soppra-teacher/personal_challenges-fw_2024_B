package cashbook.dao.common;

import java.util.List;
import java.util.Map;

/**
 * DAO基底クラス
 */
public interface BaseDao {

	/**
	 * 複数検索メソッド
	 * @param strSql SQL文List
	 * @return 検索結果を格納したList
	 */
	public List<Map<String, String>> search(String strSql);

	/**
	 * 単一検索メソッド
	 * @param strSql SQL文
	 * @return 検索結果を格納したMap
	 */
	public Map<String, String> find(String strSql);

	/**
	 * 更新処理メソッド
	 * @param strSql SQL文
	 * @return 更新件数
	 */
	public int update(String strSql);
	
	/**
	 * セーブポイントを作成する
	 */
	public void savePoint();
	
	/**
	 * 一連の処理をコミットする
	 */
	public void commit();
	
	/**
	 * セーブポイントまで、ロールバックする
	 */
	public void rollback();
}