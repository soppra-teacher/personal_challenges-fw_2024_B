window.addEventListener("DOMContentLoaded", () => {
	
	/**
	 * テキストエリアの入力内容に応じて高さを可変自動調節する
	 */
	document.querySelectorAll("textarea").forEach((ele) => {
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
			let charele = document.createElement("div");

			if (sentakushi.trim() == answer.trim()) {
				popupele.innerText = "正解!";
				charele.innerText = "〇";
				charele.classList = "char maru";
			} else {
				popupele.innerText = "不正解!";
				charele.innerText = "×";
				charele.classList = "char batu";
			}

			popupele.classList = "popup show";
			popupele.appendChild(charele);


			const call_interval = () => {

				// 1秒後にポップアップを非表示
				const hide = () => {
					setInterval(() => {
						popupele.classList = "popup hide";
					}, 1000)
				};

				hide();

				clearInterval(hide);
			}

			call_interval(popupele);


			// 「正解を表示」ボタンを非表示にする
			document.getElementById("showAnswerBtn").classList = "hide";

			// 解答と解説を表示
			document.getElementById("answer").classList = "answerArea show";

			// ユーザの解答を非表示フィールドに設定
			document.getElementsByName("userSelect")[0].value = sentakushi;

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