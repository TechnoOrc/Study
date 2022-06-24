package ch10;

import java.awt.Color;
import java.awt.Frame;

public class Event1WindowClosing {

	Frame frm;
	WindowAdapterObject closeObj;//시스템 종료 오브젝트 load!!!!!!!

	public Event1WindowClosing(){
		frm = new Frame("close test");
		closeObj = new WindowAdapterObject();//시스템 종료 오브젝트 load!!!!!!!
	}//constructor

	public void makeGui() {
		frm.setSize(300, 300);
		frm.setBackground(Color.PINK);
		frm.setVisible(true);

		frm.addWindowListener(closeObj);//
		//frm.addWindowListener : frm에 윈도우 이벤트를 감지하는 센서를 추가해라.
		//addWindowListener(closeObj) : 윈도우 이벤트를 처리하는 로직은 closeObj에 있다.
		//JRE에게 명령 : frm을 감시하다가, 이벤트가 발생하면, closeObj의 담당 메소드로 전달해라.
		//우리는 이벤트가 발생하면 수행하는 절차만 정의 -> closeObj(WindowAdapterObject).
		//실제로 이벤트가 발생하면 closeObj(WindowAdapterObject)의 메소드를 호출하는 것은 JRE.
	}//makeGui

	public static void main(String[] args) {
		Event1WindowClosing test = new Event1WindowClosing();
		test.makeGui();
	}//main

}//class