package test;

import java.util.ArrayList;

public class Ch07Ex02 {

	public static void main(String[] args) {

		ArrayList<String> listGStr = new ArrayList<String>();
		//listGStr.add(1);
		//listGStr.add(3.14);
		//listGStr.add('A');
		//listGStr.add(true);
		listGStr.add("hi");
		
		
		ArrayList list1 = new ArrayList();
		list1.add(1);
		list1.add(3.14);
		list1.add('A');
		list1.add(true);
		list1.add("hi");
		System.out.println("size : " + list1.size());
		System.out.println("get(0) : " + list1.get(0));
		System.out.println("get(4) : " + list1.get(4));
		
		Object obj = list1.clone(); // list1을 통째로 복사
		
		ArrayList list2 = (ArrayList) obj;
		Object [] objArr = list2.toArray();//to.Array 배열로 변환
		
		System.out.println("objArr [4] : " + objArr[4]);
		System.out.println("list2 isempty : " + list2.isEmpty());
		list2.clear();
		System.out.println("list2 isempty : " + list2.isEmpty());
		
		System.out.println(list1.indexOf('A'));
		System.out.println(list1.lastIndexOf('A'));
		System.out.println(list1);
		list1.remove(1);
		System.out.println(list1);
		
		
		
		
		
	}//main

}//class
