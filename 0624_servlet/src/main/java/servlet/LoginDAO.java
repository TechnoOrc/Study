package servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {

	private Connection con;
	private PreparedStatement psmt;
	private ResultSet rs;
	private final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private final String USER = "c##scott";
	private final String PASSWORD = "tiger";
	
	
	public LoginDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch ( ClassNotFoundException e ) {
			e.printStackTrace();
		}
	}//constructor
	
	
	public int idCheck(MemberDTO dto) throws SQLException {
		//결과 값이 0 : 아이디가 없다.	//결과 값이 1 : 아이디가 있다.
		String sql = "select count(mid) from member where mid = ?";
		int result = 0;

		con = DriverManager.getConnection(URL, USER, PASSWORD);
		psmt = con.prepareStatement(sql);
		psmt.setString( 1, dto.getMid() );
		rs = psmt.executeQuery();

		rs.next();// SQL Developer 검색 결과문의 줄(막대)를 하나 내린다.
		result = rs.getInt(1);//결과의 첫 번째 컬럼을 int 형태로 가져온다.

		rs.close();
		psmt.close();
		con.close();

		return result;
	}//idCheck
	

	public int loginCheck(MemberDTO dto) throws SQLException {//id와 pwd 체크.(유효한 아이디의 패스워드까지 체크)
		//결과 값이 0 : id는 이미 있으므로, pwd가 잘못됬다.
		//결과 값이 1 : id도 있고 pwd가 정상이다.
		String sql = "select count(mid) from member where mid = ? and mpwd = ?";
		int result = 0;
		
		con = DriverManager.getConnection(URL, USER, PASSWORD);
		psmt = con.prepareStatement(sql);
		psmt.setString( 1, dto.getMid() );
		psmt.setString( 2, dto.getMpwd() );
		rs = psmt.executeQuery();
		
		rs.next();
		result = rs.getInt(1);
		
		rs.close();
		psmt.close();
		con.close();
				
		return result;
	}//loginCheck
	
	
}//class
