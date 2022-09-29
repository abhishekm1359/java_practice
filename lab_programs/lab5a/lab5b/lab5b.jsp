<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	String firstname = request.getParameter("first");
	String lastname = request.getParameter("last");
	int age = Integer.parseInt(request.getParameter("age"));
	
	if(firstname.isBlank() || lastname.isBlank() || age==0){
	
	out.print("Error happened");
	
	}else{%>
	
		First Name : <%=firstname %></br>
		Last Name : <%=lastname%></br>
		Age : <%=age%></br>
		
	<%}%>
</body>
</html>