<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>dls
<%@ page errorPage="./11err_handling.jsp" %>
<!-- 현재 페이지에서 에러가 난다면해당 에러를 지정한 페이지에서 처리한다. -->
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>11err_test.jsp</title>
	</head>
	<body>
		<!-- 의도적인 에러발생 : error page로 이동 -->
		<%
			String tmp = null;
			out.print( tmp.length() );
		%>
	</body>
</html>