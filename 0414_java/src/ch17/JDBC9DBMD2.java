package ch17;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.spi.DirStateFactory.Result;

public class JDBC9DBMD2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		
		Class.forName("oracle.jdbc.driver.OracleDriver");

		String user = "c##scott", password = "tiger";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Connection con = DriverManager.getConnection(url, user, password);
		
		DatabaseMetaData dbmd = con.getMetaData();
		
		ResultSet rs1 = dbmd.getSchemas();// DBMS 내부 객체의 소유자.
		while(rs1.next()) {
			System.out.println(rs1.getString(1));
		}//while
		
		ResultSet rs2 = dbmd.getTables(null, "C##SCOTT", "%", null);//특정 사용자가 가지고 있는 데이터
		while (rs2.next()) {
			System.out.print(rs2.getString(1)+ " ");//catalog
			System.out.print(rs2.getString(2)+ " ");//scheme
			System.out.print(rs2.getString(3)+ " ");//table
			System.out.println(rs2.getString(4));//type
		}
		
		ResultSet rs3 = dbmd.getTableTypes();
		while (rs3.next()) {
			System.out.print(rs3.getString(1));
		
		}
		
		
		

	}//main

}//class
