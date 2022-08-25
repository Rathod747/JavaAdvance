<%@page import="java.util.ArrayList"%>
<%@page import="com.rays.bean.StudentBean"%>
<%@page import="java.util.Iterator"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<center>
		<table border="3px">

			<h1 class="h">
				<B><U><I><a href="Student.jsp">WELCOME</I></U></B>
			</h1>

			<tr>
				<td>Id</td>
				<td>Rollno</td>
				<td>fname</td>
				<td>lname</td>
				<td>session</td>
			</tr>
			<%
				ArrayList list = (ArrayList) request.getAttribute("ok");
				Iterator<StudentBean> it = list.iterator();
				while (it.hasNext()) {
					StudentBean bean = it.next();
			%>
			<tr>
				<td><%=bean.getId()%></td>
				<td><%=bean.getRollno()%></td>
				<td><%=bean.getFname()%></td>
				<td><%=bean.getLname()%></td>
				<td><%=bean.getSession()%></td>
			</tr>
			<%
				}
			%>
		</table>



	</center>
</body>
</html>