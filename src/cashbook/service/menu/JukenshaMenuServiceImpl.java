package cashbook.service.menu;

import java.util.LinkedHashMap;
import java.util.Map;

import cashbook.dao.menu.JukenshaMenuDao;

public class JukenshaMenuServiceImpl implements JukenshaMenuService {

	/** 受験者メニューDao */
	private JukenshaMenuDao jukenshaMenuDao;

	/**
	 * 受験者ニューDAOを設定します。
	 * @param TeacherMenuDao 講師メニューDao
	 */
	public void setJukenshaMenuDao(JukenshaMenuDao jukenshaMenuDao) {
		this.jukenshaMenuDao = jukenshaMenuDao;
	}

	/**
	 * JAVA問題数を取得
	 * @param formMap
	 * @return 問題数
	 */
	public Map<String, String> getJavaQuestionCount(Map<String, Object> formMap) {

		// Javaの問題数を取得
		int max = jukenshaMenuDao.getJavaQuestionCount(formMap);

		// 取得した問題数を返却用変数に格納
		Map<String, String> result = new LinkedHashMap<String, String>();

		// 問題を5問ずつに区切る
		int count = 1;
		int ans = 0;
		while (true) {

			ans = count * 5;
			count++;

			if (max < ans) {
				result.put(String.valueOf(max), max + "問");
				break;
			}

			result.put(String.valueOf(ans), ans + "問");
		}

		return result;
	}

	/**
	 * SQL問題数を取得
	 * @param formMap
	 * @return 問題数
	 */
	public Map<String, String> getSQLQuestionCount(Map<String, Object> formMap) {

		// SQLの問題数を取得
		int max = jukenshaMenuDao.getSQLQuestionCount(formMap);

		// 取得した問題数を返却用変数に格納
		Map<String, String> result = new LinkedHashMap<String, String>();

		int count = 1;
		int ans = 0;
		while (true) {

			ans = count * 5;
			count++;

			if (max < ans) {
				result.put(String.valueOf(max), max + "問");
				break;
			}

			result.put(String.valueOf(ans), ans + "問");
		}

		return result;
	}

}
