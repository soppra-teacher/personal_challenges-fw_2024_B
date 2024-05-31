<%@ page pageEncoding="Windows-31J"%>
<%@ page contentType="text/html;charset=Windows-31J"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ page import="cashbook.util.Const"%>

<!DOCTYPE html>
<html:html lang="ja">
<head>
<meta content="ja" http-equiv="Content-Language" />
<meta content="text/html; charset=utf-8" http-equiv="Content-Type" />
<link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/css/teacherMenu.css" />
<title>受験者メニュー</title>
</head>

<body>
	<header class="site-header">
		<div class="wrapper site-header__wrapper">
			<div class="site-header__start">
				<span class="brand">問題の管理</span>
			</div>
			<div class="site-header__middle">
				<nav class="nav">
					<ul class="nav__wrapper">
						<li class="nav__item"><a href="#">問題の登録</a></li>
					</ul>
				</nav>
			</div>
			<div class="site-header__end">
				<html:link action="/Logout" >ログアウト</html:link>
			</div>
		</div>
	</header>

	<div class="index">
		<div class="example">
			<table>
				<tr class="top-table">
					<td></td>
					<td>問題ID</td>
					<td>教科</td>
					<td>分類</td>
					<td>問題</td>
					<td>解答</td>
					<td>解説</td>
					<td>正答率</td>
				</tr>
				<tr>
					<td><input type="checkbox" /></td>
					<td>1</td>
					<td>Java</td>
					<td>型変換</td>
					<td>文字列から数値型への型変換を行う適切</td>
					<td>a</td>
					<td>解説</td>
					<td>88</td>
				</tr>

				<tr>
					<td><input type="checkbox" /></td>
					<td>問題ID</td>
					<td>教科</td>
					<td>分類</td>
					<td>問題</td>
					<td>解答</td>
					<td>解説</td>
					<td>正答率</td>
				</tr>
				<tr>
					<td><input type="checkbox" /></td>
					<td>問題ID</td>
					<td>教科</td>
					<td>分類</td>
					<td>問題</td>
					<td>解答</td>
					<td>解説</td>
					<td>正答率</td>
				</tr>
				<tr>
					<td><input type="checkbox" /></td>
					<td>問題ID</td>
					<td>教科</td>
					<td>分類</td>
					<td>問題</td>
					<td>解答</td>
					<td>解説</td>
					<td>正答率</td>
				</tr>
				<tr>
					<td><input type="checkbox" /></td>
					<td>問題ID</td>
					<td>教科</td>
					<td>分類</td>
					<td>問題</td>
					<td>解答</td>
					<td>解説</td>
					<td>正答率</td>
				</tr>
				<tr>
					<td><input type="checkbox" /></td>
					<td>問題ID</td>
					<td>教科</td>
					<td>分類</td>
					<td>問題</td>
					<td>解答</td>
					<td>解説</td>
					<td>正答率</td>
				</tr>
				<tr>
					<td><input type="checkbox" /></td>
					<td>問題ID</td>
					<td>教科</td>
					<td>分類</td>
					<td>問題</td>
					<td>解答</td>
					<td>解説</td>
					<td>正答率</td>
				</tr>
				<tr>
					<td><input type="checkbox" /></td>
					<td>問題ID</td>
					<td>教科</td>
					<td>分類</td>
					<td>問題</td>
					<td>解答</td>
					<td>解説</td>
					<td>正答率</td>
				</tr>
				<tr>
					<td><input type="checkbox" /></td>
					<td>問題ID</td>
					<td>教科</td>
					<td>分類</td>
					<td>問題</td>
					<td>解答</td>
					<td>解説</td>
					<td>正答率</td>
				</tr>
				<tr>
					<td><input type="checkbox" /></td>
					<td>問題ID</td>
					<td>教科</td>
					<td>分類</td>
					<td>問題</td>
					<td>解答</td>
					<td>解説</td>
					<td>正答率</td>
				</tr>
				<tr>
					<td><input type="checkbox" /></td>
					<td>問題ID</td>
					<td>教科</td>
					<td>分類</td>
					<td>問題</td>
					<td>解答</td>
					<td>解説</td>
					<td>正答率</td>
				</tr>
				<tr>
					<td><input type="checkbox" /></td>
					<td>問題ID</td>
					<td>教科</td>
					<td>分類</td>
					<td>問題</td>
					<td>解答</td>
					<td>解説</td>
					<td>正答率</td>
				</tr>
				<tr>
					<td><input type="checkbox" /></td>
					<td>問題ID</td>
					<td>教科</td>
					<td>分類</td>
					<td>問題</td>
					<td>解答</td>
					<td>解説</td>
					<td>正答率</td>
				</tr>

			</table>
		</div>
		<div class="questionID">
			<a>１</a>
			<ul class="li__wrapper">
				<li class="item"><a>Java</a></li>
				<li class="item"><a>型変換</a></li>
			</ul>

			<div class="question">
				<a>文字列から数値型への型変換を行う適切</a>
			</div>

			<div class="answer">
				<a>a</a>
			</div>

			<div class="kaisetu">
				<a>解説</a>
			</div>

			<div class="percent">
				<a>88％</a>
			</div>


			<a class="update" href="#">問題の更新</a>

		</div>

	</div>
</body>
</html:html>