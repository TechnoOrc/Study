<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
	
		<title>상부상酒  |  관리자 페이지 </title>
		
		<!-- CDN -->
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
		<script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
		<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>

		<!-- CSS 파일 -->
		
		
		
		
<style type="text/css">
		

/* Style the navigation menu */
#myMenu {
  list-style-type: none;
  padding: 0;
  margin: 0;
}

/* Style the navigation links */
#myMenu li a {
  padding: 12px;
  text-decoration: none;
  color: black;
  display: block
}

#myMenu li a:hover {
  background-color: #eee;
}



</style>	


	</head>
	
	
	<body>
			<!-- header -->
			<jsp:include page="/WEB-INF/views/headerMain.jsp"></jsp:include>
			<br>
			<br>
			
			<div class="container">
			
			<!-- nav 시작 -->
			<nav>
				<jsp:include page="/WEB-INF/views/admin/admin_nav.jsp"></jsp:include>
				<br>
				<br>			
			</nav>
			
			<!-- nav 끝 -->
			<main class="clearfix mt-1" style="height:500px">
				<!--  aside 시작 -->	
				<aside class="col-3 h-100 bg-white float-left">
					
					
				<jsp:include page="/WEB-INF/views/admin/admin_aside.jsp"></jsp:include>
				<br>
				<br>			
				
				
				
				</aside>
				
			<!--  aside 끝 -->	
				
				
				<!-- section 시작--------------------------------------------------------------------------------- -->
				<section class="col-9 h-100 bg-white float-left">
					<h1> 상 품 관 리</h1>
					  <hr style="width:100%;height:5px;border:none;background-color:black;">
					  	
					  	
					  	
					  	
					  	
					  	
		<form action="${pageContext.request.contextPath}/admin/admin_md_list" method="get">
			<div class="input-group">
				<div class="input-group-prepend">
					<select class="form-control" id="searchOption" name="searchOption">
						<option value="md_name"
							<c:if test="${search_dto.searchOption == 'md_name'}">selected="selected"</c:if>
						> 상 품 이 름 </option>
						<option value="md_category"
							<c:if test="${search_dto.searchOption == 'md_category'}">selected="selected"</c:if>
						> 주 종 </option>
					</select>
				</div>
				<input type="text" class="form-control" id="searchWord" name="searchWord"
						value="${search_dto.searchWord}">
				<div class="input-group-append">
					<button type="submit" class="btn btn-info"> 검 색 </button>
				</div>
			</div>
		</form>
		<table class="text-center text-capitalize table table-hover">
			<thead>
				<tr>
					<th><input id="allCheck" type="checkbox" name="allCheck"></th> <th> image </th> <th> 상품번호 </th> <th> 상품명 </th> <th> 가격 </th>	<th> 주종 </th> <th> 기준재고 </th> <th> 판매수량 </th> <th> 잔여재고 </th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="dto" items="${list}">
					<tr>
						<td class="col-1">
							<input name="RowCheck" type="checkbox" value="${dto.md_id}">
						</td>
						<td class="col-1">
							<img src="${dto.md_thumbnail_path}" class="img-thumbnail">
						</td>
						<td class="col-1">
							${dto.md_id}
						</td>
						<td class="col-1">
							<a href="${pageContext.request.contextPath}/admin/detail?prdt_no=">
							${dto.md_name}	
							</a><!-- 디테일 수정 예정 -->
						</td>
						<td class="col-1">
							${dto.md_price} 원
						</td>
						<td class="col-1">
							${dto.md_category} 
						</td>
						<td class="col-1">
							${dto.md_standard_stock}개
						</td>
						<td class="col-1">
							${dto.md_sales_rate} 개
						</td>
						<td class="col-1">
							${dto.md_stock} 개
						</td>
						
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<hr>
		<div class="clearfix">
				<button id="delete_btn" class="btn btn-danger" onclick="deleteValue();"> 상 품 삭 제 </button>
			
			<a href="${pageContext.request.contextPath}/md/write_form"><!-- 컨트롤러의 RequestMapping 호출 -->
				<button class="btn btn-primary float-right"> 상 품 등 록 </button>
			</a>
		</div>
		<hr>
		<ul class="pagination">
			<c:if test="${startPageNum > 10}">
				<li class="page-item mx-auto">
					<a class="page-link"
						href="${pageContext.request.contextPath}/admin/admin_md_list?userWantPage=${startPageNum-1}&searchOption=${search_dto.searchOption}&searchWord=${search_dto.searchWord}">
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
								href="${pageContext.request.contextPath}/admin/admin_md_list?userWantPage=${page_no}&searchOption=${search_dto.searchOption}&searchWord=${search_dto.searchWord}">
								${page_no}
							</a>
						</li>
					</c:otherwise>
				</c:choose>
			</c:forEach>
			<c:if test="${lastPageNum > endPageNum}">
				<li class="page-item mx-auto">
					<a class="page-link"
						href="${pageContext.request.contextPath}/admin/admin_md_list?userWantPage=${endPageNum+1}&searchOption=${search_dto.searchOption}&searchWord=${search_dto.searchWord}">
						Next
					</a>
				</li>
			</c:if>
		</ul>
					  	
					  	
					  	
					  	
					  	
					  
					  
					  
				</section>
				<!-- section 끝---------------------------------------------------------------------------- -->
			</main>
			
			
		</div><!-- container -->
	</body>
	<script type="text/javascript">
		$(function () {
			var chkObj = document.getElementsByName("RowCheck");
			var rowCnt = chkObj.length;
			
			$("input[name='allCheck']").click(function() {
				var chk_listArr = $("input[name='RowCheck']");
				for (var i=0; i<chk_listArr.length; i++){
					chk_listArr[i].checked = this.checked;
				}
			});//click
			
			$("input[name='RowCheck']").click(function() {
				if($("input[name='RowCheck']:checked").length == rowCnt){
					$("input[name='allcheck']")[0].checked = true;
				}
				else{
					
					$("input[name='allCheck']")[0].checked = false;
				}
			});//click
		});//function
		
		function deleteValue(){
			var url = "${pageContext.request.contextPath}/admin/delete"; // Controller로 보내고자하는 URL
			var valueArr = new Array();
			var list = $("input[name='RowCheck']");
			
			for(var i = 0; i < list.length; i++){
				if(list[i].checked){ //선택되어 있으면 배열에 값을 저장함
					valueArr.push(list[i].value);
				}
			}
		
			if (valueArr.length == 0){
				alert("선택된 상품이 없습니다.");
			}
			else{
				var chk = confirm("정말 삭제하시겠습니까?");
				$.ajax({
					url : "${pageContext.request.contextPath}/admin/delete"//전송 URL
					, type : 'POST' //POST 방식
					, traditional : true
					, data : {
						valueArr : valueArr //보내고자 하는 data 변수 설정
					},
					success : function(jdata){
						if(jdata = 1) {
							alert("삭제 성공");
							location.href = "${pageContext.request.contextPath}/admin/admin_md_list";
						}
						else {
							alert("삭제 실패");
						}
					}
				});
				
			}//else
			
		}//deleteValue
		
		
		
		
		
		
		
	</script>
</html>