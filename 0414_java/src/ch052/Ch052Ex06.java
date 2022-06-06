package ch052;

/*
 * static method
 *  - class load 할 때, static area(stack)에, 최초 1번만 만들어진다
 *  - override가 안 됨
 *  	-> final의 override 문법적 에러
 *  	-> static의 override는 문법적 에러는 아님
 *  		-> 부모의 static 메소드와 (자식의?) static 메소드가 독립하여 개별적으로 존재하게 된다.
 *  	-> 부모 타입의 변수로 자식 타입의 객체를 생성했을 때, 
 *  		-> 부모 타입의 변수로 호출되는 static 메소드는 부모의 static 메소드가 된다.
 */

class Ch052Parent3{
	public static void staticMethod() {
		System.out.println("Ch052Parent3 : staticMethod");
	}
}

class Ch052Child3 extends Ch052Parent3{
	public static void staticMethod() {
		System.out.println("   ===> Ch052Child3 : staticMethod");
	}
}

public class Ch052Ex06 {

	public static void main(String[] args) {

		Ch052Parent3 p1 = new Ch052Child3();
		p1.staticMethod();//override가 안 됨
		Ch052Parent3.staticMethod();
		
		Ch052Child3 c1 = new Ch052Child3();
		c1.staticMethod();
		Ch052Child3.staticMethod();
		
	}//main

}//class
