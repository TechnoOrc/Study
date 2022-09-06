package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SessionLogout26")
public class SessionLogout26 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SessionLogout26() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		HttpSession session = request.getSession();
		session.invalidate();//모든 세션 삭제 //log out
		System.out.println("session invalidate complete");
		response.sendRedirect("http://localhost:8080/0624_servlet/svl/13index.html");
		//response.sendRedirect("./svl/13index.html");
	
	}//doGet

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
