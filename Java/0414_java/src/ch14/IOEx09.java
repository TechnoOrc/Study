package ch14;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOEx09 {

	public static void main(String[] args) {

		String inPath = "C:\\Users\\김세민\\eclipse-workspace\\0414_java\\src\\ch14\\javaiotest\\sweden.txt";
		String outPath = "C:\\Users\\김세민\\eclipse-workspace\\0414_java\\src\\ch14\\javaiotest\\swedencopy.txt";
		FileReader fr = null;
		FileWriter fw = null;
		
		
		try {
			
			fr = new FileReader(inPath);
			fw = new FileWriter(outPath);
			
			int frRead = fr.read();
			while(frRead != -1) {//-1 : EOF : End Of File.
				System.out.print( (char) frRead );
				fw.write(frRead);
				frRead = fr.read();
				
			}//while
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}//finally
		
		
	}//main

}//class
