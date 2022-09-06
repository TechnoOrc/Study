package ch10;

import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Event8DialogEvent implements ActionListener{

	Dialog dialog;
	Event8DialogEvent(Dialog d){
		this.dialog = d;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String cmd = e.getActionCommand();
		
		if(cmd.equals("Exit")) {
			dialog.setVisible(true);
		} else if (cmd.equals(" O K ")) {
			System.exit(0);
		}
		
	}//actionPerformed
	

}//class
