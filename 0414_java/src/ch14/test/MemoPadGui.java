package ch14.test;

import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;

public class MemoPadGui {
	
	Frame frm;
	MenuBar bar;
	Menu menu;
	MenuItem item1, item2, item3;
	TextArea area;
	FileDialog open, save;
	MemoPadEvent event;
	
	
	
	
	MemoPadGui(){
		frm = new Frame("MemoPad");//bar를 여기에 붙임
		bar = new MenuBar();//menu를 여기에 붙임
		menu = new Menu("File");//item을 여기에 붙임
		item1 = new MenuItem("Open");
		item2 = new MenuItem("Save");
		item3 = new MenuItem("Exit");
		area = new TextArea();
		open = new FileDialog(frm,"File Open",FileDialog.LOAD);
		save = new FileDialog(frm,"File Save",FileDialog.SAVE);
		event = new MemoPadEvent(open,save,area);
		
	}//생성자
	
	
	public void makeGui() {
		frm.setSize(300,300);
		frm.setVisible(true);
		frm.add(area);
		frm.setMenuBar(bar);
		bar.add(menu);
		menu.add(item1);
		menu.add(item2);
		menu.add(item3);
		
		
		
	}//makeGui
	
	
	public void addEvent() {
		frm.addWindowListener(event);
		item1.addActionListener(event);
		item2.addActionListener(event);
		item3.addActionListener(event);
		
		
	
		
		
	}//addEvent
	
}//class
