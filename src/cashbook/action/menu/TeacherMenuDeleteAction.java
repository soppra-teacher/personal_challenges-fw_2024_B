package cashbook.action.menu;

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
import cashbook.service.menu.TeacherMenuService;
import cashbook.util.CommonUtil;
import cashbook.util.TeacherMenuConst;

public class TeacherMenuDeleteAction extends BaseAction {

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

		// フォームの値を取得する。
		Map<String, Object> formMap = CommonUtil.getFormMap((DynaActionForm) form);

		// 選択された問題IDを取得
		String questionId = CommonUtil.getStr(formMap.get(TeacherMenuConst.VIEW_TEACHER_QUESTION_ID));

		// 削除処理
		teacherMenuService.deleteQA(questionId, loginDto);

		// 処理成功時の遷移先を指定する。
		return map.findForward(ACTION_FOWARD_SUCCESS);
		
	}
}
