package ch051;

/*
 * 상속을 사용하는 이유? & 장점
 *  - 구조가 간단해 진다.
 *  - 코드 재사용성 높아진다.
 *  - 추가 개발 또는 수정이 쉬워진다.(프로그램의 유연성이 좋아진다.)
 *  - 프로그램의 확장과 관리도 쉬워진다.
 */
public class People {
	String familyName;
	String name;
	String address;
	String tel;
	void print() {
		System.out.print(familyName + " : " + name + " : " + address
				+ " : " + tel + " : ");
	}//
}//class

class Teacher extends People {

	String subject;//과목
	String payAccount;//급여 계좌
	void print() {
		System.out.print(familyName + " : " + name + " : " + address
				+ " : " + tel + " : " + subject + " : " + payAccount);
	}//
}//class

class Student extends People {

	String grade;//학년
	String ban;//반
	void print() {
		System.out.print(familyName + " : " + name + " : " + address
				+ " : " + tel + " : " + grade + " : " + ban);
	}//
	
}//class
