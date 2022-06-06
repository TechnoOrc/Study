package ch06;

/*
 * return
 * 	- 일반적인 사용법 : 메소드에서 수행 결과를 메소드를 호출한 곳으로 보낼 때 사용.
 * 	- 특별한 사용법 : return 혼자 사용할 때는 메소드 종결(마침)의 의미. 
 */
public class Ch06Ex082 {

	public static int plus(int a, int b) {
		
		return a + b;// 일반적인 사용법
		
	}//plus
	
	public static void returnTest() {
		return;//return이 홀로 쓰이면, 메소드 수행을 여기서 멈춰라	
		// 리턴 전까지의 값을 돌려줘라 너를 호출한 메소드에 하지만 메소드가 void면 없는것이 된다.
		//System.out.println("수행이 될까요?"); 실행되지 않는 코드.
	}//returnTest
	
	public static void main(String[] args) {
		
		int res = plus(7,8);// int res = 15;
		System.out.println(res);
		
		
	}//main
}//class
