<%@ page contentType="text/html; charset=Windows-31J"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>

<header class="site-header">
	<div class="wrapper site-header__wrapper">
		<div class="site-header__start">
			<span class="brand"><%=request.getParameter("screenTitle")%></span>
		</div>
		<div class="site-header__end">
			<html:link action="/Logout">ログアウト</html:link>
		</div>
	</div>
</header>