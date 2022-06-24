package ch10;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Event4WindowEvent implements WindowListener{

	@Override
	public void windowOpened(WindowEvent e) {// 
		System.out.println("창이 시작 되었다는 의미.");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("창을 지금 종료 한다는 의미.");
		System.exit(0);//시스템 종료
		
	}

	@Override
	public void windowClosed(WindowEvent e) {// 창 종료시에는 실행되지 않음 의미 없음
		System.out.println("창을 지금 종료 되었다는 의미.");
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("창을 최소화 했다는 의미.");
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("창을 최소화를 취소 했다는 의미.");
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("사용자가 내 창을 클릭 했다는 의미.");
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("사용자가 다른 창을 클릭 했다는 의미.");
		
	}

	
	
}//class
