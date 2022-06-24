package ch03;

import java.util.Scanner;

public class Ch03Ex25 {
	/* 하이/로우 게임
	 * 0 ~ 9까지의 수 중에
	 * 첫 번째 수를 보여주고
	 * 두 번째 수가 첫 번째 수보다
	 * 높은지 낮은지를 선택하는 게임
	 */
	public static void main(String[] args) {
		//module 1 - 0 ~ 9까지의 수 중에, 첫 번째 수를 발생시켜, 보여준다.
		int fNum = (int) (Math.random() * 10);
		System.out.println("Welcome High/Low Game");
		System.out.println("First Number : " + fNum);

		//module 2 - 0 ~ 9까지의 수 중에, 두 번째 수를 발생시켜, 보관한다.
		int sNum = (int) (Math.random() * 10);

		//module 3 - 유저의 판단을 입력 받는다.
		Scanner scan = new Scanner(System.in);
		System.out.print("1:High, 2:Low, 당신의 선택은? : ");
		int userSelect = scan.nextInt();
		scan.close();
		System.out.println("당신의 선택은 : " + userSelect);

		//module 4 - 결과를 보여준다.
		System.out.println("Second Number : " + sNum);
		if(fNum == sNum) {
			System.out.println("무승부");
		} else if(userSelect == 1) {//high
			if(fNum < sNum) {//sNum이 크다.
				System.out.println("승리");
			} else {//sNum이 작다.
				System.out.println("패배");
			}
		} else if (userSelect == 2) {//low
			if(fNum < sNum) {//sNum이 크다.
				System.out.println("패배");
			} else {//sNum이 작다.
				System.out.println("승리");
			}
		} else {
			System.out.println("입력 값이 올바르지 않습니다.");
		}

	}//main

}//class 
