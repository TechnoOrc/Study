package kr.co.ictedu.basket;

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

import com.google.gson.Gson;

import kr.co.ictedu.credit.card.CreditCardDTO;
import kr.co.ictedu.credit.card.CreditCardService;
import kr.co.ictedu.delivery.DeliveryDTO;
import kr.co.ictedu.delivery.DeliveryService;
import kr.co.ictedu.product.ProductDTO;
import kr.co.ictedu.util.dto.MemberDTO;

@Controller
@RequestMapping( value = "/basket" )
public class BasketController {

	private final static Logger logger = LoggerFactory.getLogger(BasketController.class);

	@Autowired
	private BasketService service;

	@Autowired
	private DeliveryService deliveryService;

	@Autowired
	private CreditCardService creditCardService;

	@RequestMapping( value = "/orderList", method = RequestMethod.GET )
	public String orderList( String [] arr_basket_no, Model model, HttpSession session ) {
		List<ProductDTO> list = null;
		list = service.orderList( arr_basket_no );
		model.addAttribute("list", list);

		List<DeliveryDTO> deliverylist = null;
		deliverylist = deliveryService.list( ( (MemberDTO) session.getAttribute("login_info") ).getMno() );
		model.addAttribute("deliverylist", deliverylist);

		List<CreditCardDTO> cardlist = null;
		cardlist = creditCardService.list( ( (MemberDTO) session.getAttribute("login_info") ).getMno() );
		model.addAttribute("cardlist", cardlist);

		model.addAttribute( "arr_basket_no", new Gson().toJson( arr_basket_no ) );

		return "/basket/olist";//jsp file name
	}//list

	@RequestMapping( value = "/delete", method = RequestMethod.GET )
	public void delete( ProductDTO dto, HttpSession session, PrintWriter out ) {
		dto.setMno( ( (MemberDTO) session.getAttribute("login_info") ).getMno() );

		int successCount = 0;
		successCount = service.delete( dto );
		out.print(successCount);
		out.close();
	}//delete

	@RequestMapping( value = "/list", method = RequestMethod.GET )
	public String list( Model model, HttpSession session ) {
		String mno = ( (MemberDTO) session.getAttribute("login_info") ).getMno();

		List<ProductDTO> list = null;
		list = service.list( mno );
		model.addAttribute("list", list);
		return "/basket/list";//jsp file name
	}//list

	@RequestMapping( value = "/insert", method = RequestMethod.POST )
	public void insert( ProductDTO dto, HttpSession session, PrintWriter out ) {
		dto.setMno( ( (MemberDTO) session.getAttribute("login_info") ).getMno() );

		int successCount = 0;
		successCount = service.insert(dto);
		out.print(successCount);
		out.close();
	}//insert

}//class

/*
drop table basket;

create table basket (
  basket_no int not null auto_increment,
  mno int not null,
  prdt_no int not null,
  buy_qty int not null,
  reg_date datetime not null,
  primary key (basket_no)
);
*/
