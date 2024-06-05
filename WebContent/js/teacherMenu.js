window.addEventListener("DOMContentLoaded", () => {

	//
	//	一覧表示テーブルで選択された行の詳細内容を右側の詳細表示エリアに表示
	//

	//詳細表示エリアのエレメントを取得
	let questionId = document.getElementById("questionId");
	let subject = document.getElementById("subject");
	let category = document.getElementById("category");
	let questionText = document.getElementById("questionText");
	let answer = document.getElementById("answer");
	let kaisetsuText = document.getElementById("kaisetsuText");


	//hiddenフィールドの各エレメントを取得
	let questionId_hidden = document.getElementsByName("questionId");
	let subject_hidden = document.getElementsByName("subject");
	let category_hidden = document.getElementsByName("category");
	let questionText_hidden = document.getElementsByName("question");
	let answer_hidden = document.getElementsByName("answer");
	let kaisetsuText_hidden = document.getElementsByName("kaisetsu");

	let tr_ele = document.getElementsByTagName("tr");
	for (let f = 1; f < tr_ele.length; f++) {
		tr_ele[f].addEventListener("click", () => {

			//問題一覧表示テーブルで、選択された行の各値を取得
			let td_ele = tr_ele[f].children;
			let questionId_table = td_ele[0].innerText;
			let subject_table = td_ele[1].innerText;
			let category_table = td_ele[2].innerText;
			let question_table = td_ele[3].innerText;
			let answer_table = td_ele[4].innerText;
			let kaisetsu_table = td_ele[5].innerText;

			//innerTextをクリア
			questionId.innerText = "問題ID: ";
			subject.innerText = "教科: ";
			category.innerText = "分類: ";
			questionText.innerText = "問題文: ";
			answer.innerText = "解答: ";
			kaisetsuText.innerText = "解説: ";


			//詳細表示エリアの各エレメントに値を代入
			questionId.innerText += questionId_table;
			subject.innerText += subject_table;
			category.innerText += category_table;
			questionText.innerText += question_table;
			answer.innerText += answer_table;
			kaisetsuText.innerText += kaisetsu_table;

			//hiddenフィールドの各エレメントに値を代入
			questionId_hidden.values = questionId_table;
			subject_hidden.values = subject_table;
			category_hidden.values = category_table;
			questionText_hidden.values = question_table;
			answer_hidden.values = answer_table;
			kaisetsuText_hidden.values = kaisetsu_table;
		});
	}
});