package ch10.ch10test;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.TextField;

import ch10.WindowAdapterObject;

public class Ch10Test1 {

	Frame frm;
	TextField tf1, tf2;
	Button btn1, btn2;
	Ch10Test1Event evnt; // // 버튼 누른 이벤트에 대한...
	
	Ch10Test1(){
		frm = new Frame("Up & Down");
		tf1 = new TextField("click down butto");
		tf2 = new TextField();
		btn1 = new Button("Up");
		btn2 = new Button("Down");
		evnt = new Ch10Test1Event(tf1,tf2);// 버튼 누른 이벤트에 대한...
		
	}//Ch10Test1()
	
	public void makeGui() {
		frm.setSize(500,500);
		frm.setBackground(Color.pink);
		frm.setVisible(true);
		
		
		
		frm.setLayout(null);//setLayout(null)에서는 객체를 붙이는 위치를 설정해주어야한다.
		
		tf1.setBounds(10, 35, 200, 30);
		tf2.setBounds(10, 70, 200, 30);
		btn1.setBounds(215, 35, 100, 30);
		btn2.setBounds(215, 70, 100, 30);
		
		frm.add(tf1);		frm.add(tf2);
		frm.add(btn1);		frm.add(btn2);
		
		//frm.addWindowListener(new WindowAdapterObject());// 종료진행하는 부분///// 제발 확인하자
		frm.addWindowListener(new WindowAdapterObject());
		btn1.addActionListener(evnt);// 버튼 누른 이벤트에 대한...
		btn2.addActionListener(evnt);// 버튼 누른 이벤트에 대한...
		
		
		
	}//makeGui
	
}//class
