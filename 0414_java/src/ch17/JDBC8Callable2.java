package ch17;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class JDBC8Callable2 {

	public static void main(String[] args) 
			throws ClassNotFoundException, SQLException {

		
		Class.forName("oracle.jdbc.driver.OracleDriver");

		String user = "c##scott", password = "tiger";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Connection con = DriverManager.getConnection(url, user, password);
		
		String sql = "{? = call func_calc(?,?,?)}";
		CallableStatement csmt = con.prepareCall(sql); 
		csmt.registerOutParameter(1, Types.INTEGER);
		csmt.setInt(2, 7);
		csmt.setString(3, "+");
		csmt.setInt(4, 8);
		
		csmt.executeUpdate();
		int res = csmt.getInt(1);
		System.out.println("res : " + res);
		
		csmt.close();
		con.close();
		
	}//main

}//class


/*
 * create or replace function func_calc(num1 in number, giho in varchar2, num2
 * in number) return number is resNum number; begin if( giho = '+' ) then resNum
 * := num1 + num2; elsif( giho = '-' ) then resNum := num1 - num2; elsif( giho =
 * '*' ) then resNum := num1 * num2; elsif( giho = '/') then resNum := num1 /
 * num2; elsif( giho = '%' ) then resNum := mod(num1, num2); else
 * dbms_output.put_line('wrong input!!!'); end if; return resNum;
 * 
 * end;
 */
