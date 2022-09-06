package ch14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * Package java.io.*; -> IO -> Input / Output
 * Input / Output + Stream : data가 물처럼 흘러 간다는 의미.
 * 	- Input / Output은 상대적인 개념. 매우 중요하다!!!
 * 	- Stream : data의 흐름을 의미.
 * 	- Input Stream : 현재 코드로 data가 들어온다.
 * 	- Output Stream : 현재 코드에서 data가 나간다.
 * 
 * Byte Stream 
 * 	- data의 입출력 단위가 8bit.
 * 	- 이름이 ~InputStream, ~OutputStream
 * Char Stream
 * 	- data의 입출력 단위가 16bit.
 * 	- 이름이 ~Reader, ~Writer
 * 
 * Node Stream
 *	- data source와 data destination을 연결하는 개념.
 *	- FileInputStream, FileOutputStream, FileReader, FileWriter
 * Filter Stream
 * 	- data의 가공이나, 특수 기능 제공을 목적으로 하는 Stream의 개념
 * 	- InputStreamReader, OutputStreamWriter
 * 	- Node Stream이 없이 독립적으로 존재 할 수 없다.
 * 
 * 주의!!! 반드시 close 헤야 한다.!!!
 * 	- close는 입출력 객체를 메모리에서 삭제 요청하는 행위.
 * 	- close를 하지 않으면, 메모리에 사용하지 않는 입출력 객체가 누적된다.
 */
public class IOEx01 {

	public static void main(String[] args) {
		String path = "C:\\Users\\김세민\\eclipse-workspace\\0414_java\\src\\ch14\\javaiotest\\io1.txt";
		FileInputStream fis = null;//file이 없을 경우도 같이 설정(try catch)해줘야 에러가 없다.
		try {
			
			fis = new FileInputStream(path);
			
			int fisRead = fis.read();//같이 설정(try catch)해줘야 에러가 없다.
//			System.out.println("fisRead : " + fisRead);
//			System.out.println("(char) fisRead : " + (char) fisRead);
//			
//			fisRead = fis.read();
//			System.out.println("fisRead : " + fisRead);
//			System.out.println("(char) fisRead : " + (char) fisRead);
			
			while(fisRead != -1) {//-1 : EOF (End Of File :  EOFException도 있다.)
				System.out.print((char) fisRead);
				fisRead = fis.read();				
				
			}//while
			
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();//같이 설정(try catch)해줘야 에러가 없다.
			} catch (IOException e) {
				e.printStackTrace();
			}
		}//finally
		
	}//main

}//class
