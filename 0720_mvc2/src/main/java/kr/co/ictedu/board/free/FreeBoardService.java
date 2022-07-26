package kr.co.ictedu.board.free;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FreeBoardService {

   @Autowired
   private FreeBoardDAO dao;
   
   
   public List<FreeBoardDTO> pagingList( int limitNum ) {
	   List<FreeBoardDTO> list = null;
	   list = dao.pagingList ( limitNum );
	   return list;
   }//pagingList
   
   public int totalListCount() {
	int totalListCount = 0;
	totalListCount = dao.totalListCount();
	return totalListCount;
   }//totalListCount
   
   
   public int update(FreeBoardDTO dto) {
	   int successCount = 0;
	   successCount = dao.update(dto);
	   return successCount;
   }//update
   
   public int delete( FreeBoardDTO dto ) {
	   int successCount = 0;
	   successCount = dao.delete( dto );
	   return successCount;
   }//delete
   
   
   public FreeBoardDTO detail( String board_no ) {
	 FreeBoardDTO dto = null;
	 dto = dao.detail(board_no);
	 return dto;
   }//detail
   
   
   public int write( FreeBoardDTO dto ) {
	   int successCount = 0;
	   successCount = dao.write(dto);
	   
	   return successCount;
   }//write
   
   public List<FreeBoardDTO> list() {
      List<FreeBoardDTO> list = null;
      list = dao.list();
      return list;
   }//list




   
   
  
}//class