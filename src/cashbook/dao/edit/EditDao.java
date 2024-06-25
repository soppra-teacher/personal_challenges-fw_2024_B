package cashbook.dao.edit;

import java.util.Map;

import cashbook.dto.edit.AnswerDto;
import cashbook.dto.edit.QuestionDto;

/**
 * 登録・更新画面DAOインターフェース
 */
public interface EditDao {

	/**
	 * Javaの分類を取得
	 * @return Map<String, String> 分類ID:分類
	 */
	public Map<String, String> getJavaCategory();

	/**
	 * SQLの分類を取得
	 * @return Map<String, String> 分類ID:分類
	 */
	public Map<String, String> getSQLCategory();

	/**
	 * 引数の問題IDの問題と対応する解答を検索する
	 * @param questionId 問題ID
	 * @return 問題と解答
	 */
	public Map<String, String> findQuestionAnswer(String questionId);

	/**
	 * 問題マスタのデータ件数を取得する
	 * @return　データ件数
	 */
	public int getQuestionCount();

	/**
	 * 解答解説マスタのデータ件数を取得する
	 * @return　データ件数
	 */
	public int getAnswerCount();

	/**
	 * データ件数に引数分足した問題IDが存在するかチェックを行う
	 * @param データ件数に足す数
	 * @return IDが存在する場合はTrue、しない場合はFalseを返却
	 */
	public boolean isExistQuestionId(int addCount);

	/**
	 * データ件数に引数分足した解答解説IDが存在するかチェックを行う
	 * @param データ件数に足す数
	 * @return IDが存在する場合はTrue、しない場合はFalseを返却
	 */
	public boolean isExistAnswerId(int addCount);

	/**
	 * 解答解説マスタに登録するためのSQLを作成する
	 * @param answerDto
	 */
	public void registAnswer(AnswerDto answerDto);

	/**
	 * 問題マスタに登録するためのSQLを作成する
	 * @param questionDto
	 */
	public void registQuestion(QuestionDto questionDto);

	/**
	 * 解答解説マスタを更新するためのSQLを作成する
	 * @param answerDto
	 */
	public void updateAnswer(AnswerDto answerDto);

	/**
	 * 問題マスタを更新するためのSQLを作成する
	 * @param questionDto
	 */
	public void updateQuestion(QuestionDto questionDto);
	
	/**
	 * 問題マスタをロックする
	 */
	public void lockMstQuestion();
	
	/**
	 * 解答解説マスタをロックする
	 */
	public void lockMstAnswer();

}
