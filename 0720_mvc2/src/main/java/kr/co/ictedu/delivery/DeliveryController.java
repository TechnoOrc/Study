package kr.co.ictedu.delivery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping( value = "/delivery" )
public class DeliveryController {

	private final static Logger logger = LoggerFactory.getLogger(DeliveryController.class);

	//@Autowired
	//private DeliveryService service;

	@RequestMapping(value = "/form", method = RequestMethod.GET)
	public String form() {
		return "delivery/form";//jsp file name
	}//form

}//class

/*
drop table delivery_address;
create table delivery_address (
	addr_no int not null auto_increment,
	addr_name varchar(60) not null,
	mno int not null,
	recipient_name varchar(60) not null,
	tel varchar(15) not null,
	post_code varchar(10) not null,
	addr1 varchar(150) not null,
	addr2 varchar(150) not null,
	primary key (addr_no)
);
*/
