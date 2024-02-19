<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	String myname = (String) session.getAttribute("name");
	%>
	<h3> about us welcome : <%= myname %> </h3>
	<a href="profile.jsp"> profile</a> &nbsp; &nbsp;
	<a href = "home.jsp"> home</a>
</body>
</html>