package cashbook.action.menu;

import static cashbook.util.Const.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import cashbook.action.common.BaseAction;
import cashbook.dto.common.LoginDto;
import cashbook.dto.menu.JukenshaMenuDto;
import cashbook.service.menu.JukenshaMenuService;
import cashbook.util.JukenshaMenuConst;

public class JukenshaMenuInitAction extends BaseAction {

	/** 受験者メニューサービス */
	private JukenshaMenuService jukenshaMenuService;

	/**
	 * 受験者メニューサービスを設定します。
	 * @param jukenshaMenuService 受験者メニューサービス
	 */
	public void setJukenshaMenuService(JukenshaMenuService jukenshaMenuService) {
		this.jukenshaMenuService = jukenshaMenuService;
	}

	/**
	 * <p><b>
	 * 受験者メニュー画面
	 * <br>初期表示処理
	 * </b></p>
	 *
	 * @param map      アクションマッピング
	 * @param form     フォーム
	 * @param request  リクエスト
	 * @param response レスポンス
	 * @param loginDto ログイン情報DTO
	 * @return アクションフォワード
	 * @throws Exception すべての例外
	 */
	protected ActionForward doProcess(ActionMapping map, ActionForm form,
			HttpServletRequest request, HttpServletResponse response, LoginDto loginDto) throws Exception {

		JukenshaMenuDto dto = new JukenshaMenuDto();
		// 教科のラジオボタンで、Javaが選択されているように設定
		dto.setSubjectRadio(SELECT_JAVA_ON);
		// Javaの問題数を問題数ドロップダウンに設定
		dto.setJavaQuestionNumber(jukenshaMenuService.getJavaQuestionCount());
		// SQLの問題数を問題数ドロップダウンに設定
		dto.setSqlQuestionNumber(jukenshaMenuService.getSQLQuestionCount());

		// 取得した情報をリクエストに設定
		request.setAttribute(JukenshaMenuConst.FORM_JUKENSHA_MENU, dto);
		// 出題設定保持用のセッションをクリア
		request.getSession().setAttribute(SESSION_DTO_QUESTION_ANSWER_SETTING, EMPTY);

		// 処理成功時の遷移先を指定する。
		return map.findForward(ACTION_FOWARD_SUCCESS);
	}

}
