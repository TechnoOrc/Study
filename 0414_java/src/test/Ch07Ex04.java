package test;

import java.util.HashSet;

public class Ch07Ex04 {

	public static void main(String[] args) {

		HashSet set = new HashSet();
		set.add(1);
		set.add(3.14);
		set.add('A');
		set.add(true);
		set.add(true);
		set.add("hello");
		
		System.out.println(set);
		
		HashSet set2 = (HashSet) set.clone();
		
		System.out.println(set2);
		
		System.out.println(set.size());
		System.out.println(set.contains("hello"));
		set2.remove('A');
		System.out.println(set2);
		
		set2.clear();
		System.out.println("다지웠습니다.");
		System.out.println(set2);
		set2 = (HashSet) set.clone();
		System.out.println(set2);
				
				
				
				
	}//main

}//class
