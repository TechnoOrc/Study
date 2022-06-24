 package ch07;

import java.util.Enumeration;
import java.util.Vector;

/*
 * Enumeration
 * 	- Iterator와 동작 방식이 같다.
 * 	- 데이터 저장 객체와 결합하여, 검색의 역할을 수행한다.
 * 	- hasMoreElements : 현재 위치의 뒤쪽에 data가 있는가? - true/false
 * 	- nextElement : 현재 위치의 뒤쪽에 있는 data로 이동 + data 추출(꺼내기).
 */
public class Ch07Ex06 {

	public static void main(String[] args) {
		
		//List type : 순서 있고, 중복 있음.
		Vector vector1 = new Vector();
		vector1.add(1);
		vector1.add(3.14);
		vector1.add('A');
		vector1.add(true);
		vector1.add(true);
		vector1.add("hello");
		System.out.println(vector1);
		
		Enumeration enu = vector1.elements();
		
		while(enu.hasMoreElements()) {//before  first에서 after last까지 검색.
			System.out.println(enu.nextElement());
			
		}//while
		
		
	}//main

}//class
