package cashbook.service.menu;

import java.util.LinkedHashMap;
import java.util.Map;

import cashbook.dao.menu.JukenshaMenuDao;

public class JukenshaMenuServiceImpl implements JukenshaMenuService {

	/** 受験者メニューDao */
	private JukenshaMenuDao jukenshaMenuDao;

	/**
	 * 受験者ニューDAOを設定します。
	 * @param JukenshaMenuDao 講師メニューDao
	 */
	public void setJukenshaMenuDao(JukenshaMenuDao jukenshaMenuDao) {
		this.jukenshaMenuDao = jukenshaMenuDao;
	}

	/**
	 * Java問題数を取得
	 * @return Javaの問題数
	 */
	public Map<String, String> getJavaQuestionCount() {

		// Javaの問題数を取得
		int max = jukenshaMenuDao.getJavaQuestionCount();

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
	 * @return SQLの問題数
	 */
	public Map<String, String> getSQLQuestionCount() {

		// SQLの問題数を取得
		int max = jukenshaMenuDao.getSQLQuestionCount();

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

}
