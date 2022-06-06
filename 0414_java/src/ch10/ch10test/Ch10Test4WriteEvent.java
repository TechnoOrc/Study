package ch10.ch10test;

import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

//저장 버튼이 클릭되면, ftd1, tfd2, ta에서 데이터를 가져와서 저장한다.
public class Ch10Test4WriteEvent implements ActionListener{

	//ArrayList로 저장객체를 만들었음. 저장 단위는BoardObj
	ArrayList<BoardObj> list = new ArrayList<BoardObj>();//BoardObj에서 입력데이터 타입만 차용함
	TextField field1, field2;
	TextArea area;
	
	public Ch10Test4WriteEvent(){}
	public Ch10Test4WriteEvent(TextField tf1, TextField tf2, TextArea ta){
		this.field1 = tf1;
		this.field2 = tf2;
		this.area = ta;
		
	}//Ch10Test4WriteEvent
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if(cmd.equals("SAVE")) {
			BoardObj obj = new BoardObj(field1.getText(), field2.getText(), area.getText());
			
			list.add(obj);//ArrayList<BoardObj>에 현재 값을 저장
			field1.setText("");//TextField tf1 공백으로 비우기
			field2.setText("");//TextField tf2 공백으로 비우기
			area.setText("");//TextArea ta 공백으로 비우기
			System.out.println(list);//list를 찍으면 list 내부의 객체의 toString을 자동 호출한다 생성자와 상관없이 실행
			/*
			 	ArrayList list = new ArrayList();
				list.add("data1");//.add 값을 입력
				list.add("data1");//.add 값을 입력
				list.add(777);
				list.add(777);
				System.out.println(list);
				ArrayList list는 Object 타입이다. 
				Object 타입은 출력할때 toString()메소드를 이용하여 출력하는데
				그 toString()를 내가 원하는 타입으로 재정의 하면 원하는 모양으로 출력이 가능하다.
				평소에는 toString()메소드 자동으로 실행되며 눈에 보이지 않는다.
				Ch07Ex01, Ch07Ex07 참조 
			 */
			
			
			
		}
	}//actionPerformed
	
}//class
