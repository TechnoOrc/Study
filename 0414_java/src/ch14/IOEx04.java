package ch14;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 * FileOutputStream
 * 	- NodeStream
 * 	- ByteStream : data를 8bit 출력. // 영문을 입력하여서 파일로 출력했기때문에 8bit
 * 	- 알파벳 문화권의 언어가 아니면 출력 문자가 깨진다.
 */
public class IOEx04 {

	public static void main(String[] args) {

		String path = "C:\\Users\\김세민\\eclipse-workspace\\0414_java\\src\\ch14\\javaiotest\\io3.txt";
		FileOutputStream fos = null;//나중에 new할 것이라는 의미.
		
		try {
			fos = new FileOutputStream(path);// 영문을 입력 
			fos.write(104);// h
			fos.write(105);// i
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}//finally
		
		
	}//main

}//class
