package ch041;
/*
 * array : 배열 : 배치를 줄줄이 했다
 * array의 개념
 *  - 하나의 변수로 여러 data를 다룰(handling) 수 있다.
 *  - 하나의 변수로 여러 data에 접근 가능하다.
 *  - 변수는 하나 + 번지를 여러 개.
 *  - 길이의 개념(length), 번지의 개념(index)
 *  - same data type, group handling, java object.
 *  - same date type : 정수 선언된 배열은 정수만 담고, 실수 선언된 배열은 실수만 담을 수 있다.
 *  - group handling : 데이터를 그룹으로 다룬다.
 *  - java object : array 변수는 주소를 담고, array는 다른 공간에 생성된다.
 */
public class Ch041Ex09 {

	//same data type
	public static void main(String[] args) {

		double [] dArr = new double[5];
		dArr[0] = 3.14;//double
		dArr[1] = 99.9F;// 자동 형태 변경 : data type casting : auto data type casting
		dArr[2] = 2100000000;// 자동 형태 변경 : data type casting : 묵시적 형 변환
		dArr[3] = 'A';//ascii code : 자판 신호를 정수로 받는다.// 자동 형태 변경 : data type casting : 묵시적 형 변환
		//dArr[4] = true;//error
		
		int [] iArr = new int [7];
		//iArr[0] = 3.14;//error//강제 data 형태 변경 하면 넣을 수는 있다.(data 손실 발생 가능)
		//iArr[1] = 2200000000L;//error//강제 data 형태 변경 하면 넣을 수는 있다.(data 손실 발생 가능)
		iArr[2] = 'a';//ascii code : 자판 신호를 정수로 받는다.// 자동 형태 변경 : data type casting : 묵시적 형 변환
		//iArr[3] = false;//error
		
		
	}//main

}//class
