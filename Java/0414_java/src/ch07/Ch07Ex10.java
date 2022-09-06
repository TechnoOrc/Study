package ch07;

import java.util.ArrayList;

/*
 * Generic : 클래스 내부에서 사용하려는 데이터 타입을 미리 정의하는 것.
 * 	- 클래스 내부에서 사용하려는 데이터 타입을 다이아몬드 지시자로 받을 수 있다.
 * 	- 불필요한 형변환 코드를 줄일 수 있다.
 * 	- 부주의한 객체 사용과 형변환으로 인해 발생하는 오류를 줄일 수 있다.
 * 	- 
 */
public class Ch07Ex10 {

	public static void main(String[] args) {

		
		//1. ArrayList에서 사용할 데이터 타입을 지정하지 않으면,
		ArrayList list1 = new ArrayList();
		//2. 여러 종류의 데이터를 저장할 수 있지만,
		list1.add(3.14);list1.add("hello");
		//3. instanceof 연산과 Object data type casting을 하는 불편함이 있다.
		//String str = list1.get(1);//error
		Object ob = list1.get(1);
		if(ob instanceof String) {
			String str = (String) ob;
		}//if
		
		//1. 반면에, ArrayList에서 사용할 데이터 타입을 지정하면,
		ArrayList<String> strList = new ArrayList<String>();
		//2. 선언된 데이터만 저장할 수 있지만,
		//strList.add(3.14);//error
		strList.add("hello");
		//3. instanceof 연산과 Object data type casting을 하지 않아도 된다.
		String str2 = strList.get(0);// Object data type casting 필요 없음.
		
		
	}//main

}//class

