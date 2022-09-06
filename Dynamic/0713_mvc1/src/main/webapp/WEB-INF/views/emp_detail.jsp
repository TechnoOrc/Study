<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>emp_detail.jsp</title>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
		<script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
		<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
		
		<style type="text/css">
		thead {
			background : lightcoral;
		}
		table {
			border : 1px solid blue;
		}
		tbody tr {
			background: lightblue;
		}
		tbody tr:hover {
			background-color: orange;
		}
		td {
			width: 150px;
			height: 50px;
			text-align: center;
		}
		</style>
		
	</head>
	<body>
		<table>
			<tr class="table table-hover">
				<th>사번</th><td>${ detail_dto.empno }</td>
				<th>이름</th><td>${ detail_dto.ename }</td>
			</tr>
			<tr>
				<th>직업</th><td>${ detail_dto.job }</td>
				<th>팀장</th><td>${ detail_dto.mgr }</td>
			</tr>
			<tr>
				<th>입사일</th><td>${ detail_dto.hiredate }</td>
				<th>부서번호</th><td>${ detail_dto.deptno }</td>
			</tr>
			<tr>
				<th>급여</th><td>${ detail_dto.sal }</td>
				<th>성과급</th><td><font size="4" face="바탕체">&#92;${ detail_dto.comm }</font></td>
					  
			</tr>
		</table>
	</body>
</html>