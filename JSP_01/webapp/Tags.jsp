<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tags</title>
</head>
<body>
	<h2>Declarative Tag Example</h2>
	<%!
		int age = 20;
		int a = 10;
		int b  = 20;
		String name = "phanendra lanki";
		
		public int doSum(){
			return a+b;
		}
	%>
	<p style="font-size:18px;">your name is: <%=name %> and age: <%=age %></p>
	
	<!-- Scriplet tag -->
	<h2>Scriplet tag</h2>
	<% 
	out.println(a);
	out.println(b);
	%>
	
	<!-- expression tag -->
	<h1>Expression tag</h1>
	<h1>sum is: <%= a+b %></h1>
</body>
</html>