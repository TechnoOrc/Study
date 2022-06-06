package ch17;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC8Callable {

	public static void main(String[] args) 
			throws ClassNotFoundException, SQLException {

		Class.forName("oracle.jdbc.driver.OracleDriver");

		String user = "c##scott", password = "tiger";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Connection con = DriverManager.getConnection(url, user, password);
		
		String sql = "{call testproc1}";// procedure 호출
		CallableStatement csmt = con.prepareCall(sql);
		//CallableStatement : 프로시져를 호출하는 Statement.
		
		int i = csmt.executeUpdate();
		System.out.println("성공 여부 : " + i);
		
		csmt.close();
		con.close();
		
	}//main

}//class


/*
 * create or replace procedure testproc1 is begin insert into testboard
 * values(tno_seq.nextval, 'test','tester','this is test', sysdate);
 * 
 * 
 * 
 * end; /
 */
