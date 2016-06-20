<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'verfityTrip.jsp' starting page</title>

	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <h2 align="center">验证票价</h2>
    <hr>
    <form action="VerifyTrips" method="get"  >
    <input type="hidden" name="uri" value=<%="'"+request.getAttribute("uri")+"'" %> >
    <h3 align="center">验证票价成功，现在去下单！</h3>
    <input type="submit" value="下一步  " >
    </form>
  </body>
</html>
