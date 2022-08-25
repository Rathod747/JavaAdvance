<%@ page errorPage="ErrorHandler.jsp" language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="Header.jsp"%><br>
	<br>
	<br>
	<br>
	<br>
	<center>
		<form action="StudentCtrl" method=post>

			<center>
				<h1>Login Form</h1>
			</center>
			<table>
				<tr>
					<th><b> Roll no.</b></th>
					<td><input type="text" value="" name=rollno></td>
				</tr>

				<tr>
					<th><b> First Name</b></th>
					<td><input type="text" value="" name=fname></td>
				</tr>

				<tr>
					<th><b> Last Name</b></th>
					<td><input type="text" value="" name=lname></td>
				</tr>

				<tr>
					<th><b> Session</b></th>
					<td><input type="text" value="" name=session></td>
				</tr>

				<th></th>
				<td><input type="submit" value="add" name="operation">
					<input type="submit" value="delete" name="operation">
					 <input
					type="submit" value="modify" name="operation">
					<a href="Rollno.jsp"><input type="button" value="GetStudent" name="rollNo"></a>
					<a href="GetStudentSearchCtrl"><input type="button" value="GetStudentSearch"></a></td>
					</td>


			</table>
			<br><br><br><br>
		</form>
	</center>
	<%@ include file="Footer.jsp"%>
</body>
</html>