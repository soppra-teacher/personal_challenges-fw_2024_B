package cashbook.dao.edit;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import cashbook.dao.common.BaseDaoImpl;
import cashbook.dto.edit.AnswerDto;
import cashbook.dto.edit.QuestionDto;

public class EditDaoImpl extends BaseDaoImpl implements EditDao {

	/**
	 * Javaの分類を取得
	 * @param formMap
	 * @return 分類
	 */
	public Map<String, String> getJavaCategory() {
		// SQLを組み立てる。
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT CATEGORY_ID, CATEGORY ");
		sql.append("  FROM MST_CATEGORY ");
		sql.append(" WHERE SUBJECT = 'Java'");

		// 組み立てたSQLで検索処理を行う。
		List<Map<String, String>> dbresult = super.search(sql.toString());
		Map<String, String> result = new LinkedHashMap<String, String>();

		for (int f = 0; f < dbresult.size(); f++) {
			result.put(dbresult.get(f).get("CATEGORY_ID"), dbresult.get(f).get("CATEGORY"));
		}

		// 処理結果を返却する。
		return result;
	}

	/**
	 * SQLの分類を取得
	 * @param formMap
	 * @return 分類
	 */
	public Map<String, String> getSQLCategory() {
		// SQLを組み立てる。
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT CATEGORY_ID, CATEGORY ");
		sql.append("  FROM MST_CATEGORY ");
		sql.append(" WHERE SUBJECT = 'SQL'");

		// 組み立てたSQLで検索処理を行う。
		List<Map<String, String>> dbresult = super.search(sql.toString());
		Map<String, String> result = new LinkedHashMap<String, String>();

		for (int f = 0; f < dbresult.size(); f++) {
			result.put(dbresult.get(f).get("CATEGORY_ID"), dbresult.get(f).get("CATEGORY"));
		}

		// 処理結果を返却する。
		return result;
	}

	/**
	 * 問題と解答の検索を行う
	 * @param formMap
	 * @return 問題と解答
	 */
	public Map<String, String> findQuestionAnswer(String questionId) {
		// SQLを組み立てる。
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT A.QUESTION_ID ");
		sql.append("     , B.CATEGORY_ID");
		sql.append("     , C.ANSWER_ID");
		sql.append("     , B.SUBJECT");
		sql.append("     , A.QUESTION_TITLE");
		sql.append("     , A.QUESTION");
		sql.append("     , A.SENTAKU_A");
		sql.append("     , A.SENTAKU_B");
		sql.append("     , A.SENTAKU_C");
		sql.append("     , A.SENTAKU_D");
		sql.append("     , C.ANSWER");
		sql.append("     , C.KAISETSU");
		sql.append("  FROM MST_QUESTION A ");
		sql.append("  INNER JOIN MST_CATEGORY B ");
		sql.append("    ON A.CATEGORY_ID = B.CATEGORY_ID ");
		sql.append("  INNER JOIN MST_ANSWER C ");
		sql.append("    ON A.ANSWER_ID = C.ANSWER_ID ");
		sql.append("  WHERE A.QUESTION_ID = '").append(questionId).append("'");
		sql.append("  AND A.DEL_FLG = '0' ");

		return super.find(sql.toString());
	}

	/**
	 * 問題マスタのデータ件数を取得する
	 * @return　データ件数
	 */
	public int getQuestionCount() {
		// SQLを組み立てる。
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT COUNT(QUESTION_ID) ");
		sql.append("  FROM MST_QUESTION ");

		var result = super.find(sql.toString());

		// 処理結果を返却する。
		return Integer.parseInt(result.get("COUNT(QUESTION_ID)"));
	}

	/**
	 * 解答解説マスタのデータ件数を取得する
	 * @return　データ件数
	 */
	public int getAnswerCount() {
		// SQLを組み立てる。
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT COUNT(ANSWER_ID) ");
		sql.append("  FROM MST_ANSWER ");

		var result = super.find(sql.toString());

		// 処理結果を返却する。
		return Integer.parseInt(result.get("COUNT(ANSWER_ID)"));
	}

	/**
	 * データ件数に引数分足した解答解説IDが存在するかチェックを行う
	 * @param データ件数に足す数
	 * @return IDが存在する場合はTrue、しない場合はFalseを返却
	 */
	public boolean isExistAnswerId(int addCount) {
		// SQLを組み立てる。
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT ANSWER_ID ");
		sql.append("  FROM MST_ANSWER ");
		sql.append(" WHERE ANSWER_ID = 'A' || ");
		sql.append(" (( SELECT COUNT(ANSWER_ID) ");
		sql.append("   FROM MST_ANSWER ) +  ").append(addCount).append(" )");

		// 処理結果を返却する。
		return super.find(sql.toString()).size() > 0;
	}

	/**
	 * データ件数に引数分足した問題IDが存在するかチェックを行う
	 * @param データ件数に足す数
	 * @return IDが存在する場合はTrue、しない場合はFalseを返却
	 */
	public boolean isExistQuestionId(int addCount) {
		// SQLを組み立てる。
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT QUESTION_ID ");
		sql.append("  FROM MST_QUESTION ");
		sql.append(" WHERE QUESTION_ID = 'Q' || ");
		sql.append(" (( SELECT COUNT(QUESTION_ID) ");
		sql.append("   FROM MST_QUESTION ) +  ").append(addCount).append(" )");

		// 処理結果を返却する。
		return super.find(sql.toString()).size() > 0;
	}

