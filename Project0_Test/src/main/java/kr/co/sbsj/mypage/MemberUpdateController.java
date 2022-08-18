package kr.co.sbsj.mypage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping( value = "/mypage" )
public class MemberUpdateController {
	
	
	private final static Logger logger = LoggerFactory.getLogger(MemberUpdateController.class);
	
	@Autowired
	private MemberUpdateService service;
	
	
	@RequestMapping( value = "/", method = RequestMethod.GET )
	private String myPage() {
		return "/mypage/member";//
	}
	
	
	
	
	
}//class