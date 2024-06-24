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
<meta content="text/html; charset=utf-8" http-equiv="Content-Type" />
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/css/common.css" />
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/css/qa.css" />
<title>–â‘è‰ð“š‰æ–Ê</title>
</head>

<body>

	<bean:define id="viewBean" name="qaForm" />
	<bean:define id="viewBeanSetting" name="QUESTION_ANSWER_SETTING_DTO" />

	<jsp:include page="/jsp/common/header.jsp">
		<jsp:param name="screenTitle" value="–â‘è‰ð“š‰æ–Ê" />
	</jsp:include>

	<div class="content">
		<div class="CurrentQuestionCount">
			<p>
				‘æ
				<bean:write name="viewBeanSetting" property="currentQuestionCount" />
				–â
			</p>
		</div>
		<div class="questionArea">
			<html:textarea name="viewBean" property="question" readonly="true" />
		</div>
		<div class="sentakushiArea">
			<ul>
				<li><span>A</span>
				<html:textarea name="viewBean" property="sentakuA" readonly="true" /></li>
				<li><span>B</span>
				<html:textarea name="viewBean" property="sentakuB" readonly="true" /></li>
				<li><span>C</span>
				<html:textarea name="viewBean" property="sentakuC" readonly="true" /></li>
				<li><span>D</span>
				<html:textarea name="viewBean" property="sentakuD" readonly="true" /></li>
			</ul>
		</div>
	</div>

	<bean:write name="viewBean" property="answer" />
	<bean:write name="viewBean" property="kaisetsu" />

	<html:link action="/QuestionAnswerInit">ŽŸ‚Ì–â‘è</html:link>

</body>
</html:html>