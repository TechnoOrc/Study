package ch17;

//ResultSetMetaData : ResultSet 부가 정보. 


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC10RSMD2 {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");

		String user = "c##scott", password = "tiger";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Connection con = DriverManager.getConnection(url, user, password);
		
		Statement stmt = con.createStatement();
		String sql = "Select *from emp";
		
		ResultSet rs = stmt.executeQuery(sql);
		
		ResultSetMetaData rsmd = rs.getMetaData();
		for (int i = 1; i <= rsmd.getColumnCount(); i++) {
			System.out.println(rsmd.getColumnName(i) + "\t");
			rs.next();
			
		}//for
		
		while (rs.next()) {
			System.out.print(rs.getString("empno") + "\t");
			System.out.print(rs.getString("ename") + "\t");
			System.out.print(rs.getString("job") + "\t");
			System.out.print(rs.getString("mgr") + "\t");
			System.out.print(rs.getString("hiredate") + "\t");
			System.out.print(rs.getString("sal") + "\t");
			System.out.print(rs.getString("comm") + "\t");
			System.out.println(rs.getString("deptno") + "\t");
		}//while

		
		rs.close();
		stmt.close();
		con.close();
		
		
	}//main
}//class
