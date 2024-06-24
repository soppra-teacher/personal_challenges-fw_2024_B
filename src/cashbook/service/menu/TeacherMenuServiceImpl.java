package cashbook.service.menu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import cashbook.dao.menu.TeacherMenuDao;
import cashbook.dto.common.LoginDto;
import cashbook.dto.menu.TeacherMenuDto;

public class TeacherMenuServiceImpl implements TeacherMenuService {

	/** 講師メニューDao */
	private TeacherMenuDao teacherMenuDao;

	/**
	 * 講師メニューDAOを設定します。
	 * @param TeacherMenuDao 講師メニューDao
	 */
	public void setTeacherMenuDao(TeacherMenuDao teacherMenuDao) {
		this.teacherMenuDao = teacherMenuDao;
	}

	/**
	 * 問題・解答一覧表示テーブル用検索メソッド
	 * @return 問題・解答
	 */
	public List<TeacherMenuDto> listSearch() {

		List<TeacherMenuDto> resultlist = new ArrayList<TeacherMenuDto>();

		// 講師メニュー画面用の一覧データを検索する
		List<Map<String, String>> list = teacherMenuDao.searchQuestion();

		// 検索結果を返却用変数の各項目に設定
		Iterator<Map<String, String>> it = list.iterator();
		while (it.hasNext()) {
			Map<String, String> map = it.next();
			TeacherMenuDto dto = new TeacherMenuDto();
			dto.setQuestionId(map.get("QUESTION_ID"));
			dto.setSubject(map.get("SUBJECT"));
			dto.setCategory(map.get("CATEGORY"));
			dto.setQuestionTitle(map.get("QUESTION_TITLE"));
			dto.setQuestion(map.get("QUESTION"));
			dto.setAnswer(map.get("ANSWER"));
			dto.setKaisetsu(map.get("KAISETSU"));

			resultlist.add(dto);
		}

		return resultlist;
	}

	/**
	 * 引数問題IDの問題を削除する
	 * @param 問題ID
	 * @param ログイン情報
	 */
	public void deleteQA(String questioId, LoginDto loginDto) {

		teacherMenuDao.deleteQuestion(questioId, loginDto);

	}
}
