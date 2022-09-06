package ch17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC3CreateTable {

	public static void main(String[] args) 
			throws ClassNotFoundException, SQLException {

		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String user = "c##scott", passsword = "tiger";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection con = DriverManager.getConnection(url, user, passsword);
		//DriverManager : 똑같은 드라이버를 두개 이상 중복 로딩하지 않도록 관리하는 객체.
		
		Statement stmt = con.createStatement();
		String sql = "create table testboard "
				+ "(t_no number(5) primary key"
				+ ", t_title varchar2(90)"
				+ ", t_writer varchar2(20)"
				+ ", t_cnts varchar2(900)"
				+ ", t_date date)";
		int successCount = stmt.executeUpdate(sql);//1:성공, 0:실패. // create는 반환안됨
		System.out.println("create table : " + successCount);
		
		//stmt.execute...: select -> ResultSet.
		//stmt.execute...: insert/update/ delete/ --> 성공 건수.
		
		
		stmt.close();
		con.close();
		
		
	}//main

}//class


/*
 sql developer에서 실행
 
 create sequence ton_seq
 start with 1
 increment by 1
 maxvalue 99999
 nocycle;
 

 */
