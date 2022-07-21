<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>day5_ajax3.jsp</title>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script><!-- ajax 링크 -->
	</head>
	<body>
		<h1>회원 아이디 중복 체크</h1>
		아이디 : <input type="text" id="mid" name="mid" maxlength="20">
		<button id="btn3"> 아이디 중복 체크 </button>
		<h6 id="id_message"></h6>		
		<script type="text/javascript">
		$(document).ready(function() {
			$("#btn3").click(function() {
				if( $.trim( $("#mid").val() ) == ""){
					$("#id_message").text("아이디를 입력하세요 .");
					$("#id_message").css("color", "blue");
					return;// 공백 입력 시  아이디를 입력 하세요 출력.
				}
				$.post(
						"${pageContext.request.contextPath}/ajax3_test"
						, {mid:$("#mid").val()}
						, function(data, status) {
							//alert(data)
							if( data < 1 ){//중복 아님.
								
								$("#id_message").text("사용 가능한 아이디 입니다.");
								$("#id_message").css("color", "blue");
								
							} else if ( data >= 1) {//중복
								$("#id_message").text("이미 사용중인 아이디 입니다.");
								$("#id_message").css("color", "red");
								
							} else {//에러
								$("#id_message").text("잠시 후 다시 시도해 주세요.");
								$("#id_message").css("color", "red");
								
							}
							
							
						}//function
				);//post
				
			});//click
		});//ready
		</script>
	</body>
</html>