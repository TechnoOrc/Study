package kr.co.ictedu.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

	@Autowired
	private OrderDAO dao;

	public int insert( OrderMainDTO dto ) {
		int successCount = 0;
		successCount = dao.insertOrderMain(dto);//insertOrderMain을 호출하는 시점에 dto에 order_no 값이 없다.
		//insertOrderMain을 수행하면서 selectKey가 dto에 order_no 값을 입력한다.
		if(successCount < 1) {
			return successCount;
		}
		successCount = dao.insertOrderDetail(dto);//insertOrderDetail을 호출하는 시점에 dto에 order_no 값이 있다.
		if(successCount < 1) {
			return successCount;
		}
		successCount = dao.deleteBasketByArray(dto.getArr_basket_no());
		return successCount;
	}//insert

}//class
