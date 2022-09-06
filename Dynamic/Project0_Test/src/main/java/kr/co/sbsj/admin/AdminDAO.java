package kr.co.sbsj.admin;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.sbsj.md.MdDTO;
import kr.co.sbsj.util.dto.SearchDTO;



@Repository
public class AdminDAO {

	@Autowired
	private SqlSession sqlSession;
	
	
	public int fileDelete( AdminDTO dto ) {
		int successCount = 0;
		successCount = sqlSession.update("AdminMapper.fileDelete", dto);
		return successCount;
	}//delete
	
	public int update( AdminDTO dto ) {
		int successCount = 0;
		successCount = sqlSession.update("AdminMapper.update", dto);
		return successCount;
	}//update
	
	
	
	public AdminDTO detail( String md_id ) {
		AdminDTO dto = null;
		dto = sqlSession.selectOne("AdminMapper.detail", md_id);
		return dto;
	}//detail
	
	
	public int searchReviewCount( SearchDTO dto ) {
		int totalCount = 0;
		totalCount = sqlSession.selectOne("AdminMapper.searchReviewCount", dto);
		return totalCount;
	}//searchListCount
	
	
	public int searchListCount( SearchDTO dto ) {
		int totalCount = 0;
		totalCount = sqlSession.selectOne("AdminMapper.searchListCount", dto);
		return totalCount;
	}//searchListCount


	public List<AdminReviewDTO> searchReview( SearchDTO dto ) {
		 List<AdminReviewDTO> list = null;
		list = sqlSession.selectList("AdminMapper.selectReview", dto);
		return list;
	}//searchList
	
	public List<MdDTO> searchList( SearchDTO dto ) {
		List<MdDTO> list = null;
		list = sqlSession.selectList("AdminMapper.selectList", dto);
		return list;
	}//searchList
	
	public void reviewDelete( String no ) {
		sqlSession.delete("AdminMapper.reviewDelete", no);
	}//reviewDelete
	
	public void delete( String no ) {
		sqlSession.delete("AdminMapper.delete", no);
	}//delete

	public void offsale(String no) {
		sqlSession.update("AdminMapper.offsale", no);
		
	}
	public void reviewOn(String no) {
		sqlSession.update("AdminMapper.reviewOn", no);
		
	}
	
	public void reviewOff(String no) {
		sqlSession.update("AdminMapper.reviewOff", no);
		
	}
	
	
	public void onsale(String no) {
		sqlSession.update("AdminMapper.onsale", no);
		
	}
	
}//JoinDAO
