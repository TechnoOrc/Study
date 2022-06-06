package ch02;

public class Ch02Ex24 {
	
	public static void main(String[] args) {
		
		String str;
		/*
		 * 1. 메모리에 주소(메모리 위치 값)를 담을 수 있는 공간을 만들고, 이름을 str이라고 붙인다.
		 */
		
		str = new String("hello");
		/*
		 * 2. new String을 수행 : 메모리에 String 객체 공간 확보
		 * 3. ("hello") 수행 : 2에서 만들어진 공간에 hello 대입
		 * 4. = 수행 : new String("hello")가 만들어진 공간의 주소(위치) 값을 str에 대입
		 * 5. String instance 생성 완료
		 * 이를 통해, class를 new 하면 메모리가 주소 하나, instance 하나, 두 개 만들어 진다.
		 * 
		 * instance란?
		 * 	- java class가 new를 통해 메모리에 올라간 것(load된 것).
		 */
	}//main

}//class
