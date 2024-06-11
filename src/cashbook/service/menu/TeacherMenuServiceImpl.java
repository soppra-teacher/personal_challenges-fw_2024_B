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
	 * 一覧画面検索メソッド
	 */
	@Override
	public List<TeacherMenuDto> listSearch(Map<String, Object> formMap) {
		//------------------------------------------
		// 一覧
		//------------------------------------------
		List<TeacherMenuDto> resultlist = new ArrayList<TeacherMenuDto>();
		// 検索処理
		List<Map<String, String>> list = teacherMenuDao.searchQuestion(formMap);
		Iterator<Map<String, String>> it = list.iterator();
		while (it.hasNext()) {
			Map<String, String> map = it.next();
			TeacherMenuDto dto = new TeacherMenuDto();
			dto.setQuestionId(map.get("QUESTION_ID"));
			dto.setSubject(map.get("SUBJECT"));
			dto.setCategory(map.get("CATEGORY"));
			dto.setQuestion(map.get("QUESTION"));
			dto.setAnswer(map.get("ANSWER"));
			
			resultlist.add(dto);
		}
		return resultlist;
	}
}
