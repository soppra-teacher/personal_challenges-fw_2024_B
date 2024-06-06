package cashbook.dto.menu;

import java.util.Map;

public class JukenshaMenuDto {

	/** 教科選択用のラジオボタン */
	private String subjectRadio;

	/** 問題数Key */
	private String questionNumberKey;

	/** Java問題数 */
	private Map<String, String> javaQuestionNumber;
	
	/** SQL問題数 */
	private Map<String, String> sqlQuestionNumber;

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

	public Map<String, String> getJavaQuestionNumber() {
		return javaQuestionNumber;
	}

	public void setJavaQuestionNumber(Map<String, String> javaQuestionNumber) {
		this.javaQuestionNumber = javaQuestionNumber;
	}
	
	public Map<String, String> getSqlQuestionNumber() {
		return sqlQuestionNumber;
	}

	public void setSqlQuestionNumber(Map<String, String> sqlQuestionNumber) {
		this.sqlQuestionNumber = sqlQuestionNumber;
	}

}
