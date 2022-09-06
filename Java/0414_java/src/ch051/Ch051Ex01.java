package ch051;

/*
 * Inheritance : 상속 : 설계 개념
 * - 하나의 class의 유전적 특징(멤버 변수, 멤버 메소드)를 또 다른 class에 이식하는 방법
 * - 유전적 특징을 주는 class : parent, super, 상위, 부모 class
 * - 유전적 특징을 받는 class : child, sub, 하위, 자식 class
 * - extends : 상속을 만드는 문법 : 확장한다는 의미
 * - Child extends Parent : Child는 Parent를 확장했다. : 뿌리가 Parent
 * - Parent : family name(성씨, 홍), Child : name(이름, 길동) 
 * - java에서는 단일 상속만 지원 : extends 뒤에 단 하나의 class만 온다.
 * - 상속은 is a relationship : 자식은 일종의 부모이다.
 * - 박찬호는 투수이다 O, 류현진은 투수이다 O
 *    - 박찬호는 일종의 투수이다 O , 류현진은 일종의 투수이다 O
 *    - 투수는 류현진이다. X -> 투수는 일종의 류현진이다 X
 *    - 박찬호는 류현진이다 X -> 박찬호는 일종의 류현진이다. X
 *    - parent는 상위 개념, child는 하위 개념.
 *    - 하위 class는 상위 class의 일종이다.
 */

class Ch051Parent {
	String familyName;
	void printParent() {
		System.out.println(familyName);
	}
	
}//class
//*  - 상속 받은 객체(child)의 내부에는 부모객체(parent)가 있다. O
class Ch051Child extends Ch051Parent{
	String name;
	void printChild() {
		System.out.println(familyName + " " + name);
	}
	
	
}//class

public class Ch051Ex01 {

	public static void main(String[] args) {
		
		Ch051Child child = new Ch051Child();
		child.familyName = "Hong";
		child.printParent();
		child.name = "Gil Dong";
		child.printChild();
		
	}//main

}//class
