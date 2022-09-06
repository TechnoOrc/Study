package ch06;

/*
 * User Defined Exception
 * 	- Exception을 만드는 가장 쉽고 빠른 방법은 Exception을 상속 받는 것
 * 	- 나만의 Exception을 만들자
 * 	- throw new Exception을 통해 프로그램을 분기 할 수 있다.
 * 
 */
public class IDException extends Exception{// Exception 의 이름을 지정했다.라고 보면된다
	public IDException() {
		super("ID를 확인 하세요.");// Exception 의 이름을 지정했다.라고 보면된다
	}//IDException()
	
}//class
