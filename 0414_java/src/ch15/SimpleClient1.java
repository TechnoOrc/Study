package ch15;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class SimpleClient1 {

	public static void main(String[] args) throws IOException{

		Socket soc = new Socket("127.0.0.1",5432);// 교수님 PC의 IP주소 적용시에 Server에서 설정한 텍스트로 출력됨
		InputStream is = soc.getInputStream();//Socket이 가진 기본 연결 기능을 가져 오는 표현.
		DataInputStream dis = new DataInputStream(is);
		String str = dis.readUTF();
		System.out.println(str);
		dis.close();
		is.close();
		
	}//main

}//class
