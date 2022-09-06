package ch17;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;

import ch10.WindowAdapterObject;

public class BoardMenu {

	Frame frm;
	MenuBar bar;
	Menu menu;
	MenuItem item1, item2;
	Panel pan1, pan2;
	CardLayout card;
	
	BoardMenu(){
		frm = new Frame("CardMenu");
		bar = new MenuBar();
		menu = new Menu("File");
		item1 = new MenuItem("BoardInsert");
		item2 = new MenuItem("BoardList");
		pan1 = new Panel();
		pan2 = new Panel();
		card = new CardLayout();
	}//생성자
	
	void makeGui() {
		frm.setSize(300,300);
		
		frm.setMenuBar(bar);
		bar.add(menu);
		menu.add(item1);
		menu.add(item2);
		
		pan1.setBackground(Color.green);
		pan2.setBackground(Color.pink);
		frm.setLayout(card);
		frm.add(pan1, "list");
		frm.add(pan2, "insert");// 별명을 통해서 화면 교체 예정
		
		frm.setVisible(true);
	}
	
	void addEvent() {
		BoardMenuEvent event = new BoardMenuEvent(card, frm);
		item1.addActionListener(event);
		item2.addActionListener(event);
		frm.addWindowListener(new WindowAdapterObject());
				
	}
	
	public static void main(String[] args) {
		BoardMenu test = new BoardMenu();
		test.makeGui();
		test.addEvent();
		
		
	}//main

}//class
