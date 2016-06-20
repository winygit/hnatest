<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>My JSP 'ReservationInfo.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css" href="css/01.css">

</head>

<body>
	<h1>bingo!  尊敬的<font color=red><%=request.getSession().getAttribute("FirstName")%> <%=request.getSession().getAttribute("LastName")%></font> 订票成功!</h1>
	<hr>
	<div>
		<ul>
			
			<li>订单状态：<%=request.getSession().getAttribute("Status")%></li>
			<li>支付金额：<%=request.getSession().getAttribute("PurchaseAmount")%></li>
			<li>乘客信息：</li>
			<li>电话：<%=request.getSession().getAttribute("Phone")%> 证件类型：<%=request.getSession().getAttribute("IDType")%>
				证件号：<%=request.getSession().getAttribute("IDNO")%></li>
			<li>联系人信息 :</li>
			<li><%=request.getSession().getAttribute("cFirstName")%> <%=request.getSession().getAttribute("cLastName")%>
				电话：<%=request.getSession().getAttribute("cPhone")%> 邮箱：<%=request.getSession().getAttribute("cEmail")%>
		</ul>
	</div>
</body>
</html>
