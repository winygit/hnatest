<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'DocumentReservationOK.jsp' starting page</title>

	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="css/01.css">

  </head>
  
  <body>
   <h2 align="center">出票成功！</h2>
    <hr>
  <div>
         您的票号是：<%=request.getSession().getAttribute("TicketNo") %>
  </div>
    <a href="Getreservation"><h3>查询订单信息</h3></a>  
  </body>
</html>
