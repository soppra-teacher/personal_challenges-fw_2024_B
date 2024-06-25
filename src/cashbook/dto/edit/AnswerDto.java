package cashbook.dto.edit;

import cashbook.dto.common.BaseDto;

/**
 * 解答解説マスタDTOクラス
 */
public class AnswerDto extends BaseDto {

	/** 解答解説ID */
	private String answerId;

	/** 解答 */
	private String answer;

	/** 解説 */
	private String kaisetsu;

	public String getAnswerId() {
		return answerId;
	}

	public void setAnswerId(String answerId) {
		this.answerId = answerId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getKaisetsu() {
		return kaisetsu;
	}

	public void setKaisetsu(String kaisetsu) {
		this.kaisetsu = kaisetsu;
	}

}
