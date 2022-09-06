package ch03;

import java.util.Scanner;

//100 이하의 양의 정수만 입력된다.
//while 문을 이용하여 1부터 입력받은 정수까지의 합을 구하여 출력하는 프로그램을 작성하시오.
//입력 예) 10
//출력 예) 55
public class JO537 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하시오 : ");
		int userInput = scan.nextInt();
		scan.close();
		if (userInput >= 1 && userInput <= 100) {
			int sum = 0;
			int loopCnt = 1;
			while (loopCnt <= userInput) {
				sum += loopCnt;
				loopCnt++;
			} // while
			System.out.println(sum);

		} // if

	}// main

}// class
