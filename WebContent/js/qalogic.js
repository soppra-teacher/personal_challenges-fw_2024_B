window.addEventListener("DOMContentLoaded", () => {

	//
	//	textareaエレメントのスタイル調整
	//
	document.querySelectorAll("textarea").forEach((ele) => {
		// 入力内容に応じて高さを可変自動調節する
		ele.style.cssText = "width : 100%;";
		ele.style.cssText += "height : " + ele.scrollHeight + "px;";
	});

	//
	//	正誤判定を行う
	//
	const sentakushiBtns = document.getElementsByClassName("selectBtn");
	for (let f = 0; f < sentakushiBtns.length; f++) {

		let sentakushiBtn = sentakushiBtns[f];

		// 選択肢ボタンのクリックイベント
		sentakushiBtn.addEventListener("click", () => {

			// 受験者の選択した解答を取得
			let sentakushi = sentakushiBtn.innerText;

			// 正解の選択肢を取得
			let answer = document.getElementById("answerSentakushi").innerText;

			// ポップアップを表示
			let popupele = document.getElementById("popup");
			popupele.innerText = sentakushi.trim() == answer.trim() ? "正解!" : "不正解!";
			popupele.classList = "popup show";

			// 「正解を表示」ボタンを非表示にする
			document.getElementById("showAnswerBtn").classList = "hide";

			// 解答と解説を表示
			document.getElementById("answer").classList = "answerArea show";

			// 解答と解説が表示されるエリアまでスムーズスクロール
			window.location.href = "#answer";

		});
	}

	//
	//	正解を表示する
	//
	document.getElementById("showAnswerBtn").addEventListener("click", () => {

		// 「正解を表示」ボタンを非表示にする
		document.getElementById("showAnswerBtn").classList = "hide";

		// 解答と解説を表示
		document.getElementById("answer").classList = "answerArea show";

		// 解答と解説が表示されるエリアまでスムーズスクロール
		window.location.href = "#answer";

	});

});