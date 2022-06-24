package ch06;

public class Ch06Ex02 {// 문법적 오류가 아니라 실행할 때 오류를 발생시킨다 시행전까진 알 수 없다.

	public static void main(String[] args) {

		String str = null;
		System.out.println(str.length());// 변수안에 값이 없는 Null  인데 출력을 요구할때
		//NullPointerException
		
		int[] iArr = new int[3];
		//System.out.println(iArr[3]);// 생성된 배열의 범위를 벗어났을 때. 
		//ArrayIndexOutOfBoundsException
		
		String str2 = new String("hi");
		//System.out.println(str2.charAt(1));// 인덱스의 범위를 벗어났을 때.
		//StringIndexOutOfBoundsException
		
		//System.out.println(7/0);//0으로 나눌 때 발생
		//ArithmeticException
		
	}//main

}//class
