package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Context232Get")
public class Context232Get extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Context232Get() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletContext ctx = getServletContext();
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<h1>" + ctx.getAttribute("hello") + "</h1>");//ctx.GetAttribute(name)
		
		FreeBoardDTO dto = (FreeBoardDTO) ctx.getAttribute("free");
		out.print("<h1>" + dto.getBtitle() + "</h1>");//
		
		ArrayList<String> list = (ArrayList<String>) ctx.getAttribute("arr");
		
		for (String tmp : list) {
			out.print("<h1>" + tmp + "</h1>");
		}
		
		
		/* 위 36 ~ 38 라인의 코드를 풀어쓰면 아래와 같다.
		for (int i = 0; i < list.size(); i++) {
			String tmp = list.get(i);
		}
		*/
		
		
		out.close();
	
	}//doGet

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
