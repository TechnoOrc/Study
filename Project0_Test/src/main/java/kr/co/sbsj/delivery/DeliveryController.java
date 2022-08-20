package kr.co.sbsj.delivery;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.sbsj.util.dto.MemberDTO;

@Controller
@RequestMapping( value = "/delivery" )
public class DeliveryController {

	private final static Logger logger = LoggerFactory.getLogger(DeliveryController.class);

	@Autowired
	private DeliveryService service;

	@RequestMapping( value = "/delete", method = RequestMethod.GET )
	public void delete( DeliveryDTO dto, HttpSession session, PrintWriter out ) {
		dto.setMember_id( ( (MemberDTO) session.getAttribute("login_info") ).getMember_id() );

		int successCount = 0;
		successCount = service.delete( dto );
		out.print(successCount);
		out.close();
	}//delete

	@RequestMapping( value = "/insert", method = RequestMethod.POST )
	public void insert( DeliveryDTO dto, HttpSession session, PrintWriter out ) {
		dto.setMember_id( ( (MemberDTO) session.getAttribute("login_info") ).getMember_id() );

		int successCount = 0;
		successCount = service.insert( dto );
		out.print(successCount);
		out.close();
	}//insert

	@RequestMapping(value = "/form", method = RequestMethod.GET)
	public String form( Model model, HttpSession session ) {
		List<DeliveryDTO> list = null;
		list = service.list( ( (MemberDTO) session.getAttribute("login_info") ).getMember_id() );
		model.addAttribute("list", list);
		return "delivery/form";//jsp file name
	}//form

}//class

