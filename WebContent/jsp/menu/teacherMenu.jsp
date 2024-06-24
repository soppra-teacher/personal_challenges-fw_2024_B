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
<script language="JavaScript" type="text/javascript" charset="shift_jis"
	src="js/common.js"></script>
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
						<li class="nav__item"><html:link action="/RegistInit">新しい問題を登録</html:link></li>
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
					<td>問題</td>
					<td>解答</td>
					<td>解説</td>
				</tr>
				<logic:notEmpty name="viewBean" property="list">
					<logic:iterate id="list" name="viewBean" property="list">
						<tr>
							<td><bean:write name="list" property="questionId" /></td>
							<td><bean:write name="list" property="subject" /></td>
							<td><bean:write name="list" property="category" /></td>
							<td><bean:write name="list" property="questionTitle" /></td>
							<td><bean:write name="list" property="question" /></td>
							<td><bean:write name="list" property="answer" /></td>
							<td><bean:write name="list" property="kaisetsu" /></td>
						</tr>
					</logic:iterate>
				</logic:notEmpty>
			</table>
		</div>
		<div class="questionID">
			<html:form action="/UpdateInit">
				<html:hidden name="inputBean" property="questionId" />
				<div id="updlink" class="hide">
					<html:submit>この問題を更新</html:submit>
			</html:form>
			<html:form action="/TeacherMenuDelete">
				<html:hidden property="operation" value="" />
				<html:hidden name="inputBean" property="questionId"
					styleClass="update" />
				<html:submit property="operation"
					onclick="callAction(this.form, 'delete');">この問題を削除</html:submit>
			</html:form>

		</div>
		<ul id="liwapper" class="hide">
			<li class="item"><spna id=questionId></spna></li>
			<li class="item"><spna id=subject></spna></li>
			<li class="item"><spna id=category></spna></li>
			<li class="item"><spna id=questionTitle_S></spna></li>
			<li class="item"><spna id=questionText></spna></li>
			<li class="item"><spna id=answer></spna></li>
			<li class="item"><spna id=kaisetsuText></spna> </spna></li>
		</ul>
	</div>
</body>
</html:html>