package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.spi.DirStateFactory.Result;

public class JDBC1OverView {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1단계 - 오라클 드라이버 로딩 (ojdbc8.jar)
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//2단계 - dbms 접속
		
		String id = "c##scott";
		String pwd = "tiger";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		Connection con = DriverManager.getConnection(url, id, pwd);
		
		String sql = "select * from emp";
		Statement stmt = con.createStatement();
		
		ResultSet rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			System.out.println(rs.getInt("empno") + "\t");
		}
		rs.close();
		stmt.close();
		con.close();
	}//main

}//class
