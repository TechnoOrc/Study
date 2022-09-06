<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>05scriptlet1.jsp</title>
	</head>
	<body>
		<%@ include file="./header.jsp" %>
		<h1>scriptlet 구구단</h1>
		<%
			for(int dan = 2; dan <= 9; dan++) {
				for(int gop = 1; gop <= 9; gop++) {
		%>
					<%= dan %> * <%= gop %> = <%= (dan * gop) %>
					<br>
		<%
				}//for - gop
		%>
				<hr>
		<%
			}//for - dan
		%>
		<hr><hr>
		<h1>out.print 구구단</h1>
		<%
			for(int dan = 2; dan <= 9; dan++) {
				for(int gop = 1; gop <= 9; gop++) {
					out.print( dan + " * " + gop + " = " + (dan * gop) );
					out.print("<br>");
				}//for - gop
				out.print("<hr>");
			}//for - dan
		%>
		<%@ include file="./footer.jsp" %>
	</body>
</html>










