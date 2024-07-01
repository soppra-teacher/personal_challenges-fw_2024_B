window.addEventListener("DOMContentLoaded", () => {

	/**
	 * レイアウト切り替え関数
	 * @param 表示するレイアウト番号
	 */
	const showlayout = (layoutNumber) => {

		if (layoutNumber < 1 || layoutNumber > 3) {
			return;
		}

		// 画面レイアウトエレメントを取得
		const content1 = document.getElementById("content1");
		const content2 = document.getElementById("content2");
		const content3 = document.getElementById("content3");

		// 引数に応じて画面を切り替え
		if (layoutNumber == 1) {
			content1.className = "";
			content2.className = "hide";
			content3.className = "hide";
		} else if (layoutNumber == 2) {
			content1.className = "hide";
			content2.className = "";
			content3.className = "hide";
		} else if (layoutNumber == 3) {
			content1.className = "hide";
			content2.className = "hide";
			content3.className = "";
		}
	}

	// 教科の分類を格納するドロップダウンリストのエレメントを取得
	let javaSelect = document.getElementsByName("categoryKeyJava")[0];
	let sqlSelect = document.getElementsByName("categoryKeySql")[0];

	// 教科を選択するラジオボタンのエレメントを取得
	let radioBtns = document.getElementsByName("subject");
	let java_radio = radioBtns[0];
	let sql_radio = radioBtns[1];

	// 分類ドロップダウンリストの初期表示
	if (java_radio.checked) {
		javaSelect.className = "select";
		sqlSelect.className = "hide";
	} else {
		javaSelect.className = "hide";
		sqlSelect.className = "select";
	}

	// 画面レイアウト1を表示
	showlayout(1);

	//
	//	Javaラジオボタンのチェックイベント
	//
	java_radio.addEventListener("change", () => {

		javaSelect.className = "select";
		sqlSelect.className = "hide";

	});

	//
	//	SQLラジオボタンのチェックイベント
	//
	sql_radio.addEventListener("change", () => {

		javaSelect.className = "hide";
		sqlSelect.className = "select";

	});

	//
	//	画面レイアウト1　次へボタン押下イベント
	//
	document.getElementById("btn").addEventListener("click", () => {

		// 画面レイアウト2を表示
		showlayout(2);

		let check_subject = document.getElementById("output1");

		//ラジオボタン選択状態の取得
		if (java_radio.checked) {

			// 確認用エレメントに選択された教科名を設定
			check_subject.innerText = "Java";

			// 選択された分類を確認用エレメントに設定
			let selectIndex = document.getElementsByName("categoryKeyJava")[0].selectedIndex;
			let category = document.getElementsByName("categoryKeyJava")[0].options[selectIndex].label;
			document.getElementById("output2").innerText = category;

		} else {

			// 確認用エレメントに選択された教科名を設定
			check_subject.innerText = "SQL";

			// 選択された分類を確認用エレメントに設定
			let selectIndex = document.getElementsByName("categoryKeySql")[0].selectedIndex;
			let category = document.getElementsByName("categoryKeySql")[0].options[selectIndex].label;
			document.getElementById("output2").innerText = category;

		}

		// 問題タイトルに入力された内容を取得し、確認用のエレメントに設定
		let questionTitle_text = document.getElementsByName("questionTitle")[0].value;
		document.getElementById("output3").innerText = questionTitle_text;

		// 問題文に入力された内容を取得し、確認用のエレメントに設定
		let question_text = document.getElementsByName("question")[0].value;
		document.getElementById("output4").textContent = question_text;

	});

	//
	//	画面レイアウト2　次へボタン押下イベント
	//
	document.getElementById("btn2").addEventListener("click", () => {
		
		// 画面レイアウト3を表示
		showlayout(3);

		// 選択肢Aのエレメントの値を取得
		let sentakushi_A_txt = document.getElementsByName("sentakuA")[0].value;
		// 選択肢Bのエレメントの値を取得
		let sentakushi_B_txt = document.getElementsByName("sentakuB")[0].value;
		// 選択肢Cのエレメントの値を取得
		let sentakushi_C_txt = document.getElementsByName("sentakuC")[0].value;
		// 選択肢Dのエレメントの値を取得
		let sentakushi_D_txt = document.getElementsByName("sentakuD")[0].value;

		// 解答で選択された値を取得
		let answer = document.getElementsByName("answerKey")[0].value;
		// 入力された解説の値を取得
		let kaisetsu = document.getElementsByName("kaisetsu")[0].value;

		// 確認用エレメントに値を設定
		document.getElementById("output5").innerText = sentakushi_A_txt;
		document.getElementById("output6").innerText = sentakushi_B_txt;
		document.getElementById("output7").innerText = sentakushi_C_txt;
		document.getElementById("output8").innerText = sentakushi_D_txt;
		document.getElementById("output9").innerText = answer;
		document.getElementById("output10").innerText = kaisetsu;

	});

	//
	//	画面レイアウト1の編集ボタンクリックイベント
	//
	document.getElementById("updatebtn").addEventListener("click", () => showlayout(1));

	//
	//	画面レイアウト2の編集ボタンクリックイベント
	//
	document.getElementById("updatebtn2").addEventListener("click", () => showlayout(2));

});
