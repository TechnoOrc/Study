package kr.co.ictedu.login;

import java.io.PrintWriter;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.ictedu.util.dto.MemberDTO;

@Controller
public class LoginController {

	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	private LoginService service;
	
	
	@RequestMapping( value = "/logout", method = RequestMethod.GET )
	public String logout( HttpSession session ) {
		session.invalidate();//세션 삭제
		return "/home";//jsp file name 
	}//logout
	
	@RequestMapping( value = "/login", method = RequestMethod.POST )
	public void login( MemberDTO dto, PrintWriter out, HttpSession session ) {
		MemberDTO dtoFromDB = null;
		dtoFromDB = service.login( dto );
		System.out.println("======================");
		System.out.println(dtoFromDB);
		if( dtoFromDB == null ) {//아이디 없는 사용자 또는 패스워드 오류 사용자.
			out.print(0);
			
		} else if ( dtoFromDB != null && dtoFromDB.getMno() != null && dtoFromDB.getMno() != "") {
			out.print(1);//아이디, 패스워드 모두 OK
			session.setAttribute("login_info", dtoFromDB);
		}
		out.close();
	}//login
	
	
	
	@RequestMapping( value = "/login_form", method = RequestMethod.GET )
	public String  loginForm() {
		return "/login/login_form";//jsp file name
	}//loginForm
	
	
	
	
	
}//class


/*
create table member(
mno int primary key auto_increment
, mid varchar(20)
, mpwd varchar(20)
, tel varchar(15)
, email varchar(50)
, mdate datetime
);
*/