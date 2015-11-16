<%@ page language="java" pageEncoding="GB18030"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>ÓÃ»§ÁÐ±í</title>
</head>
<body>

	<table border=2 width=420 align="center">

		<caption>
			<FONT style="FONT-SIZE: 20pt; FONT-FAMILY: ¿¬Ìå," color=#0000ff>ÓÃ»§ÁÐ±í</FONT>
		</caption>

		<tr>
			<th>ÓÃ»§ID</th>
			<th>ÓÃ»§ÐÕÃû</th>
			<th>ÓÃ»§È¨ÏÞ</th>
			<th colspan=2>²Ù×÷</th>
		</tr>
		<s:iterator value="users">
			<tr>
				<th><s:property value="id" /></th>
				<th><s:property value="name" /></th>
				<th><s:property value="authority" /></th>
				<th><a href="adminLogin!change?id=<s:property value="id"/>">¸ü¸ÄÈ¨ÏÞ</a></th>
				<th><a href="adminLogin!delete?id=<s:property value="id"/>">É¾³ýÓÃ»§</a></th>
			</tr>
		</s:iterator>
	</table>
	<br>
	<br>
<a href="news/deleteNews!list">
<FONT style="FONT-SIZE: 20pt; FONT-FAMILY: ¿¬Ìå," color=#ff0000>²é¿´ÐÂÎÅ</FONT></a><br>
<a href="release.jsp?issueUser=Admin">
<FONT style="FONT-SIZE: 20pt; FONT-FAMILY: ¿¬Ìå," color=#ff0000>·¢²¼ÐÂÎÅ</FONT></a>
	<br>
	<div class="text" style="text-align: center;">
		<FONT style="FONT-SIZE: 20pt; FONT-FAMILY: ¿¬Ìå," color=#ff0000>´´½¨ÐÂÓÃ»§</FONT>
	</div>
	<form action="adminLogin!create" method="get">
		<div style="width: 100%; text-align: center">
			ÓÃ»§Ãû£º<input type="text" name="name"><br> ÃÜÂë£º<input
				type="password" name="password"><br> ÓÃ»§È¨ÏÞ£º<input
				type="radio" name="authority" value="Normal">Normal <input
				type="radio" name="authority" value="VIP">VIP <br> <input
				type="submit" value="Ìá½»">
		</div>
	</form>
	<s:debug></s:debug>
</body>
</html>