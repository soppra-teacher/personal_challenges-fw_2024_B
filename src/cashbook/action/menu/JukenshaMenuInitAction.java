package cashbook.action.menu;

import static cashbook.util.Const.*;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import cashbook.action.common.BaseAction;
import cashbook.dto.common.LoginDto;
import cashbook.dto.menu.JukenshaMenuDto;
import cashbook.util.JukenshaMenuConst;

public class JukenshaMenuInitAction extends BaseAction {

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
		
		//
		// 初期表示
		//
		JukenshaMenuDto dto = new JukenshaMenuDto();
		// 教科のラジオボタンで、Javaが選択されているように設定
		dto.setSubjectRadio(JUKENSHA_MENU_SELECT_JAVA_ON);
		// 問題数ドロップダウンに値を設定
		var questionNumebr =  new ArrayList<String>() {};
		questionNumebr.add("5");
		questionNumebr.add("10");
		questionNumebr.add("15");
		questionNumebr.add("20");
		
		// 取得した情報をリクエストに設定
		request.setAttribute(JukenshaMenuConst.FORM_JUKENSHA_MENU, dto);

		// 処理成功時の遷移先を指定する。
		return map.findForward(ACTION_FOWARD_SUCCESS);
	}

}
