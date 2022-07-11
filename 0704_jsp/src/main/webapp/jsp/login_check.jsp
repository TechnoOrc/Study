<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String chkStr = (String) session.getAttribute("login_id");
	if( chkStr == null || chkStr.trim().length() == 0 ){
		response.sendRedirect( request.getContextPath() + "/jsp/main.jsp");
		return;
	}//login_check.jsp
%>