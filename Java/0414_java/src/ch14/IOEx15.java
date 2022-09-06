package ch14;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * ObjectInputStream / ObjectOutputStream
 * 	- Object도 Input / Output 가능.
 *	- class type을 만들어진 객체를 Input / Output.
 *	- FilterStream 
 *	- 주의!!!implements Serializable!!! 중요 !!!
 */

class IOEx15Object implements Serializable{
	private String message = "this is test object.";
	@Override
		public String toString() {
			return message;
		}
}//class

public class IOEx15 {

	public static void main(String[] args) {
		IOEx15Object obj = new IOEx15Object();
		String path = "C:\\Users\\김세민\\eclipse-workspace\\0414_java\\src\\ch14\\javaiotest\\io9.txt";
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream(path);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(obj);
			//java.io.NotSerializableException, Serializable를 상속받은 Object만 가능하다.
		} catch (IOException e) {//FileNotFoundException, IOException
			e.printStackTrace();
			
		} finally {
			try {
				oos.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}//finally
		
		
	}//main

}//class
