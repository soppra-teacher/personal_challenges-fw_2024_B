package cashbook.dao.menu;

import java.util.List;
import java.util.Map;

import cashbook.dao.common.BaseDaoImpl;
import cashbook.dto.common.LoginDto;

public class TeacherMenuDaoImpl extends BaseDaoImpl implements TeacherMenuDao {

	/**
	 * 講師メニュー画面用の一覧データを検索する
	 * @return 問題・解答
	 */
	public List<Map<String, String>> searchQuestion() {
		// SQLを組み立てる
		List<Map<String, String>> result;
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT  A.QUESTION_ID ");
		sql.append("       ,B.SUBJECT ");
		sql.append("       ,B.CATEGORY ");
		sql.append("       ,A.QUESTION_TITLE");
		sql.append("       ,A.QUESTION ");
		sql.append("       ,C.ANSWER ");
		sql.append("       ,C.KAISETSU ");
		sql.append("  FROM MST_QUESTION A ");
		sql.append("  INNER JOIN MST_CATEGORY B ");
		sql.append("  ON A.CATEGORY_ID = B.CATEGORY_ID ");
		sql.append("  INNER JOIN MST_ANSWER C ");
		sql.append("  ON A.ANSWER_ID = C.ANSWER_ID ");
		sql.append("  WHERE A.DEL_FLG = '0' ");
		sql.append("  ORDER BY A.INS_DATE DESC ");

		result = super.search(sql.toString());

		return result;
	}

	/**
	 * 引数問題IDの問題を論理削除する
	 * @param 削除対象の問題ID
	 */
	public void deleteQuestion(String questionId, LoginDto loginDto) {
		// 論理削除用のSQLを組み立てる。
		StringBuffer sql = new StringBuffer();
		sql.append("UPDATE  MST_QUESTION ");
		sql.append("SET     DEL_FLG = '1'");
		sql.append("      , UPD_USER = '").append(loginDto.getUserId()).append("'");
		sql.append("      , UPD_DATE = SYSDATE ");
		sql.append("WHERE  QUESTION_ID = '").append(questionId).append("'");

		// 組み立てたSQLで更新処理(論理削除)を行う。
		super.update(sql.toString());
	}
}
