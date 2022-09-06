package login.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import login.dao.LoginDAO;
import login.dto.MemberDTO;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private LoginDAO dao;
    public Login() {
        super();
        dao = new LoginDAO();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}//doGet

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		MemberDTO dto = new MemberDTO();
		dto.setMid( request.getParameter("mid") );
		dto.setMpwd( request.getParameter("mpwd") );
		
		int loginYN = 0;
		RequestDispatcher disp = request.getRequestDispatcher("./ErrMsg");
		//request를 ErrMsg.java와 공유함

		try {
			loginYN = dao.loginCheck(dto);//id, pwd가 모두 올바르면 loginYN은 1이 된다.
		} catch ( SQLException e ) {
			e.printStackTrace();
			request.setAttribute("error_message", "DBMS 오류<br><br> 잠시 후 다시 시도해 주세요.");
			//("name", "value") 클라이언트의 요청(request)을 생성
			disp.forward(request, response);//request를 ErrMsg.java와 공유함
			return;
		}
		
		if( loginYN == 0 ) {//login 불가능.
			request.setAttribute("error_message","로그인 실패<br><br> 아이디 또는 패스워드를 확인 하세요");
			//("name", "value") 클라이언트의 요청(request)을 생성
			disp.forward(request, response);//request를 ErrMsg.java와 공유함
		} else if( loginYN == 1 ) {//login 가능.
			//로그인 성공 표시를 httpSession에 남긴다.
			HttpSession session = request.getSession();//session 생성 방법
			session.setAttribute("lid", dto.getMid());//session에 name과 value를 생성
			response.sendRedirect("./LoginComplete");//특정 페이지 호출
		}
	}//doPost

}//class
