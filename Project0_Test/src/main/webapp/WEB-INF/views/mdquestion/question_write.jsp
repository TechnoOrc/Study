<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>상품 문의</title>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
		<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
		<style type="text/css">
		.write_label {
			font-size : 0.7em;
			color : red;
		}
		</style>
	</head>
	
	<body>
	<!-- body 시작 -->
	<div class="container">
		
		<!-- 문의 작성 폼 -->
		<form id="write_form">
			<h3>상품 문의</h3>
			<hr><br>
				<input type="hidden" id="md_id" name="md_id" value="${md_id}">	
				
				문의 유형
				<select id="md_question_type" name="md_question_type">
					<option value="product">상품 문의</option>
					<option value="delivery">배송 문의</option>
					<option value="pay">결제 문의</option>
					<option value="exchange">교환&반품 문의</option>
				</select><br><br>
						
				글 제목 <br>
				<input id="md_question_title" name="md_question_title" type="text" 
					placeholder="제목을 입력하세요." cols="100" style="width:500px;"><br>
				<label for="md_question_title" id="md_question_title_label" class="write_label"></label>
				<br>
				
				작성자 <br><br>
				<!-- 로그인 구현한 후 login_info 정보 추가 예정 -->
				
				내용 작성<br>
				<textarea id="md_question_content" name="md_question_content" 
					placeholder="내용을 입력하세요." rows="8" cols="100" style="resize:none;"></textarea><br>
				<label for="md_question_content" id="md_question_content_label" class="write_label"></label><br>
		</form>
		
			<button id="write_btn" class="btn btn-primary float-right"> 작성 완료 </button>
			<a href="${pageContext.request.contextPath}/mdquestion/question_list?md_id=${md_id}">
				<button class="btn btn-warning"> 작성 취소 </button>
			</a>
	</div>
	</body>
	
	<script type="text/javascript">
	$(document).ready(function() {
		$("#write_btn").click(function() {
			
			//내용 작성 유효성 검사 
			if( $.trim( $("#md_question_title").val() ) == "" ){
				$("#md_question_title_label").text("제목을 입력하세요.");
				return;
			} else { $("#md_question_title_label").text(""); }
			
			if( $.trim( $("#md_question_content").val() ) == "" ){
				$("#md_question_content_label").text("내용을 입력하세요.");
				return;
			} else { $("#md_question_content_label").text(""); }
			
			let form = new FormData( document.getElementById( "write_form" ) );
			
			//문의 작성 내용 ajax 전송
			$.ajax({
				type : "POST"
				, encType : "form-data"
				, url : "${pageContext.request.contextPath}/mdquestion/insert"
				, data : form
				, processData : false
				, contentType : false
				, cache : false
				, success : function(result) {
					alert("문의가 등록되었습니다.");
					location.href = "${pageContext.request.contextPath}/mdquestion/question_list?md_id=${md_id}";
				}//call back function
				, error : function(xhr) {
					alert("잠시 후 다시 시도해 주세요.");
				}//call back function//xhr : xml http request/response
			});//ajax
		});//click
	});//ready
			
	</script>
</html>