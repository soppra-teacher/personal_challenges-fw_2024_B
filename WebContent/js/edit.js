window.addEventListener("DOMContentLoaded", () => {

	//教科の分類を格納するドロップダウンリストのエレメントを取得
	let javaSelect = document.getElementsByName("categoryKeyJava")[0];
	let sqlSelect = document.getElementsByName("categoryKeySql")[0];

	//教科を選択するラジオボタンのエレメントを取得
	let radioBtns = document.getElementsByName("subject");

	//分類ドロップダウンリストの初期表示
	if (radioBtns[0].checked) {
		javaSelect.className = "select select1";
		sqlSelect.className = "hide";
	} else {
		javaSelect.className = "hide";
		sqlSelect.className = "select select1";
	}

	radioBtns[0].addEventListener("change", () => {

		javaSelect.className = "select select1";
		sqlSelect.className = "hide";

	});

	radioBtns[1].addEventListener("change", () => {

		javaSelect.className = "hide";
		sqlSelect.className = "select select1";

	});


	//
	//	画面レイアウト2を表示
	//
	document.getElementById("btn").addEventListener("click", () => {

		const content1 = document.getElementById("content1");
		const content2 = document.getElementById("content2");
		const content3 = document.getElementById("content3");

		if (content1.className.length == 0) {
			content1.className = "hide";
			content2.className = "";
			content3.className = "hide";
		} else {
			content1.className = "";
			content2.className = "hide";
			content3.className = "hide";
		}

	});

	//
	//	画面レイアウト3を表示
	//
	document.getElementById("btn2").addEventListener("click", () => {

		const content1 = document.getElementById("content1");
		const content2 = document.getElementById("content2");
		const content3 = document.getElementById("content3");

		if (content2.className.length == 0) {
			content1.className = "hide";
			content2.className = "hide";
			content3.className = "";
		} else {
			content1.className = "hide";
			content2.className = "";
			content3.className = "hide";
		}

	});


	//
	//	画面レイアウト1を表示
	//
	document.getElementById("updatebtn").addEventListener("click", () => {

		const content1 = document.getElementById("content1");
		const content2 = document.getElementById("content2");
		const content3 = document.getElementById("content3");

		if (content3.className.length == 0) {
			content1.className = "";
			content2.className = "hide";
			content3.className = "hide";
		} else {
			content1.className = "hide";
			content2.className = "hide";
			content3.className = "";
		}

	});

	//
	//	画面レイアウト2を表示
	//
	document.getElementById("updatebtn2").addEventListener("click", () => {

		const content1 = document.getElementById("content1");
		const content2 = document.getElementById("content2");
		const content3 = document.getElementById("content3");

		if (content3.className.length == 0) {
			content1.className = "hide";
			content2.className = "";
			content3.className = "hide";
		} else {
			content1.className = "hide";
			content2.className = "hide";
			content3.className = "";
		}

	});

});