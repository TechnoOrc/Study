package servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RE14DAO {

	public RE14DAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//OracleDriver : 오라클에서 제공한 자바와 오라클의 연동이 가능한 프로그램.
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}//constructor
	
	Connection con;
	PreparedStatement psmt;
	
	final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	final String USER = "c##scott";
	final String PASSWORD = "tiger";//final은 변수의 상수화(한번 값을 대입하면, 다시는 값을 바구지 못한다. 보안상 이유로 final 선언함)
	
	public int insertMember( MemberDTO dto ) {
		int successCount = 0;
		try {
			con = DriverManager.getConnection(URL, USER, PASSWORD);
			//DriverManager : 실수로 OracleDriver 드라이버를 여러번 로딩했더라도 한번만 로딩해주는 메니져
			String sql = "insert into member(mno, mid, mpwd, "
					+ "tel1, tel2, tel3, email1, email2, mdate) values("
					+ "mno_seq.nextval, ?, ?, ?, ?, ?, ?, ?, sysdate)";
			psmt = con.prepareStatement(sql);
			psmt.setString(1, dto.getMid());//? 1번째 물음표에서 해당 String 삽입
			psmt.setString(2, dto.getMpwd());
			psmt.setString(3, dto.getTel1());
			psmt.setString(4, dto.getTel2());
			psmt.setString(5, dto.getTel3());
			psmt.setString(6, dto.getEmail1());
			psmt.setString(7, dto.getEmail2());
			successCount = psmt.executeUpdate();
		} catch ( SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				psmt.close(); // psmt가 오류로 생성되지 않았는데 close 를 하게되면 이것 또한 에러가 되므로 exception 처리해야한다.
				con.close();
				
			} catch ( SQLException e) {
				e.printStackTrace();
			}
		}
		
		return successCount;
		
		
		
	}//insertMember

}//class
