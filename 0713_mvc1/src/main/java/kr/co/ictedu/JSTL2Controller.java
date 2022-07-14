package kr.co.ictedu;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class JSTL2Controller {
	
	
	
	@RequestMapping( value = "/jstl3", method = RequestMethod.GET )
	public String day1Jstl3( Model model, ArrayList<String> list) {
		
		list.add("hi");list.add("hello");list.add("how are you");
		list.add("안녕");list.add("밥먹었니?");
		model.addAttribute("mylist", list);
		
		return "day1jstl3";//jsp 파일 이름
	}//day1Jstl3
	
	
	@RequestMapping( value = "/jstl2", method = RequestMethod.GET )
	public String day1Jstl2() {
		
		return "day1Jstl2";//jsp 파일 이름.
	}//day1Jstl2
	
	
	@RequestMapping( value = "/jstl1", method = RequestMethod.GET )
	public String day1Jstl1(  ) {
		
		return "day1jstl1";//jsp 파일 이름.
	}//day1Jstl1
	
}//class
