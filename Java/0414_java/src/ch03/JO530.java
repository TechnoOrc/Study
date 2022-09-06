package ch03;


import java.util.Scanner;

public class JO530 {

	public static void main(String[] args) {
		// 1. 나이를 입력받아 
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		scan.close();
		
		// 2. 20살 이상이면 "adult"라고 출력하고 
		if(age >= 20) {
			System.out.println("adult");
		}
		// 3. 그렇지 않으면 몇 년후에 성인이 되는지를 "○ years later"라는 메시지를 출력하는 프로그램을 작성하시오.
		else {
			int years = 20 - age;
			System.out.printf("%d years later",years);
		}//else
		
	}//main

}//class
