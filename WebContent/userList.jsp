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

<title>�û��б�</title>
</head>
<body>

	<table border=2 width=420 align="center">

		<caption>
			<FONT style="FONT-SIZE: 20pt; FONT-FAMILY: ����," color=#0000ff>�û��б�</FONT>
		</caption>

		<tr>
			<th>�û�ID</th>
			<th>�û�����</th>
			<th>�û�Ȩ��</th>
			<th colspan=2>����</th>
		</tr>
		<s:iterator value="users">
			<tr>
				<th><s:property value="id" /></th>
				<th><s:property value="name" /></th>
				<th><s:property value="authority" /></th>
				<th><a href="adminLogin!change?id=<s:property value="id"/>">����Ȩ��</a></th>
				<th><a href="adminLogin!delete?id=<s:property value="id"/>">ɾ���û�</a></th>
			</tr>
		</s:iterator>
	</table>
	<br>
	<br>
<a href="news/deleteNews!list">
<FONT style="FONT-SIZE: 20pt; FONT-FAMILY: ����," color=#ff0000>�鿴����</FONT></a><br>
<a href="release.jsp?issueUser=Admin">
<FONT style="FONT-SIZE: 20pt; FONT-FAMILY: ����," color=#ff0000>��������</FONT></a>
	<br>
	<div class="text" style="text-align: center;">
		<FONT style="FONT-SIZE: 20pt; FONT-FAMILY: ����," color=#ff0000>�������û�</FONT>
	</div>
	<form action="adminLogin!create" method="get">
		<div style="width: 100%; text-align: center">
			�û�����<input type="text" name="name"><br> ���룺<input
				type="password" name="password"><br> �û�Ȩ�ޣ�<input
				type="radio" name="authority" value="Normal">Normal <input
				type="radio" name="authority" value="VIP">VIP <br> <input
				type="submit" value="�ύ">
		</div>
	</form>
	<s:debug></s:debug>
</body>
</html>