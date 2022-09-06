package jsp;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.NamingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import oracle.jdbc.oracore.Util;

@WebServlet("/MBList18")
public class MBList18 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	
	MB18DAO dao;
    public MBList18() {
        super();
        dao = new MB18DAO();
    }//constructor

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//로그인 검사 start!!!
		HttpSession session = request.getSession();
		String loginID = (String) session.getAttribute("login_id");
		if( loginID == null || loginID.trim().length() == 0 )	{
			response.sendRedirect(request.getContextPath() + "/jsp/main.jsp");
			return;
		}
				
		//로그인 검사 end!!!
		
		ArrayList<BoardDTO> list = null;
		try {
			list = dao.list();
		} catch ( SQLException e ) {
			e.printStackTrace();// 개발작 나중에 error을 추적하기위해서
			UtilMessage.setSessionFailMsg(session, "DBMS 오류", request.getContextPath() + "/jsp/main.jsp", "메인으로 바로가기");
			
			response.sendRedirect( request.getContextPath() + "/jsp/fail_page.jsp" );
			return;
		}
		request.setAttribute("member_board_list", list);
		RequestDispatcher disp = request.getRequestDispatcher("./jsp/18mb_list.jsp");
		disp.forward(request, response);
	}//doGet

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}//doPost

}
