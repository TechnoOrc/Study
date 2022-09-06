package ch06;

/*
 * Exception도 throw와 new를 통해 만들 수 있다.
 *  - throw new Exception()과 catch문을 이용하여, 프로그램을 분기 시킬 수 있다.
 * 
 * throws
 *  - 메소드 선언부에 사용
 *  - try ~ catch 처리를 현재 메소드가 아닌 다른 메소드에서 처리하게 하는 것
 *  - throws가 사용된 메소드를 호출한 메소드가 try ~ catch 처리를 해야 함
 */
public class Ch06Ex06 {

	//makeException() 메소드를 호출한 메소드가
	//NullPointerException에 대한 try ~ catch 처리를 해야 한다.
	public void makeException() throws NullPointerException {
		//(throws NullPointerException) 호출한 곳으로 NullPointerException을 넘긴다.
		//throw new NullPointerException()를 통해서 만들어진 것을 호출한 곳(makeException())으로 넘긴다.

		throw new NullPointerException();// throw는 Exception을 만들때 사용
		//NullPointerException을 새로 만들어,
		//NullPointerException을 일부러 발생 시킴.
	}

	public static void main(String[] args) {

		Ch06Ex06 test = new Ch06Ex06();
		try{
			test.makeException();
		} catch(NullPointerException e) {
			System.out.println("처리 완료 - NullPointerException");
		}

	}//main

}//class 
