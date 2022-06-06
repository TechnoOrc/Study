package test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOEx03 {

	public static void main(String[] args) {

		String path = "C:\\Users\\techn\\eclipse-workspace\\0414_java\\src\\ch14\\javaiotest\\io2.txt";//한글
		
		FileReader fr = null;
		
		try {
			fr = new FileReader(path);
			try {
				int frReader = fr.read();
				while(frReader != -1) {
					System.out.print((char)frReader);
					frReader = fr.read();
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
		
	}//main

}//class
