package cashbook.service.qa;

import cashbook.dto.qa.QaDto;
import cashbook.dto.qa.QaHistoryDto;
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
	 * @param QaHistoryDto
	 */
	public void insHistory(QaHistoryDto dto);

}
