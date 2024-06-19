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
<title>���𓚉��</title>
</head>

<body>

	<bean:define id="viewBean" name="qaForm" />

	<jsp:include page="/jsp/common/header.jsp">
		<jsp:param name="screenTitle" value="���𓚉��" />
	</jsp:include>
	
	<bean:write name="viewBean" property="question" />
	<bean:write name="viewBean" property="sentakuA" />
	<bean:write name="viewBean" property="sentakuB" />
	<bean:write name="viewBean" property="sentakuC" />
	<bean:write name="viewBean" property="sentakuD" />
	<bean:write name="viewBean" property="answer" />
	<bean:write name="viewBean" property="kaisetsu" />

	<html:link action="/QuestionAnswerInit">���̖��</html:link>

</body>
</html:html>