package ch07;
//TreeSet//data 중심 정렬.
import java.util.TreeSet;

public class Ch07Ex08 {// 나중에 시간되면 Comparable 알려주세요!!!

	public static void main(String[] args) {

		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(555);set.add(999);set.add(111);set.add(333);set.add(777);
		System.out.println(set);//data 중심 정렬.
		
		TreeSet<String> set2 = new TreeSet<String>();
		set2.add("i");set2.add("am");set2.add("a");set2.add("boy");
		set2.add("hi");set2.add("you");set2.add("girl");
		System.out.println(set2);
		
		//데이터를 마구 집어넣어도 출력될 때는 data 중심 정렬되어서 출력된다.
	}//main

}//class
