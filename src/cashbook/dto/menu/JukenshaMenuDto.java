package cashbook.dto.menu;

import java.util.List;

public class JukenshaMenuDto {

	/** 教科選択用のラジオボタン */
	private String subjectRadio;

	/** 問題数Key */
	private String questionNumberKey;

	/** 問題数 */
	private List<String> questionNumber;

	public String getSubjectRadio() {
		return subjectRadio;
	}

	public void setSubjectRadio(String subjectRadio) {
		this.subjectRadio = subjectRadio;
	}

	public String getQuestionNumberKey() {
		return questionNumberKey;
	}

	public void setQuestionNumberKey(String questionNumberKey) {
		this.questionNumberKey = questionNumberKey;
	}

	public List<String> getQuestionNumber() {
		return questionNumber;
	}

	public void setQuestionNumber(List<String> questionNumber) {
		this.questionNumber = questionNumber;
	}

}
