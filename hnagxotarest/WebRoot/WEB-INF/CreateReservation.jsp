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
		��֤Ʊ�����! <font color=red> ���ڴ�������������PNR</font>
	</h2>

	<hr>
	<form action="CreateReservation" method="post">
		<input type="hidden" name="uri"
			value=<%="'" + request.getAttribute("uri") + "'"%>>
		<div>
	<h4> �˻�����Ϣ </h4> 
			<table>
				<tr>
					<td>�˻�������:<input type="radio" name="code" value="ADT"
						checked="checked">���� <input type="radio" name="code"
						value="CNN">��ͯ</td>
					<td></td>
				</tr>
				<tr>
					<td>���֣�<input type="text" name="fName" >
					</td>
					<td>�գ�<input type="text" name="lName">
					</td>
					<td>�м�����<input type="text" name="mName">
					</td>
				</tr>
				<tr>
					<td>�绰���룺<input type="text" name="mobilePhonenumber">
					</td>
					<td>�������䣺<input type="text" name="Email">
					</td>
					<td>�������ڣ�<input type="text" name="dateOfBirth">(��ʽ��YYYY-MM-DD,��ͯ����)</td>
				</tr>
				<tr>
					<td>֤�����ͣ�<input type="radio" name="documenttype" value="ID_CARD" checked="checked">���֤
					<input type="radio" name="documenttype" value="MI_CARD">����֤
					<input type="radio" name="documenttype" value="2.DOC">����
					</td>
					<td>֤�����룺<input type="text" name="documentnumber"></td>
					<td></td>
				</tr>

				<tr>
					<td>֤��ǩ������<input type="text" name="documentcountry"
						value="CN"></td>
					<td>֤���������ڣ�<input type="text" name="documentexpirationDate"
						value="2999-10-01">
					</td>
					<td></td>
				</tr>
			</table>
			<br>
			<h4> ��ϵ����Ϣ  </h4>
			<table>				
				<tr>
					<td>�˻�������:<input type="radio" name="ccode" value="ADT"
						checked="checked">���� <input type="radio" name="ccode"
						value="CNN">��ͯ</td>
					<td></td>
				</tr>
				<tr>
					<td>���֣�<input type="text" name="cfName">
					</td>
					<td>�գ�<input type="text" name="clName">
					</td>
					<td>�м�����<input type="text" name="cmName">
					</td>
				</tr>
				<tr>
					<td>�绰���룺<input type="text" name="cmobilePhonenumber">
					</td>
					<td>�������䣺<input type="text" name="cemail">
					</td>				
				</tr>			
			</table>
		</div>
		<hr>
		<input type="button" class="def " value="���������ҵ���Ϣ">
		<input type="submit" value="��һ��  ">
	</form>
</body>
</html>
