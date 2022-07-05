<%@page import="jsp.EmpDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>10RE_result.jsp</title>
	</head>
	<body>
		<%@ include file="./header.jsp" %>
				<hr>
		<%
			ArrayList<EmpDTO> list
			= (ArrayList<EmpDTO>) request.getAttribute("empNameLikeSearchResult");
			if(list == null || list.size() == 0){
			
		%>

			<h1>조회 결과가 없습니다.</h1>

		<%	
			} else {
		%>
		
				<table class="table table-hover">
			
			<%
				for(int i = 0; i < list.size(); i++){
					EmpDTO dto = list.get(i);
			%>
	
					<tr>
					<td><%= i+1 %></td>
					<td><%= dto.getEmpno() %></td>
					<td><%= dto.getEname() %></td>
					<td><%= dto.getJob() %></td>
					<td><%= dto.getMgr() %></td>
					<td><%= dto.getHiredate() %></td>
					<td><%= dto.getSal() %></td>
					<td><%= dto.getComm() %></td>
					<td><%= dto.getDeptno() %></td>
					</tr>
	
			<%		
				}
			}
			%>

			</table>
				<hr>
		
		<%@ include file="./footer.jsp" %>

	</body>
</html>