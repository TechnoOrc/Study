package ch09;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

import ch10.WindowAdapterObject;

public class AWT2Panel {//
	
	public Frame frm;
	public Panel p1;
	WindowAdapterObject winx;
	
	public AWT2Panel(String str) {
		frm = new Frame(str);
		p1 = new Panel();
		winx = new WindowAdapterObject();
		
	}
	
	public void makeGUI() {
		frm.setSize(500,500);
		frm.setBackground(Color.PINK);
		frm.setVisible(true);
		frm.addWindowListener(winx);
		p1.setBackground(Color.GRAY);
		frm.add(p1);
	
	}

	public static void main(String[] args) {
	
		AWT2Panel test = new AWT2Panel("First Window");
		test.makeGUI();
	}//main
	
}//class
