package cashbook.service.qa;

import java.util.Map;

import cashbook.dto.common.LoginDto;
import cashbook.dto.qa.QaDto;
import cashbook.dto.qa.QaSettingDto;

public interface QaService {

	/**
	 * 引数の出題設定をもとに問題と解答を取得する
	 * @param QASettingDto
	 * @return QaDto
	 */
	public QaDto getQA(QaSettingDto setting);

	/**
	 * 引数の登録データを解答履歴テーブルに登録
	 * @param formMap
	 * @param loginDto
	 * @param berforeQuestionId
	 */
	public void insHistory(Map<String, Object> formMap, LoginDto loginDto, String berforeQuestionId);

}
