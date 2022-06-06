package ch10;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Event3MouseEvent implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent e) {//skip 되는 경우가 많아 잘 사용하지 않음
		System.out.println("==========> clicked");		
		
		
	}

	@Override
	public void mousePressed(MouseEvent e) {// 마우스 버튼을 누를 때 
		System.out.println("1. pressed");		
	}

	@Override
	public void mouseReleased(MouseEvent e) {//마우스 버튼을 눌렀다가 땔 때 
		System.out.println("2. mouseReleased");		
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {

		//System.out.println("프레임의 안으로 마우스 커서가 들어 왔습니다.");
		
	}

	@Override
	public void mouseExited(MouseEvent e) {// 마우스가 특정 영역에서 나갔을 때 
		//System.out.println("프레임의 밖으로 마우스 커서가 나갔습니다.");
		
	}

	
	
}
