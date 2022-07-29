package kr.co.ictedu.test;

import java.io.PrintWriter;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.google.gson.Gson;

@Controller
@RequestMapping( value = "/test" )
public class DongCodeController {

	private final static Logger logger = LoggerFactory.getLogger(DongCodeController.class);
	
	@Autowired
	private DongCodeService service;
	
	@RequestMapping( value = "/dong_name", method = RequestMethod.GET )
	public void dongName( String key_word, PrintWriter out ) {
		List<DongCodeDTO> list = null;
		list = service.dongName( key_word );
		out.print( new Gson().toJson( list ) );
		out.close();
	}//dongName
	
	
	@RequestMapping( value = "/dong_search", method = RequestMethod.GET )
	public String dongSearch() {
		return "/test/dong_search";//jsp file name
	}//dongSearch
	
	
	@RequestMapping ( value = "/dong", method = RequestMethod.GET )
	public void dongSelect( String gugun_code, PrintWriter out ) {
		List<DongCodeDTO> list = null;
		list = service.dongSelect( gugun_code );
		
		out.print( new Gson().toJson( list ) );
		out.close();
		
	}//dongSelect
	
	@RequestMapping( value = "/gugun", method = RequestMethod.GET )
	public void gugunSelect( String sido_code, PrintWriter out ) {
		List<DongCodeDTO> list = null;
		list = service.gugunSelect ( sido_code );
		
		out.print( new Gson().toJson(list) );
		out.close();
	}//gugunSelect
	
	@RequestMapping ( value = "/sido", method = RequestMethod.GET )
	public void sidoSelect( PrintWriter out) {
		List<DongCodeDTO> list = null;
		list = service.sidoSelect();
		
		Gson gson = new Gson();
		//Gson 객체를 사용하면 list에 담긴 데이터를 Gson 스타일로 변경해줌
		String jsonString = gson.toJson(list);
		//out.print(new Gson.toJson(list)); <- 한줄로 표현가능
		
		logger.info(jsonString);
		
		out.print(jsonString);
		out.close();
	}//sidoSelect
	
	@RequestMapping ( value = "/dong_code", method = RequestMethod.GET )		
	public String dongCodeView() {
		return "/test/dong_code";//jsp file name
	}//dongCodeView
	
	
	
}//class
