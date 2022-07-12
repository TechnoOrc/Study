<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>212use_bean2.jsp</title>
	</head>
	<body>
		<%@ include file="./header.jsp" %>
			request.getParameter : <%= request.getParameter("mid") %>
			<hr>
			<h1>useBean 사용 : input type의 name과 DTO의 변수명이 같아야 한다.</h1>
			<jsp:useBean id="dto" class="jsp.MemberDTO" /><!-- class 사용 선언 -->
			<jsp:setProperty property="*" name="dto"/><!-- dto에 request.getParameter 수행 -->
			<!-- 14 ~ 15라인의 코딩이 현재 주석의 내용을 자동 실행한 것.
			MemberDTO dto = new MemberDTO();
			dto.setMid( request.getParameter("mid") );
			dto.setMpwd( request.getParameter("mpwd") );
			dto.setTel1( request.getParameter("tel1") );
			dto.setTel2( request.getParameter("tel2") );
			dto.setTel3( request.getParameter("tel3") );
			dto.setEmail1( request.getParameter("email1") );
			dto.setEmail2( request.getParameter("email2") );
			-->
			<jsp:getProperty property="mid" name="dto"/><!-- dto의 mid 출력 -->
			<jsp:getProperty property="mpwd" name="dto"/>
			<jsp:getProperty property="tel1" name="dto"/>
			<jsp:getProperty property="tel2" name="dto"/>
			<jsp:getProperty property="tel3" name="dto"/>
			<jsp:getProperty property="email1" name="dto"/>
			<jsp:getProperty property="email2" name="dto"/>
		<%@ include file="./footer.jsp" %>
	</body>
</html>




