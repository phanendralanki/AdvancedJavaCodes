<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>TagLib directive</title>
</head>
<body>

<!-- 
 Taglib directive: 
	is used when we want to use other tag library in our Jsp page
	such as JSTL(JSP standard Tag Library) or custom library created by users.
	
	JSTL library contains following tags
	core: out,forEach
	sql
	formating..
 -->
 
 <h1>TagLib directive</h1>
 <hr>
 <c:set var="name" value="phanendra lanki"></c:set>
 
 <c:out value="${name}"></c:out>
 
 <c:if test="${3<2}">
 <h2>yes 3 is greater than 2</h2>
 </c:if>
 
 </body>
</html>