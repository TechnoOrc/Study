<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<head>
		<meta charset="UTF-8">
		<title> 배 송 지 추 가 </title>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
		<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
		<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
		<script type="text/javascript">
		$(document).ready(function() {
			$("#addr_btn").click(function() {

			    new daum.Postcode({
			        oncomplete: function(data) {//data : 다음에서 주는 결과 값.
			        	$("#post_code").val(data.zonecode);
			        	$("#addr1").val(data.address);
			        }//call back function
			    }).open();

			});//click
		});//ready
		</script>
	</head>
	<body>
	<%@ include file="/WEB-INF/views/header.jsp" %>
		<hr>
		<h3> 배 송 지 추 가 </h3>
		<hr>
		<div class="row">
			<div class="col-6">
				<table class="table table-hover">
					<tr>
						<td>
						</td>
					</tr>
				</table>
			</div>
			<div class="col-6">
				<table class="table table-hover">
					<tr>
						<th> 배 송 지 명 </th>
						<td>
							<input type="text" class="form-control" id="addr_name" name="addr_name">
							<label for="prdt_name" id="prdt_name_label" class="write_label"></label>
						</td>
					</tr>
					<tr>
						<th> 받 는 분 </th>
						<td>
							<input type="text" class="form-control">
						</td>
					</tr>
					<tr>
						<th> 연 락 처 </th>
						<td>
							<input type="text" class="form-control">
						</td>
					</tr>
					<tr>
						<th> 주 소 </th>
						<td>
							<div class="form-inline">
								<input type="text" id="post_code" name="post_code" readonly="readonly" class="form-control mb-1 mr-1">
								<button id="addr_btn" type="button" class="btn btn-primary btn-small mb-1">
									주 소 찾 기
								</button>
							</div>
							<input type="text" id="addr1" name="addr1" readonly="readonly" class="form-control mb-1">
							<input type="text" id="addr2" name="addr2" class="form-control">
						</td>
					</tr>
					<tr>
						<td colspan="2" class="text-center">
							<button type="button" class="btn btn-primary btn-block"> 저장 </button>
						</td>
					</tr>
				</table>
			</div>
		</div>
		<hr>
	<%@ include file="/WEB-INF/views/footer.jsp" %>
	</body>
</html>














