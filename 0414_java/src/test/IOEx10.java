package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOEx10 {

	public static void main(String[] args) {

		String inPath = "C:\\Users\\techn\\eclipse-workspace\\0414_java\\src\\ch14\\javaiotest\\sweden.txt";
		String outPath = "C:\\Users\\techn\\eclipse-workspace\\0414_java\\src\\ch14\\javaiotest\\swedencopy2.txt";
		
		FileReader fr = null; BufferedReader br = null;//한 줄씩 읽는기능
		FileWriter fw = null; BufferedWriter bw = null;//자동 줄바꿈
		
		try {
			fr = new FileReader(inPath);
			br = new BufferedReader(fr);

			fw = new FileWriter(outPath);
			bw = new BufferedWriter(fw);
			
			String str = br.readLine();//한 줄씩 읽는다.
			while(str != null) {
				System.out.println(str);
				bw.write(str);// 읽어온것을 다시 넣기
				bw.newLine();//
				str = br.readLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();fr.close();
				bw.close();	fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
		
		
		
	}//main

}//class
