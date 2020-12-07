<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="user.UserDAO" %>
<%@ page import="java.io.PrintWriter" %>

<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content= "text/html;" charset="UTF-8">
	<title>W&C 게시판</title>
</head>
<body>
	<%
		session.invalidate();
	%>	
	<script>
		location.href = 'index.html';
	</script>
</body>
</html>