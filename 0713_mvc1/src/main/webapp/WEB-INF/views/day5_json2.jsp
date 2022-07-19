<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>day5_json2.jsp</title>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
		<script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
		<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script><!-- ajax 링크 -->
	</head>
	<body>
		<script type="text/javascript">
		$(document).ready(function() {
			$("#btn1").click(function() {
				
				$.get(
						"${pageContext.request.contextPath}/json2_test"	
						//,
						,function( data, status ) {
							$("#tbody").empty();
							alert(data); 
							//data가 객체가 들어있는 배열일 경우, $.each를 통해 객체를 하나씩 꺼낼 수 있다.
							$.each(JSON.parse(data), function(i, dto) {
								//$.each(가공할 데이터, function (foreach 의 반복횟수를 저장하는 변수 명 , 가공할 데이터 변수명) {
									
								//})
								$("#tbody").append(
										"<tr>"	
										+ "<td>" + dto.empno + "</td>"
										+ "<td>" + dto.ename +i+ "</td>"
										+ "<td>" + dto.job + "</td>"
										+ "<td>" + dto.mgr + "</td>"
										+ "<td>" + dto.hiredate + "</td>"
										+ "<td>" + dto.sal + "</td>"
										+ "<td>" + dto.comm + "</td>"
										+ "<td>" + dto.deptno + "</td>"
										+ "</tr>"
								);//append
							});//forEach
						}//callback function
				);//get
				
			});//click
		});//ready
		</script>
		<button id="btn1"> 사원 목록 불러오기 </button>
		<hr>
		<table class="table table-hover">
			<thead>
				<th>사번</th>	<th>이름</th>	<th>직업</th>	<th>팀장</th>
				<th> 입사일 </th>	<th> 급여 </th>	<th> 성과급 </th>	<th> 팀번호 </th>
			</thead>
			<tbody id="tbody">
			</tbody>
		</table>
	</body>
</html>