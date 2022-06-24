package ch10;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Event6ItemEvent implements ItemListener{

	@Override
	public void itemStateChanged(ItemEvent e) {

		System.out.println(e.getItem());
		System.out.println(e.getStateChange());
		// 해당 이벤트는 누른 버튼의 이름 뿐만아니라 누름버튼의 선택여부를 1: 선택, 2: 선택해제
		
		
		
	}

}//class