	/**
	 * 解答解説マスタに登録する
	 * @param answerDto
	 * @param loginDto
	 */
	public void registAnswer(AnswerDto answerDto) {
		// SQLを組み立てる。
		StringBuffer sql = new StringBuffer();
		sql.append("INSERT INTO ");
		sql.append("   MST_ANSWER ");
		sql.append("  ( ");
		sql.append("    ANSWER_ID, ");
		sql.append("    ANSWER, ");
		sql.append("    KAISETSU, ");
		sql.append("    INS_DATE, ");
		sql.append("    INS_USER ");
		sql.append("  ) ");
		sql.append(" VALUES ");
		sql.append(" ( ");
		sql.append("'").append(answerDto.getAnswerId()).append("'");
		sql.append(",");
		sql.append("'").append(answerDto.getAnswer()).append("'");
		sql.append(",");
		sql.append("'").append(answerDto.getKaisetsu()).append("'");
		sql.append(",");
		sql.append("SYSDATE");
		sql.append(",");
		sql.append("'").append(answerDto.getInsUser()).append("'");
		sql.append(" ) ");

		super.update(sql.toString());
	}

	/**
	 * 問題マスタに登録する
	 * @param questionDto
	 * @param loginDto
	 */
	public void registQuestion(QuestionDto questionDto) {
		// SQLを組み立てる。
		StringBuffer sql = new StringBuffer();
		sql.append("INSERT INTO ");
		sql.append("   MST_QUESTION ");
		sql.append("  ( ");
		sql.append("    QUESTION_ID, ");
		sql.append("    CATEGORY_ID, ");
		sql.append("    ANSWER_ID, ");
		sql.append("    SENTAKU_A, ");
		sql.append("    SENTAKU_B, ");
		sql.append("    SENTAKU_C, ");
		sql.append("    SENTAKU_D, ");
		sql.append("    QUESTION, ");
		sql.append("    QUESTION_TITLE, ");
		sql.append("    INS_DATE, ");
		sql.append("    INS_USER ");
		sql.append("  ) ");
		sql.append(" VALUES ");
		sql.append(" ( ");
		sql.append("'").append(questionDto.getQuestionId()).append("'");
		sql.append(",");
		sql.append("'").append(questionDto.getCategoryId()).append("'");
		sql.append(",");
		sql.append("'").append(questionDto.getAnswerId()).append("'");
		sql.append(",");
		sql.append("'").append(questionDto.getSentakuA()).append("'");
		sql.append(",");
		sql.append("'").append(questionDto.getSentakuB()).append("'");
		sql.append(",");
		sql.append("'").append(questionDto.getSentakuC()).append("'");
		sql.append(",");
		sql.append("'").append(questionDto.getSentakuD()).append("'");
		sql.append(",");
		sql.append("'").append(questionDto.getQuestion()).append("'");
		sql.append(",");
		sql.append("'").append(questionDto.getQuestionTitle()).append("'");
		sql.append(",");
		sql.append("SYSDATE");
		sql.append(",");
		sql.append("'").append(questionDto.getInsUser()).append("'");
		sql.append(" ) ");

		super.update(sql.toString());
	}

	/**
	 * 解答解説マスタを更新する
	 * @param answerDto
	 * @param loginDto
	 */
	public void updateAnswer(AnswerDto answerDto) {
		// SQLを組み立てる。
		StringBuffer sql = new StringBuffer();
		sql.append("UPDATE ");
		sql.append("   MST_ANSWER ");
		sql.append("    SET ANSWER = '").append(answerDto.getAnswer()).append("'");
		sql.append("      , KAISETSU = '").append(answerDto.getKaisetsu()).append("'");
		sql.append("      , UPD_USER = '").append(answerDto.getUpdUser()).append("'");
		sql.append("      , UPD_DATE = SYSDATE");
		sql.append("   WHERE ANSWER_ID = '").append(answerDto.getAnswerId()).append("'");

		super.update(sql.toString());
	}

	/**
	 * 問題マスタを更新する
	 * @param questionDto
	 * @param loginDto
	 */
	public void updateQuestion(QuestionDto questionDto) {
		// SQLを組み立てる。
		StringBuffer sql = new StringBuffer();
		sql.append("UPDATE ");
		sql.append("   MST_QUESTION ");
		sql.append("    SET CATEGORY_ID = '").append(questionDto.getCategoryId()).append("'");
		sql.append("      , ANSWER_ID = '").append(questionDto.getAnswerId()).append("'");
		sql.append("      , SENTAKU_A = '").append(questionDto.getSentakuA()).append("'");
		sql.append("      , SENTAKU_B = '").append(questionDto.getSentakuB()).append("'");
		sql.append("      , SENTAKU_C = '").append(questionDto.getSentakuC()).append("'");
		sql.append("      , SENTAKU_D = '").append(questionDto.getSentakuD()).append("'");
		sql.append("      , QUESTION = '").append(questionDto.getQuestion()).append("'");
		sql.append("      , QUESTION_TITLE = '").append(questionDto.getQuestionTitle()).append("'");
		sql.append("      , UPD_DATE = SYSDATE");
		sql.append("      , UPD_USER = '").append(questionDto.getUpdUser()).append("'");
		sql.append("   WHERE QUESTION_ID = '").append(questionDto.getQuestionId()).append("'");
		
		super.update(sql.toString());
	}

}
