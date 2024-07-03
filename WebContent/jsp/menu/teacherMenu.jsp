<%@ page pageEncoding="Windows-31J"%>
<%@ page contentType="text/html;charset=utf-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ page import="cashbook.util.Const"%>

<!DOCTYPE html>
<html:html lang="ja">
<head>
<meta content="ja" http-equiv="Content-Language" />
<meta charset=utf-8 " http-equiv="Content-Type" />
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/css/teacherMenu.css" />
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/css/common.css" />
<script type="text/javascript" charset="utf-8" src="js/teacherMenu.js"></script>
<script type="text/javascript" charset="shift_jis" src="js/common.js"></script>
<title>講師メニュー</title>
</head>

<body>

	<bean:define id="inputBean" name="teacherListForm" />
	<bean:define id="viewBean" name="TEACHER_LIST_DTO" />

	<header class="site-header">
		<div class="wrapper site-header__wrapper">
			<div class="site-header__start">
				<span class="brand">問題の管理</span>
			</div>
			<div class="site-header__middle">
				<nav class="nav">
					<ul class="nav__wrapper">
						<li class="nav__item"><html:link action="/InsUpdInit">新しい問題を登録</html:link></li>
					</ul>
				</nav>
			</div>
			<div class="site-header__end">
				<html:link action="/Logout">ログアウト</html:link>
			</div>
		</div>
	</header>

	<div class="index">
		<div class="example">
			<table>
				<tr class="top-table">
					<td>問題ID</td>
					<td>教科</td>
					<td>分類</td>
					<td>問題タイトル</td>
					<td>解答</td>
				</tr>
				<logic:notEmpty name="viewBean" property="list">
					<logic:iterate id="list" name="viewBean" property="list">
						<tr>
							<td><bean:write name="list" property="questionId" /></td>
							<td><bean:write name="list" property="subject" /></td>
							<td><bean:write name="list" property="category" /></td>
							<td><bean:write name="list" property="questionTitle" /></td>
							<td><bean:write name="list" property="answer" /></td>
							<input type="hidden"
								value='<bean:write name="list" property="question" />' />
							<input type="hidden"
								value='<bean:write name="list" property="kaisetsu" />' />
						</tr>
					</logic:iterate>
				</logic:notEmpty>
			</table>
		</div>
		<div class="questionID">
			<html:form action="/InsUpdInit">
				<html:hidden name="inputBean" property="questionId" />
				<div id="updlink" class="hide">
					<html:submit>この問題を更新</html:submit>
			</html:form>
			<html:form action="/TeacherMenuDelete">
				<html:hidden property="operation" value="" />
				<html:hidden name="inputBean" property="questionId"
					styleClass="update" />
				<html:button property="delete"
					onclick="callAction(this.form, 'delete');">この問題を削除</html:button>
			</html:form>

		</div>
		<ul id="liwapper" class="hide">
			<li class="item">
				<p>問題ID :</p>
				<p id=questionId></p>
			</li>
			<li class="item">
				<p>教科 :</p>
				<p id=subject></p>
			</li>
			<li class="item">
				<p>分類 :</p>
				<p id=category></p>
			</li>
			<li class="item-t">
				<p>問題タイトル</p>
				<p id=questionTitle_S></p>
			</li>
			<li class="item-t"><p>問題文</p> <textarea id=questionText></textarea></li>
			<li class="item">
				<p>解答 :</p> <spna id=answer></spna>
			</li>
			<li class="item-t"><p>解説</p> <textarea id=kaisetsuText></textarea></li>
		</ul>
	</div>
</body>
</html:html>