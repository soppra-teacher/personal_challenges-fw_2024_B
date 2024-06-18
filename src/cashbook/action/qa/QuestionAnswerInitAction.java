package cashbook.action.qa;

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
import cashbook.dto.qa.QADto;
import cashbook.util.CommonUtil;
import cashbook.util.JukenshaMenuConst;

public class QuestionAnswerInitAction extends BaseAction {

	/**
	 * <p><b>
	 * 問題解答画面
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

		if (CommonUtil.isNull(CommonUtil.getStr(request.getSession().getAttribute(SESSION_DTO_QUESTION_ANSWER)))) {

			//
			//	受験者メニュー画面で選択された出題の設定を保持
			//
			QADto dto = new QADto();
			dto.setSubject(CommonUtil.getStr(formMap.get(JukenshaMenuConst.KEY_SUBJECT_RADIO)));
			String str_questionCount = CommonUtil.getStr(formMap.get(JukenshaMenuConst.KEY_JAVA_QUESTION_NUMBER_KEY));
			dto.setQuestionCount(Integer.parseInt(str_questionCount));
			dto.setCurrentQuestionCount(0);
			
			//
			//	最初の問題を出題
			//

			// 現在の出題数を+1
			dto.incrementCurrentQuestionCount();
			
		} else {

			//
			//	次の問題を出題
			//
			
		}

		// 処理成功時の遷移先を指定する。
		return map.findForward(ACTION_FOWARD_SUCCESS);
	}
}
