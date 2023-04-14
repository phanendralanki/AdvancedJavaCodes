<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!-- @page directive -->
<%@page import="java.util.*"%>
<%@page session="false"%>
<%@page isELIgnored="false"%>
<%@page errorPage="error.jsp"%>
<!-- @page directive -->

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Directives Examples</title>
</head>
<body>

	<!-- include directive -->
	<%@include file="header.jsp" %>
	<!-- include directive -->

	<!-- @page directive -->
	<h1>
		Time :
		<%=new Date().toString()%>
	</h1>
	<!-- @page directive -->
	
	
</body>
</html>