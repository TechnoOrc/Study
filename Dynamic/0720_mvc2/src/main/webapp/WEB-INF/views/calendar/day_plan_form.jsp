<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<head>
		<meta charset="UTF-8">
		<title> Calendar Day Plan </title>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
		<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
	</head>
	<body>
	<%@ include file="/WEB-INF/views/header.jsp" %>
		<hr>
		<h3> Calendar Day Plan </h3>
		<hr>

		<form id="planInsertForm">
			<table class="table table-bordered table-hover">
				<thead>
					<tr>
						<th>Plan Start Time</th>	<th>Plan End Time</th>	<th>Plan Description</th>
						<th>Expectation Price</th>	<th>Contract Price</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="count" begin="1" end="24">
						<tr>
							<td style="width:15%;">
								<input type="text" class="form-control" id="plan_start_time" name="plan_start_time" maxlength="20">
							</td>
							<td style="width:15%;">
								<input type="text" class="form-control" id="plan_end_time" name="plan_end_time" maxlength="20">
							</td>
							<td style="width:40%;">
								<input type="text" class="form-control" id="plan_desc" name="plan_desc" maxlength="100">
							</td>
							<td style="width:15%;">
								<input type="text" class="form-control" id="plan_expect_price" name="plan_expect_price" maxlength="20">
							</td>
							<td style="width:15%;">
								<input type="text" class="form-control" id="plan_contact_price" name="plan_contact_price" maxlength="20">
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</form>
		<div class="text-right">
			<button id="write_btn" class="btn btn-primary"> 일정 계획 입력 </button>
		</div>
		<hr>

	<%@ include file="/WEB-INF/views/footer.jsp" %>

	<script type="text/javascript">
	$(document).ready(function() {

		let objectArray = new Array();

		$("#write_btn").click(function() {

			let startTime = $("input[name=plan_start_time]");
			let endTime = $("input[name=plan_end_time]");
			let desc = $("input[name=plan_desc]");
			let expectPrice = $("input[name=plan_expect_price]");
			let contactPrice = $("input[name=plan_contact_price]");

			for(let i = 0; i < desc.length; i++){
				if( desc[i].value.trim() != "" ){
					let object = {
							plan_year:"${date_info.plan_year}"
							, plan_month:"${date_info.plan_month}"
							, plan_date:"${date_info.plan_date}"
							, plan_start_time:startTime[i].value
							, plan_end_time:endTime[i].value
							, plan_desc:desc[i].value
							, plan_expect_price:expectPrice[i].value
							, plan_contact_price:contactPrice[i].value
					};
					objectArray.push(object);
				}//if
			}//for

			alert( JSON.stringify(objectArray) );

			$.post(
					"${pageContext.request.contextPath}/calendar/day_plan_insert"
					, {
						jsonArr : JSON.stringify(objectArray)
					}
					, function(data, status) {
						if(data >= 1){
							alert("일정 계획을 입력 하였습니다.");
							location.href="${pageContext.request.contextPath}/calendar/main";
						} else {
							alert("일정 계획 입력을 실패 하였습니다.");
						}
					}//call back function
			);//post

		});//click

	});//ready
	</script>

	</body>
</html>
