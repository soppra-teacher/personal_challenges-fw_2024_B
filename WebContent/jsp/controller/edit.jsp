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
	href="<%=request.getContextPath()%>/css/edit.css" />
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/css/common.css" />
<script language="JavaScript" type="text/javascript" charset="shift_jis"
	src="js/common.js"></script>
<script language="JavaScript" type="text/javascript" charset="shift_jis"
	src="js/edit.js"></script>
<title>問題・解答を編集</title>
</head>

<body>

	<bean:define id="inputBean" name="editForm" />
	<bean:define id="viewBean" name="EDIT_DTO" />
	<bean:define id="viewUpdateBean" name="UPDATE_DTO" />

	<logic:empty name="viewUpdateBean">
		<jsp:include page="/jsp/common/header.jsp">
			<jsp:param name="screenTitle" value="登録画面" />
		</jsp:include>
	</logic:empty>
	<logic:notEmpty name="viewUpdateBean">
		<jsp:include page="/jsp/common/header.jsp">
			<jsp:param name="screenTitle" value="更新画面" />
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

		<div id="content1">
			<div class="contact1">
				<div class="">
					<div class="radio-list1">
						<p class="sub">教科：</p>
						<html:radio name="inputBean" property="subject" value="java" />
						<label for="radio1">Java</label>
						<html:radio name="inputBean" property="subject" value="sql" />
						<label for="radio1">SQL</label>
					</div>

					<div class="form-select1">
						<p class="category1">分類：</p>
						<html:select name="inputBean" property="categoryKeyJava"
							styleClass="select select1">
							<html:optionsCollection name="viewBean" property="categoryJava"
								value="key" label="value" />
						</html:select>
						<html:select name="inputBean" property="categoryKeySql"
							styleClass="hide">
							<html:optionsCollection name="viewBean" property="categorySql"
								value="key" label="value" />
						</html:select>
					</div>

					<div class="form-title1">
						<p class="q-title">問題タイトル：</p>

						<html:textarea name="inputBean" styleClass="tarea1"
							property="questionTitle" />

					</div>

					<div class="form-area1">
						<p class="t-question">問題文：</p>

						<html:textarea name="inputBean" styleClass="tarea2"
							property="question" />

					</div>

					<div class="button-list1">
						<div id="btn" class="regist-button1">次へ</div>
						<div id="b-btn" class="regist-button1">
							<a href="/Cashbook/TeacherMenuInit.do" class="menuback">メニューへ戻る</a>
						</div>
					</div>
				</div>
			</div>
		</div>

		<div id="content2" class="hide">
			<div class="contact">
				<div class="index">
					<div class="choice-list2">
						<p class="choice2">選択肢</p>
						<div class="form-title2">
							<div class="leftborder">
								<p class="title">a.</p>
							</div>

							<html:textarea name="inputBean" property="sentakuA"
								styleClass="t-box2" />

							<div class="leftborder">
								<p class="title">b.</p>
							</div>

							<html:textarea name="inputBean" property="sentakuB"
								styleClass="t-box2" />

							<div class="leftborder">
								<p class="title">c.</p>
							</div>

							<html:textarea name="inputBean" property="sentakuC"
								styleClass="t-box2" />

							<div class="leftborder">
								<p class="title">d.</p>
							</div>

							<html:textarea name="inputBean" property="sentakuD"
								styleClass="t-box2" />
						</div>

						<div class="answer-list2">
							<p class="answer2">解答</p>
							<html:select name="inputBean" styleClass="select2"
								property="answerKey">
								<html:optionsCollection name="viewBean" property="answer"
									value="key" label="value" />
							</html:select>
						</div>
					</div>

					<div class="form-area2">
						<p class="kaisetsu2">解説</p>

						<html:textarea name="inputBean" styleClass="tarea2"
							property="kaisetsu" />

					</div>
				</div>


				<div class="button-list2">
					<div id="btn2" class="regist-button2">次へ</div>
					<div id="b-btn" class="regist-button2">
						<a href="/Cashbook/TeacherMenuInit.do" class="menuback">メニューへ戻る</a>
					</div>
				</div>
			</div>
		</div>


		<div id="content3" class="hide">
			<div class="index3">

				<div class="question-list3">

					<div class="sub-list">
						<p class="subject3">教科：</p>
						<div id="output1" class="output1"></div>
					</div>

					<div class="cat-list">
						<p class="category3">分類：</p>
						<div id="output2" class="output2"></div>
					</div>

					<div class="title-list">
						<p class="Q-title3">問題タイトル：</p>
						<div id="output3" class="output3"></div>
					</div>

					<div class="form-area3">
						<p class="quiestion3">問題文</p>
						<div id="output4" class="output4"></div>
					</div>

					<div class="update3">
						<div id="updatebtn" class="regist-button3">編集</div>
					</div>
				</div>
				<div class="answer-list3">

					<div class="choice-list3">
						<p class="choice3">選択肢</p>
						
						<div class="form-title3">

							<div class="A">
								<p class="title">a.</p>
								<div id="output5" class="output5"></div>
							</div>

							<div class="B">
								<p class="title">b.</p>
								<div id="output6" class="output6"></div>
							</div>

							<div class="C">
								<p class="title">c.</p>
								<div id="output7" class="output7"></div>
							</div>

							<div class="D">
								<p class="title">d.</p>
								<div id="output8" class="output8"></div>
							</div>
						</div>
					</div>

					<div class="ans-list3">
						<p class="answer3">解答 :</p>
						<div class="form-title">
							<div id="output9" class="output9"></div>
						</div>

					</div>
					<div class="form-area3">
						<p class="quiestion3">解説</p>
						<div id="output10" class="output10"></div>
					</div>


					<div class="update3">
						<div id="updatebtn2" class="regist-button3">編集</div>
					</div>
				</div>



				<logic:empty name="viewUpdateBean">
					<div class="button-list3">
						<html:button property="insert"
							onclick="callAction(this.form, 'insert');" styleClass="r-button3">
              						登録
            				</html:button>
					</div>
				</logic:empty>
				<logic:notEmpty name="viewUpdateBean">
					<div class="button-list3">
						<html:button property="update"
							onclick="callAction(this.form, 'update');" styleClass="r-button3">
              						更新
            			</html:button>
					</div>
				</logic:notEmpty>
			</div>
		</div>
	</html:form>


</body>
</html:html>