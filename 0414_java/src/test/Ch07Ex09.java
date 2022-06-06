package test;

import java.util.TreeMap;

public class Ch07Ex09 {

	public static void main(String[] args) {

	TreeMap<Integer, String>  map1 = new TreeMap<Integer, String>();
	map1.put(5, "no5"); map1.put(9, "999"); map1.put(1, "first"); map1.put(7, "seven");
	
	System.out.println(map1);
	
	
	
	TreeMap<String, String> map2 = new TreeMap<String, String>();
	map2.put("nice", "no5");
	map2.put("two", "999");
	map2.put("meet", "first");
	map2.put("you", "seven");
	
	System.out.println(map2);
	
	System.out.println(map2.keySet());
	System.out.println(map2.values());
		
	}//main

}//class
