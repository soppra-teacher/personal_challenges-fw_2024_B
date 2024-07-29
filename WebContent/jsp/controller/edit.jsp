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
	href="<%=request.getContextPath()%>/css/edit.css" />
<script language="JavaScript" type="text/javascript" charset="shift_jis"
	src="js/common.js"></script>
<script language="JavaScript" type="text/javascript" charset="shift_jis"
	src="js/edit.js"></script>
<title>���E�𓚂�ҏW</title>
</head>

<body>

	<bean:define id="inputBean" name="editForm" />
	<bean:define id="viewBean" name="EDIT_DTO" />
	<bean:define id="viewUpdateBean" name="UPDATE_DTO" />

	<logic:empty name="viewUpdateBean">
		<jsp:include page="/jsp/common/header.jsp">
			<jsp:param name="screenTitle" value="�o�^���" />
		</jsp:include>
	</logic:empty>
	<logic:notEmpty name="viewUpdateBean">
		<jsp:include page="/jsp/common/header.jsp">
			<jsp:param name="screenTitle" value="�X�V���" />
		</jsp:include>
	</logic:notEmpty>

	<html:messages id="msg" message="false">
		<p class="msg-err">
			<bean:write name="msg" ignore="true" filter="false" />
		</p>
	</html:messages>

	<html:form action="/InsUpd">

		<html:hidden property="operation" value="" />
		<html:hidden name="inputBean" property="questionId" />
		<html:hidden name="inputBean" property="answerId" />

		<div class="content">
			<div id="layout1">
				<div class="content_box mtop_5per">
					<h2>���Ȃ̑I��</h2>
					<div class="item_box">
						<p class="item_box_title">�o�肷����̋��Ȃ�I�����܂��B</p>
						<div class="radio_btns">
							<div class="radio_btn">
								<html:radio name="inputBean" property="subject" value="java" />
								<label for="radio1">JAVA</label>
							</div>
							<div class="radio_btn">
								<html:radio name="inputBean" property="subject" value="sql" />
								<label for="radio1">SQL</label>
							</div>
						</div>
					</div>
				</div>
				<div class="content_box mtop_5per">
					<h2>���̕���</h2>
					<div class="item_box">
						<p class="item_box_title">���̕��ނ�I�����܂��B</p>
						<html:select name="inputBean" property="categoryKeyJava">
							<html:optionsCollection name="viewBean" property="categoryJava"
								value="key" label="value" />
						</html:select>
						<html:select name="inputBean" property="categoryKeySql"
							styleClass="hide">
							<html:optionsCollection name="viewBean" property="categorySql"
								value="key" label="value" />
						</html:select>
					</div>
				</div>
				<div class="content_box mtop_10per">
					<h2>���^�C�g���̓���</h2>
					<div class="item_box">
						<p class="item_box_title">���Ƀ^�C�g����t���܂��B</p>
						<p class="sample">��j�I�u�W�F�N�g�w���̃J�v�Z�����ɂ��Ă̖��ɒ��킵�悤!</p>
						<html:textarea name="inputBean" styleClass="textarea_title"
							property="questionTitle" />
					</div>
				</div>
				<div class="content_box mtop_5per">
					<h2>��蕶�̓���</h2>
					<div class="item_box">
						<p class="item_box_title">�o�肷����̖�蕶����͂��܂��B</p>
						<p class="sample">��j���̂����A�J�v�Z�������s�������b�g�Ƃ��Đ��������̂͂ǂ�ł��傤���H</p>
						<html:textarea name="inputBean" styleClass="textarea_question"
							property="question" />
					</div>
				</div>
				<div class="btns">
					<div id="layout1Btn" class="btn">����</div>
					<div id="menuBtn" class="btn">
						<a href="./TeacherMenuInit.do" class="menuback">���j���[�֖߂�</a>
					</div>
				</div>
			</div>

			<div id="layout2">
				<div class="content_box mtop_5per">
					<h2>���̑I����</h2>
					<div class="item_box_se">
						<p>�I����A�̕��͂���͂��܂��B</p>
						<html:textarea name="inputBean" property="sentakuA"
							styleClass="textarea_selection" />
					</div>
					<div class="item_box_se">
						<p>�I����B�̕��͂���͂��܂��B</p>
						<html:textarea name="inputBean" property="sentakuB"
							styleClass="textarea_selection" />
					</div>
					<div class="item_box_se">
						<p>�I����C�̕��͂���͂��܂��B</p>
						<html:textarea name="inputBean" property="sentakuC"
							styleClass="textarea_selection" />
					</div>
					<div class="item_box_se">
						<p>�I����D�̕��͂���͂��܂��B</p>
						<html:textarea name="inputBean" property="sentakuD"
							styleClass="textarea_selection" />
					</div>
				</div>
				<div class="content_box mtop_5per">
					<h2>�𓚂�ݒ�</h2>
					<div class="item_box">
						<p class="item_box_title">�������I������ݒ肵�܂��B</p>
						<html:select name="inputBean" styleClass="select2"
							property="answerKey">
							<html:optionsCollection name="viewBean" property="answer"
								value="key" label="value" />
						</html:select>
					</div>
				</div>
				<div class="content_box mtop_5per">
					<h2>����̓���</h2>
					<div class="item_box">
						<p class="item_box_title">�o�肵�����̉������͂��܂��B</p>
						<html:textarea name="inputBean" styleClass="textarea_question"
							property="kaisetsu" />
					</div>
				</div>
				<div class="btns">
					<div id="layout2Btn" class="btn">����</div>
					<div id="menuBtn" class="btn">
						<a href="./TeacherMenuInit.do" class="menuback">���j���[�֖߂�</a>
					</div>
				</div>
			</div>

			<div id="layout3">
				<div class="content_box mtop_5per item_box">
					<div class="content_box mtop_5per">
						<h2>���Ȃƕ���</h2>
						<div class="item_box">
							<p class="item_box_title">�ȉ��̋��Ȃƕ��ނŔ��f����܂��B</p>
							<div class="check_box">
								<p>���ȁF</p>
								<p id="check_subject"></p>
							</div>
							<div class="check_box">
								<p>���ށF</p>
								<p id="check_category"></p>
							</div>
						</div>
					</div>
					<div class="content_box mtop_5per">
						<h2>���^�C�g���̓���</h2>
						<div class="item_box">
							<p class="item_box_title">�ȉ��̓��e�Ŗ��^�C�g�������f����܂��B</p>
							<textarea id="check_question_title" readonly="true"></textarea>
						</div>
					</div>
					<div class="content_box mtop_5per">
						<h2>��蕶�̓���</h2>
						<div class="item_box">
							<p class="item_box_title">�ȉ��̓��e�Ŗ�蕶�����f����܂��B</p>
							<textarea id="check_question" readonly="true"></textarea>
						</div>
					</div>
					<div class="btns">
						<div id="edit_layout1" class="btn">�ҏW</div>
					</div>
				</div>
				<br> <br>
				<div class="content_box mtop_10per item_box">
					<div class="content_box mtop_5per">
						<h2>���̑I����</h2>
						<div class="item_box_se">
							<p>�ȉ��̓��e�őI����A�����f����܂��B</p>
							<textarea id="check_selection_A" readonly="true"></textarea>
						</div>
						<div class="item_box_se">
							<p>�ȉ��̓��e�őI����B�����f����܂��B</p>
							<textarea id="check_selection_B" readonly="true"></textarea>
						</div>
						<div class="item_box_se">
							<p>�ȉ��̓��e�őI����C�����f����܂��B</p>
							<textarea id="check_selection_C" readonly="true"></textarea>
						</div>
						<div class="item_box_se">
							<p>�ȉ��̓��e�őI����D�����f����܂��B</p>
							<textarea id="check_selection_D" readonly="true"></textarea>
						</div>
					</div>
					<div class="content_box mtop_5per">
						<h2>�𓚂�ݒ�</h2>
						<div class="item_box">
							<p class="item_box_title">�ȉ��̉𓚂Ŕ��f����܂��B</p>
							<div class="check_box">
								<p>�𓚁F</p>
								<p id="check_answer"></p>
							</div>
						</div>
					</div>
					<div class="content_box mtop_5per">
						<h2>����̓���</h2>
						<div class="item_box">
							<p class="item_box_title">�ȉ��̉���Ŕ��f����܂��B</p>
							<textarea id="check_kaisetsu" readonly="true"></textarea>
						</div>
					</div>
					<div class="btns">
						<div id="edit_layout2" class="btn">�ҏW</div>
					</div>
				</div>
				<logic:empty name="viewUpdateBean">
					<div class="btns">
						<html:button property="insert" styleClass="btn r-button3">
              						�o�^
            				</html:button>
					</div>
				</logic:empty>
				<logic:notEmpty name="viewUpdateBean">
					<div class="btns">
						<html:button property="update" styleClass="btn r-button3">
              						�X�V
            			</html:button>
					</div>
				</logic:notEmpty>
			</div>
		</div>
	</html:form>
</body>
</html:html>