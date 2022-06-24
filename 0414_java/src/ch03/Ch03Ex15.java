package ch03;

import java.util.Scanner;

public class Ch03Ex15 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		//1 : 가위, 2 : 바위, 3 : 보
		System.out.print("정수 1 / 2 / 3 / 입력 : ");
		int yourChoice = scan.nextInt();
		System.out.println("your Choice : " + yourChoice);
		
		int comChoice = (int) (Math.random() * 3 + 1 );
		System.out.println("Computer Choice : " + comChoice);
		//Math.random() : 0.0 ~ 1.0 미만 ( 0.0 ~ 0.999999....)
		//Math.random() * 3 => 0.0 ~ 2.99999999 =>
		//1,2,3을 나오게 하기 위해 +1 수행 하면 1.0 ~ 3.99999 (int)로 demotion하여 정수만 추출가능
		
		if(	(yourChoice == 1 && comChoice == 2) 
			|| (yourChoice == 2 && comChoice == 3)
			|| (yourChoice == 1 && comChoice == 1) ) {
				System.out.println("패배");
		}//if
		
		if((yourChoice == 1 && comChoice == 3)
			|| (yourChoice == 2 && comChoice == 1) 
			|| (yourChoice == 3 && comChoice == 2)){ 
			System.out.println("승리");
		}//if
		
		if(yourChoice == comChoice) {
			System.out.println("비김");
			
		}//if
				
				
		scan.close();
		
		
	}//main
	
}//class
