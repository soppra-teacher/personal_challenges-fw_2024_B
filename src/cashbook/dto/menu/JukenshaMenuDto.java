package cashbook.dto.menu;

import java.util.Map;

public class JukenshaMenuDto {

	/** 教科選択用のラジオボタン */
	private String subjectRadio;

	/** Java問題数Key */
	private Map<String, String> javaQuestionNumberKey;
	
	/** SQL問題数Key */
	private Map<String, String> sqlQuestionNumberKey;

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

	public Map<String, String> getJavaQuestionNumberKey() {
		return javaQuestionNumberKey;
	}

	public void setJavaQuestionNumberKey(Map<String, String> javaQuestionNumberKey) {
		this.javaQuestionNumberKey = javaQuestionNumberKey;
	}

	public Map<String, String> getSqlQuestionNumberKey() {
		return sqlQuestionNumberKey;
	}

	public void setSqlQuestionNumberKey(Map<String, String> sqlQuestionNumberKey) {
		this.sqlQuestionNumberKey = sqlQuestionNumberKey;
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
