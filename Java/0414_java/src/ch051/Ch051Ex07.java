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
class Ch05DummyParent{
	String familyName;
	void setting(String str) {}//의미 없는 빈 메소드
	void print() {
		System.out.println(familyName);
	}
}//class

class Ch05DummyChild extends Ch05DummyParent{
	String name;
	void setting(String str) {this.name = str;}
	void print() {
		System.out.println(familyName + name);
	}
}//class

public class Ch051Ex07 {

	public static void main(String[] args) {
		Ch05DummyParent parent = new Ch05DummyChild();
		parent.familyName = "김";
		parent.print();
		
		//==========================================
		
		Ch05DummyChild cTest = new Ch05DummyChild();
		cTest.familyName = "강";
		cTest.name = "감찬";
		cTest.print();
		
	}//main


		
}//class

