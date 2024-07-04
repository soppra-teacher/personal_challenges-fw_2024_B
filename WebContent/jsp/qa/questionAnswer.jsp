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
<script type="text/javascript" charset="utf-8"
	src="<%=request.getContextPath()%>/js/common.js"></script>
<script type="text/javascript" charset="utf-8"
	src="<%=request.getContextPath()%>/js/qalogic.js"></script>
<title>–â‘è‰ð“š‰æ–Ê</title>
</head>

<body>

	<bean:define id="viewBean" name="qaForm" />
	<bean:define id="viewBeanSetting" name="QUESTION_ANSWER_SETTING_DTO" />

	<jsp:include page="/jsp/common/header.jsp">
		<jsp:param name="screenTitle" value="–â‘è‰ð“š‰æ–Ê" />
	</jsp:include>

	<div class="content">
		<div class="popupArea">
			<div class="hide" id="popup"></div>
		</div>
		<div class="questionArea">
			<div class="questionNumber">
				<span> ‘æ<bean:write name="viewBeanSetting"
						property="currentQuestionCount" />–â
				</span>
			</div>
			<div class="question">
				<html:textarea name="viewBean" property="question" readonly="true" />
			</div>
		</div>
		<div class="sentakushi">
			<ul>
				<li><button class="selectBtn">a</button> <html:textarea
						name="viewBean" property="sentakuA" readonly="true" /></li>
				<div class="line"></div>
				<li><button class="selectBtn">b</button> <html:textarea
						name="viewBean" property="sentakuB" readonly="true" /></li>
				<div class="line"></div>
				<li><button class="selectBtn">c</button> <html:textarea
						name="viewBean" property="sentakuC" readonly="true" /></li>
				<div class="line"></div>
				<li><button class="selectBtn">d</button> <html:textarea
						name="viewBean" property="sentakuD" readonly="true" /></li>
			</ul>
		</div>
		<div class="showAnswerBtnArea">
			<button id="showAnswerBtn">³‰ð‚ð•\Ž¦</button>
		</div>
		<div id="answer" class="answerArea hide">
			<div class="answerSentakushiArea">
				<span>³‰ðF</span><span id="answerSentakushi"><bean:write
						name="viewBean" property="answer" /> </span>
			</div>
			<div class="kaisetuArea">
				<bean:write name="viewBean" property="kaisetsu" />
			</div>
		</div>
	</div>
	<div class="nextBtnArea">
		<html:form action="/QuestionAnswerInit">
			<html:hidden property="userSelect" />
			<html:submit>ŽŸ‚Ì–â‘è</html:submit>
		</html:form>
	</div>
</body>
</html:html>