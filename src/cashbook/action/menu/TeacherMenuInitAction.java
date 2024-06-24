package cashbook.action.menu;

import static cashbook.util.Const.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import cashbook.action.common.BaseAction;
import cashbook.dto.common.LoginDto;
import cashbook.dto.menu.TeacherMenuDto;
import cashbook.service.menu.TeacherMenuService;
import cashbook.util.TeacherMenuConst;

public class TeacherMenuInitAction extends BaseAction {

	/** 講師メニューサービス */
	private TeacherMenuService teacherMenuService;

	/**
	 * 講師メニューサービスを設定します。
	 * @param teacherMenuService 講師メニューサービス
	 */
	public void setTeacherMenuService(TeacherMenuService teacherMenuService) {
		this.teacherMenuService = teacherMenuService;
	}

	/**
	 * <p><b>
	 * 講師メニュー画面
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

		// 初期表示情報を取得
		TeacherMenuDto dto = new TeacherMenuDto();
		dto.setList(teacherMenuService.listSearch());

		// 取得した情報をリクエストに設定
		request.setAttribute(TeacherMenuConst.VIEW_TEACHER_QUESTION_ID, new TeacherMenuDto());

		// 取得した情報をセッションに設定
		request.getSession().setAttribute(SESSION_LIST_DTO_TEACHER, dto);

		// 処理成功時の遷移先を指定する。
		return map.findForward(ACTION_FOWARD_SUCCESS);
	}
}
