package cashbook.dto.edit;

import cashbook.dto.common.BaseDto;

/**
 * 問題マスタDTOクラス
 */
public class QuestionDto extends BaseDto {

	/** 問題ID */
	private String questionId;
	
	/** 分類ID */
	private String categoryId;

	/** 解答解説ID */
	private String answerId;
	
	/** 選択肢A */
	private String sentakuA;
	
	/** 選択肢B */
	private String sentakuB;
	
	/** 選択肢C */
	private String sentakuC;
	
	/** 選択肢D */
	private String sentakuD;
	
	/** 問題 */
	private String question;
	
	/** 問題タイトル */
	private String questionTitle;

	public String getQuestionId() {
		return questionId;
	}

	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getAnswerId() {
		return answerId;
	}

	public void setAnswerId(String answerId) {
		this.answerId = answerId;
	}

	public String getSentakuA() {
		return sentakuA;
	}

	public void setSentakuA(String sentakuA) {
		this.sentakuA = sentakuA;
	}

	public String getSentakuB() {
		return sentakuB;
	}

	public void setSentakuB(String sentakuB) {
		this.sentakuB = sentakuB;
	}

	public String getSentakuC() {
		return sentakuC;
	}

	public void setSentakuC(String sentakuC) {
		this.sentakuC = sentakuC;
	}

	public String getSentakuD() {
		return sentakuD;
	}

	public void setSentakuD(String sentakuD) {
		this.sentakuD = sentakuD;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getQuestionTitle() {
		return questionTitle;
	}

	public void setQuestionTitle(String questionTitle) {
		this.questionTitle = questionTitle;
	}
}
