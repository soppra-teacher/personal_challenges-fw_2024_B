package cashbook.service.edit;

import java.util.Map;

import cashbook.dto.common.LoginDto;
import cashbook.dto.edit.EditDto;

public interface EditService {

	/**
	 * 登録・更新画面(登録モード)の初期表示を行う。
	 * @return EditDto 初期値が格納されたDTO
	 */
	public EditDto registInit();

	/**
	 * 登録・更新画面(更新モード)の初期表示を行う。
	 * @param formMap
	 * @return 更新対象の問題・解答
	 */
	public EditDto updateInit(Map<String, Object> formMap);

	/**
	 * 問題と解答解説を登録する
	 * @param formMap
	 * @param loginDto
	 * @return 成功時はtrue、それ以外はfalse
	 */
	public boolean registQuestionAnswer(Map<String, Object> formMap, LoginDto loginDto) throws Exception;
	
	/**
	 * 問題と解答解説を更新する
	 * @param formMap
	 * @param loginDto
	 * @return 成功時はtrue、それ以外はfalse
	 */
	public boolean updateQuestionAnswer(Map<String, Object> formMap, LoginDto loginDto) throws Exception;

}
