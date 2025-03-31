<%@page import="in.sp.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		User user = (User)session.getAttribute("session_user");
	%>

	<h1>Welcome</h1>
	
	<h3>Name : </h3>

</body>
</html>