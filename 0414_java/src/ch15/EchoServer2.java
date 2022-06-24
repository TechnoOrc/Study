package ch15;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer2 {

	public static void main(String[] args) throws IOException {

		System.out.println("Server Start...");
		ServerSocket ss = new ServerSocket(8765);
		Socket soc = null;
		InputStream is = null;//유저의 데이터를 받는다.
		DataInputStream dis = null;
		OutputStream os = null;//유저에게 데이터를 돌려 보낸다.
		DataOutputStream dos = null;
		String str = "";
		
		while(true) {
			soc = ss.accept();
			is = soc.getInputStream();
			dis = new DataInputStream(is);
			os = soc.getOutputStream();
			dos = new DataOutputStream(os);
			str = soc.getRemoteSocketAddress().toString();
			str = str + " : " + dis.readUTF();
			dos.writeUTF(str.toString());
			System.out.println();
			
			dos.close();
			os.close();
			dis.close();
			is.close();
			soc.close();
		}//while
		
	}//main

}//class
