package ch051;
/*
 * Polymorphic Arguments : 다형성 응용
 *  - Arguments의 자리에 부모 타입의 변수를 사용하면,
 *    모든 자식 타입의 객체를 가져올 수 있다.
 */

class Ch051Print {

//	void print(Teacher t) {
//		t.print();
//	}
//	void print(Student s) {
//		s.print();
//	}
	void print(People p) {
		//부모 타입의 변수 p는 오버라이딩으로 자식 타입의 객체를 가져올 수 있다.
		p.print();
	}

}//class

public class Ch051Ex11 {

	public static void main(String[] args) {

		Teacher t = new Teacher();// People의 객체 상속받음
		t.name = "길동";

		Student s = new Student();// People의 객체 상속받음
		s.name = "감찬";

		Ch051Print p = new Ch051Print();
		p.print(t);
		p.print(s);

	}//main

}//class 
