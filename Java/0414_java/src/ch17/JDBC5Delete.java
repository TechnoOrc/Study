package ch17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC5Delete {

	public static void main(String[] args)
			throws ClassNotFoundException, SQLException {

		Class.forName("oracle.jdbc.driver.OracleDriver");

		String user = "c##scott", password = "tiger";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection con = DriverManager.getConnection(url, user, password);

		Statement stmt = con.createStatement();
		String sql = "delete from testboard where t_no = '1'";

		int successCount = stmt.executeUpdate(sql);//1:성공, 0:실패.
		System.out.println("delete : " + successCount);
		//stmt.execute... : select->ResultSet.
		//stmt.execute... : insert/update/delete->성공 건수.

		stmt.close();
		con.close();

	}//main

}//class

/*
sql developer에서 실행.

create sequence tno_seq
start with 1
increment by 1
maxvalue 99999
nocycle;
*/ 

