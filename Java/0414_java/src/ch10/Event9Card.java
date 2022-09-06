package ch10;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;

public class Event9Card {
	
	Frame frm;
	MenuBar menuBar;
	Menu menu;
	MenuItem menuItem1, menuItem2, menuItem3;
	CardLayout card;
	Panel pan1, pan2, pan3;
	Event9CardEvent event;
	
	Event9Card(){
		frm = new Frame("메뉴");
		menuBar = new MenuBar();
		menu = new Menu("Home");
		menuItem1 = new MenuItem("Regist");
		menuItem2 = new MenuItem("List");
		menuItem3 = new MenuItem("Exit");
		card = new CardLayout();
		pan1 = new Panel();
		pan2 = new Panel();
		pan3 = new Panel();
		event = new Event9CardEvent(card,frm);
		
		
	}//AWT9Menu()
	
	public void makeGui() {
		frm.setLayout(card);//cardLayout 적용
		frm.setSize(300,300);
		frm.setVisible(true);
		
		frm.setMenuBar(menuBar);//연쇄적인 메뉴 구성들...
		menuBar.add(menu); //중요함
		menu.add(menuItem1);
		menu.add(menuItem2);
		menu.addSeparator();// 메뉴에 문자 ----- 삽입?
		menu.add(menuItem3);
		
		pan1.setBackground(Color.red);
		pan2.setBackground(Color.green);
		pan3.setBackground(Color.blue);
		frm.add(pan1); 
		frm.add(pan2);
		frm.add(pan3);
		
		
	}//makeGui
	
	public void addEvent() {
		frm.addWindowListener(new WindowAdapterObject());
		menuItem1.addActionListener(event);
		menuItem2.addActionListener(event);
		//menuItem3.addActionListener(event); 종료버튼 만들어 보기
		
	}//addEvent
	

	public static void main(String[] args) {
	
		Event9Card test = new Event9Card();
		test.makeGui();
		test.addEvent();
		
	}//main

}//AWT9Menu
