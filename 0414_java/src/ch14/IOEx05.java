package ch14;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*
 * FileOutputStream
 *  - NodeStream
 *  - ByteStream : data를 8bit로 출력.
 *  - 알파벳 문화권의 언어가 아니면 출력 문자가 깨진다.
 */
public class IOEx05 {

	public static void main(String[] args) {

		String path = "C:\\Users\\김세민\\eclipse-workspace\\0414_java\\src\\ch14\\javaiotest\\io4.txt";
		FileOutputStream fos = null;
		Scanner scan = new Scanner(System.in);
		String str = "";

		try {

			fos = new FileOutputStream(path);
			while(str.equals("")) {
				System.out.print("한 줄을 입력 후 엔터(종료)를 쳐주세요 : ");
				str = scan.nextLine();
				for (int i = 0; i < str.length(); i++) {
					fos.write(str.charAt(i));
				}//for
				fos.write(10);
			}//while

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
				scan.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}//finally

	}//main

}//class