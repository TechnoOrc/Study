package ch14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

/*
 * Buffered Reader
 * 	- FilterStream
 * 	- 한 줄씩 읽는 기능
 * Buffered Writer
 *	- FilterStream
 *	- 자동 줄 바꿈 기능
 */
public class IOEx10 {

	public static void main(String[] args) {

		String inPath = "C:\\Users\\김세민\\eclipse-workspace\\0414_java\\src\\ch14\\javaiotest\\sweden.txt";
		String outPath = "C:\\Users\\김세민\\eclipse-workspace\\0414_java\\src\\ch14\\javaiotest\\swedencopy2.txt";
		FileReader fr = null;	BufferedReader br = null;
		FileWriter fw = null;	BufferedWriter bw = null;
		
		
		try {
			fr = new FileReader(inPath);
			br = new BufferedReader(fr);
			
			fw = new FileWriter(outPath);
			bw = new BufferedWriter(fw);
			
			String str = br.readLine();//한 줄씩 읽어요.
			while(str != null) {//null : EOF
				System.out.println(str);
				bw.write(str);
				bw.newLine();
				str = br.readLine();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();	fr.close();
				bw.close();	fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}//finally
		
		
	}//main

}//class
