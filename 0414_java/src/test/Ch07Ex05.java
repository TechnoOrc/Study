package test;

import java.util.HashSet;
import java.util.Iterator;

public class Ch07Ex05 {

	public static void main(String[] args) {

		
		HashSet set = new HashSet();
		set.add(1);
		set.add(3.14);
		set.add('A');
		set.add(true);
		set.add("hello");
		
		System.out.println(set);
		
		Iterator iter = set.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println(set.contains("hello"));
		
		
		
		System.out.println("===========");
	
		
	}//main

}//class
