<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="getpwd" method="post">
		<%
			String pass = (String) request.getAttribute("pass");
			if (pass != null) {
		%>
		<h1>
			<font color="pink"><h2><%=pass%></h2></font>
		</h1>
		<%
			}
		%>
		<center>
			<font= "red"><h1>Forget your Password is here</h1></font>
			<h4>Submit your email address we'll send your password</h4>
			<p>Password is sent to your regestration email id</p>

			<table>
				<tr>
					<td>
						<p>Email Id;</p>
					</td>
					<td><input type="email" name="userid"
						placeholder="ENTER ID HERE"></td>
					<td>
						<button>
							<a style="float: center; text-decoration: none;"> Go 
						</button>

					</td>
				</tr>


				<td></td>
				<td><font color="red"> Email is required</font></td>



			</table>
		</center>
</body>
</html>