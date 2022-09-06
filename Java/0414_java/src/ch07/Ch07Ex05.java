package ch07;

import java.util.HashSet;
import java.util.Iterator;

/*
 * Iterator
 * 	- data 저장 객체(List, Set)에 결합하여, data를 검색하는 역할.
 * 	- 1.데이터 간의 이동, 2.데이터가 있는지 확인, 3. 데이터 꺼내기
 * 	- hasNext : 다음 데이터가 있는지 확인. 
 * 	- next : 데이터 간의 이동 후, 데이터 꺼내기.
 */

public class Ch07Ex05 {

	public static void main(String[] args) {

		HashSet set = new HashSet();
		set.add(1);
		set.add(3.14);
		set.add('A');
		set.add(true);
		set.add("hello");
		
		System.out.println("set : " + set);
		
		Iterator iter = set.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		  
		    
		}//while
		
		
	}//main

}//class
