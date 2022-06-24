package ch02;

/*
 * primitive data type 외에는 모두 class로 만들어진 java instance(class를 메모리에 올린 것)
 * primitive data type를 생성할때 
 * 컴이 실행을 하기 위해서는 실행 대상을 먼저 메모리에 올리는(load) 행위부터 한다
 * 문자열을 의미하는 String도 class를 메모리에 load해서 사용한다
 */
public class Ch02Ex14 {

	public static void main(String[] args) {

		String str1;//메모리에 String  문자열 공간 확보 + 이름은 str1
		str1 = new String("hello");//메모리에 새로운 문자열을 만든다
		//new String : 메모리에 새로운 문자열을 만든다
		//String("hello") : hello라는 글자가 담긴 문자열 메모리 공간
		System.out.println(str1);
		
		String str2 = "안녕하세요";
		System.out.println(str2);
		
		
		
	}//main

}//class
