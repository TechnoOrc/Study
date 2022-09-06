package ch03;

import java.util.Scanner;

/*
 * 두 개의 실수를 입력받아 
 * 모두 4.0 이상이면 "A", 
 * 모두 3.0 이상이면 "B", 
 * 아니면 "C" 라고 출력하는 프로그램을 작성하시오.
 * 입력 예) 5.3 3.5
 * 출력 예) B
 */
public class JO532 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double var1 = scan.nextDouble();
		double var2 = scan.nextDouble();
		scan.close();
		
		if(var1 >= 4.0 && var2 >= 4.0) {
			System.out.println("A");
		} else if(var1 >= 3.0 && var2 >= 3.0) {
			System.out.println("B");
		} else {
			System.out.println("C");
		}
		
		
		
	}//main

}//class
