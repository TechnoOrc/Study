package test;

import java.util.HashMap;

import javax.print.attribute.HashAttributeSet;

public class Ch07Ex03 {

	public static void main(String[] args) {

		HashMap map1 = new HashMap();
		map1.put("first", 1);
		map1.put("second", 3.14);
		map1.put("third", 'A');
		map1.put(4, true);
		map1.put(4, false);
		map1.put(5, "hello");
		map1.put(6, 3.14);
		
		System.out.println(map1.size());
		System.out.println(map1.keySet());
		System.out.println(map1.values());
		System.out.println(map1);
		System.out.println(map1.get("third"));
		System.out.println(map1.get(5));
		
		//HashMap map2 = (HashMap) map1.clone();
		Object objt = map1.clone();
		HashMap map2 = (HashMap) objt;
		
		System.out.println(map2);
		System.out.println(map2.isEmpty());
		map2.remove("third");
		map2.remove(5);
		System.out.println(map2);
		
		
	}//main

}//class
