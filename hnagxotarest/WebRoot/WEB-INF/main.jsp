<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>广西北部湾航空接口调用测试</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<link rel="stylesheet" type="text/css" href="css/01.css">
	


</head>

<body>
	<div align="center">
		<h1>广西北部湾航空</h1>
		<hr>
	</div>
	<div>
		<form action="SearchLowFareTripCL" method="get">
			<ul>
				<li>出发地    <input type="text" name="origin" value="NNG">
				</li>
				<li>目的地     <input type="text" name="destination" value="HAK">
				</li>
				<li>出发时间  <input type="text" name="time" value="2016-06-30">
				</li>
				<li>固定日期  <input type="radio" name="flexible" value="false">是
					<input type="radio" name="flexible" value="true" checked="checked">否</li>
			</ul>

			<hr>
			<div align="center">
			<input type="submit"  value="查   询">
			</div>
		</form>

	</div>
</body>
</html>
