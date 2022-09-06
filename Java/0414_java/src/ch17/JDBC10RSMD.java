package ch17;

//ResultSetMetaData : ResultSet 부가 정보. 


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC10RSMD {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");

		String user = "c##scott", password = "tiger";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Connection con = DriverManager.getConnection(url, user, password);
		
		Statement stmt = con.createStatement();
		String sql = "Select *from emp";
		
		ResultSet rs = stmt.executeQuery(sql);
		
		ResultSetMetaData rsmd = rs.getMetaData();
		System.out.println("ColumnCount : " + rsmd.getColumnCount());
		System.out.println("ColumnLabel : " + rsmd.getColumnLabel(1));
		System.out.println("ColumnName : " + rsmd.getColumnName(2));
		System.out.println("ColumnType : " + rsmd.getColumnType(1));
		System.out.println("ColumnTypeName : " + rsmd.getColumnTypeName(1));
		System.out.println("Nullable : " + rsmd.isNullable(1));
		System.out.println("Nullable : " + rsmd.isReadOnly(1));
		System.out.println("Nullable : " + rsmd.isWritable(1));


		
		rs.close();
		stmt.close();
		con.close();
		
		
	}//main
}//class
