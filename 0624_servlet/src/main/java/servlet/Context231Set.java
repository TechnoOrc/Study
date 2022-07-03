package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Context231Set")
public class Context231Set extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Context231Set() {
        super();
    }

    /*
     * ServletContext : 서블릿 실행 환경의 하나.
     * 	- 공유 data 보관용으로 사용가능: A서블릿에서 담은 data를 B서블릿에서 꺼내어 사용 가능하다.
     * 	- 전혀 무관한 서블릿 사이에 데이터를 공유할 수 있다.
     */
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ServletContext ctx = getServletContext();
		
		ctx.setAttribute("hello", "hello string data : hi, how are you.");//ctx.setAttribute(name, value)
		
		FreeBoardDTO dto = new FreeBoardDTO();
		dto.setBtitle("dto share use context");
		ctx.setAttribute("free", dto);//ctx.setAttribute(name, value)
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("good"); list.add("bye");
		ctx.setAttribute("arr", list);//ctx.setAttribute(name, value)
	
	}//doGet

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
