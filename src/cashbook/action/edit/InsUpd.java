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
import cashbook.service.edit.EditService;
import cashbook.util.CommonUtil;

/**
 * 登録・更新画面 登録・更新アクションクラス
 * @author soppra
 */
public class InsUpd extends BaseAction {

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
		
		

		// 処理成功時の遷移先を指定する。
		return map.findForward(ACTION_FOWARD_SUCCESS);
	}
}
