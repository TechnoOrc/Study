<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>09err_msg.jsp</title>
	</head>
	<body>
		<%@ include file="./header.jsp" %>
		<%= session.getAttribute("err_msg") %>
		<%@ include file="./footer.jsp" %>
	</body>
</html>









