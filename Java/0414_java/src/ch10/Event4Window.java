package ch10;

import java.awt.Color;
import java.awt.Frame;

public class Event4Window {
	
	Frame frm;
	
	Event4Window(){
		frm = new Frame("제목 옵니다.");
		
	}//Event4Window
	
	public void makeGui() {
		frm.setSize(300,300);
		frm.setBackground(Color.pink);
		frm.setVisible(true);
	}//makeGui

	public void addEvent() {
		frm.addWindowListener(new Event4WindowEvent());
		
	}//addEvent
	
	
	
	
	public static void main(String[] args) {
		
		Event4Window test = new Event4Window();
		test.makeGui();
		test.addEvent();
		
	}//main

}//class
