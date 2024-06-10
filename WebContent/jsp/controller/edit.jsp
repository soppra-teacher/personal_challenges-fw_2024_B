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
	href="<%=request.getContextPath()%>/css/teacherMenu.css" />
<script language="JavaScript" type="text/javascript" charset="shift_jis"
	src="js/common.js"></script>
<title>���E�𓚂�ҏW</title>
</head>

<body>

	<bean:define id="inputBean" name="editForm" />
	<bean:define id="viewRegistBean" name="REGIST_DTO" />
	<bean:define id="viewUpdateBean" name="UPDATE_DTO" />

	<html:form action="/InsUpdDisp">

		<div class="radio-list">
			<p class="sub">���ȁF</p>
			<html:radio name="inputBean" property="subject" value="1" />
			<label for="radio1">Java</label>
			<html:radio name="inputBean" property="subject" value="0" />
			<label for="radio1">SQL</label>
		</div>

		<div class="form-select">
			<p class="category">���ށF</p>
			<html:select name="inputBean" property="categoryKey"
				styleClass="select">
				<html:optionsCollection name="inputBean" property="category"
					value="key" label="value" />
			</html:select>
		</div>

		<div class="form-title">
			<p class="title">���^�C�g���F</p>
			<html:text name="inputBean" property="questionTitle" />
		</div>

		<div class="form-area">
			<p class="category">��蕶�F</p>
			<html:text name="inputBean" property="question" />
		</div>
		<div class="index">
			<div class="choice-list">
				<p class="choice">�I����</p>
				<div class="form-title">
					<p class="title">a.</p>
					<html:text name="inputBean" property="sentakuA" />
					<p class="title">b.</p>
					<html:text name="inputBean" property="sentakuB" />
					<p class="title">c.</p>
					<html:text name="inputBean" property="sentakuC" />
					<p class="title">d.</p>
					<html:text name="inputBean" property="sentakuD" />
				</div>
				<div class="answer-list">
					<p class="answer">��</p>
					<html:select name="inputBean" property="answerKey">
						<html:optionsCollection name="inputBean" property="answer"
							value="key" label="value" />
					</html:select>
				</div>
			</div>

			<div class="form-area">
				<p class="kaisetsu">���</p>
				<html:text name="inputBean" property="kaisetsu" />
			</div>

			<html:button property="insert"
				onclick="callAction(this.form, 'insert');">
              �o�^
            </html:button>
		</div>

	</html:form>


</body>
</html:html>