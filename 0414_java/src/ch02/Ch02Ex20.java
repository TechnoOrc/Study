package ch02;

/*
 * trim : 공백 자르기
 * toUpperCase : 모두 대문자로
 * toLowerCase : 모두 소문자로
 * 	- 본판 불변의 법칙 : 변환한 결과는 저장하지 않으면 사라진다.
 */
public class Ch02Ex20 {

	public static void main(String[] args) {

		String str = "       열       공       ";
		System.out.println("trim : ["+str.trim()+"]");
		System.out.println("원본 : ["+str+"]");
		//문자열의 앞과 뒤의 공백만 잘린다.
		//로그인 창의 아이디를 입력 받을 때 사용.
		
		String str2 ="HAPPY birthday To you.";
		System.out.println(str2.toUpperCase());
		System.out.println(str2.toLowerCase());
		System.out.println(("원본 : "+str2));
		
	}//main

}//class
