package kr.co.ictedu.jsoup;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping( value = "/jsoup" )
public class JsoupController {

	private final static Logger logger = LoggerFactory.getLogger(JsoupController.class);

	
	@RequestMapping( value = "/step3", method = RequestMethod.GET )
	public String step3( Model model ) throws IOException {
		
		String url = "http://www.joygm.com/news/articleList.html?sc_section_code=S1N3&view_type=sm";
		Connection con = Jsoup.connect(url);
		Document doc = con.get();
		Elements titleList = doc.select( ".list-titles a" );//.list-titles 안에 있는 a 태그를 의미함.
		
		List<JoyGMDTO> list = new ArrayList<JoyGMDTO>();
		for (Element title : titleList) {

			//System.out.println( title );
			//System.out.println( title.text() );
			//System.out.println( title.absUrl("href") );// a 태그의 주소 값 불러오기
			
			String contentsUrl = title.absUrl("href");
			Connection contentsConnection = Jsoup.connect(contentsUrl); // 기사 티테일 페이지로 연결
			Document contentsDocument = contentsConnection.get();
			Elements cnts = contentsDocument.select("#articleBody");
			
			JoyGMDTO dto = new JoyGMDTO();
			dto.setTitle( title.text() );// 기사 제목 저장
			dto.setLinkUrl( title.absUrl("href") ); // 기사 url 저장
			//dto.setLinkUrl( contentsUrl );
			dto.setContents( cnts.html() );// 기사의 html을 저장
			list.add(dto);		
					
		}//for
		
		model.addAttribute("list",list);
		return "jsoup/step3";//jsp file name
	}//step3
	
	
	
	@RequestMapping( value = "/step2", method = RequestMethod.GET )
	public String step2() throws IOException {
		
		String url = "http://www.joygm.com/news/articleList.html?sc_section_code=S1N3&view_type=sm";
		Connection con = Jsoup.connect(url);
		
		Document doc = con.get();
		//System.out.println(doc);
		
		Elements titleList = doc.select(".list-titles");// jsoup.select.Elements
		for (Element title : titleList) {
			//System.out.println( title );
			System.out.println( title.text() );
		}//for
		
		return "jsoup/step1";//jsp file name
	}//step2
	
	@RequestMapping( value = "/step1", method = RequestMethod.GET )
	public String step1() throws IOException {
		
		String url = "https://www.naver.com/";
		Connection con = Jsoup.connect(url); // jsoup.Connection
		Document doc = con.get(); //jsoup.nodes.Document;
		
		System.out.println( doc ); // 크롤링한 전체 내용 
		System.out.println( "======================" ); 
		//System.out.println( doc.select(".blind") );
		System.out.println( doc.title() );
		System.out.println( doc.select(".corp_area .blind") );// 원하는 정보만을 구하기 위한 필터링
		System.out.println( doc.select(".corp_area .blind").text() );// 원하는 정보만을 구하기 위한 필터링 후 문자만 출력
		System.out.println( doc.select(".corp_area .blind").attr("class") );// 원하는 정보만을 구하기 위한 필터링 후 클래스명 출력
		System.out.println( doc.select(".corp_area .blind").html() );// 원하는 정보만을 구하기 위한 필터링 후 문자만 출력
		
				
		return "jsoup/step1";//jsp 파일 이름
	}//step1

}//class
