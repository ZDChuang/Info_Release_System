<%@ page language="java" pageEncoding="GB18030"%>
<%@ page import="java.util.List,com.zdc.util.NewsUtil"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>信息发布</title>
<style type="text/css">
</style>
</head>
<%
String[] types = {"热点新闻","规章制度","公司文件","会议纪要"};
%>

<body>
	<form action="news/newsSubmit" method="post">
		<table width="80%" height="170" border="1" cellpadding="0"
			cellspacing="0" align=center>
			<tr>
				<td height="17" colspan="2">
					<div align="center" class="style1">发布信息</div>
				</td>
			</tr>
			<tr>
				<td width="126" height="19"><strong>信息标题</strong></td>
				<td width="560"><input name="head" type="text" size="100%"></td>
			</tr>
			<tr>
				<td height="73"><strong>信息内容</strong></td>
				<td><p>
						<textarea name="content" cols="100%" rows="30"></textarea>
					</p></td>
			</tr>
			<tr>
				<td height="19" colspan="2"><strong>发布时间:</strong><%=NewsUtil.getTime()%><s:property value="date"/>
					<strong>发布人:</strong><%=request.getParameter("issueUser")%>
					<input type="hidden" name="issueUser" value="<%=request.getParameter("issueUser")%>"/> 
			<%-- 		<s:property value="issueUser"/> --%>
					<strong>信息类型</strong>:<select
					name="type">
						<option><%=types[0]%></option>
						<option><%=types[1]%></option>
						<option><%=types[2]%></option>
						<option><%=types[3]%></option>
				</select>&nbsp;
				<input type="submit" value="提交"> </td>
			</tr>

			<!-- <tr>
				<td height="18">&nbsp;</td>
				<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<input type="submit" value="提交"> </td>
			</tr> -->

		</table>
	</form><br>
	<s:debug></s:debug>
</body>
</html>