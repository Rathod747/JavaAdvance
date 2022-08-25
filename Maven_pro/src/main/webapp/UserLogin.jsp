<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file = "Header.jsp" %>
<%@ include file = "Footer.jsp" %>
<br> <br> <br> <br>
	<form action="LoginCtrl" method="post">
	<% 
	String sMsg = (String) request.getAttribute("sMsg");
	String userid = (String) request.getAttribute("userid");
	String pwd = (String) request.getAttribute("pwd");
	String msg = (String) request.getAttribute("msg");
	if (sMsg != null) {
	%>
	<center>
		<font color="Red"> <%=sMsg%></font>
	</center>
	<%
	}
	%>
	<center>
		<%
		if (msg != null) {
		%>
		<font color="red"><h3><%=msg%></h3></font>
		<%
		}
		%>
		</center>

		<table align="center">
			<tr>
				<th>User name*:</th>
				<td><input type="text" name="user" value=""></td>
	<td>
						<%
						if (userid != null) {
						%> <font color="Red"> <%=userid%></font> <%
 }
 %>
					</td>
			</tr>
			<tr>
				<th>Password*:</th>
				<td><input type="password" name="pwd" value=""></td>
					<td>
						<%
						if (pwd != null) {
						%> <font color="Red"> <%=pwd%></font> <%
 }
 %>
					</td>
			</tr>
			<tr>
				<td><input type="submit" value="Log In"> <input
					type="submit" name="Cancel" value="Cancel"></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><a href="Regestration.jsp"><b>SignUp</b></a>
					| <a href="ForgetyourPassword.jsp"><b>Forget my password</b></a>&nbsp;</td>
			</tr>
		</table>
		<br> <br> <br><br>
		<%@ include file = "Footer.jsp" %>
	</form>
</body>
</html>