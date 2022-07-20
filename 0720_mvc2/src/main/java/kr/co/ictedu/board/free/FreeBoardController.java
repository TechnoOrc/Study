package kr.co.ictedu.board.free;

import java.io.PrintWriter;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping( value = "/board/free" )
public class FreeBoardController {

	private static final Logger logger = LoggerFactory.getLogger(FreeBoardController.class);

	@Autowired
	private FreeBoardService service;
		
	@RequestMapping( value = "/write", method = RequestMethod.POST )
	public void write( FreeBoardDTO dto, PrintWriter out) {
		//dbms에 게시글을 insert : FreeBoardService.write(dto) -> FreeBoardDAO.write(dto)
		//						-> freeboard-mapper.xml(namespace : FreeBoardMapper.write)
		int successCount = 0;
		
		successCount = service.write(dto);
		out.print( successCount );
		out.close();
		
		
		
	}//write

	@RequestMapping( value = "/write_form", method = RequestMethod.GET )
	public String writeForm() {
		return "/board/free/write_form";//jsp 파일 이름
	}//writeForm

	@RequestMapping( value = "/list", method = RequestMethod.GET )
	public String list( Model model ) {
		//dbms에서 게시판 전체를 select : FreeBoardService.list() -> FreeBoardDAO.list()
		//								-> freeboard-mapper.xml(namespace : FreeBoardMapper.list)
		List<FreeBoardDTO> list = null;
		list = service.list();
		model.addAttribute("list", list);
		return "/board/free/list";//list.jsp (view name) 호출
	}//list

}//class
