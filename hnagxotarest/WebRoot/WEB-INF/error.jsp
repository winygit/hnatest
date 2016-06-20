<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>My JSP 'error.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<link rel="stylesheet" type="text/css" href="css/01.css">


</head>

<body>
<h2 align="center">错误消息</h2>
	<hr>
	<ul>
		<li>错误代码：<%=request.getAttribute("errCode")%></li>
		<li>错误描述：<%=request.getAttribute("errInfo")%></li>
	</ul>
	<hr>
	<form action=<%=request.getHeader("Referer")%> method="post">
		<center><input type="submit" value=" 返   回  " ></center>
	</form>
	
</body>
</html>
