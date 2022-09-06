package ch07njm;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

/*
 * 다중 catch문 : try문의 에외 발생이 여러 종류의 예외가 발생할 경우
 * 주의사항 : catch문에 Exception 사용할때는 반드시 맨 아래쪽 catch문에서 사용해야 된다.
 */
public class Ch11Ex03 {

	public static void main(String[] args) {
		int k = 100;
		Scanner sc = new Scanner(System.in); // Scanner 생성
		
		try {
			int var = 50;
			System.out.print("정수 입력 : ");
			int su = sc.nextInt();
			System.out.println("정답 : " + (var / su));
			k = k + 10;
		} catch (Exception e) {
			System.out.println("정상적입 입력을 해주세요 : " + e);
			k = k + 100;
		}
//			catch (ArithmeticException e) {
//			System.out.println("0으로는 나눌 수가 없습니다.");
//			k = k + 1000;
//		}//catch
//		
		System.out.println("k = " + k);
		System.out.println("수고하셨습니다.");

	}//main

}//class
