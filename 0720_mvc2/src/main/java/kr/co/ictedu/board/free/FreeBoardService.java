package kr.co.ictedu.board.free;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FreeBoardService {

   @Autowired
   private FreeBoardDAO dao;
   
   public int write( FreeBoardDTO dto ) {
	   int successCount = 0;
	   successCount = dao.write(dto);
	   
	   return successCount;
   }//write
   
   public List<FreeBoardDTO> list() {
      List<FreeBoardDTO> list = null;
      list = dao.list();
      return list;
   }
   
   
  
}//class