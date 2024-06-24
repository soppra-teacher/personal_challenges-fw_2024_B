package cashbook.dto.menu;

import java.util.List;

/**
 * 講師メニュー画面DTOクラス
 */
public class TeacherMenuDto {

	/** 問題ID */
	private String questionId;
	
	/** 教科 */
	private String subject;
	
	/** 分類 */
	private String category;
	
	/** 問題タイトル */
	private String questionTitle;
	
	/** 問題 */
	private String question;
	
	/** 解答 */
	private String answer;
	
	/** 解説 */
	private String kaisetsu;
	
	/** 一覧表示用 */
	private List<TeacherMenuDto> list;
	
	
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
	
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
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
//	
	public List<TeacherMenuDto> getList() {
		return list;
	}

	public void setList(List<TeacherMenuDto> list) {
		this.list = list;
	}
}
