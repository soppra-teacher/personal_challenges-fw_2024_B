package cashbook.action.common;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.apache.struts.action.DynaActionForm;

import cashbook.dto.common.LoginDto;
import cashbook.service.common.LoginService;
import cashbook.util.CommonUtil;
import cashbook.util.Const;

/**
 * ログインアクションクラス
 * @author soppra
 */
public class LoginAction extends Action {

	/** ログインサービス */
	private LoginService loginService;

	/**
	 * ログインサービスを設定します。
	 * @param loginService ログインサービス
	 */
	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}

	/**
	 * <p><b>
	 * ログイン画面
	 * <br>ログイン処理
	 * </b></p>
	 * struts-configのActionに設定された場合に起動する処理です。<br>
	 *
	 * @param map      アクションマッピング
	 * @param form     フォーム
	 * @param request  リクエスト
	 * @param response レスポンス
	 * @return アクションフォワード
	 * @throws Exception すべての例外
	 */
	@Override
	public ActionForward execute(ActionMapping map, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		// フォームの値を取得
		Map<String, Object> formMap = CommonUtil.getFormMap((DynaActionForm) form);

		// フォームの値をもとに、ログイン処理
		LoginDto loginDto = loginService.execute(formMap);

		// ログイン情報DTO.ユーザIDが設定されている場合
		if (loginDto.getUserId() != null) {
			
			// ログイン日を更新
			loginService.updateLoginDate(formMap);

			// ログイン成功
			request.getSession().setAttribute(Const.SESSION_LOGIN_DTO, loginDto);

			if (loginDto.getTeacherFlg().equals(Const.TEACHER_FLG_ON)) {

				// 講師のメニュー画面へ遷移
				return map.findForward(Const.ACTION_FOWARD_TEACHER_MENU);

			} else {

				// 受験者のメニュー画面へ遷移
				return map.findForward(Const.ACTION_FOWARD_JUKENSHA_MENU);

			}

		} else {

			// ログイン失敗
			ActionErrors errors = new ActionErrors();
			// ログイン失敗メッセージを設定
			errors.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(Const.MSG_ERRORS_LOGIN_ERROR));
			// リクエストにエラーを設定する
			saveErrors(request, errors);

			// このアクションのinputプロパティに対応する ActionForwardを（必要に応じて）生成して返す
			return map.getInputForward();

		}
	}
}