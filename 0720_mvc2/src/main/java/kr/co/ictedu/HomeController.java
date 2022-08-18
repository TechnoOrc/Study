package kr.co.ictedu;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	private JavaMailSender mailSender;
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		
		String setFrom = "technoorc@gmail.com"; //보내는 사람  이메일 주소
		String toMail = "0816ksm@naver.com"; //받는 사람 이메일 주소
		String mailTitle = "홈페이지에 새로운 사용자가 오셨습니다."; // 메일 제목
		String contents = "홈페이지에 새로운 접속이 발생하였습니다."; //
		
		try {
			MimeMessage message= mailSender.createMimeMessage(); //message를 보냅
			MimeMessageHelper messageHelper = new MimeMessageHelper(message, true, "UTF-8");
			
			
			messageHelper.setFrom(setFrom);
			messageHelper.setTo(toMail);
			messageHelper.setSubject(mailTitle);
			messageHelper.setText(contents);
	
			mailSender.send(message);
			
		}
		
		catch (MessagingException e) {
			logger.info("메일 전송 에러 start ==========");
			e.printStackTrace();
			logger.info("메일 전송 에러 end ==========");
		}
		
		return "home";//jsp file name
	}//home

}//class