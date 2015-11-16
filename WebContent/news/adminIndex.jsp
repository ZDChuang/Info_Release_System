<%@ page language="java" pageEncoding="GB18030"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>首页</title>
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
		首页</div>
	<table align="center" width="80%" border="1" cellpadding="0"
		cellspacing="0">
		<tr>
			<td height="20"><strong>热点新闻</strong></td>
			<td><strong>公司文件</strong></td>
		</tr>
		<tr>
			<td height="150"><ol>
					<s:iterator value="hotNews">
						<li><a
							href="hotNews.jsp?content=<s:property value="content"/>"><s:property
									value="head" /></a> &nbsp;&nbsp;&nbsp; &nbsp;<a
							href="adminRelease.jsp?id=<s:property value="id"/>&issueUser=<s:property value="issueUser"/>
							&head=<s:property value="head"/>&content=<s:property value="content"/>">修改</a>&nbsp;&nbsp;&nbsp;
							&nbsp;<a href="deleteNews!delete?id=<s:property value="id"/>">删除</a></li>
					</s:iterator>
				</ol></td>
			<td><ol>
					<s:iterator value="fileNews">
						<li><a
							href="fileNews.jsp?content=<s:property value="content"/>"><s:property
									value="head" /></a> &nbsp;&nbsp;&nbsp; &nbsp;<a
							href="adminRelease.jsp?id=<s:property value="id"/>&issueUser=<s:property value="issueUser"/>
							&head=<s:property value="head"/>&content=<s:property value="content"/>">修改</a>&nbsp;&nbsp;&nbsp;
							&nbsp;<a href="deleteNews!delete?id=<s:property value="id"/>">删除</a></li>
					</s:iterator>
				</ol></td>
		</tr>

		<tr style="border-top-width: 0">
			<td height="15" style="border-top-width: 0"><div
					style='width: 100%; border: 1px solid red;' align='right'>
					<a href="">更多内容</a>
				</div></td>
			<td style="border-top-width: 0"><div
					style='width: 100%; border: 1px solid red;' align='right'>
					<a href="">更多内容</a>
				</div></td>
		</tr>

		<tr>

			<td height="20"><strong>会议纪要</strong></td>
			<td><strong>规章制度</strong></td>
		</tr>

		<tr>
			<td height="150"><ol>
					<s:iterator value="confNews">
						<li><a
							href="confNews.jsp?content=<s:property value="content"/>"><s:property
									value="head" /></a> &nbsp;&nbsp;&nbsp; &nbsp;<a
							href="adminRelease.jsp?id=<s:property value="id"/>&issueUser=<s:property value="issueUser"/>
							&head=<s:property value="head"/>&content=<s:property value="content"/>">修改</a>
							&nbsp;&nbsp;&nbsp; &nbsp;<a
							href="deleteNews!delete?id=<s:property value="id"/>">删除</a></li>
					</s:iterator>
				</ol></td>
			<td><ol>
					<s:iterator value="regulNews">
						<li><a
							href="regulNews.jsp?content=<s:property value="content"/>"><s:property
									value="head" /></a> &nbsp;&nbsp;&nbsp; &nbsp;<a
							href="adminRelease.jsp?id=<s:property value="id"/>&issueUser=<s:property value="issueUser"/>
							&head=<s:property value="head"/>&content=<s:property value="content"/>">修改</a>&nbsp;&nbsp;&nbsp;
							&nbsp; <a href="deleteNews!delete?id=<s:property value="id"/>">删除</a></li>
					</s:iterator>
				</ol></td>
		</tr>

		<tr>
			<td height="15" style="border-top-width: 0"><div
					style='width: 100%; border: 1px solid red;' align='right'>
					<a href="">更多内容</a>
				</div></td>
			<td style="border-top-width: 0"><div
					style='width: 100%; border: 1px solid red;' align='right'>
					<a href="">更多内容</a>
				</div></td>
		</tr>
	</table>
	<s:debug></s:debug>
</body>
</html>