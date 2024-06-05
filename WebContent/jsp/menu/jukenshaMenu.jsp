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
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/css/common.css" />
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/css/teacherMenu.css" />
<title>受験者メニュー</title>
</head>

<body>

	<jsp:include page="/jsp/common/header.jsp">
		<jsp:param name="screenTitle" value="受験者メニュー" />
	</jsp:include>

	

	<ul>
		<li class="title">問題種類：</li>
		<li><input type="radio" value="1" id="" />Java</li>
		<li><input type="radio" value="1" id="" />SQL</li>
	</ul>

	<ul>
		<li class="title">問題数：</li>
		<li><input type="list" id=""></li>
	</ul>

</body>
</html:html>