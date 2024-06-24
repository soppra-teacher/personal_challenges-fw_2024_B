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
		//		明日やるよ！！！！！！by山本優太
		//		document.

	});

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

	document.getElementById("btn").addEventListener("click", () => {
		elem1 = document.getElementById("output1");

		elem1.innerHTML = "";
		//①ラジオボタン要素の取得
		radio = document.getElementsByName("subject");

		//②ラジオボタン選択状態の取得
		//if(radio[i].checked)のみならずfor文で要素をループさせる必要あり。
		for (i = 0; i < radio.length; i++) {
			if (radio[i].checked) {
				//③ラジオボタン選択値の取得
				//　→結果を<div id="output1">要素に出力
				elem1.innerHTML += radio[i].value;
			}
		}
	});

	//分類セレクトボックスの取得Java
	document.getElementById("btn2").addEventListener("click", () => {
		const ta4 = document.getElementsByName("categoryKeyJava")[0].selectedIndex;
		var a = document.getElementsByName("categoryKeyJava")[0].options[ta4].label;
		target = document.getElementById("output2");
		target.innerText = a;
	});

	//分類セレクトボックスの取得SQL
	document.getElementById("btn2").addEventListener("click", () => {
		const ta4 = document.getElementsByName("categoryKeySql")[0].selectedIndex;
		var a = document.getElementsByName("categoryKeySql")[0].options[ta4].label;
		target = document.getElementById("output2");
		target.innerText = a;
	});

	//問題タイトルテキストボックスの取得
	document.getElementById("btn").addEventListener("click", () => {
		input = document.getElementsByName("questionTitle")[0].value;
		target = document.getElementById("output3");
		target.innerHTML = input;
	});

	//問題文テキストエリアの取得
	document.getElementById("btn").addEventListener("click", () => {
		const ta3 = document.getElementsByName("question")[0].value;
		document.getElementById("output4").textContent = ta3;
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