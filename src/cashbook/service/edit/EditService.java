package cashbook.service.edit;

import java.util.Map;

import cashbook.dto.common.LoginDto;
import cashbook.dto.edit.EditDto;

public interface EditService {

	/**
	 * 登録・更新画面(登録モード)の初期表示を行う。
	 */
	public EditDto registInit(Map<String, Object> formMap);

	/**
	 * 登録・更新画面(更新モード)の初期表示を行う。
	 * @return 更新対象の問題・解答
	 */
	public EditDto updateInit(Map<String, Object> formMap);

	/**
	 * 問題と解答解説を登録する
	 * @param formMap
	 * @param loginDto
	 */
	public void registQuestionAnswer(Map<String, Object> formMap, LoginDto loginDto) throws Exception;
	
	/**
	 * 問題と解答解説を更新する
	 * @param formMap
	 * @param loginDto
	 */
	public void updateQuestionAnswer(Map<String, Object> formMap, LoginDto loginDto) throws Exception;

}