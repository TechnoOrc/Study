package ch10.ch10test;

import java.awt.Frame;
import java.awt.BorderLayout;
import java.awt.TextField;

import ch10.WindowAdapterObject;

import java.awt.Panel;
import java.awt.GridLayout;
import java.awt.Button;
import java.awt.Color;

public class Ch10Test2Calc {

	public Frame frm;
	public TextField tf;

	public Panel pan;
	public GridLayout grid;
	public Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0;
	public Button btnEqual, btnPlus, btnMinus, btnMulti, btnDivide, btnClear;
	Ch10Test2Event event;

	public Ch10Test2Calc(String str) {
		frm = new Frame(str);
		tf = new TextField();

		pan = new Panel();
		grid = new GridLayout(4,4);//가로 세로 결정
		btnEqual = new Button("=");		btnPlus = new Button("+");
		btnMinus = new Button("-");		btnMulti = new Button("*");
		btnDivide = new Button("/");	btnClear = new Button("Cls");
		btn1 = new Button("1");		btn2 = new Button("2");
		btn3 = new Button("3");		btn4 = new Button("4");
		btn5 = new Button("5");		btn6 = new Button("6");
		btn7 = new Button("7");		btn8 = new Button("8");
		btn9 = new Button("9");		btn0 = new Button("0");
		event = new Ch10Test2Event(tf);
	}

	public void makeGUI() {
		frm.setSize(500, 500);
		frm.setVisible(true);

		frm.add(tf, BorderLayout.NORTH);
		frm.add(pan, BorderLayout.CENTER);

		pan.setLayout(grid);
		pan.add(btn7);		pan.add(btn8);
		pan.add(btn9);		pan.add(btnDivide);

		pan.add(btn4);		pan.add(btn5);
		pan.add(btn6);		pan.add(btnMulti);

		pan.add(btn1);		pan.add(btn2);
		pan.add(btn3);		pan.add(btnMinus);

		pan.add(btnClear);		pan.add(btn0);
		pan.add(btnEqual);		pan.add(btnPlus);

		addEvent();
	}//makeGUI

	public void addEvent() {
		frm.addWindowListener(new WindowAdapterObject());// 종료진행하는 부분///// 제발 확인하자

		btnEqual.addActionListener(event);		btnPlus.addActionListener(event);
		btnMinus.addActionListener(event);		btnMulti.addActionListener(event);
		btnDivide.addActionListener(event);		btnClear.addActionListener(event);
		btn1.addActionListener(event);			btn2.addActionListener(event);
		btn3.addActionListener(event);			btn4.addActionListener(event);
		btn5.addActionListener(event);			btn6.addActionListener(event);
		btn7.addActionListener(event);			btn8.addActionListener(event);
		btn9.addActionListener(event);			btn0.addActionListener(event);
	}//addEvent

}//class








