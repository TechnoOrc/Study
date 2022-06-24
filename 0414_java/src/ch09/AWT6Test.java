package ch09;

import java.awt.Frame;
import java.awt.TextField;

import ch10.WindowAdapterObject;

import java.awt.Panel;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Button;

//AWT4Grid + AWT5TextField
public class AWT6Test {//
	
	public Frame frm;
	public TextField tf;
	WindowAdapterObject winx;
	
	
	public Panel pan;
		public GridLayout grid;
	public Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0;
	public Button btnEqual, btnPlus, btnMinus, btnMulti, btnDivide, btnClear;
	
	public AWT6Test(String str) {
		frm = new Frame(str);
		tf = new TextField("최초의 문자열 셋팅");
		
		pan = new Panel();
		grid = new GridLayout(4,4);//가로 세로 결정
		btnEqual = new Button("=");		btnPlus = new Button("+");
		btnMinus = new Button("-");		btnMulti = new Button("*");
		btnDivide = new Button("/");	btnClear = new Button("Cls");
		btn1 = new Button("1");
		btn2 = new Button("2");
		btn3 = new Button("3");
		btn4 = new Button("4");
		btn5 = new Button("5");
		btn6 = new Button("6");
		btn7 = new Button("7");
		btn8 = new Button("8");
		btn9 = new Button("9");
		btn0 = new Button("0");
		
		winx = new WindowAdapterObject();
		
		
	}
	
	public void makeGUI() {
		frm.setSize(500,500);
		frm.setVisible(true);
		
		frm.add(tf,BorderLayout.NORTH);
		frm.add(pan,BorderLayout.CENTER);
		
		pan.setLayout(grid);
		pan.add(btn7);		pan.add(btn8);
		pan.add(btn9);		pan.add(btnDivide);
		
		pan.add(btn4);		pan.add(btn5);
		pan.add(btn6);		pan.add(btnMulti);
		
		pan.add(btn1);		pan.add(btn2);
		pan.add(btn3);		pan.add(btnMinus);
		
		pan.add(btnClear);		pan.add(btn0);
		pan.add(btnEqual);		pan.add(btnPlus);
		
		
		frm.addWindowListener(winx);
	}//makeGUI

	public static void main(String[] args) {
	
		AWT6Test test = new AWT6Test("First Window");
		test.makeGUI();
	}//main
	
}//class
