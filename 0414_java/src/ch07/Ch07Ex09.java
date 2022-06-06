package ch07;
//TreeMap//key 중심 정렬.
import java.util.TreeMap;

public class Ch07Ex09 {// 나중에 시간되면 Comparable(비교하는 방법론) 알려주세요!!!

	public static void main(String[] args) {

		TreeMap<Integer, String> map1 = new TreeMap<Integer, String>();
		map1.put(5, "no5");map1.put(9, "999");map1.put(1, "first");map1.put(7, "seven");
		System.out.println(map1);//key 중심 정렬.
		
		TreeMap<String, String> map2 = new TreeMap<String, String>();
		map2.put("nice", "no5");map2.put("two", "999");
		map2.put("meet", "first");map2.put("you", "seven");
		System.out.println(map2);
		
		//데이터를 마구 집어넣어도 출력될 때는 key 중심 정렬 되어서 출력된다.
		
	}//main

}//class
