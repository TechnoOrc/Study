package ch052;

/*
 * final : 최종적인 : 변경 불가능 : 수정 불가
 *  - final variable : 변경 불가능한 변수 : 상수
 *  - final method : 변경 불가능한 메소드 : override 불가
 *  - final class : 변경 불가능한 클래스 : 상속 불가
 */
/*
 * final variable : 변경 불가능한 변수 : 상수
 * 예) final int iVar = 77;//변수의 상수화
 * 주의!! 1. 선언할 때 1번만 대입 연산 가능 : final int iVar; iVar = 77;//error
 * 주의!! 2. 일반적으로 public static으로 사용 한다.
 * 주의!! 3. 상수 이름 : 모두 대문자 + 단어가 이어질 때는 _ : 예) MAX_INT
 */
public class Ch052Ex01 {

	public static final int TMP_INT_TEST = 777;//public static final로 대체적으로 많이 쓰임 반드시는 아님!!!!
	//public static final int TMP_INT_TEST2;//error
	//TMP_INT_TEST2 = 777;//error

	public static void main(String[] args) {

		System.out.println(Ch052Ex01.TMP_INT_TEST);

	}//main

}//class