package ch14;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
 * FileOutputStream
 * 	- NodeStream
 * 	- ByteStream : data를 8bit 출력. // 영문을 입력하여서 파일로 출력했기때문에 8bit
 * 	- 알파벳 문화권의 언어가 아니면 출력 문자가 깨진다.
 * 
 * OutputStreamWriter
 * 	- FilterStream : data 가공 및 변환.
 * 	- data의 8bit 출력을 16bit로 변환. //알파펫을 다른 언어(한글)로~
 * 	- 문자열을 한번에 출력 할 수 있다.
 */

public class IOEx06 {

	public static void main(String[] args) {

		String path = "C:\\Users\\김세민\\eclipse-workspace\\0414_java\\src\\ch14\\javaiotest\\io5.txt";
		FileOutputStream fos = null;
		OutputStreamWriter  osw = null;
		
		try {
			fos = new FileOutputStream(path);
			osw = new OutputStreamWriter(fos);
			
			osw.write(" my name is james\n");
			osw.write(" 제 이름은 개인정보 입니다.");
					
					
		}catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				osw.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}//finally
		
		
		
		
	}//main

}//class
