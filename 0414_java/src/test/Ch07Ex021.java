package test;

import java.util.ArrayList;
import java.util.Vector;

public class Ch07Ex021 {

	public static void main(String[] args) {

		Vector vec1 = new Vector(5,5);
		vec1.add(1);
		vec1.addElement(3.14);
		System.out.println(vec1.size());
		System.out.println(vec1.capacity());
		vec1.add('A');
		vec1.add(true);
		vec1.add("hi");
		vec1.add("how~");
		System.out.println(vec1.size());
		System.out.println(vec1.capacity());
		System.out.println(vec1.get(2));
		System.out.println(vec1);
		System.out.println(vec1.contains("hi"));
		System.out.println(vec1.elementAt(1));
		System.out.println(vec1.get(1));
		System.out.println(vec1.indexOf("hi"));
		System.out.println(vec1.lastIndexOf("hi"));
		System.out.println(vec1.firstElement());
		System.out.println(vec1.lastElement());
		
		//복제
		
		Vector vec2 = (Vector) vec1.clone();
		System.out.println(vec2);
		
		//배열로 변경
		
		Object [] obArr = vec2.toArray();
		for (int j = 0; j < obArr.length; j++) {
			
			System.out.println(obArr[j]);
		}
		
		vec2.clear();
		System.out.println(vec1.size());
		System.out.println(vec1.capacity());
		System.out.println(vec1);
		
		vec1.insertElementAt("yahoo", 6);
		System.out.println(vec1.size());
		
		
	}//main

}//class
