package ch09;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;

import ch10.WindowAdapterObject;

/*
 * BorderLayout
 * 	- 컴포턴트를 중앙 북 남 서 동 으로 배치
 * 	- Frame은 BorderLayout default layout : 기본 적용 되어 있음
 * 	- 주의!!! 북 남 서 동 중에서 없는 부분은 중앙이 침범
 */

public class AWT3Border {
	
	public Frame frm;
	public Button btn1, btn2, btn3, btn4, btn5;
	public BorderLayout border;
	WindowAdapterObject winx;
	
	
	public AWT3Border() {
		frm = new Frame("제목 오는 곳");
		btn1 = new Button("1");
		btn2 = new Button("2");
		btn3 = new Button("3");
		btn4 = new Button("4");
		btn5 = new Button("5");
		border = new BorderLayout();
		winx = new WindowAdapterObject();
		
	}
	
	public void makeGui() {
		frm.setSize(500,500);
		frm.setBackground(Color.pink);
		frm.setVisible(true);
		
		frm.setLayout(border);
		frm.add(btn1,BorderLayout.CENTER);
		frm.add(btn2,BorderLayout.NORTH);
		frm.add(btn3,BorderLayout.SOUTH);
		frm.add(btn4,BorderLayout.WEST);
		frm.add(btn5,BorderLayout.EAST);
		frm.addWindowListener(winx);
		
		
	}//makeGui
	
	public static void main(String[] args) {

		AWT3Border test = new AWT3Border();
		test.makeGui();
		
		
	}//main

}//class
