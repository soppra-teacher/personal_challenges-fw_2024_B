package cashbook.util;

/**
 * 共通定数クラス
 */
public class Const {

	/** 空文字 */
	public static final String EMPTY = "";

	/** 遷移先 成功 */
	public static final String ACTION_FOWARD_SUCCESS = "success";
	/** 遷移先 失敗 */
	public static final String ACTION_FOWARD_ERROR = "error";
	/** 遷移先 検索 */
	public static final String ACTION_FOWARD_SEARCH = "search";
	/** 遷移先 削除 */
	public static final String ACTION_FOWARD_DELETE = "delete";
	/** 遷移先 登録 */
	public static final String ACTION_FOWARD_INSERT = "insert";
	/** 遷移先 更新 */
	public static final String ACTION_FOWARD_UPDATE = "update";
	/** 遷移先 戻る(メニュー) */
	public static final String ACTION_FOWARD_BACK_MENU = "backMenu";
	/** 遷移先 戻る(一覧) */
	public static final String ACTION_FOWARD_BACK_LIST = "backList";
	/** 遷移先 オペレーション */
	public static final String ACTION_FOWARD_OPERATION = "operation";
	
	/** 遷移先 講師のメニュー画面 */
	public static final String ACTION_FOWARD_TEACHER_MENU = "teacherMenu";
	/** 遷移先 受験者のメニュー画面 */
	public static final String ACTION_FOWARD_JUKENSHA_MENU = "jukenshaMenu";

	/** ログイン失敗メッセージ */
	public static final String MSG_ERRORS_LOGIN_ERROR = "loginForm.error.login";
	/** 検索結果0件メッセージ */
	public static final String MSG_ERRORS_NO_DATA = "errors.noData";
	/** 削除対象なしメッセージ */
	public static final String MSG_ERRORS_NO_DELETE = "errors.checkDel";
	/** キー重複データ存在ありメッセージ */
	public static final String MSG_ERRORS_PRIMARY_KEY = "errors.overLap";
	/** 排他エラーメッセージ */
	public static final String MSG_ERRORS_DATA_LOCK = "errors.lock";

	/** 登録完了メッセージ */
	public static final String MSG_SUCCESS_INSERT = "messages.success.insert";
	/** 更新完了メッセージ */
	public static final String MSG_SUCCESS_UPDATE = "messages.success.update";
	/** 削除完了メッセージ */
	public static final String MSG_SUCCESS_DELETE = "messages.success.delete";


	/************* セッション情報 *************/
	/** ログイン画面 DTO */
	public static final String SESSION_LOGIN_DTO = "LOGIN_DTO";
	
	/** 講師メニュー画面 DTO */
	public static final String SESSION_LIST_DTO_TEACHER = "TEACHER_LIST_DTO";
	/** 講師メニュー画面 戻り先 */
	public static final String SESSION_LIST_BACK_TEACHER = "TEACHER_LIST_BACK";
	
	/** 受験者メニュー画面 DTO */
	public static final String SESSION_DTO_JUKENSHA = "JUKENSHA_DTO";
	
	/** 登録・更新画面（登録モード） DTO */
	public static final String SESSION_DTO_QUESTION_REGIST = "REGIST_DTO";
	/** 登録・更新画面（更新モード） DTO */
	public static final String SESSION_DTO_QUESTION_UPDATE = "UPDATE_DTO";
	
	/** 問題解答画面 DTO */
	public static final String SESSION_DTO_QUESTION_ANSWER = "QUESTION_ANSWER_DTO";
	
	/************* 区分値 *************/
	/** 教科:Java　ON */
	public static final String SELECT_JAVA_ON = "java";
	/** 教科:Java　OFF */
	public static final String SELECT_JAVA_OFF = "";
	/** 教科:SQL　ON */
	public static final String SELECT_SQL_ON = "sql";
	/** 教科:SQL　OFF */
	public static final String SELECT_SQL_OFF = "";
	/** 教科:Java */
	public static final String SUBJECT_JAVA = "Java";
	/** 教科:SQL */
	public static final String SUBJECT_SQL = "SQL";
	
	/************* ユーザマスタ *************/
	/** 講師フラグ：コード値 1 */
	public static final String TEACHER_FLG_ON = "1";
	/** 講師フラグ：コード値 0 */
	public static final String TEACHER_FLG_OFF = "0";
	
}
