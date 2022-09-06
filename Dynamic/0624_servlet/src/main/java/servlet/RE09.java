package servlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.tribes.util.Arrays;

@WebServlet("/RE09")
public class RE09 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RE09() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		request.getParameter("html input의 name 속성");
//		getParameter로는 다건 value를 받을 수 없다.
//		request.getParameterValues("html input의 name 속성");
//		getParameterValues로 다건 value를 받을 수 있다.
//		request.getParameterNames();
		String id = request.getParameter("mid");//value가 단건
		String pwd = request.getParameter("mpwd");//value가 단건
		String fruit = request.getParameter("fruit");//value가 다건
		System.out.println(id + " : " + pwd + " : " + fruit);
		//========================================================
		String [] fruitsArr = request.getParameterValues("fruit");
		System.out.println( Arrays.toString( fruitsArr ) );
		//========================================================
		Enumeration<String> fruitsEnum = request.getParameterNames();
		while(fruitsEnum.hasMoreElements()) {
			String tmp = fruitsEnum.nextElement();
			System.out.print(tmp + " : ");
			System.out.println( request.getParameter(tmp) );
		}//while

	}//doGet

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}