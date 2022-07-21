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
	
	
	@RequestMapping ( value = "/delete", method = RequestMethod.GET)
	public void delete( FreeBoardDTO dto, PrintWriter out ) {
		//	board_no : ${detail_dto.board_no} , pwd : $("#pwd").val() 의 값이 ==> dto에 담김  (변수명과 일치해야함)
		//dbms에서 게시글 하나를 delete : FreeBoardService.delete(board_no) ->  FreeBoardDAO.delete(board_no)
		//						->  freeboard-mapper.xml(namespace : FreeBoardMapper.delete)
		//logger.info(dto.toString());
		int successCount = 0;
		successCount = service.delete( dto );
		out.print( successCount );
		out.close();
	}//delete
	
	
	
	@RequestMapping( value = "/detail", method = RequestMethod.GET )
	public String detail( String board_no, Model model ) {
		//dbms에서 게시글 하나를 select : FreeBoardService.detail(board_no) ->  FreeBoardDAO.detail(board_no)
		//						->  freeboard-mapper.xml(namespace : FreeBoardMapper.detail)
		logger.info(board_no);
		FreeBoardDTO dto = service.detail(board_no);
		model.addAttribute("detail_dto", dto);
		logger.info(dto.toString());
		return "/board/free/detail";//jsp file name
	}//detail
	
	
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
