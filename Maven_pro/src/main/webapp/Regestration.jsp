<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<body bgcolor="7D7CAF">
	<title>My profile</title>
	<div style="text-align: center;">
		<img src="C:\Users\dell\Downloads\rays.png" width="200px" />
	</div>
	<hr>
	<h1 style="text-align: center;">My Profile</h1>
	<form action="ragctl"  method="post">
		<%
		String fname = (String) request.getAttribute("fname");
		String lname = (String) request.getAttribute("lname");
		String userid = (String) request.getAttribute("userid");
		String pwd = (String) request.getAttribute("pwd");
		String gender = (String) request.getAttribute("gender");
		String number = (String) request.getAttribute("number");
		String dob = (String) request.getAttribute("dob");
		%>
		<center>
			<table border="20px">
				<tr>
					<th><b>First Name*:</b></th>
					<td><input type="text" name="fname" value=""
						placeholder="FirstName"></td>
					<td>
						<%
						if (fname != null) {
						%> <font color="Red"> <%=fname%></font> <%
 }
 %>
					</td>
				</tr>
				<tr>
					<th><b>Last Name*:</b></th>
					<td><input type="text" name="lname" value=""
						placeholder="LastName"></td>
					<td>
						<%
						if (lname != null) {
						%> <font color="Red"> <%=lname%></font> <%
 }
 %>
					</td>
				</tr>
				<tr>
					<th><b>Login Id*:</b></th>
					<td><input type="email" name="userid" value=""
						placeholder="EmailId"></td>
					<td>
						<%
						if (userid != null) {
						%> <font color="Red"> <%=userid%></font> <%
 }
 %>
					</td>
				</tr>
				<tr>
					<th><b>Password*:</b></th>
					<td><input type="password" name="pwd" value=""
						placeholder="Password"></td>
					<td>
						<%
						if (pwd != null) {
						%> <font color="Red"> <%=pwd%></font> <%
 }
 %>
					</td>
				</tr>
				<tr>
					<th>Gender:</th>
					<td><label for="gender" style="text-align: center;"></label> <input
						type="radio" name="gender" value=" male" selected>Male <input
						type="radio" name="gender" value="female" selected>Female
						<input type="radio" name="gender" value="others" selected>Others</td>
					<td>
						<%
						if (gender != null) {
						%> <font color="Red"> <%=gender%></font> <%
 }
 %>
					</td>
				</tr>
				<tr>
					<th><b>Mobile No.:</b></th>
					<td><input type="number" name="number" value=""
						placeholder="mob"></td>
					<td>
						<%
						if (number != null) {
						%> <font color="Red"> <%=number%></font> <%
 }
 %>
					</td>
				</tr>
				<tr>
					<th><b>Date of Birth(dd/mm/yyyy):</b></th>
					<td><input type="text" name="dob" placeholder="dd/mm/yyyy"></td>
					<td>
						<%
						if (dob != null) {
						%> <font color="Red"> <%=dob%></font> <%
 }
 %>
					</td>
				</tr>
				<tr>
					<th></th>
					<td><input type="submit" name="submit" value="submit">
						<input type="submit" name="change password"
						value="change password"></td>
				</tr>
				</center>
				</form>
			</table>
			<hr>
			<h2 style="text-align: center;">(c)copyrights SunilOS Infotech
				Pvt.Ltd.</h2>
	</form>
</body>
</head>
</html>