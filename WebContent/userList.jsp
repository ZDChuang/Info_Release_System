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

<title>用户列表</title>
</head>
<body>

	<table border=2 width=420 align="center">

		<caption>
			<FONT style="FONT-SIZE: 20pt; FONT-FAMILY: 楷体," color=#0000ff>用户列表</FONT>
		</caption>

		<tr>
			<th>用户ID</th>
			<th>用户姓名</th>
			<th>用户权限</th>
			<th colspan=2>操作</th>
		</tr>
		<s:iterator value="users">
			<tr>
				<th><s:property value="id" /></th>
				<th><s:property value="name" /></th>
				<th><s:property value="authority" /></th>
				<th><a href="adminLogin!change?id=<s:property value="id"/>">更改权限</a></th>
				<th><a href="adminLogin!delete?id=<s:property value="id"/>">删除用户</a></th>
			</tr>
		</s:iterator>
	</table>
	<br>
	<br>
<a href="news/deleteNews!list">
<FONT style="FONT-SIZE: 20pt; FONT-FAMILY: 楷体," color=#ff0000>查看新闻</FONT></a><br>
<a href="release.jsp?issueUser=Admin">
<FONT style="FONT-SIZE: 20pt; FONT-FAMILY: 楷体," color=#ff0000>发布新闻</FONT></a>
	<br>
	<div class="text" style="text-align: center;">
		<FONT style="FONT-SIZE: 20pt; FONT-FAMILY: 楷体," color=#ff0000>创建新用户</FONT>
	</div>
	<form action="adminLogin!create" method="get">
		<div style="width: 100%; text-align: center">
			用户名：<input type="text" name="name"><br> 密码：<input
				type="password" name="password"><br> 用户权限：<input
				type="radio" name="authority" value="Normal">Normal <input
				type="radio" name="authority" value="VIP">VIP <br> <input
				type="submit" value="提交">
		</div>
	</form>
	<s:debug></s:debug>
</body>
</html>