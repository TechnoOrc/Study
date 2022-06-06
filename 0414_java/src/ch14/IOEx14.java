package ch14;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * DataInputStream / DataOutputStream
 * - FilterStream
 * - data type의 형태로 data를 읽거나 쓰는 기능을 제공
 */
public class IOEx14 {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\김세민\\eclipse-workspace\\0414_java\\src\\ch14\\javaiotest\\io8.txt";
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try {
			fis = new FileInputStream(path);
			dis = new DataInputStream(fis);
			
			System.out.println(dis.readByte());
			System.out.println(dis.readShort());
			System.out.println(dis.readInt());
			System.out.println(dis.readLong());
			System.out.println(dis.readFloat());
			System.out.println(dis.readDouble());
			System.out.println(dis.readBoolean());
			System.out.println(dis.readChar());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
			
		} catch(IOException e) {//FileNotFoundException, IOException
			e.printStackTrace();
		} finally {
			try {
				dis.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}//try
		}//finally

		
	}//main

}//class
