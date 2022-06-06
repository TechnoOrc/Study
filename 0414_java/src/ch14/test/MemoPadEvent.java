package ch14.test;

import java.awt.FileDialog;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import ch10.WindowAdapterObject;

public class MemoPadEvent extends WindowAdapter implements ActionListener {
	
	FileDialog fileDialog4Open, fileDialog4Save;
	TextArea text;
	
	MemoPadEvent(FileDialog fd1, FileDialog fd2, TextArea ta){
		fileDialog4Open = fd1;
		fileDialog4Save = fd2;
		text = ta;
		
	}//생성자
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String cmd = e.getActionCommand();
		if(cmd.equals("Save")) {
			fileDialog4Save.setVisible(true);
			File path  = null;
			
			try {
				path = fileDialog4Save.getFiles()[0];
				//fileDialog는 파일 전체창을 말하며,.getFiles는 전체를 모두 가저오는것 
				//그러나 [0]번지는 내가 선택한 것이 0번지로 지정됨 
				// 저장하려고 선택한 파일명을 말한다(경로포함), 0번지는 내가 선택한것인데 1번지가 사용되려면 2개이상
				//0번지 1번지 복수선택이 되어야 한다.
			}catch (ArrayIndexOutOfBoundsException ae) {
				System.out.println("파일 선택을 취소 하셨습니다.");
				return;
			}
			
			PrintWriter pw = null;
			try {
				pw = new PrintWriter(path);
				pw.println(text.getText());
			}catch (Exception ioe) {
				ioe.printStackTrace();
			} finally {
				pw.close();
			}//finally
		}//if (cmd.equals("Save"))
		else if(cmd.equals("Open")) {
			fileDialog4Open.setVisible(true);
			File openPath = null;
			
			try {
			openPath = fileDialog4Open.getFiles()[0];//선택한 파일을 말한다(경로포함)
			} catch (ArrayIndexOutOfBoundsException ae) {
				System.out.println("파일 선택을 취소 하셨습니다.");
				return;
			}//try
			
			FileReader fr = null;
			BufferedReader br = null;
			try {		
				fr = new FileReader(openPath);
				br = new BufferedReader(fr);
				StringBuilder sb = new StringBuilder("");
				String readLine = br.readLine();
				while(readLine != null) {
					sb.append(readLine + "\n");
					readLine = br.readLine();
				}//while
				text.setText(sb.toString());
			
			} catch (IOException ioe) {
				ioe.printStackTrace();
			} finally {
				try {
					br.close();
					fr.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}//finally
			
			
		}//else if(cmd.equals("Save"))
		else if(cmd.equals("Exit")) {
			System.exit(0);
		}//else if(cmd.equals("Exit"))
		
	}//actionPerformed
	
	
	
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
		
	}//windowClosing
	
	
}//class
