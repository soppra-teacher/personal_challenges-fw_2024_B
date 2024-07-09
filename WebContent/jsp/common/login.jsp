<%@ page pageEncoding="Windows-31J"%>
<%@ page contentType="text/html;charset=utf-8"%>
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

<body>

	<html:messages id="msg" message="false">
		<p class="msg-err">
			<bean:write name="msg" ignore="true" filter="false" />
		</p>
	</html:messages>

	<html:form action="/Login?getKey=aaa" focus=""
		styleClass="signinform form_360_550">
		<h2>ログイン</h2>
		<div class="mtop_15">
			<div class="leftborder">
				<p class="item_title">ユーザID</p>
			</div>
			<html:text property="userId" tabindex="1" />
		</div>
		<div class="mtop_15">
			<div class="leftborder">
				<p class="item_title">パスワード</p>
			</div>
			<html:password property="password" tabindex="2" />
		</div>
		<div class="submit">
			<html:submit value="はじめる" tabindex="3" />
		</div>
	</html:form>

	<script type="text/javascript">
		let ele = document.querySelectorAll("input");
		ele[0].placeholder = "ユーザIDを入力";
		ele[1].placeholder = "パスワードを入力";
	</script>

</body>

</html:html>