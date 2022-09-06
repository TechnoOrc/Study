package ch17;

import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBC6GuiEvent implements ActionListener {

	TextField textfield1, textfield2;
	TextArea textarea;
	String user = "c##scott", password = "tiger";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String sql = "insert into testboard values(tno_seq.nextval, ?, ?, ?, sysdate)";// ?표를 제외한 나머지 값을 저장해 놓았다가 사용됨
	Connection con;
	PreparedStatement psmt;
	

	JDBC6GuiEvent(TextField tf1, TextField tf2, TextArea ta){
		this.textfield1 = tf1;
		this.textfield2 = tf2;
		this.textarea = ta;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스를 찾지 못하였습니다.");
		}
			
			
			
	}//constructor

	@Override
	public void actionPerformed(ActionEvent e) { // 이벤트 발생시 dbms 연결하여 데이터 입력한다.

		String cmd = e.getActionCommand();
		if(cmd.equals("SAVE")) {
			System.out.println(textfield1.getText());
			System.out.println(textfield2.getText());
			System.out.println(textarea.getText());
			
			try {
				con = DriverManager.getConnection(url, user, password);
				psmt = con.prepareStatement(sql); //sql로 데이터를 실어 나르는 기능
				psmt.setString(1, textfield1.getText());
				psmt.setString(2, textfield2.getText());
				psmt.setString(3, textarea.getText());
				int suceessCount = psmt.executeUpdate();
				System.out.println("suceessCount : " + suceessCount);
			} catch (SQLException sqle) {
				System.out.println("DB 접속 오류...");
			} finally {
				
				try {
					psmt.close();
					con.close();
				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				
			}//finally
								
			
		}//if
		
		
	}//actionPerformed

}//class 
