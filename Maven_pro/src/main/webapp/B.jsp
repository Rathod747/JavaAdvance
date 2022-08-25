<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
In b jsp
<jsp:forward page="C.jsp"></jsp:forward>

<%
response.sendRedirect("c.jsp");


%>
<%
request.setAttribute("b", "two");

%>
</body>
</html>