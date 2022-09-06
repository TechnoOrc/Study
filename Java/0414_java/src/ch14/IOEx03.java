package ch14;

import java.io.FileReader;
import java.io.IOException;

/*
 * FileReader
 * 	- NodeStream
 * 	- CharStream : 16bit data 입력 : 비영어권 문자 처리 가능.
 */
public class IOEx03 {

	public static void main(String[] args) {

		//String path = "C:\\Users\\김세민\\eclipse-workspace\\0414_java\\src\\ch14\\javaiotest\\io1.txt";//영어
		String path = "C:\\Users\\techn\\eclipse-workspace\\0414_java\\src\\ch14\\javaiotest\\io2.txt";//한글
		
		FileReader fr = null;//나중에 new할 것이라는 의미.//16bit 불러오기
		try {
			
			fr = new FileReader(path);
			int  frRead = fr.read();
			while(frRead != -1) {
				System.out.print( (char) frRead );
				frRead = fr.read();
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}//finally
		
		
	}//main

}//class
