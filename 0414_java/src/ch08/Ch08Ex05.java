package ch08;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Base64;

//Base64 - encode(암호 만들기), decode(암호를 풀기).
public class Ch08Ex05 {

	public static void main(String[] args) {

		String str = "nice to meet you, too.";
		System.out.println("str : " + str);
		try {
			String encodedStr = Base64.getEncoder().encodeToString(str.getBytes("utf-8"));
			System.out.println("encodedStr : " + encodedStr);

			byte[] encodedStrBytes = Base64.getDecoder().decode(encodedStr);
			System.out.println("encodedStrBytes : " + Arrays.toString(encodedStrBytes) );

			String decodedStr = new String(encodedStrBytes, "utf-8");
			System.out.println("decodedStr : " + decodedStr);

		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

	}//main
	

}//class 
