package jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Join14DAO {

	public Join14DAO() {
		//1. 드라이버 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch( ClassNotFoundException e ) {
			e.printStackTrace();
		}
	}//Join14DAO

	private final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private final String USER = "c##scott";
	private final String PASSWORD = "tiger";
	private Connection con;
	private PreparedStatement psmt;

	public int insertMember(MemberDTO dto) throws SQLException {
		//2. 커넥션 연결
		con = DriverManager.getConnection(URL, USER, PASSWORD);
		//3. sql 전송
		String sql = "insert into member (mno, mid, mpwd, tel1, tel2, tel3"
				+ ", email1, email2, mdate) values (mno_seq.nextval"
				+ ", ?, ?, ?, ?, ?, ?, ?, sysdate)";
		psmt = con.prepareStatement(sql);
		psmt.setString( 1, dto.getMid() );
		psmt.setString( 2, dto.getMpwd() );
		psmt.setString( 3, dto.getTel1() );
		psmt.setString( 4, dto.getTel2() );
		psmt.setString( 5, dto.getTel3() );
		psmt.setString( 6, dto.getEmail1() );
		psmt.setString( 7, dto.getEmail2() );
		//4. 결과 확인(select -> resultSet, insert/update/delete -> int)
		//select -> executeQuery(), insert/update/delete -> executeUpdate()
		int successCount = 0;
		successCount = psmt.executeUpdate();
		//5. close
		psmt.close();
		con.close();

		return successCount;
	}//insertMember

}//class