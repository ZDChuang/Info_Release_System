<%@ page language="java" pageEncoding="GB18030"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Information Submit Fail</title>
<style> 
body{text-align:center} 
</style> 
</head>
<body><br><br><br>
<FONT style="FONT-SIZE: 20pt; FONT-FAMILY: 楷体," color=#ff0000>信息提交失败！</FONT><br><br><br><br><br>
请重新<a href="../release.jsp?issueUser=<s:property value="issueUser"/>">提交</a>
<s:debug/>
</body>
</html>