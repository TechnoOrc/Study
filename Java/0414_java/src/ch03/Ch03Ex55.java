package ch03;

public class Ch03Ex55 {

	//TIP - 반복문에서는 보조 변수를 쓰면 편리하다. //합계, 횟수.
	public static void main(String[] args) {
		//반복문으로 1에서 10까지 더하기.
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum = sum + i;
		}//for
		System.out.println("1에서 10까지 합계 : " + sum);
		
		
	}//main

}//class
