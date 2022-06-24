package ch03;

import java.util.Scanner;

//if : 분기문 : branch statement : 만약 ~ 하다면
//if(수행 조건) {수행 코드}
//(수행 조건) : true / false를 나타내는 문장 또는 식이어야 함.
//(수행 조건)이 true면, {수행 코드}를 실행, (수행 조건)이 false면, {수행 코드}를 실행하지 않음.
public class Ch03Ex14 {

	public static void main(String[] args) {
		
		//1 : 가위, 2 : 바위, 3 : 보
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 1 / 2 / 3 입력 : ");
		int yourChoice = scan.nextInt();
		System.out.println("your Choice : " + yourChoice);
		
		int comChoice = (int) Math.random() * 3 + 1;
		System.out.println("com Choice : " + comChoice);
		
		if(yourChoice == 1 && comChoice == 2) {
			System.out.println("패배");
		}
		if(yourChoice == 2 && comChoice == 3) {
			System.out.println("패배");
		}
		if(yourChoice == 3 && comChoice == 1) {
			System.out.println("패배");
		}
		
		if(yourChoice == 1 && comChoice == 3) {
			System.out.println("승리");
		}
		if(yourChoice == 2 && comChoice == 1) {
			System.out.println("승리");
		}
		if(yourChoice == 3 && comChoice == 2) {
			System.out.println("승리");
		}
		
		
		if(yourChoice == 1 && comChoice == 1) {
			System.out.println("비김");
		}
		if(yourChoice == 2 && comChoice == 2) {
			System.out.println("비김");
		}
		if(yourChoice == 3 && comChoice == 3) {
			System.out.println("비김");
		}
		
		scan.close();
		
		
		
	}//main
	
}//class
