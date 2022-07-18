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
		
		list = sqlSession.selectList("EmpMapper.empList");
		
		System.out.println("Execute DAO : " + list);
		
		return list;
		
	}//empList
	
}//class
