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

	<html:form action="/QuestionAnswerInit">

		<div class="contents">
			<ul>
				<li class="title">問題種類：</li>
				<li><html:radio name="inputBean" property="subjectRadio"
						value="java" /> Java</li>
				<li><html:radio name="inputBean" property="subjectRadio"
						value="sql" />SQL</li>
			</ul>

			<ul>
				<li class="title">問題数：</li>
				<li><html:select name="inputBean" property="javaQuestionNumberKey"
						styleClass="select">
						<html:optionsCollection name="inputBean"
							property="javaQuestionNumber" value="key" label="value" />
					</html:select> <html:select name="inputBean" property="sqlQuestionNumberKey"
						styleClass="hide">
						<html:optionsCollection name="inputBean"
							property="sqlQuestionNumber" value="key" label="value" />
					</html:select></li>
			</ul>

			<div class="submit">
				<html:submit styleClass="link">スタート</html:submit>
			</div>
		</div>

	</html:form>
	
</body>
</html:html>