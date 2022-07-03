package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Session252Get")
public class Session252Get extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Session252Get() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();

		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<h1>mid : " + session.getAttribute("mid") + "</h1>");
		out.print("<h1>admin : " + session.getAttribute("admin") + "</h1>");
		out.print("<h1>mgrade : " + session.getAttribute("mgrade") + "</h1>");

		FreeBoardDTO dto = (FreeBoardDTO) session.getAttribute("FreeBoardDTO");
		out.print("<h1>dto.getBtitle : " + dto.getBtitle() + "</h1>");
		out.print("<h1>dto.getBwriter : " + dto.getBwriter() + "</h1>");

		session.removeAttribute("admin");
		out.print("<h1>admin : " + session.getAttribute("admin") + "</h1>");

		ArrayList<String> list = (ArrayList<String>) session.getAttribute("list");
		for(String tmp : list) {
			out.print("<h1>list : " + tmp + "</h1>");
		}

		out.close();
	}//doGet

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

} 
