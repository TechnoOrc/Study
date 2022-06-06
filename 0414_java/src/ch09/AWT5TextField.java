package ch09;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.TextField;

import ch10.WindowAdapterObject;

public class AWT5TextField {//
	
	public Frame frm;
	public TextField tf;
	WindowAdapterObject winx;
	
	
	public AWT5TextField(String str) {
		frm = new Frame(str);
		tf = new TextField("최초의 문자열 셋팅");
		winx = new WindowAdapterObject();
		
	}
	
	public void makeGUI() {
		frm.setSize(500,500);
		frm.setBackground(Color.pink);
		frm.setVisible(true);
		
		frm.add(tf,BorderLayout.NORTH);
		
		frm.addWindowListener(winx);
	}

	public static void main(String[] args) {
	
		AWT5TextField test = new AWT5TextField("First Window");
		test.makeGUI();
	}//main
	
}//class
