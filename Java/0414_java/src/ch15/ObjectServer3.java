package ch15;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ObjectServer3 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		System.out.println("Server Start...");
		ServerSocket ss = new ServerSocket(2356);
		Socket soc = null;
		InputStream is = null;
		ObjectInputStream ois = null;

		while(true){
			soc = ss.accept();
			is = soc.getInputStream();
			ois = new ObjectInputStream(is);

			ChatObject co = (ChatObject) ois.readObject();
			System.out.println(co.getName() + " : " + co.getChat());

			ois.close();
			is.close();
			soc.close();
		}//while

	}//main

}//class 
