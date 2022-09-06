package servlet;

import java.io.IOException;
import java.net.URLDecoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Cookie282Get")
public class Cookie282Get extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Cookie282Get() { 
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Cookie [] cookieArr = request.getCookies();
//		for(Cookie coo : cookieArr)
		
//		for(int i = 0; i < cookieArr.length; i++) {
//			Cookie coo = cookieArr[i];
//		}

		for(Cookie coo : cookieArr) {
			System.out.println(coo.getName() + " : " 
					 
					+ URLDecoder.decode(coo.getValue(), "utf-8") );//공백과 한글 사용을 위해 encode한것을 decode 함
			
			System.out.println(coo.getMaxAge() + " : " + coo.getDomain());
			System.out.println("====================================");
			System.out.println("====================================");
		}//for
		
		
	}//doGet

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
