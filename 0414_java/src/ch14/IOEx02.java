package ch14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * FileInputStream
 * 	- Node Stream
 * 	- 파일을 연결해서 읽어오는 Stream.
 * 	- 8bit 입력
 * 	- 비영어권 문자가 깨지는 단점.
 * InputStreamReader
 * 	- Filter Stream
 * 	- data 변환기능
 * 	- 8bit 입력을 16비트로 전환.
 * 
 * FileInputStream을 InputStreamReader로 filtering하면 비영어권 문자 입력 가능.
 * FileInputStream과 InputStreamReader는 한 세트!!!
 * 주의!!! close는 생성의 역순 : 나중에 생성한 Stream을 먼저 close한다!!!
 */
public class IOEx02 {

	public static void main(String[] args) {
		String path = "C:\\Users\\김세민\\eclipse-workspace\\0414_java\\src\\ch14\\javaiotest\\io1.txt";
		FileInputStream fis = null; // 파일가져오기 8bit로 //
		InputStreamReader isr = null;// 가공 16bit로 
		
		try {
			fis = new FileInputStream(path);// 파일이 없는 경우의 exception 처리해줘야한다.
			isr = new InputStreamReader(fis); // 혼자 쓰일 수 없다.
			
			int isrRead = isr.read();
			while(isrRead != -1) {//-1 : EOF (End Of File)
				System.out.print((char) isrRead );
				isrRead = isr.read();
			}//while
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {//나중에 생성한 Stream을 먼저 close 한다.
				isr.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}//finally
		
		
	}//main

}//class
