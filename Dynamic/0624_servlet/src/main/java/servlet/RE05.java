package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/RE05")
public class RE05 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public RE05() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("=== RE05 : doGet ===");
		String id = request.getParameter("mid");
		String password = request.getParameter("mpwd");
		String hidden1 = request.getParameter("h1");
		
		System.out.println(id);//유저가 보낸 파라미터값 mid을 출력
		System.out.println(password);//유저가 보낸 파라미터값 mpwd을 출력
		System.out.println(hidden1);//유저가 보낸 파라미터값 h1을 출력
		
		response.setCharacterEncoding("euc-kr");
		PrintWriter out2 = response.getWriter();//유저가 보는 화면에 데이터를 돌려줄 때 사용
		out2.print("<h1>클라이언트가 입력한 id를 서버에서 받아서 다시 클라이언트로 보냄 : " + id + "<h1>");
		out2.close();
		
		
		/*
		 * doGet 메소드를 호출해 주는 객체 : 톰캣
		 * 	- 클라이언트가 프로그램id를 톰캣에 전달 
		 * 		-> 톰캣이 프로그램id를 실행 
		 * 			+ 클라이언트가 보낸 정보를 HttpServletRequest 객체로 생성해서 프로그램에 전달.
		 * 			+ 클라이언트에게 보낼 html 문소를 넣는  HttpServletResponse객체도 생성해서 프로그램에 전달.
		 * 
		 */
	}//doGet

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("=== RE05 : doPost ===");
		String id2 = request.getParameter("mid");
		String password2 = request.getParameter("mpwd");
		String h12 = request.getParameter("h1");
		
		System.out.println(id2);
		System.out.println(password2);
		System.out.println(h12);
		
		response.setCharacterEncoding("euc-kr");
		PrintWriter out3 = response.getWriter();
		out3.print("유저가 전송한 id, password, hidden data가 서버에 잘 도착하였습니다.");
		out3.close();
	}//doPost

}
