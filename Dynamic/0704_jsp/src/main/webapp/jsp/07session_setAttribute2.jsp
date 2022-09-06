<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>07session_setAttribute2.jsp</title>
	</head>
	<body>
		<%@ include file="./header.jsp" %>
		<h1>07session_setAttribute2.jsp</h1>
		<h2>session.getAttribute("session_data1") :
			<%= session.getAttribute("session_data1") %></h2>
		<h2>session.getAttribute("session_time1") :
			<%= session.getAttribute("session_time1") %></h2>
		<%@ include file="./footer.jsp" %>
	</body>
</html>










