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
<script type="text/javascript" charset="utf-8" src="js/jukenshaMenu.js"></script>
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
			<li><html:select name="inputBean"
					property="questionNumberKey" styleClass="select">
					<html:optionsCollection name="inputBean"
						property="javaQuestionNumber" value="key" label="value" />
				</html:select> <html:select name="inputBean" property="questionNumberKey"
					styleClass="hide">
					<html:optionsCollection name="inputBean"
						property="sqlQuestionNumber" value="key" label="value" />
				</html:select></li>
		</ul>

		<div class="submit">
			<a class="link">スタート</a>
		</div>
	</div>

</body>
</html:html>