package ch03;

import java.util.Scanner;

public class Ch03Ex24 {

	public static void main(String[] args) {
		//가위 바위 보 게임 만들기
		//module 1 : 유저의 선택을 입력 받는다. - Scanner
		Scanner scan = new Scanner(System.in);
		System.out.print("1:가위, 2:바위, 3:보, 당신의 선택은? : ");
		int yourSelect = scan.nextInt();
		System.out.println("Your Select : " + yourSelect);
		scan.close();

		//module 2 : 컴의 선택을 만들어야 한다. - random
		int comSelect = (int) (Math.random() * 3 + 1);
		System.out.println("Computer Select : " + comSelect);

		//module 3 : 유저와 컴의 선택을 비교한다. - if
		if(yourSelect == comSelect) {
			System.out.println("비김");
		} else if(yourSelect == 1) {
			if (comSelect == 2) {
				System.out.println("패배");
			} else if (comSelect == 3) {
				System.out.println("승리");
			}
		} else if (yourSelect == 2) {
			if(comSelect == 1) {
				System.out.println("승리");
			} else if (comSelect == 3) {
				System.out.println("패배");
			}
		} else if (yourSelect == 3) {
			if(comSelect == 1) {
				System.out.println("패배");
			} else if (comSelect == 2) {
				System.out.println("승리");
			}
		} else {
			System.out.println("입력 값이 올바르지 않습니다.");
		}//else

	}//main

}//class 
