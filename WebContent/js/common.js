/**
 * アクションを呼び出す共通メソッド
 * @param form
 * @param operation
 * @returns
 */
function callAction(form, operation) {
	form.operation.value = operation;
	var msg = null;
	if (operation == "insert") {
		msg = "登録してもよろしいですか？";
	} else if (operation == "update") {
		msg = "更新してもよろしいですか？";
	} else if (operation == "delete") {
		msg = "削除してもよろしいですか？";
	}
	if (msg != null && !confirm(msg)) {
		return;
	}
	form.submit();
}



window.addEventListener("DOMContentLoaded", () => {

	/**
	 * テキストエリアの入力内容に応じて高さを可変自動調節する
	 */
	document.querySelectorAll("textarea").forEach((ele) => {
		ele.style.cssText = "width : 100%;";
		ele.style.cssText += "height : " + ele.scrollHeight + "px;";
	});

});