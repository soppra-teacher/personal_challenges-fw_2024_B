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
<title>–â‘è‰ð“š‰æ–Ê</title>
</head>

<body>

	<jsp:include page="/jsp/common/header.jsp">
		<jsp:param name="screenTitle" value="–â‘è‰ð“š‰æ–Ê" />
	</jsp:include>


</body>
</html:html>