<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.Random,java.util.ArrayList" %>

<%@page isErrorPage="true" %> <!-- now this page will be act as an error page -->

<%@page session="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Page Directive</title>
</head>
<body>

<h2>Random number</h2>
<%
	Random r = new Random();
	int n = r.nextInt(10); //random number from 0 to 9
%>

	<%=n %>

</body>
</html>