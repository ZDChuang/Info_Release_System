<%@ page language="java" pageEncoding="GB18030"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Information</title>
</head>
<body>
	ÓÃ»§×ÊÁÏ:<br>
	<s:iterator value="users">
		<s:property value="id"/><br/>
		<s:property value="name"/><br/>
		<s:property value="authority"/><br/>
	</s:iterator> 
	
</body>
</html>