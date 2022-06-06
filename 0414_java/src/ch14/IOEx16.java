package ch14;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class IOEx16 {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\김세민\\eclipse-workspace\\0414_java\\src\\ch14\\javaiotest\\io9.txt";
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		
		try {
			fis = new FileInputStream(path);
			ois = new ObjectInputStream(fis);
			
			//System.out.println(ois); Object 타입 Object 변수에 넣은 뒤 출력해 주어야한다.
			Object obj = ois.readObject();
			IOEx15Object testObj = (IOEx15Object) obj;
			System.out.println(testObj.toString());
			
		} catch(IOException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				ois.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}//try
		}//finally
		
		
	}//main

}//class
