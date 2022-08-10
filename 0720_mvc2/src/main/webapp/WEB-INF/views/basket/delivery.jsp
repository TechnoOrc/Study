<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<head>
		<meta charset="UTF-8">
		<title> 주 문 서 </title>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
		<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
	</head>
	<body>
	<%@ include file="/WEB-INF/views/header.jsp" %>
		<hr>
		<h3> 주 문 서 </h3>
		<hr>
		<table class="table table-hover">
			<col class="col-1">
			<thead>
				<tr>
					<th> 썸네일 </th>	<th> 상품명 </th>
					<th> 단가 </th>	<th> 구매 수량 </th>	<th> 구매 금액 </th>
					<th> 할인 금액 </th>	<th> 실 구매 금액 </th>
				</tr>
			</thead>
			<tbody>
				<c:set var="sum_product_class_qty" value="0" />
				<c:set var="sum_buy_amt" value="0" />
				<c:set var="sum_discount_amt" value="0" />
				<c:forEach var="dto" items="${list}" varStatus="status">
					<c:set var="sum_product_class_qty" value="${sum_product_class_qty + 1}" />
					<c:set var="sum_buy_amt" value="${sum_buy_amt + (dto.price * dto.buy_qty)}" />
					<c:set var="sum_discount_amt" value="${sum_discount_amt + ( (dto.price - dto.sale_price) * dto.buy_qty )}" />
					<tr>
						<td width="10%">
							<img src="${dto.thumbnail_path}" class="img-thumbnail">
						</td>
						<td>
							<a href="${pageContext.request.contextPath}/product/detail?prdt_no=${dto.prdt_no}">
								${dto.prdt_name}
							</a>
						</td>
						<td> ${dto.price} 원 </td>
						<td> ${dto.buy_qty} 개 </td>
						<td> ${dto.price * dto.buy_qty} 원 </td>
						<td class="text-danger"> -${ (dto.price - dto.sale_price) * dto.buy_qty} 원 </td>
						<td> ${dto.price * dto.buy_qty - ( (dto.price - dto.sale_price) * dto.buy_qty )} 원 </td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<hr>
		<div class="row">
			<div class="col-6">
				<table class="table table-hover">
					<tr>
						<td>
							<button id="delivery_btn" type="button" class="btn btn-danger btn-large"
							 		data-toggle="modal" data-target="#delivery_modal">
								배 송 지 변 경
							</button>
						</td>
					</tr>
				</table>
			</div>
			<div class="col-6">
				<table class="table table-hover">
					<tr>
						<th> 총 상 품 수 </th>
						<td class="text-right"> <span id="span_sum_product_class_qty"> ${sum_product_class_qty}</span> 개 </td>
					</tr>
					<tr>
						<th> 총 구 매 금 액 </th>
						<td class="text-right"> <span id="span_sum_buy_amt"> ${sum_buy_amt}</span> 원 </td>
					</tr>
					<tr>
						<th> 총 할 인 금 액 </th>
						<td class="text-right text-danger"> <span id="span_sum_discount_amt"> -${sum_discount_amt}</span> 원 </td>
					</tr>
					<tr>
						<th> <h3>총 결 제 금 액</h3> </th>
						<td class="text-right"> <h3><span id="span_sum_total_buy_amt"> ${sum_buy_amt - sum_discount_amt}</span> 원</h3> </td>
					</tr>
					<tr>
						<td colspan="2" class="text-center">
							<button id="order_btn" class="btn btn-danger btn-large"> 결 제 하 기 </button>
						</td>
					</tr>
				</table>
			</div>
		</div>
		<hr>
		<!-- delivery modal start -->
		<div class="modal" id="delivery_modal">
			<div class="modal-dialog">
				<div class="modal-content">

					<!-- Modal Header -->
					<div class="modal-header">
						<h4 class="modal-title"> 배 송 지 추 가 / 선 택 </h4>
						<button type="button" class="close" data-dismiss="modal">&times;</button>
					</div>

					<!-- Modal body -->
					<div class="modal-body">
						<table class="table table-hover">
							<tr>
								<th> 배 송 지 명 </th>
								<td>
									<input type="text" class="form-control">
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
										<input type="text" class="form-control mb-1 mr-1">
										<button type="button" class="btn btn-primary btn-small mb-1">
											주 소 찾 기
										</button>
									</div>
									<input type="text" class="form-control mb-1">
									<input type="text" class="form-control">
								</td>
							</tr>
						</table>
						
					</div>

					<!-- Modal footer -->
					<div class="modal-footer">
						<button type="button" class="btn btn-warning" data-dismiss="modal"> 취 소 </button>
						<button type="button" class="btn btn-primary" data-dismiss="modal"> 저장 </button>
					</div>

				</div>
			</div>
		</div>
		<!-- delivery modal end -->
	<%@ include file="/WEB-INF/views/footer.jsp" %>
	</body>
</html>














