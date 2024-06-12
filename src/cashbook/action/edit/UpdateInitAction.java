package cashbook.action.edit;

import static cashbook.util.Const.*;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;

import cashbook.action.common.BaseAction;
import cashbook.dto.common.LoginDto;
import cashbook.dto.edit.EditDto;
import cashbook.service.edit.EditService;
import cashbook.util.CommonUtil;
import cashbook.util.EditConst;

public class UpdateInitAction extends BaseAction {
	
	/** 登録・更新画面サービス */
	private EditService editService;

	/**
	 * 登録・更新画面サービスを設定します。
	 * @param EditService 登録・更新画面
	 */
	public void setEditService(EditService editService) {
		this.editService = editService;
	}

	/**
	 * <p><b>
	 * 登録・更新画面
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

		// フォームの値を取得する。
		Map<String, Object> formMap = CommonUtil.getFormMap((DynaActionForm) form);
		
		// 更新モードでの初期表示を行う。
		EditDto dto = editService.updateInit(formMap);
		
		// 取得した情報をリクエストに設定
		request.setAttribute(EditConst.FORM_TEACHER_EDIT, dto);

		// 取得した情報をセッションに設定
		request.getSession().setAttribute(SESSION_DTO_QUESTION_REGIST, "");
		request.getSession().setAttribute(SESSION_DTO_QUESTION_UPDATE, dto);
		
		// 処理成功時の遷移先を指定する。
		return map.findForward(ACTION_FOWARD_SUCCESS);
	}

}
