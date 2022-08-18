package kr.co.ictedu.batch;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.ictedu.order.OrderMainDTO;

@Repository
public class BatchDAO1 {

	@Autowired
	private SqlSession sqlSession;

	public List<OrderMainDTO> autoConfirmList() {

		List<OrderMainDTO> list = null;
		list = sqlSession.selectList("Batch1Mapper.autoConfirmList");
		return list;

	}//autoConfirmList

}//class












