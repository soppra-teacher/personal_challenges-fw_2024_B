package cashbook.dto.qa;

public class QADto {
	
	/** 教科 */
	private String subject;
	
	/** 出題数 */
	private int questionCount;
	
	/** 現在の出題数 */
	private int currentQuestionCount;
	
	/** 
	 * 現在の出題数を+1する
	 */
	public void incrementCurrentQuestionCount() {
		int currentQuestionCount = this.getCurrentQuestionCount();
		this.setCurrentQuestionCount(++currentQuestionCount);
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getQuestionCount() {
		return questionCount;
	}

	public void setQuestionCount(int questionCount) {
		this.questionCount = questionCount;
	}

	public int getCurrentQuestionCount() {
		return currentQuestionCount;
	}

	public void setCurrentQuestionCount(int currentQuestionCount) {
		this.currentQuestionCount = currentQuestionCount;
	}
}
