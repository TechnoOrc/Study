package ch09;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;

import ch10.WindowAdapterObject;

/*
 * GridLayout
 *  - 컴포넌트를 엑셀 표처럼 배치
 *  - 주의!!! 좌에서 우로, 위에서 아래로.
 */
public class AWT4Grid {

	public Frame frm;
	public Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0;
	public Button btnEqual, btnPlus, btnMinus, btnMulti, btnDivide, btnClear;
	public GridLayout grid;
	public WindowAdapterObject winx;
	
	
	
	
	public AWT4Grid() {
		frm = new Frame("제목 오는 곳");
		grid = new GridLayout(4,4);//가로 세로 결정
		btnEqual = new Button("=");
		btnPlus = new Button("+");
		btnMinus = new Button("-");
		btnMulti = new Button("*");
		btnDivide = new Button("/");
		btnClear = new Button("Cls");
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

	public void makeGui() {
		frm.setSize(500, 500);
		frm.setBackground(Color.PINK);
		frm.setVisible(true);

		frm.setLayout(grid);

		frm.add(btn7);
		frm.add(btn8);
		frm.add(btn9);
		frm.add(btnDivide);

		frm.add(btn4);
		frm.add(btn5);
		frm.add(btn6);
		frm.add(btnMulti);

		frm.add(btn1);
		frm.add(btn2);
		frm.add(btn3);
		frm.add(btnMinus);

		frm.add(btnClear);
		frm.add(btn0);
		frm.add(btnEqual);
		frm.add(btnPlus);
		
		frm.addWindowListener(winx);
		//frm.addWindowListener : frm에 윈도우 이벤트를 감지하는 센서를 추가해라.
		//addWindowListener(closeObj) : 윈도우 이벤트를 처리하는 로직은 closeObj에 있다.
		//JRE에게 명령 : frm을 감시하다가, 이벤트가 발생하면, closeObj의 담당 메소드로 전달해라.
		//우리는 이벤트가 발생하면 수행하는 절차만 정의 -> closeObj(WindowAdapterObject).
		//실제로 이벤트가 발생하면 closeObj(WindowAdapterObject)의 메소드를 호출하는 것은 JRE.
		
		
		
	}//makeGui

	public static void main(String[] args) {
		AWT4Grid test = new AWT4Grid();
		test.makeGui();
		
		
		
	}//main
	
	



}//class