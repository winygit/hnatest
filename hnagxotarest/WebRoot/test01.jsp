<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>


<title>My JSP 'test01.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<script type="text/javascript" src="js/jquery-1.7.2.js"></script>
<script type="text/javascript">
	function fun() {
		alert("JSON :nnn ");
		var s = {
			"name" : "Bill Gates",
			"street" : "Fifth Avenue New York 666",
			"age" : 56,
			"phone" : "555 1234567"
		};

		//var s = eval("(" + obj + ")");
		alert(s);
		alert("JSON : " + s.name);
	}
</script>
<script type="text/javascript">
	//$(function(){
	$(function() {
		$.getJSON("json1.json", function(json1) {
         // $.get("http://www.baidu.com", function(json) {
			//alert("RS: " + json.AirLowFareSearchRS['@Uri']);
			alert("typeof:" + typeof json1);
			alert("legth:" + json1.legth);
			alert(":" + json1.employees[0].firstName);
			
			
			$("#txt1").val("hhh");
			
		}

		);
	});
</script>
</head>

<body>
	This is my test page.
	<br>
	<input type="text" id="txt2" value="123" >
	<input type="button" id="txt1" value="1111" onclick="fun()">
</body>
</html>
