package ch052;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ch052Ex19 {

	public static void main(String[] args) {

		Frame frm = new Frame("Anonymous Inner Class");//프레임 생성 및 제목 글 설정
		 frm.setSize(500,500);
		 frm.setBackground(Color.PINK);//컬러지정
		 frm.setVisible(true);
		 //Anonymous Inner Class
		 frm.addWindowListener(//frm.addWindowListener : frm에 윈도우 이벤트를 감지하는 센서를 추가해라.
				 new WindowAdapter() {//WindowAdapter : 윈도우 창에서 일어나는 유저의 모든 활동을 담당한다
					                  //클래스 로드부터 모든것을 생략 다른 윈도우 클로징과 비교할것
					@Override
					public void windowClosing(WindowEvent e) {// WindowAdapter(){ 여기 사이에서 컨트롤 엔터 windows closing 선택}
						System.exit(0);
					}//windowClosing
				 }//WindowAdapter
		);//frm.addWindowListener
		 
	}//main

}//class
