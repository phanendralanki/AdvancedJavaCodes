<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    

<%@page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>something went wrong</title>
<style>
	*{
		margin:0;
		padding:0;
	}
</style>
</head>
<body>
	<div style="padding:20px;color:blue; background:#e2e2e2">
	<h2>Sorry! something went wrong...</h2>
	<p><%=exception%></p>
	</div>
</body>
</html>