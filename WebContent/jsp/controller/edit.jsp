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

		<div class="content">
			<div id="layout1">
				<div class="content_box mtop_5per">
					<h2>教科の選択</h2>
					<div class="item_box">
						<p class="item_box_title">出題する問題の教科を選択します。</p>
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
					<h2>問題の分類</h2>
					<div class="item_box">
						<p class="item_box_title">問題の分類を選択します。</p>
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
					<h2>問題タイトルの入力</h2>
					<div class="item_box">
						<p class="item_box_title">問題にタイトルを付けます。</p>
						<p class="sample">例）オブジェクト指向のカプセル化についての問題に挑戦しよう!</p>
						<html:textarea name="inputBean" styleClass="textarea_title"
							property="questionTitle" />
					</div>
				</div>
				<div class="content_box mtop_5per">
					<h2>問題文の入力</h2>
					<div class="item_box">
						<p class="item_box_title">出題する問題の問題文を入力します。</p>
						<p class="sample">例）次のうち、カプセル化を行うメリットとして正しいものはどれでしょうか？</p>
						<html:textarea name="inputBean" styleClass="textarea_question"
							property="question" />
					</div>
				</div>
				<div class="btns">
					<div id="layout1Btn" class="btn">次へ</div>
					<div id="menuBtn" class="btn">
						<a href="./TeacherMenuInit.do" class="menuback">メニューへ戻る</a>
					</div>
				</div>
			</div>

			<div id="layout2">
				<div class="content_box mtop_5per">
					<h2>問題の選択肢</h2>
					<div class="item_box_se">
						<p>選択肢Aの文章を入力します。</p>
						<html:textarea name="inputBean" property="sentakuA"
							styleClass="textarea_selection" />
					</div>
					<div class="item_box_se">
						<p>選択肢Bの文章を入力します。</p>
						<html:textarea name="inputBean" property="sentakuB"
							styleClass="textarea_selection" />
					</div>
					<div class="item_box_se">
						<p>選択肢Cの文章を入力します。</p>
						<html:textarea name="inputBean" property="sentakuC"
							styleClass="textarea_selection" />
					</div>
					<div class="item_box_se">
						<p>選択肢Dの文章を入力します。</p>
						<html:textarea name="inputBean" property="sentakuD"
							styleClass="textarea_selection" />
					</div>
				</div>
				<div class="content_box mtop_5per">
					<h2>解答を設定</h2>
					<div class="item_box">
						<p class="item_box_title">正しい選択肢を設定します。</p>
						<html:select name="inputBean" styleClass="select2"
							property="answerKey">
							<html:optionsCollection name="viewBean" property="answer"
								value="key" label="value" />
						</html:select>
					</div>
				</div>
				<div class="content_box mtop_5per">
					<h2>解説の入力</h2>
					<div class="item_box">
						<p class="item_box_title">出題した問題の解説を入力します。</p>
						<html:textarea name="inputBean" styleClass="textarea_question"
							property="kaisetsu" />
					</div>
				</div>
				<div class="btns">
					<div id="layout2Btn" class="btn">次へ</div>
					<div id="menuBtn" class="btn">
						<a href="./TeacherMenuInit.do" class="menuback">メニューへ戻る</a>
					</div>
				</div>
			</div>

			<div id="layout3">
				<div class="content_box mtop_5per item_box">
					<div class="content_box mtop_5per">
						<h2>教科と分類</h2>
						<div class="item_box">
							<p class="item_box_title">以下の教科と分類で反映されます。</p>
							<div class="check_box">
								<p>教科：</p>
								<p id="check_subject"></p>
							</div>
							<div class="check_box">
								<p>分類：</p>
								<p id="check_category"></p>
							</div>
						</div>
					</div>
					<div class="content_box mtop_5per">
						<h2>問題タイトルの入力</h2>
						<div class="item_box">
							<p class="item_box_title">以下の内容で問題タイトルが反映されます。</p>
							<textarea id="check_question_title" readonly="true"></textarea>
						</div>
					</div>
					<div class="content_box mtop_5per">
						<h2>問題文の入力</h2>
						<div class="item_box">
							<p class="item_box_title">以下の内容で問題文が反映されます。</p>
							<textarea id="check_question" readonly="true"></textarea>
						</div>
					</div>
					<div class="btns">
						<div id="edit_layout1" class="btn">編集</div>
					</div>
				</div>
				<br> <br>
				<div class="content_box mtop_10per item_box">
					<div class="content_box mtop_5per">
						<h2>問題の選択肢</h2>
						<div class="item_box_se">
							<p>以下の内容で選択肢Aが反映されます。</p>
							<textarea id="check_selection_A" readonly="true"></textarea>
						</div>
						<div class="item_box_se">
							<p>以下の内容で選択肢Bが反映されます。</p>
							<textarea id="check_selection_B" readonly="true"></textarea>
						</div>
						<div class="item_box_se">
							<p>以下の内容で選択肢Cが反映されます。</p>
							<textarea id="check_selection_C" readonly="true"></textarea>
						</div>
						<div class="item_box_se">
							<p>以下の内容で選択肢Dが反映されます。</p>
							<textarea id="check_selection_D" readonly="true"></textarea>
						</div>
					</div>
					<div class="content_box mtop_5per">
						<h2>解答を設定</h2>
						<div class="item_box">
							<p class="item_box_title">以下の解答で反映されます。</p>
							<div class="check_box">
								<p>解答：</p>
								<p id="check_answer"></p>
							</div>
						</div>
					</div>
					<div class="content_box mtop_5per">
						<h2>解説の入力</h2>
						<div class="item_box">
							<p class="item_box_title">以下の解説で反映されます。</p>
							<textarea id="check_kaisetsu" readonly="true"></textarea>
						</div>
					</div>
					<div class="btns">
						<div id="edit_layout2" class="btn">編集</div>
					</div>
				</div>
				<logic:empty name="viewUpdateBean">
					<div class="btns">
						<html:button property="insert" styleClass="btn r-button3">
              						登録
            				</html:button>
					</div>
				</logic:empty>
				<logic:notEmpty name="viewUpdateBean">
					<div class="btns">
						<html:button property="update" styleClass="btn r-button3">
              						更新
            			</html:button>
					</div>
				</logic:notEmpty>
			</div>
		</div>
	</html:form>
</body>
</html:html>