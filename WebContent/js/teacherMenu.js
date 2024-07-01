
window.addEventListener("DOMContentLoaded", () => {

	//
	//	一覧表示テーブルで選択された行の詳細内容を右側の詳細表示エリアに表示
	//

	//詳細表示エリアのエレメントを取得
	let questionId = document.getElementById("questionId");
	let subject = document.getElementById("subject");
	let category = document.getElementById("category");
	let questionTitle = document.getElementById("questionTitle_S");
	let questionText = document.getElementById("questionText");
	let answer = document.getElementById("answer");
	let kaisetsuText = document.getElementById("kaisetsuText");

	//hiddenフィールドの各エレメントを取得
	let questionId_hidden_upd = document.getElementsByName("questionId")[0];
	let questionId_hidden_del = document.getElementsByName("questionId")[1];

	let updlink = document.getElementById("updlink");
	let liwapper = document.getElementById("liwapper");

	//trタグを取得
	let tr_ele = document.getElementsByTagName("tr");

	for (let f = 1; f < tr_ele.length; f++) {

		//
		// テーブル行のクリックイベント
		//	
		tr_ele[f].addEventListener("click", () => {

			updlink.className = "update";
			liwapper.className = "li__wrapper";

			//問題一覧表示テーブルで、選択された行の各値を取得
			let td_ele = tr_ele[f].children;
			let questionId_table = td_ele[0].innerText;
			let subject_table = td_ele[1].innerText;
			let category_table = td_ele[2].innerText;
			let question_table_title = td_ele[3].innerText;
			let answer_table = td_ele[4].innerText;
			let question_table = tr_ele[f].children[5].value;;
			let kaisetsu_table = tr_ele[f].children[6].value;

			//innerTextをクリア
			questionId.innerText = "";
			subject.innerText = "";
			category.innerText = "";
			questionTitle.innerText = "";
			questionText.innerText = "";
			answer.innerText = "";
			kaisetsuText.innerText = "";

			//詳細表示エリアの各エレメントに値を追加で代入
			questionId.innerText += questionId_table;
			subject.innerText += subject_table;
			category.innerText += category_table;
			questionTitle.innerText += question_table_title;
			questionText.value = question_table;
			answer.innerText += answer_table;
			kaisetsuText.value = kaisetsu_table;

			//hiddenフィールドに値を代入
			questionId_hidden_upd.value = questionId_table;
			questionId_hidden_del.value = questionId_table;


			//
			//	textareaエレメントのスタイル調整
			//
			document.querySelectorAll("textarea").forEach((ele) => {
				// 入力内容に応じて高さを可変自動調節する
				ele.style.cssText = "width : 100%;";
				ele.style.cssText += "height : " + ele.scrollHeight + "px;";
			});

		});
	}
});
