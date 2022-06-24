package ch02;

/*
 * 자바에서 데이터를 사용하는 방법.
 * 	- 변수를 적극 활용한다.
 */
/*
 * 변수의 개념 : variable : various(다양함) + able(가능성)
 * 	- 다양한 값을 가질 수 있다.
 * 	- 데이터를 저장하는 저장 공간
 * 	- 데이터를 저장하는 공간에 들어 있는 값을 바꿀 수 있다. (반드시 바꾸는 것은 아님.)
 */
public class Ch02Ex02 {

	public static void main(String[] args) {
		
		int data1 = 9876;
		int data2 = 8765;
		
		System.out.println(data1 + data2);
		System.out.println(data1 - data2);
		System.out.println(data1 * data2);
		
		data2 = 4;
		System.out.println(data1 * data2);
		
	}//main

}//class
