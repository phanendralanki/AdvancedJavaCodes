<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>    

<%@page errorPage="error_page.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Error Handling</title>
</head>
<body>
	<h1>Error Handling</h1>
	<%! 
 		int n1=20;
 		int n2 = 0;
 		//int n2 = 10;
 	%>
 	<%
 		int division = n1/n2;
 	%>
 	<h2>Division=<%= division %></h2>
 	
 	
</body>
</html>