package test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Ch08Ex04 {

	public static void main(String[] args) {

		String where = "C:\\Users\\김세민\\eclipse-workspace\\0414_java\\src\\ch08\\test.properties";
		FileReader fr = null;
		Properties prop = new Properties();
		
		prop.setProperty("birth", "0816");
		System.out.println(prop.getProperty("birth"));
		
		try {
			fr = new FileReader(where);//where의 경로의 파일을 불러온다
			prop.load(fr);// 불러온 내용을 properties 설정하는 api이용하여 설정
			
			String name = prop.getProperty("name");//Properties에서 name 검색.
			System.out.println(name);
			String height = prop.getProperty("height");
			System.out.println(height);
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}//finally
			

		
	}//main

}//class
