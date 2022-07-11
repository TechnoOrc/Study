package jsp;

import javax.servlet.http.HttpSession;

public class UtilSessionLogin {
	public static boolean isLogin(HttpSession session) {
		boolean loginYN = false;
		String loginID = (String) session.getAttribute("login_id");		//Login15.java에서 설정 함.
		/*
		 * request.getSession().setAttribute("login_id", id);
		 * session.setAttribute("login_id", id); session : 클라이언트 1개당 하나 제공되는 저장소.
		 * session이 사라지기 전에는 setAttribute("login_id", id);는 살아있다. 
		 * session이 사라지는 조건
		 *  -브라우저 종료
		 *  - 접속이 setMaxInactiveInterval을 넘어설 때
		 *  - 서버 리부팅 - 로그아웃
		 */
		if(loginID != null || loginID.trim().length() > 0) {
			loginYN = true;
		}
		
		
		return loginYN;
	}//isLogin

}//class
