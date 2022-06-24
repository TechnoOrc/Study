package ch02;

/*
 * printf : print + format
 * 서식 출력 -> 기본이 문자열 출력
 * 서식 문자
 */
public class Ch02Ex23 {

	public static void main(String[] args) {

		System.out.printf("그냥 문자열 출력 가능\n");
		// \n -> 줄바꿈
		System.out.printf("%s\n", "그냥 문자열 출력 가능");
		// %s 문자열 출력.
		System.out.printf("%d\n", 123);
		// %d 정수 출력.
		System.out.printf("%f\n", 3.14);
		// %f는 실수 출력, 소수점 6자리 출력이 기본
		System.out.printf("%.2f\n", 3.14);
		// %와 f사이에 .2는 소수점 2자리 출력.
		System.out.printf("%.20f\n", 3.14);
		// %와 f사이에 .20는 소수점 20자리 출력. -> 자리수는 마음대로 조정가능.
		System.out.printf("%c\n", 'A');
		// %c는 문자 출력
		
		System.out.printf("%d + %d = %d\n",1,2,3);
		
		System.out.printf("이름 %s, 나이 %d, 키 %.1fcm, 몸무게 %.1fkg, 혈액형 %c","\"홍길동\"",25,180.0,80.0,'A');
		
		
	}//main

}//class
