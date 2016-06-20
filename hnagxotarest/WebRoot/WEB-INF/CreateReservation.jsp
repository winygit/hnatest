<%@ page language="java" import="java.util.*"  
contentType="text/html; charset=utf-8" pageEncoding="GBK"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>My JSP 'CreateReservation.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css" href="css/01.css">
<script type="text/javascript" src="js/jquery-1.7.2.js"></script>
<script type="text/javascript">

$(function(){
  
  $(".def").click(function()
  {
    //$("input[name='fName']").css("background", "#ffbbaa");
     $("input[name='fName']").val("winy");
     //$("input[name='mName']").val("jj");
     $("input[name='lName']").val("wu");
     $("input[name='mobilePhonenumber']").val("15527209215");
     $("input[name='Email']").val("winy95@foxmail.com");
     $("input[name='documenttype']").val("ID_CARD");
     $("input[name='documentnumber']").val("421181198711047630");
     $("input[name='documentexpirationDate']").val("2036-12-12");
     
     $("input[name='cfName']").val("lxx");
      $("input[name='cmName']").val("xx");
     $("input[name='clName']").val("lllsy");
     $("input[name='cmobilePhonenumber']").val("15527209215");
     $("input[name='cemail']").val("winy95@163.com");
     
  });
});
  
</script>

</head>

<body>
	<h2 align="center">
		验证票价完成! <font color=red> 现在创建订单并生成PNR</font>
	</h2>

	<hr>
	<form action="CreateReservation" method="post">
		<input type="hidden" name="uri"
			value=<%="'" + request.getAttribute("uri") + "'"%>>
		<div>
	<h4> 乘机人信息 </h4> 
			<table>
				<tr>
					<td>乘机人类型:<input type="radio" name="code" value="ADT"
						checked="checked">成人 <input type="radio" name="code"
						value="CNN">儿童</td>
					<td></td>
				</tr>
				<tr>
					<td>名字：<input type="text" name="fName" >
					</td>
					<td>姓：<input type="text" name="lName">
					</td>
					<td>中间名：<input type="text" name="mName">
					</td>
				</tr>
				<tr>
					<td>电话号码：<input type="text" name="mobilePhonenumber">
					</td>
					<td>电子邮箱：<input type="text" name="Email">
					</td>
					<td>出生日期：<input type="text" name="dateOfBirth">(格式：YYYY-MM-DD,儿童必填)</td>
				</tr>
				<tr>
					<td>证件类型：<input type="radio" name="documenttype" value="ID_CARD" checked="checked">身份证
					<input type="radio" name="documenttype" value="MI_CARD">军人证
					<input type="radio" name="documenttype" value="2.DOC">护照
					</td>
					<td>证件号码：<input type="text" name="documentnumber"></td>
					<td></td>
				</tr>

				<tr>
					<td>证件签发国：<input type="text" name="documentcountry"
						value="CN"></td>
					<td>证件过期日期：<input type="text" name="documentexpirationDate"
						value="2999-10-01">
					</td>
					<td></td>
				</tr>
			</table>
			<br>
			<h4> 联系人信息  </h4>
			<table>				
				<tr>
					<td>乘机人类型:<input type="radio" name="ccode" value="ADT"
						checked="checked">成人 <input type="radio" name="ccode"
						value="CNN">儿童</td>
					<td></td>
				</tr>
				<tr>
					<td>名字：<input type="text" name="cfName">
					</td>
					<td>姓：<input type="text" name="clName">
					</td>
					<td>中间名：<input type="text" name="cmName">
					</td>
				</tr>
				<tr>
					<td>电话号码：<input type="text" name="cmobilePhonenumber">
					</td>
					<td>电子邮箱：<input type="text" name="cemail">
					</td>				
				</tr>			
			</table>
		</div>
		<hr>
		<input type="button" class="def " value="快速生成我的信息">
		<input type="submit" value="下一步  ">
	</form>
</body>
</html>
