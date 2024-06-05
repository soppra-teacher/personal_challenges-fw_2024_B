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
	href="<%=request.getContextPath()%>/css/jukenshaMenu.css" />
<title>受験者メニュー</title>
</head>

<body>

	<bean:define id="inputBean" name="jukenshaForm" />

	<jsp:include page="/jsp/common/header.jsp">
		<jsp:param name="screenTitle" value="受験者メニュー" />
	</jsp:include>

	<div class="contents">
		<ul>
			<li class="title">問題種類：</li>
			<li><html:radio name="inputBean" property="subjectRadio"
					value="1" /> Java</li>
			<li><html:radio name="inputBean" property="subjectRadio"
					value="0" />SQL</li>
		</ul>

		<ul>
			<li class="title">問題数：</li>
			<li><html:select name="inputBean" property="questionNumberKey">
					<html:optionsCollection name="inputBean" property="questionNumber"
						value="key" label="value" />
				</html:select></li>
		</ul>
		
		<input type="submit" value="松中">

		<div class="submit">
			<a class="link">スタート</a>
		</div>
	</div>

</body>
</html:html>