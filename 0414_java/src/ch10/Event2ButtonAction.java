package ch10;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;

public class Event2ButtonAction {

	Frame frm;
	Button btnPlus, btnMinus, btnMulti, btnDivide, btnEqual, btnClear;
	ActionListenerObject obj;
	WindowAdapterObject closeObj;

	public Event2ButtonAction() {
		frm = new Frame("button action test");
		btnPlus = new Button("+");
		btnMinus = new Button("-");
		btnMulti = new Button("*");
		btnDivide = new Button("/");
		btnEqual = new Button("=");
		btnClear = new Button("Cls");
		obj = new ActionListenerObject();
		closeObj = new WindowAdapterObject();
	}//constructor

	public void makeGui() {
		frm.setSize(500, 500);
		frm.setBackground(Color.PINK);
		frm.setVisible(true);

		frm.setLayout(null);
		frm.add(btnPlus);	frm.add(btnMinus);	frm.add(btnMulti);
		frm.add(btnDivide);	frm.add(btnEqual);	frm.add(btnClear);
		btnPlus.setBounds(10, 35, 100, 50);
		btnMinus.setBounds(115, 35, 100, 50);
		btnMulti.setBounds(220, 35, 100, 50);
		btnDivide.setBounds(10, 90, 100, 50);
		btnEqual.setBounds(115, 90, 100, 50);
		btnClear.setBounds(220, 90, 100, 50);

		btnPlus.addActionListener(obj);
		btnMinus.addActionListener(obj);
		btnMulti.addActionListener(obj);
		btnDivide.addActionListener(obj);
		btnEqual.addActionListener(obj);
		btnClear.addActionListener(obj);
		//JRE에게 명령
		// -> btnClear 감시하라. + 유저의 액션이 발생하면 obj의 메소드를 실행 시켜라.

		frm.addWindowListener(closeObj);
	}//makeGui

	public static void main(String[] args) {
		Event2ButtonAction test = new Event2ButtonAction();
		test.makeGui();
	}//main

}//class 
