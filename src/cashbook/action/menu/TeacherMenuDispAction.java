package cashbook.action.menu;

import static cashbook.util.Const.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

/**
 * 講師メニュー画面ディスパッチアクションクラス
 */
public class TeacherMenuDispAction  extends DispatchAction {

	/** 削除 */
	public ActionForward delete(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		return mapping.findForward(ACTION_FOWARD_DELETE);
	}
}
