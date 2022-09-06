package ch17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC2OV {
	
	
	public static void main(String[] args) 
			throws ClassNotFoundException, SQLException {
		//1단계 : 오라클이 제공한 접속 프로그램을 자바 메모리로 로딩.
		//Class.forName : 이름으로 클래스 파일을 찾아서 메모리에 로딩하는 메소드.
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//2단계 : 오라클이 제공한 방법으로 접속.(ip address/port, id/pwd)
		String id = "c##scott", pwd = "tiger";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		//1,2단계는 dbms마다 다 다르다.
		Connection con = DriverManager.getConnection(url, id, pwd);
		//3단계 : Query(sql) 전송
		//Statement : sql을 담는 전송 바구니. 연결된 양쪽을 오가며 작업한다.
		Statement stmt = con.createStatement();
		String sql = "select empno, ename, job, sal, deptno from emp";//sql 안에 ;(세미콜론 넣지 않는다.)
		ResultSet rs = stmt.executeQuery(sql);// 자료를 출력하겠다. ResultSet rs
		//4단계 : 결과 확인.
		while(rs.next()) {
			System.out.print(rs.getString("empno") + "\t");
			System.out.print(rs.getString("ename") + "\t");
			System.out.print(rs.getString("job") + "\t");
			System.out.print(rs.getString("sal") + "\t");
			System.out.println(rs.getString("deptno") + "\t");
			//getString으로 해도 문자 숫자 모두 알맞게 적용됨			
			
//			System.out.print(rs.getInt(1) + "\t");
//			System.out.print(rs.getString(2)+ "\t");
//			System.out.print(rs.getString(3)+ "\t");
//			System.out.print(rs.getInt(4)+ "\t");
//			System.out.println(rs.getInt(5)+ "\t");
			
			
			
		}//while
		 //5단계 : 접속 해제 : close
		rs.close();
		stmt.close();
		con.close();
		
		
	}//main
	
}//class
