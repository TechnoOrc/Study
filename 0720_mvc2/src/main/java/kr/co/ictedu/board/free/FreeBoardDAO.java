package kr.co.ictedu.board.free;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class FreeBoardDAO {
	
	@Autowired
	private SqlSession sqlSession;
	
	public int delete(FreeBoardDTO dto) {
		int successCount = 0;
		successCount = sqlSession.delete("FreeBoardMapper.delete", dto);
		//data argument 1개만 가능 (board_no 와 pwd를 하나의 객체로 담아서 넘겨야 함
		//컨트롤러에서 아예 수정하여 넘겨 받음
		return successCount;
	}//delete
	
	public FreeBoardDTO detail( String board_no) {
		FreeBoardDTO dto = null;
		dto = sqlSession.selectOne("FreeBoardMapper.detail", board_no);
		return dto;
	}//detail
	
	
	
	public int write ( FreeBoardDTO dto ) {
		int successCount = 0;
		successCount = sqlSession.insert("FreeBoardMapper.write", dto);
		return successCount;
	}//write
	
	
	
	public List<FreeBoardDTO> list() {
		List<FreeBoardDTO> list = null;
		list = sqlSession.selectList("FreeBoardMapper.list");
		//sqlSession.selectOne : select 결과가 오직 하나일때.
		//sqlSession.selectList : select 결과가 너무 많아서 List 하나에 모두 담아 주는 메소드.
		return list;
		
	}//list



}//class
