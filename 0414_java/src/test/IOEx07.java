package test;

import java.io.FileWriter;
import java.io.IOException;

public class IOEx07 {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\techn\\eclipse-workspace\\0414_java\\src\\ch14\\javaiotest\\io6.txt";
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			fw.write("FileWriter도 문자열을 출력 할 수 있다.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
	}//main

}//class
