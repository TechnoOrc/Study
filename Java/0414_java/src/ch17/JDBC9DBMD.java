package ch17;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * DataBase MetaData
 * 	- DBMS 정보
 * 	- Driver 정보
 * 	- Connection 정보 등...
 */

public class JDBC9DBMD {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("oracle.jdbc.driver.OracleDriver");

		String user = "c##scott", password = "tiger";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Connection con = DriverManager.getConnection(url, user, password);
		
		DatabaseMetaData dbmd = con.getMetaData();
		
		System.out.println("MajorVersion : " + dbmd.getDatabaseMajorVersion());
		System.out.println("MinorVersion : " + dbmd.getDatabaseMinorVersion());
		System.out.println("ProductVersion : " + dbmd.getDatabaseProductVersion());
		System.out.println("ProductName : " + dbmd.getDatabaseProductName());
		System.out.println("TransactionIsolation : ");
		System.out.println("=================");
		System.out.println("MajorVersion : " + dbmd.getDriverMajorVersion());
		System.out.println("MinorVersion : " + dbmd.getDriverMinorVersion());
		System.out.println("DriverVersion : " + dbmd.getDriverVersion());
		System.out.println("DriverName : " + dbmd.getDriverName());
		System.out.println("=================");
		System.out.println("MajorVersion : " + dbmd.getJDBCMajorVersion());
		System.out.println("MinorVersion : " + dbmd.getJDBCMinorVersion());
		System.out.println("URL : " + dbmd.getURL());
		System.out.println("UserName : " + dbmd.getUserName());
		System.out.println("ReadOnly : " + dbmd.isReadOnly());
		
		con.close();
		
		
		
	}//main

}//class
