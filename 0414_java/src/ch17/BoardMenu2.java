package ch17;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.List;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BoardMenu2 {

	Frame frm;
	MenuBar bar;
	Menu menu;
	MenuItem item1, item2;
	Panel pan1, pan2;
	CardLayout card;
	List list;
	Button btnSelect, btnInsert;
	Label label1, label2, label3;
	TextField tf1, tf2;
	TextArea ta;

	BoardMenu2(){
		frm = new Frame("CardMenu");
		bar = new MenuBar();
		menu = new Menu("File");
		item1 = new MenuItem("BoardInsert");
		item2 = new MenuItem("BoardList");
		pan1 = new Panel();
		pan2 = new Panel();
		card = new CardLayout();
		list = new List(10, false);
		btnSelect = new Button("SELECT");
		btnInsert = new Button("SAVE");
		label1 = new Label("TITLE");
		label2 = new Label("WRITER");
		label3 = new Label("CONTENTS");
		tf1 = new TextField();
		tf2 = new TextField();
		ta = new TextArea();
	}//생성자

	void makeGui() {
		frm.setSize(300, 300);

		frm.setMenuBar(bar);
		bar.add(menu);
		menu.add(item1);
		menu.add(item2);

		pan1.setBackground(Color.GREEN);
		pan2.setBackground(Color.PINK);

		pan1.setLayout(null);
		list.setBounds(20, 20, 245, 170);
		pan1.add(list);
		btnSelect.setBounds(210, 200, 55, 30);
		pan1.add(btnSelect);

		pan2.setLayout(null);
		label1.setBounds(10, 10, 80, 30);
		label1.setBackground(Color.WHITE);
		pan2.add(label1);
		tf1.setBounds(100, 10, 170, 30);
		pan2.add(tf1);
		label2.setBounds(10, 50, 80, 30);
		label2.setBackground(Color.WHITE);
		pan2.add(label2);
		tf2.setBounds(100, 50, 170, 30);
		pan2.add(tf2);
		label3.setBounds(10, 90, 80, 30);
		label3.setBackground(Color.WHITE);
		pan2.add(label3);
		ta.setBounds(100, 90, 170, 100);
		pan2.add(ta);
		btnInsert.setBounds(215, 200, 55, 30);
		pan2.add(btnInsert);

		frm.setLayout(card);
		frm.add(pan1, "list");
		frm.add(pan2, "insert");

		frm.setVisible(true);
	}//makeGui

	void addEvent() {
		BoardMenuEvent event = new BoardMenuEvent(card, frm);
		item1.addActionListener(event);
		item2.addActionListener(event);

		JDBC11BoardListEvent selectEvent = new JDBC11BoardListEvent(list);
		btnSelect.addActionListener(selectEvent);

		JDBC6GuiEvent insertEvent = new JDBC6GuiEvent(tf1, tf2, ta);
		btnInsert.addActionListener(insertEvent);

		frm.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}//windowClosing
		});//frm.addWindowListener
	}//addEvent

	public static void main(String[] args) {

		BoardMenu2 test = new BoardMenu2();
		test.makeGui();
		test.addEvent();

	}//main

}//class 
