package ch10;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListenerObject implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());
		//e.getActionCommand() : 버튼의 텍스트를 읽어 온다 : 대소문자 구분
		String command = e.getActionCommand();
		if(command.equals("Cls")) {
			System.out.println("화면 클리어");
		} else if(command.equals("=")) {
			System.out.println("두 번째 입력 수를 sNum에 저장하고, 기호에 따라 계산을 수행");
		} else if(command.equals("+") || command.equals("-")
				|| command.equals("*") || command.equals("/")) {
			System.out.println("첫 번째 입력 수를 fNum에 저장하고, 기호는 giho에 저장");
		}
	}//actionPerformed

}//class