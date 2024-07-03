package cashbook.dto.qa;

public class QaDto {

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

	/** 解答 */
	private String answer;

	/** 解説 */
	private String kaisetsu;

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
