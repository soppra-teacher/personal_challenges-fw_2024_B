window.addEventListener("DOMContentLoaded", () => {

	// 教科の分類を格納するドロップダウンリストのエレメントを取得
	let javaSelect = document.getElementsByName("categoryKeyJava")[0];
	let sqlSelect = document.getElementsByName("categoryKeySql")[0];

	// 教科を選択するラジオボタンのエレメントを取得
	let radioBtns = document.getElementsByName("subject");

	// 分類ドロップダウンリストの初期表示
	if (radioBtns[0].checked) {
		javaSelect.className = "select";
		sqlSelect.className = "hide";
	} else {
		javaSelect.className = "hide";
		sqlSelect.className = "select";
	}

	//
	//	Javaラジオボタンのチェックイベント
	//
	radioBtns[0].addEventListener("change", () => {

		javaSelect.className = "select";
		sqlSelect.className = "hide";

	});

	//
	//	SQLラジオボタンのチェックイベント
	//
	radioBtns[1].addEventListener("change", () => {

		javaSelect.className = "hide";
		sqlSelect.className = "select";

	});

	//
	//	画面レイアウト１　次へボタン押下イベント
	//
	document.getElementById("btn").addEventListener("click", () => {

		// レイアウト①の初期表示をする登録更新画面のエレメントを取得
		const content1 = document.getElementById("content1");
		const content2 = document.getElementById("content2");
		const content3 = document.getElementById("content3");

		// 問題登録画面の初期表示
		if (content1.className.length == 0) {
			content1.className = "hide";
			content2.className = "";
			content3.className = "hide";
		} else {
			content1.className = "";
			content2.className = "hide";
			content3.className = "hide";
		}

		// 教科　確認表示用のエレメントを取得
		let check_subject = document.getElementById("output1");
		// 教科ラジオボタン要素の取得
		let radio = document.getElementsByName("subject");
		// ラジオボタン選択状態の取得
		for (i = 0; i < radio.length; i++) {
			if (radio[i].checked) {
				// 確認用のエレメントに値を設定
				check_subject.innerHTML = radio[i].value;
			}
		}

		//ラジオボタン要素の取得
		radio = document.getElementsByName("subject");

		//ラジオボタン選択状態の取得
		if (radio[0].checked) {
			const ta4 = document.getElementsByName("categoryKeyJava")[0].selectedIndex;
			var a = document.getElementsByName("categoryKeyJava")[0].options[ta4].label;
			//ラジオボタン選択値の取得
			//　→結果を<div id="output2">要素に出力
			target = document.getElementById("output2");
			target.innerText = a;
		} else {
			//分類セレクトボックスの取得SQL
			const ta5 = document.getElementsByName("categoryKeySql")[0].selectedIndex;
			var a = document.getElementsByName("categoryKeySql")[0].options[ta5].label;
			target = document.getElementById("output2");
			target.innerText = a;
		}

		// 問題タイトルに入力された内容を取得し、確認用のエレメントに設定
		let questionTitle_text = document.getElementsByName("questionTitle")[0].value;
		document.getElementById("output3").innerText = questionTitle_text;

		// 問題文に入力された内容を取得し、確認用のエレメントに設定
		let question_text = document.getElementsByName("question")[0].value;
		document.getElementById("output4").textContent = question_text;

	});

	document.getElementById("btn2").addEventListener("click", () => {

		//初期表示をする登録更新画面のエレメントを取得
		const content1 = document.getElementById("content1");
		const content2 = document.getElementById("content2");
		const content3 = document.getElementById("content3");

		//問題登録画面の初期表示
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

	document.getElementById("updatebtn").addEventListener("click", () => {

		//レイアウト②初期表示をする登録更新画面のエレメントを取得
		const content1 = document.getElementById("content1");
		const content2 = document.getElementById("content2");
		const content3 = document.getElementById("content3");

		//問題登録画面の初期表示
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

	document.getElementById("updatebtn2").addEventListener("click", () => {

		//レイアウト③初期表示をする登録更新画面のエレメントを取得
		const content1 = document.getElementById("content1");
		const content2 = document.getElementById("content2");
		const content3 = document.getElementById("content3");

		//問題登録画面の初期表示
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


	//分類セレクトボックスの取得Java
	document.getElementById("btn2").addEventListener("click", () => {


	});

	//選択肢aテキストボックスの取得
	document.getElementById("btn2").addEventListener("click", () => {
		input = document.getElementsByName("sentakuA")[0].value;
		target = document.getElementById("output5");
		target.innerHTML = input;
	});

	//選択肢bテキストボックスの取得
	document.getElementById("btn2").addEventListener("click", () => {
		input = document.getElementsByName("sentakuB")[0].value;
		target = document.getElementById("output6");
		target.innerHTML = input;
	});

	//選択肢cテキストボックスの取得
	document.getElementById("btn2").addEventListener("click", () => {
		input = document.getElementsByName("sentakuC")[0].value;
		target = document.getElementById("output7");
		target.innerHTML = input;
	});

	//選択肢dテキストボックスの取得
	document.getElementById("btn2").addEventListener("click", () => {
		input = document.getElementsByName("sentakuD")[0].value;
		target = document.getElementById("output8");
		target.innerHTML = input;
	});

	//解答セレクトボックスの取得
	document.getElementById("btn2").addEventListener("click", () => {
		const ta4 = document.getElementsByName("answerKey")[0].value;
		document.getElementById("output9").textContent = ta4;
	});


	//解説テキストエリアの取得
	document.getElementById("btn2").addEventListener("click", () => {
		const ta4 = document.getElementsByName("kaisetsu")[0].value;
		document.getElementById("output10").textContent = ta4;
	});

});
