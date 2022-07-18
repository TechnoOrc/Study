<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

   
<!DOCTYPE html>
<html>
	<head>
		<title>emp_list.jsp</title>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
		<script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
		<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
		<meta charset="UTF-8">
		
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
	
		<table class="table border="3">
			<thead>
				<tr>
					<td><b>사번</b></td>			<td><b>이름</b></td>
					<td><b>직업<b></b></td>		<td><b>팀장사번</b></td>
					<td><b>입사일</b></td>		<td><b>급여</b></td>
					<td><b>보너스</b></td>		<td><b>팀번호</b></td>
				</tr>
			</thead>
				<tbody>
					<c:forEach var="dto" items="${ emp_dto_list }" varStatus="">
					
						<tr>
							<td>
								<a href="${ pageContext.request.contextPath }/emp/detail?eno=${ dto.empno }">
								<b>${dto.empno}</b>
								</a>
							</td>
							
							<td><b>${dto.ename}</b></td>
							<td><b>${dto.job}</b></td>			<td><b>${dto.mgr}</b></td>
							<td><b>${dto.hiredate}</b></td>		<td><b>${dto.sal}</b></td>
							<td><b>${dto.comm}</b></td>			<td><b>${dto.deptno}</b></td>
						</tr>
				
				</tbody>
			
			<%-- ${dto.empno} ${dto.ename} ${dto.job} ${dto.mgr} ${dto.hiredate} ${dto.sal} ${dto.comm} ${dto.deptno} --%>
			</c:forEach>
		</table>
	</body>
</html>