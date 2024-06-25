package cashbook.dao.menu;

import java.util.Map;

import cashbook.dao.common.BaseDaoImpl;

public class JukenshaMenuDaoImpl extends BaseDaoImpl implements JukenshaMenuDao {

	/**
	 * 引数教科の問題件数を取得
	 * @param 教科
	 * @return 引数教科の問題数
	 */
	public int getQuestionCount(String subject) {
		// SQLを組み立てる
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT COUNT(A.QUESTION_ID) AS QUESTIONCOUNT ");
		sql.append("  FROM MST_QUESTION A ");
		sql.append("  INNER JOIN MST_CATEGORY B ");
		sql.append("     ON A.CATEGORY_ID = B.CATEGORY_ID ");
		sql.append("  WHERE B.SUBJECT = '").append(subject).append("'");
		sql.append("    AND A.DEL_FLG = '0' ");

		// SQLを実行
		Map<String, String> result = super.find(sql.toString());

		// データ件数を取得し、返却
		return Integer.parseInt(result.get("QUESTIONCOUNT"));
	}

}
