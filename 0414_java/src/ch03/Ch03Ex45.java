package ch03;

import java.util.Scanner;

/*
 * 3자리 숫자 맞추기 게임
 *  - 컴은 임의의 0에서 999 3자리 이하 숫자를 발생 시킨다
 *  - 유저는 예상되는 숫자를 입력한다.
 *  - 컴은 유저가 입력한 숫자가 큰지, 작은지, 맞는지를 판단하여 알려준다.
 *  - 유저는 숫자를 맞출 때 까지, 입력을 반복한다.//입력은 반복문 안에 있어야 한다.
 */
public class Ch03Ex45 {

	public static void main(String[] args) {

		int comSelect = (int) (Math.random() * 1000);
		Scanner scan = new Scanner(System.in);
		int userInput = 0;//메모리에 32bit 저장 공간을 만들어라.
		int count = 0;
		
		while(true) {
			System.out.print("\n 0에서 999까지의 수를 맞춰 보세요. 입력 : ");
			userInput = scan.nextInt();
			count++;
			if(comSelect == userInput) {
				System.out.println("======================");
				System.out.println("정답 입니다.!!!");
				System.out.println(count + "회만에 맞추셨습니다.");
				System.out.println("게임을 종료 합니다.");
				System.out.println("======================");
				scan.close();
				System.exit(0);
			} else if (comSelect > userInput) {
				System.out.println("정답보다 작은 수를 입력 하셨습니다.");
			} else if (comSelect < userInput) {
				System.out.println("정답보다 큰 수를 입력 하셨습니다.");
			} else {
				System.out.println("입력 값이 올바르지 않습니다.");
			}//else

		}//while
		
		
	}//main

}//class
