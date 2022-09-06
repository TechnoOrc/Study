package ch042;

import java.awt.Frame;

public class Ch042Ex111 {

	public static void main(String[] args) {
		
		//Frame frm = new Frame();
		Frame frm = new Frame("생성자를 통해 data를 전달");
		//생성자를 통해 instance 객체에 data를 전달할 수 있다.
		frm.setSize(500,200);
		frm.setVisible(true);
		
		
	}//main
}//class
