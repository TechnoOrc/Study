<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title> 자유 게시판 게시글 수정 </title>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
		<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
		<script src="//cdn.ckeditor.com/4.19.0/full/ckeditor.js"></script>
		<style type="text/css">
		.write_label {
			font-size: 0.7em;
			color: red;
		}
		</style>
	</head>
	<body>
	<%@ include file="/WEB-INF/views/header.jsp" %>
		<hr>
			<h2> 자유 게시판 게시글 수정 </h2>
		<hr>
		<table>
			<tbody>
				<tr>
					<th> 제 목 </th>
					<td>
						<input type="text" id="title" name="title" maxlength="50"
							class="form-control" value="${detail_dto.title}">
						<label id="title_label" for="title" class="write_label"></label>
					</td>
				</tr>
				<tr>
					<th> 작 성 자 </th>
					<td>
						<input type="text" id="writer" name="writer" maxlength="20"
							class="form-control" value="${detail_dto.writer}">
						<label id="writer_label" for="writer" class="write_label"></label>
					</td>
				</tr>
				<tr>
					<th> 비 밀 번 호 </th>
					<td>
						<input type="password" id="pwd" name="pwd" maxlength="20"
							class="form-control" value="${detail_dto.pwd}">
						<label id="pwd_label" for="pwd" class="write_label"></label>
					</td>
				</tr>
				<tr>
					<th> 내 용 </th>
					<td>
						<textarea rows="5" id="contents" name="contents"
							class="form-control">${detail_dto.contents}</textarea>
						<label id="contents_label" for="contents" class="write_label"></label>
						<script type="text/javascript">
						CKEDITOR.replace('contents');
						</script>
					</td>
				</tr>
			</tbody>	
		</table>
		<br>
		<hr>
		<br>
		<button id="write_btn" class="btn btn-primary float-right"> 글 수정 완료 </button>
		<a href="${pageContext.request.contextPath}/board/free/detail?board_no=${detail_dto.board_no}">
			<button class="btn btn-warning float-right"> 글 수정 취소 </button>
		</a>
		<br>
		
	<%@ include file="/WEB-INF/views/footer.jsp" %>
	<script type="text/javascript">
	$(document).ready(function() {
		$("#write_btn").click(function() {
			
			if( $.trim ( $("#title").val() ) == "" ){
				$("#title_label").text("제목을 입력해 주세요.");
				return;
			} else $("#title_label").text(" ");
			
			if( $.trim ( $("#writer").val() ) == "" ){
				$("#writer_label").text("작성자를 입력해 주세요.");
				return;
			} else $("#writer_label").text(" ");
				
			if( $.trim ( $("#pwd").val() ) == "" ){
				$("#pwd_label").text("비밀번호를 입력해 주세요.");
				return;
			} else $("#pwd_label").text(" ");
			
			if( CKEDITOR.instances.contents.getData() == "" ){
				$("#contents_label").text("내용를 입력해 주세요.");
				return;
			} else $("#contents_label").text(" ");
			
			$.post(
					"${pageContext.request.contextPath}/board/free/update"
					,{
						board_no : ${detail_dto.board_no}
						,title : $("#title").val()
						, writer : $("#writer").val()
						, pwd : $("#pwd").val()
						, contents : CKEDITOR.instances.contents.getData()
					}
					, function(data, status) {
						//alert(data);
						if(data >= 1) {
							alert("게시글을 수정 하였습니다.");
							location.href="${pageContext.request.contextPath}/board/free/final_list";
						} else if( data <= 0){
							alert(" 수정 하실 수 없는 게시글 입니다.");
						} else{
							alert("잠시 후 다시 시도해 주세요.");
						}
					}//call back function
			);//post
			
			
		});//click
	});//ready
	</script>
	</body>
</html>






















