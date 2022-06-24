package ch041;
/*
 * array : 배열 : 배치를 줄줄이 했다
 * array의 개념
 *  - 하나의 변수로 여러 data를 다룰(handling) 수 있다.
 *  - 하나의 변수로 여러 data에 접근 가능하다.
 *  - 변수는 하나 + 번지를 여러 개.
 *  - 길이의 개념(length), 번지의 개념(index)
 *  - same data type, group handling, java object.
 *  - same date tyep : 정수 선언된 배열은 정수만 담고, 실수 선언된 배열은 실수만 담을 수 있다.
 *  - group handling : 데이터를 그룹으로 다룬다.
 *  - java object : array 변수는 주소를 담고, array는 다른 공간에 생성된다.
 */
public class Ch041Ex01 {

	public static void main(String[] args) {

		int a = 7, b = 8, c = 9;//변수를 일일히 기억해야 한다 -> 변수 관리가 어렵다.
		
		int [] intArr = new int [3];
		// [] : array를 의미 : 집합
		// new : java instance // 메모리에 올라간 java
		// [3] : 길이 : lenght -> 길이는 1에서 시작 -> 번지는 0에서 시작 
		intArr[0] = 7;//[0]번지에 7 대입
		intArr[1] = 8;// 하나의 변수 이름에 번지의 개념으로 접근 가능하다
		intArr[2] = 9;
		System.out.println(intArr[1]);
		
		
	}//main

}//class
