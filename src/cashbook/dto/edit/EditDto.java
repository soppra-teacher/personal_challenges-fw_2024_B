package cashbook.dto.edit;

import java.util.Map;

public class EditDto {
	
	/** 問題ID */
	private String questionId;
	
	/** 教科 */
	private String subject;
	
	/** 分類KEY */
	private String categoryKey;
	
	/** 分類 */
	private Map<String, String> category;
	
	/** 問題タイトル */
	private String questionTitle;
	
	/** 問題 */
	private String question;
	
	/** 選択肢A */
	private String sentakuA;
	
	/** 選択肢B */
	private String sentakuB;
	
	/** 選択肢C */
	private String sentakuC;
	
	/** 選択肢D */
	private String sentakuD;
	
	/** 解答KEY */
	private String answerKey;
	
	/** 解答 */
	private Map<String, String> answer;
	
	/** 解説 */
	private String kaisetsu;
	
	public String getQuestionId() {
		return questionId;
	}

	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String getCategoryKey() {
		return categoryKey;
	}

	public void setCategoryKey(String categoryKey) {
		this.categoryKey = categoryKey;
	}
	
	public Map<String, String> getCategory() {
		return category;
	}

	public void setCategory(Map<String, String> category) {
		this.category = category;
	}
	
	public String getQuestionTitle() {
		return questionTitle;
	}

	public void setQuestionTitle(String questionTitle) {
		this.questionTitle = questionTitle;
	}
	
	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
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
	
	public String getAnswerKey() {
		return answerKey;
	}

	public void setAnswerKey(String answerKey) {
		this.answerKey = answerKey;
	}
	
	public Map<String, String> getAnswer() {
		return answer;
	}

	public void setAnswer(Map<String, String> answer) {
		this.answer = answer;
	}
	
	public String getKaisetsu() {
		return kaisetsu;
	}

	public void setKaisetsu(String kaisetsu) {
		this.kaisetsu = kaisetsu;
	}
}
