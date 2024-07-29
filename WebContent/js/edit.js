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
		const layout1 = document.getElementById("layout1");
		const layout2 = document.getElementById("layout2");
		const layout3 = document.getElementById("layout3");

		// 引数に応じて画面を切り替え
		if (layoutNumber == 1) {
			layout1.className = "";
			layout2.className = "hide";
			layout3.className = "hide";
			window.location.href = "#layout1";
		} else if (layoutNumber == 2) {
			layout1.className = "hide";
			layout2.className = "";
			layout3.className = "hide";
			window.location.href = "#layout2";
		} else if (layoutNumber == 3) {
			layout1.className = "hide";
			layout2.className = "hide";
			layout3.className = "";
			window.location.href = "#layout3";
		}

		//
		//	テキストエリアの入力内容に応じて高さを可変自動調節する
		//
		document.querySelectorAll("textarea").forEach((ele) => {
			ele.style.cssText += "width : 100%;";
			ele.style.cssText += "height : " + (ele.scrollHeight + 1) + "px;";
		});
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

		javaSelect.selectedIndex = 0;

	});

	//
	//	SQLラジオボタンのチェックイベント
	//
	sql_radio.addEventListener("change", () => {

		javaSelect.className = "hide";
		sqlSelect.className = "select";

		sqlSelect.selectedIndex = 0;

	});

	//
	//	画面レイアウト1　次へボタン押下イベント
	//
	document.getElementById("layout1Btn").addEventListener("click", () => {

		let check_subject = document.getElementById("check_subject");

		//ラジオボタン選択状態の取得
		if (java_radio.checked) {

			// 確認用エレメントに選択された教科名を設定
			check_subject.innerText = "JAVA";

			// 選択された分類を確認用エレメントに設定
			let selectIndex = document.getElementsByName("categoryKeyJava")[0].selectedIndex;
			let category = document.getElementsByName("categoryKeyJava")[0].options[selectIndex].label;
			document.getElementById("check_category").innerText = category;

		} else {

			// 確認用エレメントに選択された教科名を設定
			check_subject.innerText = "SQL";

			// 選択された分類を確認用エレメントに設定
			let selectIndex = document.getElementsByName("categoryKeySql")[0].selectedIndex;
			let category = document.getElementsByName("categoryKeySql")[0].options[selectIndex].label;
			document.getElementById("check_category").innerText = category;

		}

		// 問題タイトルに入力された内容を取得し、確認用のエレメントに設定
		let questionTitle_text = document.getElementsByName("questionTitle")[0].value;
		document.getElementById("check_question_title").innerText = questionTitle_text;

		// 問題文に入力された内容を取得し、確認用のエレメントに設定
		let question_text = document.getElementsByName("question")[0].value;
		document.getElementById("check_question").textContent = question_text;

		// 画面レイアウト2を表示
		showlayout(2);

	});

	//
	//	画面レイアウト2　次へボタン押下イベント
	//
	document.getElementById("layout2Btn").addEventListener("click", () => {

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
		document.getElementById("check_selection_A").innerText = sentakushi_A_txt;
		document.getElementById("check_selection_B").innerText = sentakushi_B_txt;
		document.getElementById("check_selection_C").innerText = sentakushi_C_txt;
		document.getElementById("check_selection_D").innerText = sentakushi_D_txt;
		document.getElementById("check_answer").innerText = answer;
		document.getElementById("check_kaisetsu").innerText = kaisetsu;

		// 画面レイアウト3を表示
		showlayout(3);

	});

	//
	//	画面レイアウト1の編集ボタンクリックイベント
	//
	document.getElementById("edit_layout1").addEventListener("click", () => showlayout(1));

	//
	//	画面レイアウト2の編集ボタンクリックイベント
	//
	document.getElementById("edit_layout2").addEventListener("click", () => showlayout(2));

	//
	//	データを送信
	//
	let btn = document.getElementsByClassName("r-button3")[0];
	btn.addEventListener("click", () => {

		if (java_radio.checked) {
			sqlSelect.selectedIndex = 1;
		}

		if (sql_radio.checked) {
			javaSelect.selectedIndex = 1;
		}

		callAction(document.querySelector("form"), btn.name);
	});

});