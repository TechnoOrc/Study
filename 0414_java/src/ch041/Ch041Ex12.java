package ch041;

public class Ch041Ex12 {

	public static void main(String[] args) {
		String s1 = new String("hello");
		String s2 = new String("HELLO");

		//문자열 2개를 비교하는 반복문을 만들자.
		boolean flag = false;//다르다.

		//문자열 비교 0단계 - 대소문자 무시
		s1 = s1.toUpperCase();
		s2 = s2.toUpperCase();

		//문자열 비교 1단계 - 길이 비교
		if(s1.length() == s2.length()) flag = true;

		//문자열 비교 2단계 - 한자씩 비교
		if(flag == true) {
			for(int i = 0; i < s1.length(); i++) {
				if(s1.charAt(i) != s2.charAt(i)) {
					flag = false;
					break;
				}//if
			}//for
		}//if
		System.out.println(flag);

	}//main

}//class 
