package ch07;

import java.util.ArrayList;

class Ch07test1 {}

public class Ch07Ex011 {//주제 : Object.

	public static void main(String[] args) {
		Ch07test1 test = new Ch07test1();
		System.out.println(test.toString());// 왜? -> Object 자동 상속.
		/*
		 * Object는 모든 class의 최상위 class가 된다.//Object메소드 상속받음
		 * 	-> Collection API의 정체 : Object의 Heterogeneous
		 * 		-> ArrayList == Object[]
		 * 			-> ArrayList.clone() ===> Object[]
		 * 			-> ArrayList.toArray() ===> Object[]
		 */
		ArrayList list = new ArrayList();
		list.add("hi");
		//String imsiStr = list.get(0);//error
		Object ob = list.get(0);
		String tmpStr = (String) ob;
		System.out.println(ob);
		//==========================================
		Ch07Parent1 [] pArr = new Ch07Parent1[2];
		pArr[0] = new Ch07Child(); //부모 타입의 배열에 자식 객체를 연결.
		//Ch07Child c1 = pArr[0];//error 자식의 변수에 부모 변수 들어갈 수 없음 // Casting 필요함.
		
	}//main

}//class


class Ch07Parent1{}

class Ch07Child extends Ch07Parent1{}