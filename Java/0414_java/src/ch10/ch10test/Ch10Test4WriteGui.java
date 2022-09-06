package ch10.ch10test;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;

import ch10.WindowAdapterObject;

public class Ch10Test4WriteGui {//그림만 만든다.

	Frame frm;
	Label la1, la2, la3;
	TextField tfd1, tfd2;
	TextArea ta;
	Button btn;
	Ch10Test4WriteEvent event;
	

	public Ch10Test4WriteGui() {
		frm = new Frame("글 등록");		la1 = new Label("Title");
		la2 = new Label("Writer");		la3 = new Label("Contents");
		tfd1 = new TextField();			tfd2 = new TextField();
		ta = new TextArea(5, 100);		btn = new Button("SAVE");
		event = new Ch10Test4WriteEvent(tfd1, tfd2,ta);
	}//constructor

	public void makeGui() {
		frm.setLayout(null);
		frm.setSize(275, 285);
		frm.setVisible(true);

		la1.setBounds(10, 35, 50, 30);		frm.add(la1);
		tfd1.setBounds(65, 35, 200, 30);	frm.add(tfd1);
		la2.setBounds(10, 70, 50, 30);		frm.add(la2);
		tfd2.setBounds(65, 70, 200, 30);	frm.add(tfd2);
		la3.setBounds(10, 105, 50, 30);		frm.add(la3);
		ta.setBounds(10, 140, 255, 100);	frm.add(ta);
		btn.setBounds(215, 245, 50, 30);	frm.add(btn);

		frm.setBackground(Color.PINK);
		setEvent();
	}//makeGui

	public void setEvent() {
		frm.addWindowListener(new WindowAdapterObject());
		btn.addActionListener(event);
		
	}//setEvent

}//class 
