package ch03;

import java.util.Scanner;

/*
 * default
 * - switch~case에서 나머지 모든 것을 의미한다.
 * - if의 else와 사용법이 같다.
 */
public class Ch03Ex30 {

	public static void main(String[] args) {

		System.out.print("1:비행기, 2:기차, 3:버스, 이동 수단을 입력하세요. : ");
		Scanner scan = new Scanner(System.in);
		int howMove = scan.nextInt();
		scan.close();
		
		switch(howMove) {//변수를 이용한 switch~case.
		case 1 : System.out.println("부산까지 비행기로는 1시간 소요 예상"); break;
		case 2 : System.out.println("부산까지 기차로는 3시간 소요 예상"); break;
		case 3 : System.out.println("부산까지 버스로는 5시간 소요 예상"); break;
		default : System.out.println("입력 값이 올바르지 않습니다.");
		}//switch
		
	}//main

}//class
