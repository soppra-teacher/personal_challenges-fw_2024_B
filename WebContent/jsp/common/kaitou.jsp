<%@ page pageEncoding="Windows-31J"%>
<%@ page contentType="text/html;charset=Windows-31J"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>

<!DOCTYPE html>
<html:html lang="ja">

<head>
<meta content="ja" http-equiv="Content-Language" />
<meta content="text/html; charset=utf-8" http-equiv="Content-Type" />
<title>ログイン画面</title>
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/css/signInStyle.css" />
</head>

<head>
	<meta content="ja" http-equiv="Content-Language" />
	<meta content="text/html; charset=utf-8" http-equiv="Content-Type" />
	<link rel="stylesheet" type="text/css" href="gamen.css" />
	<title>問題解答画面</title>
</head>

<body>

	<header class="top-header">

		<span class="brand">解答画面</span>
	</header>

	<div id="content1">
		<html:form class="contact1" action="index.html" method="post">

			<div class="index">
				<div class="radio-list">
					<span class="label-title"> 問題 </span>
				</div>

				<div class="w-75 text-left">
					整数のデータ型が小きい順に並んでいるものはどれか
				</div>


				<div>
					<span class="label-title"> a </span>
				</div>

				<div>
					byte > long > int > short
				</div>

				<div>
					<span class="label-title"> b </spa>
				</div>
				<div>

					short >byte > int > long
				</div>
				<div>
					<span class="label-title"> c </spa>
				</div>
				<div>

					short > int > byte > long
				</div>
				<div>
					<span class="label-title"> d </spa>
				</div>
				<div>
					byte > short >int > long
				</div>

			</div>
			<div class="button-list">
				<div id="btn" class="regist-button">a</div>
				<div id="btn2" class="regist-button">b</div>
				<div id="btn3" class="regist-button">c</div>
				<div id="btn4" class="regist-button">d</div>
			</div>

	</div>
	</html:form>



	</div>

	<div id="content2" class="hide">
		<html:form class="contact2" action="index1.html" method="post">

			<div class="index1">

				<div class="question-list">

					<div class="form-area1">
						<p class="quiestion">問題文</p>
						<html:textarea class="tarea"></html:textarea>
					</div>
				</div>


				<div class="answer-list">
					<div class="sentaku-list">
						<div class="choice-list">
							<p class="choice">解答</p>
							<html:textarea class="area"></html:textarea>
							<div class="form-title">

							</div>
						</div>

						<div class="ans-list">
							<p class="answer"></p>
							<div class="form-title">

							</div>
						</div>

					</div>
					<div class="form-area1">
						<p class="quiestion">解説</p>
						<html:textarea class="tarea"></html:textarea>
					</div>

				</div>
				<footer>
					<div class="buton">
						<div class="button2">次の問題</div>
					</div>
				</footer>

		</html:form>
	</div>
	<script src="gamen.js"></script>

</body>



</html:html>