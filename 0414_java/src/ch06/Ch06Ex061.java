package ch06;

//throw : 예외를 발생시키는(활동) 시키는 표현
public class Ch06Ex061 {

	public static void main(String[] args) {

		new NullPointerException();//예외 객체를 생성했음. 활동은 아직.
		System.out.println("after new Null Pointer Exception");
		throw new StringIndexOutOfBoundsException();// 예외 객체를 생성 및 활동 시작.
		//System.out.println("after new StringIndexOutOfBoundsException"); // Exception 발생으로 수행안됨
		
		
	}//main

}//class
