package ch10;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * Window Event : 컴의 그래픽 환경에서 유저의 모든 활동
 * WindowAdapter : 윈도우 창에서 일어나는 유저의 모든 활동을 담당한다
 */
public class WindowAdapterObject extends WindowAdapter {

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("windowClosing");
		System.exit(0);
	}//windowClosing

}//class


		
		

