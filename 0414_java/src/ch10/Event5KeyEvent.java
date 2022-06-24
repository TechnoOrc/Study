package ch10;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Event5KeyEvent implements KeyListener{

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("keyTyped!!!!!!!!!!!!!!!!!!");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("keyPressed");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("==========> keyReleased");// 오작동 방지를 위해 keyTyped 명령 추가.
		System.out.println(e.getKeyCode());// 중요!!! 문자를 ascii코드 숫자로 a->65 enter ->10
		//System.out.println(e.getKeyChar());
	}

}//class
