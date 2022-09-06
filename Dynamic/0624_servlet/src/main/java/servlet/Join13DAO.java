package servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Join13DAO {

	public Join13DAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch( ClassNotFoundException e ) {
			e.printStackTrace();
		}
	}//constructor
	
	
	private Connection con;
	private PreparedStatement psmt;
	private final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private final String USER = "c##scott";
	private final String PASSWORD = "tiger";
	public int insertMember( MemberDTO dto ) {
		int successCount = 0;
		String sql = "insert into member(mno, mid"
				+ ", mpwd, tel1, tel2, tel3, email1, email2, mdate) values("
				+ "mno_seq.nextval, ?, ?, ? , ?, ?, ?, ?, sysdate)";
		try {
			con = DriverManager.getConnection(URL, USER, PASSWORD);
			psmt = con.prepareStatement(sql);//?의 자리에 데이터를 바꾸어 넣는다.
			psmt.setString(1,  dto.getMid());// 첫 번째 물음표
			psmt.setString(2,  dto.getMpwd());// 첫 번째 물음표
			psmt.setString(3,  dto.getTel1());// 첫 번째 물음표
			psmt.setString(4,  dto.getTel2());// 첫 번째 물음표
			psmt.setString(5,  dto.getTel3());// 첫 번째 물음표
			psmt.setString(6,  dto.getEmail1());// 첫 번째 물음표
			psmt.setString(7,  dto.getEmail2());// 첫 번째 물음표
			successCount = psmt.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				psmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}//finally
		return successCount;
	}//insertMember
	
}//class
