package kr.co.ictedu;

import java.util.List;

import javax.management.loading.PrivateClassLoader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService {
	
	@Autowired
	private EmpDAO dao;

	public EmpDTO empDetail( String eno ) {
		EmpDTO dto = null;
		
		dto = dao.empDetail( eno );
		
		return dto;//controller로 보낸다.
	}//empDetail
	
	public List<EmpDTO> empList() {
		System.out.println("여기는 서비스 입니다.");
		
		List<EmpDTO> list = null;
		
		list = dao.empList();
				
		return list;
	}//empList
	
}//class
