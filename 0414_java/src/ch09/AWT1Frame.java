package ch09;

import java.awt.Color;
/*
 * AWT : Abstract Window ToolKit : 윈도우 화면을 만드는 도구 상자.
 * 	- container : 다른 객체를 담는 일종의 그림판 (Frame, Panel)
 * 	- layout : 그림판 위에 객체의 위치를 정해주는 개념
 * 	- components : 그림판 위에 올라가는 객체들(Button, CheckBox 등)
 *  - menu : 메뉴 : MenuBar, Menu, MenuItem
 *  
 */
/*
 * Frame의 주의 사항 (가장 바깥쪽 테두리)
 *  - 반드시 setVisiable(true);
 *  - Frame은 두 개이상 같이 사용 안됨
 *  - add()를 통해 다른 component를 붙일 수 있음
 */
import java.awt.Frame;

import ch10.WindowAdapterObject;

public class AWT1Frame {//
	
	public Frame frm;
	WindowAdapterObject winx;
	
	
	public AWT1Frame(String str) {
		frm = new Frame(str);
		winx = new WindowAdapterObject();
		
	}
	
	public void makeGUI() {
		frm.setSize(500,500);
		frm.setBackground(Color.pink);
		frm.setVisible(true);
		frm.addWindowListener(winx);
	}

	public static void main(String[] args) {
	
		AWT1Frame test = new AWT1Frame("First Window");
		test.makeGUI();
	}//main
	
}//class
