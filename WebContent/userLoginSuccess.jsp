<%@ page language="java" pageEncoding="GB18030"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Success</title>
<style> 
body{text-align:center} 
</style> 
</head>
<body>
<FONT style="FONT-SIZE: 20pt; FONT-FAMILY: 楷体," color=#ff0000>用户登录成功！</FONT><br><br><br><br><br>
<a href="release.jsp?issueUser=<s:property value="name"/>">发布信息</a>
<s:debug></s:debug>
</body>
</html>