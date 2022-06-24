package ch10;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.List;


public class Event7List {
	
	Frame frm;
	List list;
	
	
	Event7List(){
		frm = new Frame("제목 옵니다.");
		list = new List(5,false);//5줄 짜리// false : multipleMode(중복 선택 여부)
				
	}//Event7List
	
	public void makeGui() {
		frm.setSize(300,300);
		frm.setVisible(true);
		
		frm.add(list, BorderLayout.CENTER);
		list.add("Apple");
		list.add("banana");
		list.add("Mango");
		
		
	}//makeGui

	public void addEvent() {
		frm.addWindowListener(new WindowAdapterObject());
		list.addItemListener( new Event7ListEvent(list));
		
		
	}//addEvent
	
	
	
	
	public static void main(String[] args) {
		
		Event7List test = new Event7List();
		test.makeGui();
		test.addEvent();
		
	}//main

}//class
