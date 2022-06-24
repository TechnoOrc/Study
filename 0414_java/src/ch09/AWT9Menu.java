package ch09;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class AWT9Menu {
	
	Frame frm;
	MenuBar menuBar;
	Menu menu;
	MenuItem menuItem1, menuItem2, menuItem3;
	
	AWT9Menu(){
		
		frm = new Frame("메뉴");
		menuBar = new MenuBar();
		menu = new Menu("Home");
		menuItem1 = new MenuItem("Open");
		menuItem2 = new MenuItem("Save");
		menuItem3 = new MenuItem("Exit");
		
		
	}//AWT9Menu()
	
	public void makeGui() {
		frm.setSize(300,300);
		frm.setVisible(true);
		
		frm.setMenuBar(menuBar);//연쇄적인 메뉴 구성들...
		menuBar.add(menu); //중요함
		menu.add(menuItem1);
		menu.add(menuItem2);
		menu.addSeparator();// 메뉴에 문자 ----- 삽입?
		menu.add(menuItem3);
		
		
	}//makeGui
	
	
	

	public static void main(String[] args) {
	
		AWT9Menu test = new AWT9Menu();
		test.makeGui();
		
		
	}//main

}//AWT9Menu
