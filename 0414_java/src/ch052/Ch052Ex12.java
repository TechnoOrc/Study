package ch052;

/*
 * interface 간의 상속
 * 	- extends를 사용
 * 	- 다중 상속을 지원
 * 		-> 메소드의 구현부가 없다
 * 		-> 일반 변수 없다
 * 		-> 일반 메소드 없다
 * 			->  때문에, 다중 상속의 모호성이 없음
 */

interface InterTest2 {
	public abstract void absMethod1();// abstract의 메소드는 {} 구현부 없다.
}

interface InterTest3 {
	public abstract void absMethod2();
}

interface InterTest4 extends InterTest2{}//interface 간의 상속 가능

interface InterTest5 extends InterTest1, InterTest2, InterTest3{
	//interface는 다중 상속이 가능
}

public class Ch052Ex12 {

	public static void main(String[] args) {

	}//main

}//class

