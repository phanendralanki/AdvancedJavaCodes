<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!-- if any error occurs -->
<%@page errorPage="error_ex.jsp"%>
<!-- if any error occurs -->

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>output</title>
</head>
<body>
	<%
	//fetch two numbers
	String n1 = request.getParameter("n1");
	String n2 = request.getParameter("n2");

	//converting string to integer..
	int a = Integer.parseInt(n1);
	int b = Integer.parseInt(n2);

	int c = a / b;
	%>

	<h3>
		Result is:
		<%=c%></h3>
</body>
</html>