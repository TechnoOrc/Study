package jsp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MBDelete18")
public class MBDelete18 extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	private MB18DAO dao;
    public MBDelete18() {
        super();
        dao = new MB18DAO();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		if( UtilSessionLogin.isLogin(request.getSession() ) == false ) {
			response.sendRedirect( request.getContextPath() + "/jsp/main.jsp" );
			return;
		}
		
		
		String loginId = (String) request.getSession().getAttribute("login_id");
		String bno = request.getParameter("bno");
		int successCount = 0;
		try {
			successCount = dao.delete(bno, loginId);
		} catch (SQLException e) {
			e.printStackTrace();
			
			UtilMessage.setSessionFailMsg(request.getSession(), "DBMS 오류"
					, request.getContextPath() + "/jsp/18mb_list.jsp", "회원 게시판 목록으로 바로 가기");
			response.sendRedirect( request.getContextPath() + "/jsp/fail_page.jsp" );
			return;
		}//catch
		
		
		if (successCount == 0 ) {
			//4. successCount == 0 처리 -> 메세지 처리
			UtilMessage.setSessionFailMsg(request.getSession()
					, "게시판 삭제가 실패 하였습니다."
					, request.getContextPath() + "/MBList18"
					, "게시판 목록으로 바로가기");
			response.sendRedirect( request.getContextPath() + "/jsp/fail_page.jsp");
			
		} else if( successCount == 1) {
			//5. successCount == 1 처리 -> list 호출
			response.setCharacterEncoding("UTF-8");
			response.setContentType("text/html; charset=UTF-8");
			
			PrintWriter out = response.getWriter();
			// ??번의 글이 삭제되 었습니다.
			out.println("<script>alert("+request.getParameter("bno")+"+'번이 삭제되었습니다');location.href='./MBList18';</script>"); 
			//out.println("<script>alert('게시글이 삭제되었습니다.');location.href='./FBList17?cmd=list';</script>");
			
			out.flush();
			//response.sendRedirect( request.getContextPath() + "/FBList17?cmd=list");//실행 시점이 jsp 패키지 내부
		
		}//else if
		
		
		
		
	
	}//doGet
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}//doPost

}//class
