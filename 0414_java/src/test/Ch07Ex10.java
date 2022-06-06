package test;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Ch07Ex10 {

	public static void main(String[] args) {

		ArrayList list1 = new ArrayList();
		list1.add(3.14);
		list1.add("hello");
		Object ob = list1.get(1);
		if(ob instanceof String) {
			String str = (String) ob;
			
		}//if
		
		
		ArrayList<String> strList = new ArrayList<String>();
		strList.add("hello");
		String str2 = strList.get(0);
		
		
		
		
		
	}//main

}//class
