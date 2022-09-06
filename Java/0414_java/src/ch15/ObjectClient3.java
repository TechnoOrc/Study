package ch15;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ObjectClient3 {

	public static void main(String[] args) throws UnknownHostException, IOException {

		Socket soc = null;
		OutputStream os = null;
		ObjectOutputStream oos = null;

		ChatObject co = new ChatObject();
		co.setName("Teacher");

		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("채팅 입력(종료는 -1) : ");
			String chat = scan.nextLine();
			if( chat.equals("-1") ) break;

			soc = new Socket("127.0.0.1", 2356);
			os = soc.getOutputStream();
			oos = new ObjectOutputStream(os);

			co.setChat(chat);
			oos.writeObject(co);

			oos.close();
			os.close();
			soc.close();
		}//while

		scan.close();
	}//main

}//class 
