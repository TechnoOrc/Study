package test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class IOEx11 {

	public static void main(String[] args) {

		String inPath = "C:\\Users\\techn\\eclipse-workspace\\0414_java\\src\\ch14\\javaiotest\\sweden.txt";
		String outPath = "C:\\Users\\techn\\eclipse-workspace\\0414_java\\src\\ch14\\javaiotest\\swedencopy3.txt";
		
		FileReader fr = null;
		BufferedReader br = null;
		PrintWriter pw = null;
		
		try {
			fr = new FileReader(inPath);
			br = new BufferedReader(fr);
			pw = new PrintWriter(outPath);
			
			try {
				String str = br.readLine();
				while(str != null) {
					System.out.println(str);
					pw.print(str);
					str = br.readLine();
				}
				
			} catch (FileNotFoundException e) {

				e.printStackTrace();
			}finally {
				br.close(); 
				fr.close();
				pw.close(); 
				
			}
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}//main

}//class
