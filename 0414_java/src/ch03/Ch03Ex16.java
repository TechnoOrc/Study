package ch03;

import java.util.Scanner;

public class Ch03Ex16 {

	public static void main(String[] args) {
		// if문을 통한 프로그램의 흐름을 크게 두가지로만 나누고 싶을 때//이거 아니면 저거.
		// if(){} if의 수행조건이 true인 경우에 수행 됨.
		// else{} if의 수행조건이 false인 경우에 수행 됨. 

		int fNum = (int) (Math.random() * 10);// 0 ~ 9
		int sNum = (int) (Math.random() * 10);// 0 ~ 9

		System.out.println("High / Low Game");
		System.out.println("first number : " + fNum);
		System.out.println("두 번째 수는 첫 뻔째 수보다 낮을까요? 높을까요?");
		System.out.print("낮으면 1, 높으면 2, 당신의 선택은? : ");

		Scanner scan = new Scanner(System.in);

		int yourChoice = scan.nextInt();
		System.out.println("Your Choice : " + yourChoice);
		System.out.println("second number : " + sNum);

		if(yourChoice == 1) {
			if(fNum > sNum) {
				System.out.println("승리");
			} else {
				System.out.println("패배");
			}//else
		} else {
			if(fNum > sNum) {
				System.out.println("패배");
			} else {
				System.out.println("승리");
			}//else
		}//else : 당신이 선택하지 않은 나머지 모든 것.

		scan.close();
	}//main

}//class 
