package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import javax.swing.undo.CannotUndoException;

public class IOEx01 {

	public static void main(String[] args) {

		String path = "C:\\Users\\김세민\\eclipse-workspace\\0414_java\\src\\ch14\\javaiotest\\io5.txt";
		FileOutputStream fos = null;
		OutputStreamWriter osw = null;
		
		fos = new FileOutputStream(path);
		osw = new OutputStreamWriter(fos);
		
		osw.write("my name is james);
		
		
		
		
	}//main

}//class
