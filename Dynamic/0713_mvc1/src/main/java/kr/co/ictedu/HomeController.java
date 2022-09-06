package kr.co.ictedu;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);//logger.info에서 출력시 클래스 이름과 위치 같이 표현하게해줌
	
	@RequestMapping(value = "/", method = RequestMethod.GET)//Get, Post방식을 지정
	public String testhometest(Locale locale, Model model, TestObj to) {
		// TestObj를 new 하지 않아도 호출하여 사용가능 //Model - 컨트롤러에서 생성된 데이터를 담아서 전달하는 역할을 하는 존재
		logger.info("Welcome home! The client locale is {}.", locale);//System.out.println();와 같은 표현
		logger.info("시스아웃은 이제 안녕");
		
		to.print();// TestObj.java의 메소드를 호출함
		
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		//model.addAttribute("이름 오는 자리", "넣고 싶은 data가 오는 자리");
		model.addAttribute("yourName", "김 세 민");
		return "home"; //jsp 파일 이름 -> home.jsp 실행.
	}//testhometest
	
}//class
