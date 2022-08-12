package kr.co.ictedu.order;

import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.ictedu.basket.BasketController;
import kr.co.ictedu.util.dto.MemberDTO;

@Controller
@RequestMapping( value = "/order" )
public class OrderController {

	private final static Logger logger = LoggerFactory.getLogger(BasketController.class);

	@Autowired
	private OrderService service;

	@RequestMapping( value = "/insert", method = RequestMethod.POST )
	public void insert( OrderMainDTO dto, HttpSession session, PrintWriter out ) {
		dto.setMno( ( (MemberDTO) session.getAttribute("login_info") ).getMno() );

		logger.info(dto.getStr_basket_no());
		String [] tmpArr = dto.getStr_basket_no().split(",");
		dto.setArr_basket_no(tmpArr);

		int successCount = 0;
		successCount = service.insert(dto);
		out.print(successCount);
		out.close();
	}//insert

}//class

/*
drop table order_main;
drop table order_detail;

create table order_main (
  order_no int primary key auto_increment -- 주문번호
, mno int not null -- 멤버번호
, card_no int not null -- 카드번호
, addr_no int not null -- 배송지번호
, order_product_cnt int not null -- 주문상품수
, order_amt int not null -- 주문금액
, discount_amt int -- 할인금액
, pay_amt int not null -- 결제금액
, order_date datetime not null -- 주문일자
);
create table order_detail (
  detail_no int primary key auto_increment -- 주문상세번호
, order_no int not null -- 주문번호
, prod_no int not null -- 상품번호
, detail_qty int not null -- 주문수량
, detail_price int not null -- 판매단가
, detail_amt int not null -- 주문금액 (주문수량 * 판매단가)
, detail_discount int -- 할인율
, detail_discount_amt int not null -- 할인금액
, detail_pay_amt int not null -- 결제금액
);
*/
