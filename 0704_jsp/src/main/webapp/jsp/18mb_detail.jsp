<%@page import="jsp.BoardDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>18mb_detail.jsp</title>
	</head>
	<body>
		<%@ include file="./login_check.jsp" %>
		<%@ include file="./header.jsp" %>
		<h1>Member Board 회원 전용 게시판 상세 조회</h1>
		<%
		BoardDTO dto = (BoardDTO) request.getAttribute("member_board_detail");
		if (dto == null) {
		%>
			<h1>조회된 데이터가 없습니다.</h1>
		<%
		} else {
		%>
		<table class="table table-hover">
			<colgroup>
				<col class="w-25">
				<col class="w-25">
				<col class="w-25">
				<col class="w-25">
			</colgroup>
			<tbody>
				<tr>
					<td>글번호</td><td><%=dto.getBno()%></td>
					<td>제목</td><td><%=dto.getBtitle()%></td>
				</tr>
				<tr>
					<td>작성자</td><td><%=dto.getMid()%></td>
					<td>작성일</td><td><%=dto.getBdate()%></td>
				</tr>
				<tr>
					<td>내용</td><td colspan="3"><%=dto.getBcnts()%></td>
				</tr>
			</tbody>
		</table>
		<%
			if(loginID.equals(dto.getMid())){
		%>
				<div class="clearfix">
				<a href="<%=rootPath%>/MBUform18?bno=<%=dto.getBno()%>">
					<button class="btn btn-warning float-right"> 게 시 글 수 정 </button>
				</a>
				<a href="<%=rootPath%>/MBDelete18?bno=<%=dto.getBno()%>">
					<button class="btn btn-danger float-right"> 게 시 글 삭 제 </button>
				</a>
				<a href="<%=rootPath%>/MBList18">
							<button class="btn btn-info float-right"> 목 록 </button>
						</a>
				
			</div>
		<%
			} else {//if(loginID.equals(dto.getMid()))
		%>
		<a href="<%=rootPath%>/MBList18">
					<button class="btn btn-info float-right"> 목 록 </button>
				</a>
		<%				
					
			}//
		%>

		<%
		}
		%>
		<%@ include file="./footer.jsp" %>
	</body>
</html>