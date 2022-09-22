<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Cookies</title>
</head>
<body>
	<%
	String username = request.getParameter("username");
	String password = request.getParameter("password");
	Cookie uc = new Cookie("username" , username); 
	Cookie pc = new Cookie("password" , username);
	uc.setMaxAge(60*60*24*7);
	pc.setMaxAge(60*60*24*7);
	response.addCookie(uc);
	response.addCookie(pc);
	%>
	<%="Cookies is added" %>
	
	<a href="displaycookies.jsp">Display Cookies</a>
</body>
</html>