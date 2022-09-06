package ch10;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class Event8Dialog {
	
	Frame frm;
	MenuBar menuBar;
	Menu menu;
	MenuItem menuItem1, menuItem2, menuItem3;
	Dialog dia;
	Event8DialogEvent event;
	WindowAdapterObject closeEvent;
	Label label;
	Button btn;
	
	Event8Dialog(){//객체를 만드는 순서가 있으므로 순차적으로 적용해야한다.!!!
		frm = new Frame("메뉴");
		menuBar = new MenuBar();//메뉴를 붙일 수 있는 공간(Frame에 붙음)
		menu = new Menu("Home");//메뉴, (MenuBar에 붙음)
		menuItem1 = new MenuItem("Open");//메뉴아이템,(Menu에 붙음)
		menuItem2 = new MenuItem("Save");
		menuItem3 = new MenuItem("Exit");
		dia = new Dialog(frm,"confirm",false);//(Dialog 생성위치 , "제목", modal : true/false);
		/* modal : sub 창이 실행 중일 때 , 본체 창을 클릭 할 수 있는가?
		 * modal true : sub 창이 실행 중일 때 , 본체를 클릭 불가능.
		 * modal false : sub 창이 실행 중일 때 , 본체를 클릭 가능.
		 * Dialog는 붙이는게 아니라 보이나 안보이냐 이벤트를 줘야함//setVisible(true);
		*/
		event = new Event8DialogEvent(dia);
		closeEvent = new WindowAdapterObject();
		label = new Label("Really Exit???");
		btn = new Button(" O K ");
	}//AWT9Menu()
	
	public void makeGui() {
		frm.setSize(300,300);
		frm.setVisible(true);
		
		frm.setMenuBar(menuBar);//연쇄적인 메뉴 구성들...
		menuBar.add(menu); //중요함
		menu.add(menuItem1);
		menu.add(menuItem2);
		menu.addSeparator();// 메뉴에  ______ 삽입
		menu.add(menuItem3);
		
		dia.setSize(100,90);
		dia.add(label,BorderLayout.CENTER);
		dia.add(btn, BorderLayout.SOUTH);
		
		
		
	}//makeGui
	
	public void addEvent() {
		
		frm.addWindowListener(closeEvent);
		menuItem3.addActionListener(event);
		dia.addWindowListener(closeEvent);
		btn.addActionListener(event);
		
	}//addEvent
	

	public static void main(String[] args) {
	
		Event8Dialog test = new Event8Dialog();
		test.makeGui();
		test.addEvent();
		
		
	}//main

}//AWT9Menu
