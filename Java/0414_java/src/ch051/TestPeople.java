package ch051;
/*
 * OOP의 3대 특징
 *  - inheritance : 상속 : 다른 클래스를 복제 : 설계 개념
 *  - polymorphism : 다형성 : 상속의 부모 변수는 자식 객체의 주소를 가질 수 있다 : 설계 개념
 *  - encapsulation : 은형성 : 코드를숨긴다 : 단순 테크닉
 *  - jdk : 상속과 다형성 기반 만들어짐 : 사용법은 은형성을 참고
 *  - 단일 상속 : 상속의 모호성 제거
 */

class TestTeacher extends TestPeople{
	String subject;
	String payAccount;
}

class TestStudent extends TestPeople{
	String grade;
	String ban;
}

public class TestPeople {
	String firstName;
	String name;
	String tel;
	String address;
}

