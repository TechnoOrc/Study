package ch14;

import java.io.File;

public class IOEx12 {

	public static void main(String[] args) {
		
		//File이 폴더로 지정되는 경우의 예.
		File folder = new File("C:\\Users\\김세민\\eclipse-workspace\\0414_java\\src\\ch14\\javaiotest");
		//파일을 선택하는경우 해당 경로만 // 폴더를 선택하는 경우는 안에 내용을 모두 출력함
		String[] strArr = folder.list();
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
			
		}//for
		
		
	}//main

}//class
