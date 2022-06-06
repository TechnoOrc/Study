package test;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class Ch08Ex05 {

	public static void main(String[] args) {

		String str = "nice to meet you, too";
		System.out.println("str : " + str);
		
		String encodedStr = null;
		try {
			encodedStr = Base64.getEncoder().encodeToString(str.getBytes("utf-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("encodeStr : " + encodedStr);
		
		
		
		
	}//main

}//class
