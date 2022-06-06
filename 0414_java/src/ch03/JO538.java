package ch03;

import java.util.Scanner;

/*
* 한 개의 정수를 입력받아 
* 양수(positive integer)인지 
* 음수(negative number)인지 출력하는 작업을 반복하다가 
* 0이 입력되면 종료하는 프로그램을 작성하시오.
 */
public class JO538 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int userInput = 0;
		while(true) {
			userInput = scan.nextInt();
			
			if(userInput == 0 ) break; // 한줄 이면 중괄호 없어도 가능
			else if(userInput > 0) System.out.println("positive integer");
			// 한줄 이면 중괄호 없어도 가능
			else if(userInput < 0) System.out.println("negative number");
			// 한줄 이면 중괄호 없어도 가능
			
			
		}//while
		scan.close(); 
		
		
	}//main

}//class
