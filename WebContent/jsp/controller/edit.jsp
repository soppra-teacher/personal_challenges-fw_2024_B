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

	<html:messages id="msg" message="false">
		<p class="msg-err">
			<bean:write name="msg" ignore="true" filter="false" />
		</p>
	</html:messages>

	<html:form action="/InsUpdDisp">

		<html:hidden property="operation" value="" />
		<html:hidden name="inputBean" property="questionId" />
		<html:hidden name="inputBean" property="answerId" />


		<div id="content1">
			<div class="contact1">

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
					<html:text name="inputBean" styleClass="t-box1"
						property="questionTitle" />
				</div>

				<div class="form-area1">
					<p class="category1">問題文：</p>
					<html:textarea name="inputBean" styleClass="tarea1"
						property="question" />
				</div>

				<div class="button-list1">
					<div id="btn" class="regist-button1">次へ</div>
					<div id="b-btn" class="regist-button1">メニューへ戻る</div>
				</div>
			</div>

			<div id="content2" class="hide">
				<div class="contact">

					<div class="index">
						<div class="choice-list2">
							<p class="choice2">選択肢</p>
							<div class="form-title2">
								<p class="title">a.</p>
								<html:text name="inputBean" property="sentakuA" />
								<p class="title">b.</p>
								<html:text name="inputBean" property="sentakuB" />
								<p class="title">c.</p>
								<html:text name="inputBean" property="sentakuC" />
								<p class="title">d.</p>
								<html:text name="inputBean" property="sentakuD" />
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
						<div id="b-btn" class="regist-button2">メニューへ戻る</div>
					</div>

				</div>
			</div>


			<logic:empty name="viewUpdateBean">
				<html:button property="insert"
					onclick="callAction(this.form, 'insert');">
              登録
            </html:button>
			</logic:empty>
			<logic:notEmpty name="viewUpdateBean">
				<html:button property="update"
					onclick="callAction(this.form, 'update');">
              更新
            </html:button>
			</logic:notEmpty>
		</div>
	</html:form>


</body>
</html:html>