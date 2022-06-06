package ch08;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

/*
 * test.properties를 읽어오자
 * Properties :  설정을 저장하는 Collection API
 * 	- 프로그램 실행을 위한 설정을 저장하고 싶을 때 사용한다.
 * 설정 : 시스템 설정 등 프로그래밍과 시스템에 필요한 값(data)들을 설정 값이라 한다.
 */
public class Ch08Ex04 {
	public static void main(String[] args) {
		
		String where = "C:\\Users\\김세민\\eclipse-workspace\\0414_java\\src\\ch08\\test.properties";
		FileReader fr = null;
		Properties prop = new Properties();
		
		prop.setProperty("birth", "0101");//프로그램 설정 추가하는 경우
		System.out.println(prop.getProperty("birth"));
		
		try {//file을 읽을 때, 예상되는 Exception은? -> FileNotFoundException
			fr = new FileReader(where);//파일을 읽어 온다.
			prop.load(fr);//읽어온 파일의 내용을 Properties에 저장한다.
			
			
			
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
		
		Enumeration<String> enumer = (Enumeration<String>) prop.propertyNames();
		while(enumer.hasMoreElements()) {
			System.out.println(enumer.nextElement());
		}//while
		
	}//main

}//class
