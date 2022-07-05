<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>10RE.jsp</title>
	</head>
	<body>
		<%@ include file="./header.jsp" %>
		<!-- action="http://localhost:8080/0704_jsp/RE10" -->
		<form action="../RE10" method="get" target="_blank">
			이름 검색 : 
			<input type="text" id="ename" name="ename">
			<hr>
			<button type="submit"> S E A R C H </button>
		</form>
		
		<%@ include file="./footer.jsp" %>
	</body>
</html>
<!-- 
 http://localhost:8080/0704_jsp/jsp/10RE.jsp

 -->