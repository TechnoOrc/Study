<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>day1el2.jsp</title>
	</head>
	<body>
		<h1>EL을 사용함으로써, 객체를 받는 부분이 자동화 되었다.</h1>
		<hr>
		<h1>empty : 해당 객체가 null 인지를 물어보는 객체  리턴은 boolean</h1>
		<h1>empty dto? : dto is null? : ${  empty free_board_dto }</h1>
		<h1>not empty dto? : dto is not null? : ${ not empty free_board_dto }</h1>
		<hr>
		<h1>empty "hello" :  ${ empty "hello" }</h1>
		<h1>empty "" :  ${ empty "" }</h1>
		<h1>empty null :  ${ empty null }</h1>
		<hr>
		<h1>${ messageFromRequest }</h1>
		<h1>${ messageFromSession }</h1>
		<hr>
		
		<h1>글 번호 : ${ free_board_dto.getBno() }</h1>
		<h1>글 제목 : ${ free_board_dto.btitle }</h1>
		<h1>작성자 : ${ free_board_dto.bwriter }</h1>
		<h1>작성일 : ${ free_board_dto.btitle }</h1>
		<h1>내용 : ${ free_board_dto.bcnts }</h1>
	</body>
</html>