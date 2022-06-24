package ch042;

/*
 * 멤버 변수 : member varible : class의 구성 요소
 *  - method가 아닌 class 내부에 선언된 변수.
 *  - 효력 범위 : class 내부
 *  - class가 살아 있는 동안 같이 살아 있다.
 */
/*
 * class
 * - new를 통해, 메모리에 올라가면
 * - 더 이상 사용되지 않아서, garbage collector이 수집이 될 때까지 존재한다
 * method
 * - 호출이 되면 메모리에 올라가서 실행된다.
 * - 메소드 실행이 끝나면, 사라진다.
 */
/*
 * 멤버 변수는 class가 new를 통해 메모리에 올라가서, 사라지기 전까지 존재.
 * 지역 변수는 메소드가 실행될때만 메모리에 올라가서, 메소드 실행이 끝나면 사라진다.
 */
class Ch042Dummy{
	String memVar = "멤버변수";
	void method1() {
		String loVar = "지역 변수";
		System.out.println("local variable : " + loVar);
	}//method1
}//class

public class Ch042Ex06 {

	public static void main(String[] args) {
		
		Ch042Dummy dummy = new Ch042Dummy();
		//class는 new를 통해 메모리에 올라간다.
		System.out.println(dummy.memVar);
		//class 내부에 있는 변수 멤버 변수//////
		dummy.method1();
		//메소드는 호출되는 순간, 메모리에 올라가서, 실행된다.
		
		
		
	}//main

}//class
