package jsp;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MBUpdate18")
public class MBUpdate18 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private MB18DAO dao;
    public MBUpdate18() {
        super();
        dao = new MB18DAO();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");// 한글 깨짐 방지
		
		//로그인 체크 start
		boolean loginYn = UtilSessionLogin.isLogin( request.getSession() );
		if(loginYn == false) {
			response.sendRedirect( request.getContextPath() +  "/jsp/main.jsp" );
			return;
		}//로그인 체크 end
		
		String loginId = (String) request.getSession().getAttribute("login_id");
		String bno = request.getParameter("bno");
		String title = request.getParameter("title");
		String cnts = request.getParameter("cnts");//request.getParameter end
		
		
		int successCount = 0;
		try {
			successCount = dao.update(bno, title, cnts, loginId);
		} catch (SQLException e) {
			e.printStackTrace();
			UtilMessage.setSessionFailMsg(request.getSession()
					, "DBMS 오류"
					, request.getContextPath() + "/MBList18"
					, "회원 게시판 목록으로 바로가기");
			response.sendRedirect(request.getContextPath() + "/jsp/fail_page.jsp");
			return;
		}
		if(successCount == 0) {
			UtilMessage.setSessionFailMsg(request.getSession()
					, "게시판 수정을 실패 하였습니다."
					, request.getContextPath() + "/MBList18"
					, "회원 게시판 목록으로 바로가기");
			response.sendRedirect(request.getContextPath() + "/jsp/fail_page.jsp");
		}else if(successCount == 1) {
			response.sendRedirect("./MBDetail18?bno=" + bno);// 게시글 수정 후에 수정한 글 detail로 이동
		}//else if
		
	}//doPost

} 
