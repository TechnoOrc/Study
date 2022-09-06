package ch17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class JDBC11BoardListDAO {
	
	String user = "c##scott", password = "tiger";
	String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	String sql = "select t_no, t_title, t_writer, t_cnts, t_date from testboard";
	Connection con;
	Statement stmt;
	ResultSet rs;
	ArrayList<String> arr;
	
	JDBC11BoardListDAO() throws ClassNotFoundException{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		
	}
	
	ArrayList<String> selectBoardList() throws SQLException{
		arr = new ArrayList<String>();
		
		con = DriverManager.getConnection(url, user, password);
		stmt = con.createStatement();
		rs = stmt.executeQuery(sql);
		while (rs.next()) {
			arr.add(  rs.getString("t_no") + " "
					+ rs.getString("t_title") + " "
					+ rs.getString("t_writer") + " "
					+ rs.getString("t_date") + " "
					);
		}//while
		rs.close();
		stmt.close();
		con.close();
		
		return arr;
	}//selectBoardList
	

}
