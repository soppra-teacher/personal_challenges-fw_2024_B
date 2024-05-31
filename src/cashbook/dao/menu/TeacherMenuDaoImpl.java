package cashbook.dao.menu;

import java.util.List;
import java.util.Map;

import cashbook.dao.common.BaseDaoImpl;

public class TeacherMenuDaoImpl extends BaseDaoImpl implements TeacherMenuDao {
	
	/**
	 * 講師メニュー画面用の一覧データを検索する
	 * @param formMap フォーム項目
	 * @return 問題一覧
	 */
	public List<Map<String, String>> searchQuestion(Map<String, Object> formMap){
		
		List<Map<String, String>> result;
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT  A.QUESTION_ID ");
		sql.append("       ,B.SUBJECT ");
		sql.append("       ,B.CATEGORY ");
		sql.append("       ,A.QUESTION ");
		sql.append("       ,C.ANSWER ");
		sql.append("  FROM MST_QUESTION A ");
		sql.append("  INNER JOIN MST_CATEGORY B ");
		sql.append("  ON A.CATEGORY_ID = B.CATEGORY_ID ");
		sql.append("  INNER JOIN MST_ANSWER C ");
		sql.append("  ON A.ANSWER_ID = C.ANSWER_ID ");
		
		result = super.search(sql.toString());

		return result;
	}
}
