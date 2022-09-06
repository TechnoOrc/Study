package ch17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


import oracle.jdbc.internal.OracleCallableStatement;
import oracle.jdbc.internal.OracleTypes;

public class JDBC8Callable3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		
		Class.forName("oracle.jdbc.driver.OracleDriver");

		String user = "c##scott", password = "tiger";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Connection con = DriverManager.getConnection(url, user, password);
		
		String sql = "{call testproc2(?)}";
		OracleCallableStatement csmt = (OracleCallableStatement) con.prepareCall(sql);
		csmt.registerOutParameter(1, OracleTypes.CURSOR);
		csmt.executeUpdate();
		ResultSet rs = csmt.getCursor(1);
		while(rs.next()) {
			System.out.print(rs.getString("empno") + " ");
			System.out.print(rs.getString("ename") + " ");
			System.out.print(rs.getString("job") + " ");
			System.out.print(rs.getString("sal") + " ");
			System.out.println(rs.getString("deptno") + " ");
		}//while
		
		csmt.close();
		con.close();
				
		
	}//main

}//class




/*
 * create or replace procedure testproc2 (csr out SYS_REFCURSOR) is begin open
 * csr for select empno, ename, job, sal, deptno from emp; end; /
 */
