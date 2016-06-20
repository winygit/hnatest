<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
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

<title>My JSP 'calTrip.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css" href="css/01.css">

</head>

<body>
	<h2 align="center">计算税费</h2>
	<hr>
	<div>
		<ul>
			<li>总 费 用：<%=(String)request.getSession().getAttribute("totalFare")%></li>
			<li>基本费用：<%=(String)request.getSession().getAttribute("BaseFareAmount")%></li>
			<li>费务金额：<%=(String)request.getSession().getAttribute("feeAmount")%></li>
			<li>费务信息：<%=(String)request.getSession().getAttribute("feeInfo")%></li>
			<li>税务金额：<%=(String)request.getSession().getAttribute("TaxAmount")%></li>
			<li>税务信息：<%=(String)request.getSession().getAttribute("TaxInfo")%></li>
			<li>货币单位：<%=(String)request.getSession().getAttribute("Currency")%></li>
			<li></li>
			<li></li>
			<li>类型：<%=(String)request.getSession().getAttribute("FCNVal")%>
			</li>
			<%
				ArrayList<String> al=(ArrayList<String>)request.getSession().getAttribute("FCAVal");
						 for(int j=0;j<al.size();j++)
						 {
			%>
			<li>✈ <%=al.get(j)%></li>
			<%
				}
			%>
		</ul>
	</div>

	<hr>
	<form action="VerifyTrips" method="get">
		<input type="hidden" name="uri"
			value=<%="'" + request.getAttribute("uri") + "'"%>> <input
			type="submit" value="下一步   (验证票价)">
	</form>
</body>
</html>
