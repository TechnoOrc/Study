package ch10;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.List;


public class Event7ListEvent implements ItemListener{
	
	List list;
	
	
	Event7ListEvent(List list){
		this.list = list;
	}
	

	@Override
	public void itemStateChanged(ItemEvent e) {
		System.out.println(e.getItem());//.add된 객체의 위치값을 리턴함 0,1,2 
		//System.out.println((e.getItem().toString()));
		int idx = Integer.parseInt(e.getItem().toString());
		//e.getItem()는 Object 타입이고 e.getItem()에서 리턴한 숫자를 idx에 넣음

		System.out.println(list.getItem(idx));
		//list.getItem(번지) 해당 리스의 번지 값을 의미하며 출력한다.
	}

	
	
	
}//Event7ListEvent
