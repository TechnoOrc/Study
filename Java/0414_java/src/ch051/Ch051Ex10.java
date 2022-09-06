package ch051;
/*
 * method override : method overriding : 메소드 덮어 쓰기 : 메소드 재정의
 *  - 부모 타입에 선언된 메소드를 자식 타입에서 재정의 하는 것
 *  - 부모 타입에 선언된 메소드와 이름, arguments 같아야 한다.
 *  - method overriding된 메소드는 호출 될 때, 자식 타입에 재정의된 메소드가 호출된다
 * method overriding 사용하는 이유? & 장점
 * - 자식 타입의 객체에 통일된 메소드를 두어서, 부모 타입에서도 자식 타입 고유의 메소드를 실행 할 수 있다.
 * - 부모 타입의 변수로 접근 불가능한 자식 타입의 고유 영역에 접근 가능하다.
 */

class Ch051Parent2 {
	String parentVar = "parent";
	void print() {} // 부모 타입 변수의 인식 범위 확장.
}//class

class Ch051Child2 extends Ch051Parent2 {
	String childVar = "child";
	void print() {
		System.out.println(childVar);
	}
}//class

public class Ch051Ex10 {

	public static void main(String[] args) {
		Ch051Parent2 p = new Ch051Child2();
		System.out.println(p.parentVar);
		p.print();
		//System.out.println(p.childVar);//error
		//p.print();//error
		/*
		 * 이유 : p는 자신을 선언한 Ch051Parent2의 멤버만 참고가 가능.
		 * 		-> child class의 멤버는 참고 불가능. -> 당연함
		 * 	-> 극복 방법 존재 : method override : method overriding
		 *  	-> p의 인식 범위를 넓힌다.
		 *  	-> 자식에 선언된 메소드와 같은 이름 + 같은 아규먼츠의 메소드를 부모에게 선언
		 */		
		
		
	}//main
		
}//class

