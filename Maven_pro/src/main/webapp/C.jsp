<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
In c jsp
<%
request.setAttribute("c", "three");

String a = (String)request.getAttribute("a");
String b =(String)request.getAttribute("b");
String c = (String)request.getAttribute("c");

%>
<%=a %>
<%=b %>
<%=c %>
</body>
</html>