package login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import login.dto.MemberDTO;

public class LoginDAO {
	
	private final String URL ="jdbc:oracle:thin:@localhost:1521:xe";
	private final String USER ="c##scott";
	private final String PASSWORD ="tiger";
	private Connection con;
	private PreparedStatement psmt;
	private ResultSet rs;
	
	
	public LoginDAO () {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch ( ClassNotFoundException e ) {
			e.printStackTrace();
		}
		
	}//constructor
	
	public int loginCheck(MemberDTO dto) throws SQLException {
		String sql = "select count(mid) cnt from member where mid=? and mpwd=?";
		int loginYN = 0;
		con = DriverManager.getConnection(URL, USER, PASSWORD);
		psmt = con.prepareStatement(sql);
		psmt.setString(1, dto.getMid());
		psmt.setString(2, dto.getMpwd());

		rs = psmt.executeQuery();//쿼리 실행결과를 rs에 넣고
		rs.next();//쿼리 실행결과 다음줄..
		loginYN = rs.getInt("cnt");//컬럼 값이 cnt 인값을 loginYN에 넣어라
		
		rs.close();
		psmt.close();
		con.close();
		
		return loginYN; // loginYN = rs.getInt("cnt"); 값을 반환
	}//loginCheck

}//class
