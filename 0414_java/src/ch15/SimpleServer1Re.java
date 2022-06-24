package ch15;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * Server : 서비스를 제공하는 객체.
 * Client : 서비스를 요청하는 객체.
 */
public class SimpleServer1Re {

	public static void main(String[] args) throws IOException{
		//ServerSocket : 연결 요청을 받는 역할만 하는 객체. : 문지기
		ServerSocket ss = new ServerSocket(9876);
		//Socket : 실제 데이터 통신//연결 확립 : 서버와 클라이언트가 서로의 IP address, Port를 알고있다.
		
		while(true) {
			
			Socket s = ss.accept();
			OutputStream os = s.getOutputStream();//문자하나씩 출력
			DataOutputStream dos = new DataOutputStream(os);//문자열로 출력가능 
			
			dos.writeUTF("second server test...");
			
			dos.close();
			os.close();
			s.close();//Socket 연결 끊기
		}//while 반복문에 넣지앟으면 1회성으로 서버가 종료된다.
		
	}//main

}//class
