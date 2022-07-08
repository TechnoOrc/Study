package jsp;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/MBWrite18")
public class MBWrite18 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MBWrite18() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	
	}//doGet

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		//로그인 검사 start!!
		HttpSession session = request.getSession();
		String loginId = (String) session.getAttribute("login_in");
		if(loginId == null || loginId.trim().length() == 0) {
			response.sendRedirect( request.getContextPath() + "/jsp/main.jsp");
			return;
		}
		//로그인 검사 end!!
		String title = request.getParameter("title");
		String cnts = request.getParameter("cnts");
		int successCount = 0;
		//successCount = dao.write(title, cnts, loginID);
		if( successCount == 1 ) {//글쓰기 DBMS insert 성공
			
		} else {//글쓰기 DBMS insert 실패
	
		}
		
	}//doPost

}
