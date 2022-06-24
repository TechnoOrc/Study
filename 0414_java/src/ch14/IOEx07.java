package ch14;

import java.io.FileWriter;
import java.io.IOException;

/*
 * FileWriter
 *  - NodeStream
 *  - CharStream : data를 16bit로 출력.
 *  - 비 알파벳 문화권의 문자를 출력 할 수 있다.
 */
public class IOEx07 {

	public static void main(String[] args) {

		String path = "C:\\Users\\techn\\eclipse-workspace\\0414_java\\src\\ch14\\javaiotest\\io6.txt";
		FileWriter fw = null;

		try {

			fw = new FileWriter(path);
			fw.write("FileWriter도 문자열을 출력 할 수 있다.");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}//finally

	}//main

}//IOEx06