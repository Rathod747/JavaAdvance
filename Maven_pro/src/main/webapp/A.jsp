<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
In a jsp
<jsp:forward page="B.jsp"></jsp:forward> 
<%
response.sendRedirect("B.jsp");
%>

<%
request.setAttribute("a", "one");

%>
</body>
</html>