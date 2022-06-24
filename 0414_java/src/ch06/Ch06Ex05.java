package ch06;

import java.util.Scanner;

/*
 * finally
 * 	- try ~ catch의 뒷처리 담당
 * 	- exception의 발생 여부와 관계 없이 try문의 다음에는 반드시 실행되는 코드 블럭{}
 * 	- 예외가 발생해도 실행되고, 예외가 없어도 실행되는 코드가 위치하는 곳
 */

public class Ch06Ex05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수 입력 : ");
		
		int userInput = 0;
		
		try {//포위망//문제가 발생하면 처리할 수 있는 공간을 설정
			userInput = scan.nextInt();
			System.out.println("userInput : " + userInput);
		} catch (Exception e) {
			System.out.println("wrong input. try again.");
			e.printStackTrace();//exception을 확인하고 싶을 때 사용.
		}finally {
			scan.close();
		}//finally
		
		
		
		
	}//main
}//class
