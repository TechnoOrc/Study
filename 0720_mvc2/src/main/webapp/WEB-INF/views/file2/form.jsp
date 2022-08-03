<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<head>
		<meta charset="UTF-8">
		<title> AJAX 파일 업로드 연습 </title>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
		<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
		<script src="//cdn.ckeditor.com/4.19.0/full/ckeditor.js"></script>
	</head>
	<body>
	<%@ include file="/WEB-INF/views/header.jsp" %>
		<hr>
		<h3> AJAX 파일 업로드 연습 </h3>
		<hr>
		<form id="form_write">
			<table class="table table-hover">
				<tbody>
					<tr>
						<th> 제 목 </th>
						<td>
							<input type="text" id="title" name="title" class="form-control">
						</td>
					</tr>
					<tr>
						<th> 내 용 </th>
						<td>
							<textarea class="form-control" id="contents" name="contents"></textarea>
							<script type="text/javascript">
							CKEDITOR.replace("contents");
							</script>
						</td>
					</tr>
					<tr>
						<th> 파일 업로드 </th>
						<td>
							<input type="file" id="upload_file" name="upload_file" class="form-control">
						</td>
					</tr>
				</tbody>
			</table>
		</form>
		<div class="clear-fix">
			<button type="button" id="write_btn" class="btn btn-primary float-right"> 게시글 입력 </button>
		</div>
		<hr>
	<%@ include file="/WEB-INF/views/footer.jsp" %>
	<script type="text/javascript">
	$(document).ready(function() {
		
		$("#write_btn").click(function() {
			
			let form = new FormData( document.getElementById( "form_write" ) );//form 하나를 통째로 form에 담는다.
			form.append( "contents", CKEDITOR.instances.contents.getData() );//CKEDITOR은 form에 안들어가서 붙여 줌. 
			
			$.ajax({
				type : "POST"
					, encType : "multipart/form-data"
					, url : "${pageContext.request.contextPath}/file2/ajax_upload" //테이터를 전송할 주소
					, data : form
					, processData : false
					, contentType : false
					, cache : false // 이전 데이터 삭제
					, success : function(result) {// 성공시에 실행할 함수
						alert("저장성공");
						location.href="${pageContext.request.contextPath}/"
					} //call back function
					, error : function(xhr) {// 통신 실퍠시 ->xhr : xml http Rquest / Response
						alert("통신실패");
					} // call back function
				
			});//ajax
			
			
		
			
			
		});//click
		
	});//ready
	
	</script>
	</body>
</html>
