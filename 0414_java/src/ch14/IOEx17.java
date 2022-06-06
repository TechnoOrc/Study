package ch14;

import java.io.File;
import java.util.Arrays;
import java.util.Iterator;

/*
 * File : 파일 하나를 지정 또는 폴더 하나를 지정하는 객체.
 */
public class IOEx17 {

	public static void main(String[] args) {

		//String pathFile = "C:\\Users\\techn\\eclipse-workspace\\0414_java\\src\\ch14\\javaiotest\\io9.txt";
		String pathFolder = "C:\\Users\\techn\\eclipse-workspace\\0414_java\\src\\ch14\\javaiotest";
		File file = new File(pathFolder);
		
		System.out.println("isFile : " + file.isFile());//false
		System.out.println("isDirectory : " + file.isDirectory());//ture
		System.out.println();//파일이나 폴더의 권한 3개 : rwx read, write, execute.
		System.out.println("canRead : " + file.canRead());
		System.out.println("canWrite : " + file.canWrite());
		System.out.println("canExecute : " + file.canExecute());
		System.out.println();
		System.out.println("getPath : " + file.getPath());
		System.out.println("getAbsolutePath : " + file.getAbsolutePath());
		System.out.println();
		System.out.println("getName : " + file.getName());
		System.out.println("getParent : " + file.getParent());// 부모의 이름을 문자열로 알려준다.
		System.out.println("getParentFile : " + file.getParentFile());//부모 객체를 File 객체로 만들어 준다.
		System.out.println();
		System.out.println("========================");
		
		String [] fileList = file.list();
		
		//System.out.println("Arrays.toString(fileList)");
		//System.out.println(Arrays.toString(fileList));
		for (String String : fileList) {
			System.out.println(String);
		}//forEach
		
		
		String pathFile = "C:\\Users\\김세민\\eclipse-workspace\\0414_java\\src\\ch14\\javaiotest\\io9.txt";
		File file2 = new File(pathFile);
		file2.delete();
		System.out.println("=========== io9.txt 삭제 =============");
		File [] fileArr = file.listFiles();
		for (File file3 : fileArr) {
			System.out.println(file3.getName());
		}//forEach
		
		
	}//main

}//class
