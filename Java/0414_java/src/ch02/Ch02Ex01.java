package ch02;

/*
 * 자바가 다루는 데이터의 형태
 * 정수 : 음수, 양수, 0을 포함하는 소수점이 없는 숫자.
 * 실수 : 음수, 양수, 0.0을 포함하는 소수점이 있는 숫자.
 * 논리 : true, false. (오직 두개)
 * 문자 : character : 오직 문자 하나.
 * 자바의 문자는 다국어 지원을 위해 유니코드(16bit)를 사용.
 * 문자열 : character string : 문자를 줄지어 놓은 것. : 문자의 집합.
 */
public class Ch02Ex01 {

	public static void main(String[] args) {

		System.out.println(123);//정수
		System.out.println(3.14);//원주율//실수
		System.out.println(true);//논리
		System.out.println('A');//문자
		System.out.println('한');//문자
		System.out.println("문자열");//문자열
	}

}
