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
	 * 引数教科の問題数を取得
	 * @param 教科
	 * @return 問題数
	 */
	public Map<String, String> getQuestionCountDropDown(String subject) {

		// 引数教科の問題数を取得
		int max = jukenshaMenuDao.getQuestionCount(subject);

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
