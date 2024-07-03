package cashbook.dto.qa;

import cashbook.dto.common.BaseDto;

public class QaHistoryDto extends BaseDto {
	
	/** 問題ID */
	private String questionId;
	
	/** ユーザの解答 */
	private String userSelectAnswer;

	public String getQuestionId() {
		return questionId;
	}

	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}

	public String getUserSelectAnswer() {
		return userSelectAnswer;
	}

	public void setUserSelectAnswer(String userSelectAnswer) {
		this.userSelectAnswer = userSelectAnswer;
	}
}
