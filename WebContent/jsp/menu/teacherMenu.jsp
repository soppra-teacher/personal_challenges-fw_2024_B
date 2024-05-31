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
<link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/css/teacherMenu.css" />
<title>�󌱎҃��j���[</title>
</head>

<body>
	<header class="site-header">
		<div class="wrapper site-header__wrapper">
			<div class="site-header__start">
				<span class="brand">���̊Ǘ�</span>
			</div>
			<div class="site-header__middle">
				<nav class="nav">
					<ul class="nav__wrapper">
						<li class="nav__item"><a href="#">���̓o�^</a></li>
					</ul>
				</nav>
			</div>
			<div class="site-header__end">
				<html:link action="/Logout" >���O�A�E�g</html:link>
			</div>
		</div>
	</header>

	<div class="index">
		<div class="example">
			<table>
				<tr class="top-table">
					<td></td>
					<td>���ID</td>
					<td>����</td>
					<td>����</td>
					<td>���</td>
					<td>��</td>
					<td>���</td>
					<td>������</td>
				</tr>
				<tr>
					<td><input type="checkbox" /></td>
					<td>1</td>
					<td>Java</td>
					<td>�^�ϊ�</td>
					<td>�����񂩂琔�l�^�ւ̌^�ϊ����s���K��</td>
					<td>a</td>
					<td>���</td>
					<td>88</td>
				</tr>

				<tr>
					<td><input type="checkbox" /></td>
					<td>���ID</td>
					<td>����</td>
					<td>����</td>
					<td>���</td>
					<td>��</td>
					<td>���</td>
					<td>������</td>
				</tr>
				<tr>
					<td><input type="checkbox" /></td>
					<td>���ID</td>
					<td>����</td>
					<td>����</td>
					<td>���</td>
					<td>��</td>
					<td>���</td>
					<td>������</td>
				</tr>
				<tr>
					<td><input type="checkbox" /></td>
					<td>���ID</td>
					<td>����</td>
					<td>����</td>
					<td>���</td>
					<td>��</td>
					<td>���</td>
					<td>������</td>
				</tr>
				<tr>
					<td><input type="checkbox" /></td>
					<td>���ID</td>
					<td>����</td>
					<td>����</td>
					<td>���</td>
					<td>��</td>
					<td>���</td>
					<td>������</td>
				</tr>
				<tr>
					<td><input type="checkbox" /></td>
					<td>���ID</td>
					<td>����</td>
					<td>����</td>
					<td>���</td>
					<td>��</td>
					<td>���</td>
					<td>������</td>
				</tr>
				<tr>
					<td><input type="checkbox" /></td>
					<td>���ID</td>
					<td>����</td>
					<td>����</td>
					<td>���</td>
					<td>��</td>
					<td>���</td>
					<td>������</td>
				</tr>
				<tr>
					<td><input type="checkbox" /></td>
					<td>���ID</td>
					<td>����</td>
					<td>����</td>
					<td>���</td>
					<td>��</td>
					<td>���</td>
					<td>������</td>
				</tr>
				<tr>
					<td><input type="checkbox" /></td>
					<td>���ID</td>
					<td>����</td>
					<td>����</td>
					<td>���</td>
					<td>��</td>
					<td>���</td>
					<td>������</td>
				</tr>
				<tr>
					<td><input type="checkbox" /></td>
					<td>���ID</td>
					<td>����</td>
					<td>����</td>
					<td>���</td>
					<td>��</td>
					<td>���</td>
					<td>������</td>
				</tr>
				<tr>
					<td><input type="checkbox" /></td>
					<td>���ID</td>
					<td>����</td>
					<td>����</td>
					<td>���</td>
					<td>��</td>
					<td>���</td>
					<td>������</td>
				</tr>
				<tr>
					<td><input type="checkbox" /></td>
					<td>���ID</td>
					<td>����</td>
					<td>����</td>
					<td>���</td>
					<td>��</td>
					<td>���</td>
					<td>������</td>
				</tr>
				<tr>
					<td><input type="checkbox" /></td>
					<td>���ID</td>
					<td>����</td>
					<td>����</td>
					<td>���</td>
					<td>��</td>
					<td>���</td>
					<td>������</td>
				</tr>

			</table>
		</div>
		<div class="questionID">
			<a>�P</a>
			<ul class="li__wrapper">
				<li class="item"><a>Java</a></li>
				<li class="item"><a>�^�ϊ�</a></li>
			</ul>

			<div class="question">
				<a>�����񂩂琔�l�^�ւ̌^�ϊ����s���K��</a>
			</div>

			<div class="answer">
				<a>a</a>
			</div>

			<div class="kaisetu">
				<a>���</a>
			</div>

			<div class="percent">
				<a>88��</a>
			</div>


			<a class="update" href="#">���̍X�V</a>

		</div>

	</div>
</body>
</html:html>