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

		<table class="table table-bordered">
			<tr>
				<c:forEach var="num" begin="1" end="31">
					<td style="height:150px;">${num}</td>
					<c:if test="${num % 7 == 0}">
						</tr>
						<tr>
					</c:if>
				</c:forEach>
			</tr>
		</table>

	<%@ include file="/WEB-INF/views/footer.jsp" %>
	</body>
</html>
