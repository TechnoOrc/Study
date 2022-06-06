package ch15;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class SimpleClient1Re {

	public static void main(String[] args) throws UnknownHostException, IOException {

		//Socket soc = new Socket("ip address",ip port);
		Socket soc = new Socket("127.0.0.1",9876);
		InputStream is = soc.getInputStream();
		DataInputStream dis = new DataInputStream(is);
		System.out.println(dis.readUTF());
		
		
		dis.close();
		is.close();
		soc.close();
		
		
	}//main

}//class
