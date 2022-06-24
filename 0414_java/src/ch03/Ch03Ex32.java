package ch03;

import java.util.Scanner;

public class Ch03Ex32 {

	public static void main(String[] args) {
		// Ch03ex31 정수 계산기의 switch문을 if문으로 변경하여 만들어보자.
		// 계산기의 작동 순서 : 정수 입력, 기호 입력, 정수 입력, 결과 변수. 
		// 1. 입력
		int fNum, sNum, res=0; // 변수 res를 초기화 하니 않으면 에러 발생.
		String giho;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		fNum = scan.nextInt();
		
		System.out.print("+ - * / 중 하나의 기호 입력 : ");
		giho = scan.next();
		
		System.out.print("정수 입력 : ");
		sNum = scan.nextInt();
		
		scan.close();
		
		// test module 1.
		//System.out.printf("%d %s %d\n",fNum, giho, sNum);
		
		// module 2. 게산 - if
		/*
		if(giho == "+") { //giho는 new를 통해 생성되는 변수들은 String intance의 주소값이 저장되어 있으므로 직접 비교연산자를 하지 않고 equals를 사용한다.
		
		}
		*/
		if(giho.equals("+")) {
			res = fNum + sNum;
		} else if(giho.equals("-")) {
			res = fNum - sNum;
		} else if(giho.equals("*")) {
			res = fNum * sNum;
		} else if(giho.equals("/")) {
			res = fNum / sNum;
		} else {
			System.out.println("입력된 값이 올바르지 않습니다. ");
			System.out.println("계산기를 종료합니다.");
			System.exit(0);
			
		}
			System.out.printf("%d %s %d = %d\n",fNum, giho, sNum, res);		
		
	}//main

}//class


