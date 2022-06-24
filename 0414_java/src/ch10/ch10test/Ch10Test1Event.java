package ch10.ch10test;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * action이 일어나면 JRE가 actionPerformed 실행시킴
 * - ActionEvent 하나 만들어서 actionPerformed 메소드에 전달
 * 		-> ActionEvent : JRE가 감지한 유저의 이벤트 활동 정보
 * 			-> 예) 이벤트가 어디서 일어났는지 : e.getActionCommand()
 */
public class Ch10Test1Event implements ActionListener {// {사이에 ctrl + 엔터로 actionPerformed 추가  }

	TextField field1, field2;
	
	Ch10Test1Event(){}
	Ch10Test1Event(TextField field1, TextField field2){
		this.field1 = field1;
		this.field2 = field2;
	}	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {//action이 일어나면 JRE가 actionPerformed 실행시킴
		
		String cmd = e.getActionCommand();// 
		System.out.println(cmd);
		if(cmd.equals("Up")) {//아래 창의 글자를 위 창으로
			String tmp = field2.getText();
			field1.setText(tmp);
			field2.setText("");
		} else if(cmd.equals("Down")) {//아래 창의 글자를 아래 창으로
			String tmp = field1.getText();
			field2.setText(tmp);
			field1.setText("");
		}
		
		
}//actionPerformed(ActionEvent e)
	
	
	
	
	public static void main(String[] args) {

		
	}//main

}//class
