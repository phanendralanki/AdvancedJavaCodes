<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>	
	<h2>Hello world</h2>
	
	<h1>Declaration Tag :</h1>
	<%! int a=10; String name="phani"; %>
	
	
	<h1>Expression Tag:	<%=a %> <%=name %> </h1>
	
	<h1>Scriplet tags</h1>
	<%
		int sum=20+30;
		//out.println(sum);
		
		int sub = sum-10;
		//out.println("sub= "+sub);
	%>
	
	<h1>sum=<%=sum %></h1>
	<h1>sub=<%=sub %></h1>

</body>
</html>