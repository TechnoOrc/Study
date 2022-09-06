package ch051;

import java.util.ArrayList;

/*
 * 다형성의 한계
 *  - 부모 타입의 변수는 자식 객체의 고유 부분에는 접근할 수 없다
 *     -> 극복 : Object Data Type Casting : 객체 타입 변경
 */
public class Ch051Ex04 {

	public static void main(String[] args) {

		People p = new Teacher();
		p.familyName = "홍";
		p.name = "길동";
		p.address = "신수동";
		p.tel = "010";
		//p.subject = "java";//error//부모 타입의 변수는 자식 객체의 고유 영역에는 접근할 수 없다
		//p.payAccount = "KB";//error

		//Object Data Type Casting : 객체 타입 변경 필요
		Teacher t = (Teacher) p;
		t.subject = "java";
		t.payAccount = "KB";

		/*
		 * ArrayList : 자료 저장 구조 : 저장소
		 *  - 모든 타입의 자바 객체를 저장할 수 있음
		 *     -> 왜??
		 *         -> 모든 자바 객체는 Object의 후손이다
		 *             -> Teacher는 Object 상속 받은 적 없는데?
		 *                 -> Object는 자동으로 모든 객체의 최상위가 됨
		 * ArrayList : Object의 후손을 저장할 수 있는 Heterogeneous collection
		 */
		ArrayList list = new ArrayList();
		list.add(p);
		list.add(t);//Teacher
		Object imsi = list.get(1);//list.add(t);//Teacher -> 1번지
		Teacher tmp = (Teacher) imsi;

	}//main

}//class