<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>My JSP 'DocumentReservation.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css" href="css/01.css">

</head>

<body>
	<h2 align="center">
		订单创建完成! <font color=red> 现在进行支付后出票</font>
		<hr>
	</h2>
	<form action="DocumentReservation"  method="get">
		您需要支付：
		<h4><%=request.getSession().getAttribute("totalFare")%></h4>
		支付方式:<input type="radio" name="pay" value="ali" checked="checked">支付宝
		<input type="radio" name="pay" value="CCB">建设银行 
		<input type="radio" name="pay" value="ICBC">工商银行
		<input
			type="hidden" name="reservationCode"
			value=<%="'" + request.getAttribute("uri") + "'"%>>
		<hr>
		<input type="submit" value="  下一步   ">
	</form>
	
</body>
</html>
