<%@ page language="java" pageEncoding="GB18030"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ê×Ò³</title>
<style>
* {
	font-size: 12px
}

.style1 {
	font-size: x-large;
	font-weight: bold;
}
</style>
</head>
<body>
	<div align="center" class="style1"
		style='float: left; width: 100%; height: 10%; border: 1px solid #BA5B57;'>
		Ê×Ò³</div>
	<table align="center" width="80%" border="1" cellpadding="0"
		cellspacing="0">
		<tr>
			<td height="20"><strong>ÈÈµãÐÂÎÅ</strong></td>
			<td><strong>¹«Ë¾ÎÄ¼þ</strong></td>
		</tr>
		<tr>
			<td height="150"><ol>
					<s:iterator value="hotNews">
						<li><a
							href="hotNews.jsp?content=<s:property value="content"/>"><s:property
									value="head" /></a> &nbsp;&nbsp;&nbsp; &nbsp;<a
							href="adminRelease.jsp?id=<s:property value="id"/>&issueUser=<s:property value="issueUser"/>
							&head=<s:property value="head"/>&content=<s:property value="content"/>">ÐÞ¸Ä</a>&nbsp;&nbsp;&nbsp;
							&nbsp;<a href="deleteNews!delete?id=<s:property value="id"/>">É¾³ý</a></li>
					</s:iterator>
				</ol></td>
			<td><ol>
					<s:iterator value="fileNews">
						<li><a
							href="fileNews.jsp?content=<s:property value="content"/>"><s:property
									value="head" /></a> &nbsp;&nbsp;&nbsp; &nbsp;<a
							href="adminRelease.jsp?id=<s:property value="id"/>&issueUser=<s:property value="issueUser"/>
							&head=<s:property value="head"/>&content=<s:property value="content"/>">ÐÞ¸Ä</a>&nbsp;&nbsp;&nbsp;
							&nbsp;<a href="deleteNews!delete?id=<s:property value="id"/>">É¾³ý</a></li>
					</s:iterator>
				</ol></td>
		</tr>

		<tr style="border-top-width: 0">
			<td height="15" style="border-top-width: 0"><div
					style='width: 100%; border: 1px solid red;' align='right'>
					<a href="">¸ü¶àÄÚÈÝ</a>
				</div></td>
			<td style="border-top-width: 0"><div
					style='width: 100%; border: 1px solid red;' align='right'>
					<a href="">¸ü¶àÄÚÈÝ</a>
				</div></td>
		</tr>

		<tr>

			<td height="20"><strong>»áÒé¼ÍÒª</strong></td>
			<td><strong>¹æÕÂÖÆ¶È</strong></td>
		</tr>

		<tr>
			<td height="150"><ol>
					<s:iterator value="confNews">
						<li><a
							href="confNews.jsp?content=<s:property value="content"/>"><s:property
									value="head" /></a> &nbsp;&nbsp;&nbsp; &nbsp;<a
							href="adminRelease.jsp?id=<s:property value="id"/>&issueUser=<s:property value="issueUser"/>
							&head=<s:property value="head"/>&content=<s:property value="content"/>">ÐÞ¸Ä</a>
							&nbsp;&nbsp;&nbsp; &nbsp;<a
							href="deleteNews!delete?id=<s:property value="id"/>">É¾³ý</a></li>
					</s:iterator>
				</ol></td>
			<td><ol>
					<s:iterator value="regulNews">
						<li><a
							href="regulNews.jsp?content=<s:property value="content"/>"><s:property
									value="head" /></a> &nbsp;&nbsp;&nbsp; &nbsp;<a
							href="adminRelease.jsp?id=<s:property value="id"/>&issueUser=<s:property value="issueUser"/>
							&head=<s:property value="head"/>&content=<s:property value="content"/>">ÐÞ¸Ä</a>&nbsp;&nbsp;&nbsp;
							&nbsp; <a href="deleteNews!delete?id=<s:property value="id"/>">É¾³ý</a></li>
					</s:iterator>
				</ol></td>
		</tr>

		<tr>
			<td height="15" style="border-top-width: 0"><div
					style='width: 100%; border: 1px solid red;' align='right'>
					<a href="">¸ü¶àÄÚÈÝ</a>
				</div></td>
			<td style="border-top-width: 0"><div
					style='width: 100%; border: 1px solid red;' align='right'>
					<a href="">¸ü¶àÄÚÈÝ</a>
				</div></td>
		</tr>
	</table>
	<s:debug></s:debug>
</body>
</html>