package kr.co.ictedu.board.free;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class FreeBoardDAO {
	
	@Autowired
	private SqlSession sqlSession;
	
	public int write ( FreeBoardDTO dto ) {
		int successCount = 0;
		successCount = sqlSession.insert("FreeBoardMapper.write", dto);
		return successCount;
	}//write
	
	
	
	
	public List<FreeBoardDTO> list() {//나중에 리턴타입 바꿀거임
		List<FreeBoardDTO> list = null;
		list = sqlSession.selectList("FreeBoardMapper.list");
		//sqlSession.selectOne : select 결과가 오직 하나일때.
		//sqlSession.selectList : select 결과가 너무 많아서 List 하나에 모두 담아 주는 메소드.
		return list;
		
	}//list

}//class
