package ch17;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;

import ch10.WindowAdapterObject;

public class JDBC6GuiInsert {

	Frame frm;
	Label la1, la2, la3;
	TextField tf1, tf2;
	TextArea ta;
	Button btn;

	JDBC6GuiInsert(){
		frm = new Frame("게시글 입력");
		la1 = new Label("TITLE");
		la2 = new Label("WRITER");
		la3 = new Label("CONTENTS");
		tf1 = new TextField();
		tf2 = new TextField();
		ta = new TextArea();
		btn = new Button("SAVE");
	}

	void makeGui(){
		frm.setSize(300, 300);
		frm.setVisible(true);
		frm.setLayout(null);

		la1.setBounds(10, 50, 70, 30);
		frm.add(la1);

		la2.setBounds(10, 90, 70, 30);
		frm.add(la2);

		la3.setBounds(10, 130, 70, 30);
		frm.add(la3);

		tf1.setBounds(90, 50, 190, 30);
		frm.add(tf1);

		tf2.setBounds(90, 90, 190, 30);
		frm.add(tf2);

		ta.setBounds(90, 130, 190, 120);
		frm.add(ta);

		btn.setBounds(240, 260, 50, 30);
		frm.add(btn);

		frm.setBackground(Color.PINK);
	}//makeGui
	
	void addEvent() {
		JDBC6GuiEvent event = new JDBC6GuiEvent(tf1, tf2,ta);
		btn.addActionListener(event);
		frm.addWindowListener(new WindowAdapterObject());
		
		
	}//addEvent
	
	
	
	public static void main(String[] args) {

		JDBC6GuiInsert test = new JDBC6GuiInsert();
		test.makeGui();
		test.addEvent();

	}//main

}//class 
