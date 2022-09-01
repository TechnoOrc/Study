<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<head>
		<meta charset="UTF-8">
		<title> Home </title>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
		<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
	</head>
	<body>
	<%@ include file="/WEB-INF/views/header.jsp" %>
		<hr>
		<h3> Home </h3>
		<hr>

		<h4>Rest API : REpresentational State Transfer API : json 주고 받기</h4>
		<h6>json : javascript object notation</h6>

		<h6><a href="${pageContext.request.contextPath}/rest1/step1">
			rest1 step1 : @ResponseBody</a></h6>

		<h6><a href="${pageContext.request.contextPath}/rest2/step2">
			rest2 step2 : @RestController</a></h6>

		<h6><a href="${pageContext.request.contextPath}/rest2/step3">
			rest2 step3 : rest service로부터 dto 1개 받기</a></h6>

		<h6><a href="${pageContext.request.contextPath}/rest2/step4">
			rest2 step4 : rest service로부터 dto list 받기</a></h6>

		<h6><a href="${pageContext.request.contextPath}/restview/step5view">
			rest2 step5 / step6 : @PathVariabe</a></h6>
			
		<h6><a href="${pageContext.request.contextPath}/restview/step7view">
			rest2 step7 : @RequestBody</a></h6>

	<%@ include file="/WEB-INF/views/footer.jsp" %>
	</body>
</html>












