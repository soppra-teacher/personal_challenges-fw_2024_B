window.addEventListener("DOMContentLoaded", () => {

	//教科の分類を格納するドロップダウンリストのエレメントを取得
	let javaSelect = document.getElementsByName("categoryKeyJava")[0];
	let sqlSelect = document.getElementsByName("categoryKeySql")[0];

	//教科を選択するラジオボタンのエレメントを取得
	let radioBtns = document.getElementsByName("subject");

	//分類ドロップダウンリストの初期表示
	if (radioBtns[0].checked) {
		javaSelect.className = "select";
		sqlSelect.className = "hide";
	} else {
		javaSelect.className = "hide";
		sqlSelect.className = "select";
	}

	radioBtns[0].addEventListener("change", () => {

		javaSelect.className = "select";
		sqlSelect.className = "hide";

	});

	radioBtns[1].addEventListener("change", () => {

		javaSelect.className = "hide";
		sqlSelect.className = "select";

	});

});