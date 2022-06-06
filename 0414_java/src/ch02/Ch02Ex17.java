package ch02;

/*
 * equals : 문자열 비교
 * equalsIgnoreCase : 대소문자 무시하고 문자열 비교
 */
public class Ch02Ex17 {

	public static void main(String[] args) {

		int iVar1 = 777;
		int iVar2 = 777;
		System.out.println("primitive : " + (iVar1 == iVar2) );// == 같다
		
		String str1 = new String("hello");
		String str2 = new String("hello");
		System.out.println("String : " + (str1 == str2) );
		String str3 = "hello";
		String str4 = "hello";
		System.out.println("Another String : " + (str3 == str4) );
		System.out.println("str1.equals(str2) : " + str1.equals(str2));
		System.out.println("str1.equals(str3) : " + str1.equals(str3));

		String str5 = "Hello";
		System.out.println("The other String : " + (str3 == str5) );
		System.out.println("str1.equals(str5) : " + str1.equals(str5));
		System.out.println("str1.equalsIgnoreCase(str5) : "
							+ str1.equalsIgnoreCase(str5));
		//equal : 같다, Ignore : 무시하다, Case : 대소문자.
	}//main

}//class