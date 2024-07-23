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
import cashbook.dto.qa.QaDto;
import cashbook.dto.qa.QaSettingDto;
import cashbook.service.qa.QaService;
import cashbook.util.CommonUtil;
import cashbook.util.JukenshaMenuConst;
import cashbook.util.QaConst;

public class QuestionAnswerInitAction extends BaseAction {

	/** 問題解答サービス */
	private QaService qaService;

	/**
	 * 問題解答サービスを設定します。
	 * @param EditService 問題解答サービス
	 */
	public void setQaService(QaService qaService) {
		this.qaService = qaService;
	}

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

		// 受験者でない場合はエラーページへ移動
		if (isTeacher(request)) {
			return map.findForward(ACTION_FOWARD_ERROR);
		}

		// フォームの値を取得する。
		Map<String, Object> formMap = CommonUtil.getFormMap((DynaActionForm) form);

		QaSettingDto settingDto;
		QaDto qaDto;

		if (CommonUtil
				.isNull(CommonUtil.getStr(request.getSession().getAttribute(SESSION_DTO_QUESTION_ANSWER_SETTING)))) {

			//
			//	受験者メニュー画面で選択された出題の設定を初期化
			//
			settingDto = new QaSettingDto();
			// 選択された教科
			settingDto.setSubject(CommonUtil.getStr(formMap.get(JukenshaMenuConst.KEY_SUBJECT_RADIO)));
			// 選択された問題数
			String str_questionCount = EMPTY;
			if (settingDto.getSubject().equals(SELECT_JAVA_ON)) {
				//
				// 出題設定用のセッションの教科がJavaの場合
				//
				str_questionCount = CommonUtil
						.getStr(formMap.get(JukenshaMenuConst.KEY_JAVA_QUESTION_NUMBER_KEY));

			} else if (settingDto.getSubject().equals(SELECT_SQL_ON)) {
				//
				// 出題設定用のセッションの教科がSQLの場合
				//
				str_questionCount = CommonUtil
						.getStr(formMap.get(JukenshaMenuConst.KEY_SQL_QUESTION_NUMBER_KEY));
			}
			settingDto.setQuestionCount(Integer.parseInt(str_questionCount));
			// 現在の問題数に0を設定
			settingDto.setCurrentQuestionCount(0);
			// ひとつ前の問題IDをクリア
			settingDto.setBeforeQuestionId(EMPTY);

		} else {

			//
			//	出題数のチェック
			//

			// 出題の設定を取得
			settingDto = (QaSettingDto) request.getSession().getAttribute(SESSION_DTO_QUESTION_ANSWER_SETTING);

			if (settingDto.getCurrentQuestionCount() >= settingDto.getQuestionCount()) {

				// 選択した出題数に達した場合は、受験者メニューへ遷移
				return map.findForward(ACTION_FOWARD_JUKENSHA_MENU);

			}
		}

		//
		//	問題を出題
		//

		// 出題する問題と解答を取得
		qaDto = qaService.getQA(settingDto);

		// 現在の出題数を+1
		settingDto.incrementCurrentQuestionCount();

		//
		//	解答履歴を付ける
		//
		if (!CommonUtil.getStr(formMap.get(JukenshaMenuConst.KEY_USER_SELECT_ANSWER)).equals(EMPTY)) {

			// 解答履歴テーブルを更新
			qaService.insHistory(formMap, loginDto, settingDto.getBeforeQuestionId());
		}

		// 取得した情報をセッションに設定
		request.getSession().setAttribute(QaConst.FORM_QUESTION_ANSWER, qaDto);
		// 出題設定をセッションに保持
		request.getSession().setAttribute(SESSION_DTO_QUESTION_ANSWER_SETTING, settingDto);

		// 処理成功時の遷移先を指定する。
		return map.findForward(ACTION_FOWARD_SUCCESS);

	}
}
