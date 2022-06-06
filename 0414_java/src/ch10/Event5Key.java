package ch10;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.TextField;

public class Event5Key {
	
	Frame frm;
	TextField tf;
	
	Event5Key(){
		frm = new Frame("제목 옵니다.");
		tf = new TextField();
		
				
				
	}//Event5Key
	
	public void makeGui() {
		frm.setSize(300,300);
		frm.setBackground(Color.pink);
		frm.setVisible(true);
		frm.add(tf,BorderLayout.NORTH);
		
		
	}//makeGui

	public void addEvent() {
		frm.addWindowListener(new WindowAdapterObject());
		tf.addKeyListener(new Event5KeyEvent());
		
	}//addEvent
	
	
	
	
	public static void main(String[] args) {
		
		Event5Key test = new Event5Key();
		test.makeGui();
		test.addEvent();
		
	}//main

}//class
