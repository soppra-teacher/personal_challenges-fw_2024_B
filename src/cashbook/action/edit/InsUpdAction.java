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
public class InsUpdAction extends BaseAction {

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

		//				System.out.println("SUBJECT: " + formMap.get(EditConst.KEY_SUBJECT_EDIT));
		//				System.out.println("JAVA CATEGORY KEY: " + formMap.get(EditConst.KEY_CATEGORY_KEY_JAVA_EDIT));
		//				System.out.println("SQL CATEGORY KEY: " + formMap.get(EditConst.KEY_CATEGORY_KEY_SQL_EDIT));
		//				System.out.println("CATEGORY: " + formMap.get(EditConst.KEY_CATEGORY_EDIT));
		//				System.out.println("QUESTION TITLE: " + formMap.get(EditConst.KEY_QUESTIONTITLE_EDIT));
		//				System.out.println("QUESTION: " + formMap.get(EditConst.KEY_QUESTIO_EDIT));
		//				System.out.println("SENTAKUSHI A: " + formMap.get(EditConst.KEY_SENTAKU_A_EDIT));
		//				System.out.println("SENTAKUSHI B: " + formMap.get(EditConst.KEY_SENTAKU_B_EDIT));
		//				System.out.println("SENTAKUSHI C: " + formMap.get(EditConst.KEY_SENTAKU_C_EDIT));
		//				System.out.println("SENTAKUSHI D: " + formMap.get(EditConst.KEY_SENTAKU_D_EDIT));
		//				System.out.println("ANSWER KEY: " + formMap.get(EditConst.KEY_ANSWER_KEY_EDIT));
		//				System.out.println("ANSWER: " + formMap.get(EditConst.KEY_ANSWER_EDIT));
		//				System.out.println("KAISETSU: " + formMap.get(EditConst.KEY_KAISETSU_EDIT));

		// 登録処理を実行
		editService.registQuestionAnswer(formMap, loginDto);

		// 処理成功時の遷移先を指定する。
		return map.findForward(ACTION_FOWARD_SUCCESS);
	}
}
