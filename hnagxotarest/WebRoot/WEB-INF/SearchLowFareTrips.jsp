<%@ page language="java" import="java.util.*,com.hna.wjt.search.domin.*"
	contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>My JSP 'SearchLowFareTrips2.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css" href="css/01.css">

<%--显示最低价航班 --%>
<script type="text/javascript">
	
</script>
<%
  int CanSelectedNum=(Integer)request.getAttribute("CanSelectedNum");
  FlightPriceInfo selectedTrip=(FlightPriceInfo)request.getAttribute("selectedTrip");
  List<FlightPriceInfo> allTrip=(List<FlightPriceInfo>)request.getAttribute("allTrip");
  
  String uri=(String)request.getAttribute("uri");
 %>
</head>

<body >
	<div>
		<h2 align="center">查询结果</h2>
		<hr>
	</div>
	<form action="CalculateTrip"  method="get">
	<div style="padding:20px">
	<center>
	  <h4>推荐航班</h4>
	<table border="1"  >	
		<tr>	
		<th>航班号</th><th>出发地</th><th>目的地</th><th>出发时间</th><th>达到时间</th><th>基本费用</th><th>币种</th>		
		<th>选择</th>
		</tr>		
		<tr>
		<td><%=selectedTrip.getFlightNumber() %></td>
		<td><%=selectedTrip.getOriginLocationName() %></td>
		<td><%=selectedTrip.getDestinationLocationName() %></td>
		<td><%=selectedTrip.getDepartureDate() %></td>
		<td><%=selectedTrip.getArrivalDate() %></td>
		<td><%=selectedTrip.getBaseFareAmount() %></td>
		<%--
		<td><%=selectedTrip.getTotalFareAmount() %></td>
		<td><%=selectedTrip.getFeeSum() %></td>
		<td><%=selectedTrip.getTaxesSum()%></td>
		 --%>
		<td><%=selectedTrip.getCurrency()%></td>
		<td><input type="radio" name="select" value=<%="'"+selectedTrip.getIndex()+"'" %> checked="checked"></td>
		</tr>		
	</table>
	<h4>可选航班</h4>	
	<table border="1" >	
		<tr>	
		<th>航班号</th><th>出发地</th><th>目的地</th><th>出发时间</th><th>达到时间</th><th>基本费用</th><th>币种</th>		
		<th>选择</th>
		</tr>		
		<% for(int i=0;i<CanSelectedNum;i++){
		%>
		<tr>
		<td><%=allTrip.get(i).getFlightNumber() %></td>
		<td><%=selectedTrip.getOriginLocationName() %></td>
		<td><%=selectedTrip.getDestinationLocationName() %></td>
		<td><%=allTrip.get(i).getDepartureDate() %></td>
		<td><%=allTrip.get(i).getArrivalDate() %></td>
		<td><%=allTrip.get(i).getBaseFareAmount() %></td>
		<%-- 
		<td><%=allTrip.get(i).getTotalFareAmount() %></td>
		<td><%=allTrip.get(i).getFeeSum() %></td>
		<td><%=allTrip.get(i).getTaxesSum()%></td>
		--%>
		<td><%=allTrip.get(i).getCurrency()%></td>
		<td><input type="radio" name="select" value=<%="'"+allTrip.get(i).getIndex()+"'" %>></td>
		</tr>
		<% 
		 }
		 %>		
	</table>
	</center>
	</div>
	<div style="magin:50px;text-align:center ;font_size:50px">
	<input type="hidden" name="uri" value=<%= uri%>>
	<input id="tj" type="submit" value="提  交">
	
	</div>
	</form>
	<%--证票价合理性、填写旅客信息后创建订单、支付后出票、查询订单 --%>
	<div></div>
	<div></div>

</body>
</html>
