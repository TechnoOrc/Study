package ch14;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * DataInputStream / DataOutputStream
 *  - FilterStream
 *  - data type의 형태로 data를 일거나 쓰는 기능을 제공.
 */
public class IOEx13 {

	public static void main(String[] args) {

		String path = "C:\\Users\\김세민\\eclipse-workspace\\0414_java\\src\\ch14\\javaiotest\\io8.txt";
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		//FileNotFoundException 발생 할 수있음
		try {
			fos = new FileOutputStream(path);
			dos = new DataOutputStream(fos);
			dos.writeByte(127);
			dos.writeShort(30000);
			dos.writeInt(2100000000);
			dos.writeLong(900000000000L);
			dos.writeFloat(3.14F);
			dos.writeDouble(42.195);
			dos.writeBoolean(true);
			dos.writeChar('h');	dos.writeChar(105);
			dos.writeUTF("DataOutputStream Test...");
			//결과물 깨져서나옴 문자를 넣은게아니라 데이터 형식그대로 넣어서 그렇게 나옴(byte, Short, Int, Long, Float, Double...
		} catch(IOException e) {//FileNotFoundException, IOException
			e.printStackTrace();
		} finally {
			try {
				dos.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}//try
		}//finally

	}//main

}//class