package cashbook.service.menu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import cashbook.dao.menu.TeacherMenuDao;
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
	 * @param formMap
	 */
	@Override
	public List<TeacherMenuDto> listSearch() {
		// 検索処理
		List<TeacherMenuDto> resultlist = new ArrayList<TeacherMenuDto>();
		List<Map<String, String>> list = teacherMenuDao.searchQuestion();
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
}
