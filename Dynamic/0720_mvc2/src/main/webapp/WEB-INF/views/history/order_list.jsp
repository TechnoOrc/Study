<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<head>
		<meta charset="UTF-8">
		<title> 구매 내역 </title>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
		<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
	</head>
	<body>
	<%@ include file="/WEB-INF/views/header.jsp" %>
		<hr>
		<h3> 구매 내역 </h3>
		<hr>
		<form action="${pageContext.request.contextPath}/history/order_list" method="get">
			<div class="input-group">
				<div class="input-group-prepend">
					<select class="form-control" id="searchOption" name="searchOption">
						<option value="prdt_name"
							<c:if test="${search_dto.searchOption == 'prdt_name'}">selected="selected"</c:if>
						> 상 품 이 름 </option>
						<option value="mid"
							<c:if test="${search_dto.searchOption == 'mid'}">selected="selected"</c:if>
						> 판 매 자 </option>
					</select>
				</div>
				<input type="text" class="form-control" id="searchWord" name="searchWord"
						value="${search_dto.searchWord}">
				<div class="input-group-append">
					<button type="submit" class="btn btn-primary"> 검 색 </button>
				</div>
			</div>
		</form>
		<table class="table table-hover">
			<col class="col-2">
			<col class="col-2">
			<col class="col-6">
			<col class="col-1">
			<col class="col-1">
			<thead>
				<tr>
					<th> 주문일 </th>
					<th> 상품 이미지 </th>	<th> 주문번호 / 상품명 / 주문옵션 </th>
					<th> 판매자 </th>	<th> 주문상태 </th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="dto" items="${list}">
					<tr>
						<td>
							${dto.order_date}
							<hr>
							<a href="javascript:alert('준비 중 입니다');">
								결제 번호 : ${dto.order_no}
							</a>
							<hr>
							결제금액 : <b>${dto.detail_pay_amt}</b> 원
						</td>
						<td>
							<img src="${dto.thumbnail_path}" class="img-thumbnail">
						</td>
						<td>
							<a href="javascript:alert('준비 중 입니다');">
								주문 번호 : ${dto.detail_no}
							</a>
							<hr>
							<a href="${pageContext.request.contextPath}/product/detail?prdt_no=${dto.prdt_no}">
								${dto.prdt_name}
							</a>
							<hr>
							수량 : ${dto.detail_qty}
						</td>
						<td>${dto.seller_mid}</td>
						<td>${dto.order_status}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<hr>
		<ul class="pagination">
			<c:if test="${startPageNum > 10}">
				<li class="page-item mx-auto">
					<a class="page-link"
						href="${pageContext.request.contextPath}/product/list?userWantPage=${startPageNum-1}&searchOption=${search_dto.searchOption}&searchWord=${search_dto.searchWord}">
						Previous
					</a>
				</li>
			</c:if>
			<c:forEach var="page_no" begin="${startPageNum}" end="${endPageNum}">
				<c:choose>
					<c:when test="${page_no == userWantPage}">
						<li class="page-item active mx-auto">
							<a class="page-link">${page_no}</a>
						</li>
					</c:when>
					<c:otherwise>
						<li class="page-item mx-auto">
							<a class="page-link"
								href="${pageContext.request.contextPath}/product/list?userWantPage=${page_no}&searchOption=${search_dto.searchOption}&searchWord=${search_dto.searchWord}">
								${page_no}
							</a>
						</li>
					</c:otherwise>
				</c:choose>
			</c:forEach>
			<c:if test="${lastPageNum > endPageNum}">
				<li class="page-item mx-auto">
					<a class="page-link"
						href="${pageContext.request.contextPath}/product/list?userWantPage=${endPageNum+1}&searchOption=${search_dto.searchOption}&searchWord=${search_dto.searchWord}">
						Next
					</a>
				</li>
			</c:if>
		</ul>
		<hr>
	<%@ include file="/WEB-INF/views/footer.jsp" %>
	</body>
</html>
