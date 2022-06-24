package ch10;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class Event3MouseMotionEvent implements MouseMotionListener, MouseWheelListener{

	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
		System.out.println("마우스 휠이 굴러 가네요.");
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("dragged : " + e.getX() + " : " + e.getY());
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		//System.out.println("Moved : " + e.getX() + " : " + e.getY());
	}


}//Event3MouseMotionEvent
