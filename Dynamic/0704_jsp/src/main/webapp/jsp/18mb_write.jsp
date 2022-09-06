<%@page import="javax.swing.RepaintManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>18mb_write.jsp</title>
		<script src="//cdn.ckeditor.com/4.19.0/full/ckeditor.js"></script>
	</head>
	<body>
		<%@ include file="./header.jsp" %>
		<%@ include file="./login_check.jsp"%>
		<h1>Member Board 회원 전용 게시판 상세 조회</h1>
		<form id="form1" action="<%=rootPath%>/MBWrite18" method="post">
		<table class="table table-hover">
			<tbody>
				<tr>
					<td>제목</td>
					<td>
						<input type="text" id="title" name="title" maxlength="50" class="form-control">
					</td>
				</tr>
				<tr>
					<td>작성자</td>
					<td><%=loginID%></td>
				</tr>
				
				
				<tr>
					<td>내용</td>
					<td>
						<textarea rows="10" id="cnts" name="cnts" class="form-control"></textarea>
						<script type="text/javascript">
						CKEDITOR.replace('cnts');
						</script>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<button type="button"  id="btn1" class="btn btn-success float-right">글쓰기</button>
					</td>
				</tr>
			</tbody>
		</table>
		</form>
		<%@ include file="./footer.jsp" %>
		<script type="text/javascript">
		$(document).ready(function() {
			$("#btn1").click(function() {
				if( $.trim( $("#title").val() ) == "" ){
					alert("제목을 입력 하세요.");
					return;
				}
				//alert( "[" + CKEDITOR.instances.cnts.getData() +"]" );
				if( CKEDITOR.instances.cnts.getData() == "" ){// 아무것도 입력 안되어 있을 때
					alert("내용을 입력 하세요.");
					return;
				}
				
				$("#form1").submit();
			});//click
		});//ready
		</script>
	</body>
</html>