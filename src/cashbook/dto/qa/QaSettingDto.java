package cashbook.dto.qa;

public class QaSettingDto {
	
	/** 教科 */
	private String subject;
	
	/** 出題数 */
	private int questionCount;
	
	/** 現在の出題数 */
	private int currentQuestionCount;
	
	/** ひとつ前の問題ID */
	private String beforeQuestionId;
	
	/** 
	 * 現在の出題数を+1する
	 */
	public void incrementCurrentQuestionCount() {
		this.setCurrentQuestionCount(++this.currentQuestionCount);
	}
	
	public String getBeforeQuestionId() {
		return beforeQuestionId;
	}

	public void setBeforeQuestionId(String beforeQuestionId) {
		this.beforeQuestionId = beforeQuestionId;
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
