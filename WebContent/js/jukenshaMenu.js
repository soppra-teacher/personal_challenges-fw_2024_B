window.addEventListener("DOMContentLoaded", () => {

	//出題数を取得するドロップダウンリストのエレメントを取得
	let javaSelect = document.getElementsByName("javaQuestionNumberKey")[0];
	let sqlSelect = document.getElementsByName("sqlQuestionNumberKey")[0];

	//教科を選択するラジオボタンのエレメントを取得
	let radioBtns = document.getElementsByName("subjectRadio");

	radioBtns[0].addEventListener("change", () => {

		javaSelect.className = "select";
		sqlSelect.className = "hide";

	});

	radioBtns[1].addEventListener("change", () => {

		javaSelect.className = "hide";
		sqlSelect.className = "select";

	});

});