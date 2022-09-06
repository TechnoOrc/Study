package ch14;

import java.io.File;
import java.util.ArrayList;

/*
 * File을 이용하여, 폴더 목록을 만들기.
 */
public class IOEx18 {
	static ArrayList<File> list = new ArrayList<File>();

	public static void main(String[] args) {

		String path = "C:\\Users\\김세민\\eclipse-workspace\\0414_java\\src";
		File topFile = new File(path);
		
		makeFileList(topFile);
		
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).isDirectory()) {
				makeFileList(list.get(i));
			}//if
		}//for
		System.out.println(list.size());
		
		for (File tmp : list) {
			System.out.println(tmp.getName());
		}//forEach
		
	}//main
	
	public static void makeFileList(File file) {
		File [] fileArr = file.listFiles();
		for (File file2 : fileArr) {
			list.add(file2);
		}
		
	}//makeFileList
	
}//class
