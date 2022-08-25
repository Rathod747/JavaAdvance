<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
String name = (String) request.getAttribute("Myname");
if( name != null) {
	%>
	<h4>
		Hii ,<%=name%>
	</h4>
	<%
} 
else{
	%>
	<h4>Hii , Guest</h4>
	<%
}
	%>

	<h1>Welcome to my page...</h1>
</body>
</html>