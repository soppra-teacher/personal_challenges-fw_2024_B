package cashbook.dao.menu;

import java.util.Map;

import cashbook.dao.common.BaseDaoImpl;

public class JukenshaMenuDaoImpl extends BaseDaoImpl implements JukenshaMenuDao {

	/**
	 * Javaの問題件数を取得
	 * @param formMap フォーム項目
	 * @return 問題数
	 */
	public int getJavaQuestionCount(Map<String, Object> formMap) {

		return 0;
	}

	/**
	 * SQLの問題件数を取得
	 * @param formMap フォーム項目
	 * @return 問題数
	 */
	public int getSQLQuestionCount(Map<String, Object> formMap) {

		return 0;
	}
}
