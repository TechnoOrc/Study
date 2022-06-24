package ch03;

import java.util.Scanner;

public class Ch03Ex44 {

	public static void main(String[] args) {
		//메뉴 만들기 -> 0:종료, 1:입력, 2:출력
		Scanner scan = new Scanner(System.in);
		int userInput = 0;
		while(true) {//0이 입력되면 종료를 시키자.
			System.out.println("0:종료, 1:입력, 2:출력");
			System.out.println("메뉴 선택 : ");
			userInput = scan.nextInt();
			System.out.println("선택된 메뉴 : " + userInput);
			
			if(userInput == 0) {
				System.out.println("\n===== 프로그램 종료 =====");
				scan.close();
				System.exit(0);//break;로 대체가능
			} else if(userInput == 1) {
				System.out.println("입력");
			} else if(userInput == 2) {
				System.out.println("출력");
			} else {
				System.out.println("입력 값이 올바르지 않습니다.");
				System.out.println("다시 입력 하세요.");
			}
			
		}//while
		
	}//main

}//class
