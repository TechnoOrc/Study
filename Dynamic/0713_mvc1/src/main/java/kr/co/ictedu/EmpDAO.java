package kr.co.ictedu;

import java.util.List;

import org.apache.ibatis.session.SqlSession; //ibatis => mybatis의 예전이름
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmpDAO {

	@Autowired
	private SqlSession sqlSession;
	
	public EmpDTO empDetail( String eno ) {
		EmpDTO dto = null;
		
		dto = sqlSession.selectOne("EmpMapper.empDetail", eno );
		
		return dto;//service로 넘긴다.
	}//empDetail
	
	public List<EmpDTO> empList() {
		
		List<EmpDTO> list = null;
		
		list = sqlSession.selectList("EmpMapper.empList");//mybatis-mapper.xml의 (namespace.id)
		//sqlSession : dao에서 사용하는 mybatis의 변수 이름
		//selectList : select 결과를 list에 담아서 return.
		
		System.out.println("Execute DAO : " + list);
		
		return list;
		
	}//empList
	
}//class
