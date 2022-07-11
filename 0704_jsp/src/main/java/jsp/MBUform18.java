package jsp;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MBUform18")
public class MBUform18 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private MB18DAO dao;
    public MBUform18() {
        super();
        dao = new MB18DAO();
    }//constructor

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if( UtilSessionLogin.isLogin( request.getSession() ) == false ) {
			response.sendRedirect( request.getContextPath() + "/jsp/main.jsp" );
			return;
		}

		String bno = request.getParameter("bno");
		BoardDTO dto = null;
		try {
			dto = dao.detail(bno);
		} catch( SQLException e ) {
			e.printStackTrace();
			UtilMessage.setSessionFailMsg(request.getSession(), "DBMS 오류"
					, request.getContextPath() + "/MBList18", "회원 게시판 목록으로 바로가기");
			response.sendRedirect( request.getContextPath() + "/jsp/fail_page.jsp" );
			return;
		}

		String loginId = (String) request.getSession().getAttribute("login_id");
		if( loginId.equals( dto.getMid() ) == true ) {
			request.setAttribute("member_board_detail", dto);
			RequestDispatcher disp = request.getRequestDispatcher("/jsp/18mb_update.jsp");
			disp.forward(request, response);
		} else {
			UtilMessage.setSessionFailMsg( request.getSession()
					, "수정하실 수 없는 게시물 입니다."
					, request.getContextPath() + "/MBList18"
					, "회원 게시판 목록으로 바로가기");
			response.sendRedirect( request.getContextPath() + "/jsp/fail_page.jsp" );
		}//else

	}//doGet

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.setCharacterEncoding("UTF-8");
	
		
		
		
	
	}//doPost

}//class









