package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RE04")//RE04 : 프로그램id
// 클라이언트는 프로그램id를 서버에 전송해서, 서블릿 프로그램을 실행 시킨다. 
//@ : annotation, @WebServlet : 프로그램id를 등록하는 표현
public class RE04 extends HttpServlet {
	/*
	 * 서블릿 프로그램은 반드시 extends HttpServlet를 해야 한다.
	 * HttpServlet : http 통신을 하는 자바 객체.
	 * http 통신 의 역할 1 : 클라이언트의 정보를 받는 역할.
	 * http 통신 의 역할 2 : 클라이언트에게 html 문서를 전달.
	 * 
	 * HttpServletRequest : 톰캣이 받은 클라이언트 정보를 넣은 객체.
	 * HttpServletResponse : 톰캣이 클라이언트에게 보낼 html 문서를 넣는 객체.
	 * 
	 * 우리가 필요한 정보는 HttpServletRequest에서 꺼낸다.
	 * 클라이언트에게 보낼 정보는 HttpServletResponse 넣는다.
	 */
	private static final long serialVersionUID = 1L;
       
    public RE04() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		out.print("<h1><font color=red>Hello World</font></h1>");
		out.close();

	}//doGet

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}//doPost

}//class

/*
 * 서블릿 프로그램 하나마다 프로그램 id가 있어야 한다.
 * 프로그램 id를 만드는 방법 1. : @WebServlet("프로그램id") : annotation
 * 프로그램 id를 만드는 방법 2. : Web.xml에 프로그램id를 등록
 * 
 * @WebServlet("프로그램id") : annotation
 *  - 프로그램과 프로그램id를 함께 관리.
 *  - 장점 : 직관적, 손쉬운 사용, 생성/수정/삭제가 쉽다.
 *  - 단점 : 프로그램id를 목록으로 관리하기가 어렵다.
 * 
 * Web.xml에 프로그램id를 등록
 *  - 프로그램과 프로그램id를 따로 관리.
 *  - 장점 : 프로그램id를 목록으로 관리하기가 쉽다.
 *  - 단점 : 생성/수정/삭제가 어렵다. 사용하지 않는 프로그램을 찾아내기 어렵다.
 */ 
