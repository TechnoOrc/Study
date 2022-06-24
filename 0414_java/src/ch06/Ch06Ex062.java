package ch06;

/*
 * throws
 * 	- 예외에 대해서 try~catch 처리를 떠넘기기 (호출한 메소드로 떠넘긴다.)
 * 	- 현재 예외가 발생한 메소드(이하 A메소드)는 try~catch 처리를 안한다.
 * 		-> 그러므로, A메소드를 사용하는 곳이 있다면, try~catch 처리를 해야 한다.
 */

class Ch06Test1{
	public void throwsTest() throws NullPointerException{
		throw new NullPointerException();//NullPointerException을 생성 및 활동 시작
	}//throwsTes
}//class

public class Ch06Ex062 {

	public static void main(String[] args) {
		
		Ch06Test1 test = new Ch06Test1();
		try {
			test.throwsTest();
		} catch (NullPointerException e) {
			System.out.println("throws 표현이 있는 메소드는 예외 처리를 자신이 하지 않을 수 있다.");
		}
		
	}//main

}//class
