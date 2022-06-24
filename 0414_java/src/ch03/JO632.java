package ch03;

import java.util.Scanner;

/*
 * 3개의 정수를 입력받아 
 * 조건연산자를 이용하여 입력받은 수들 중 최소값을 출력하는 프로그램을 작성하시오.
 * 입력 예) 18 -5 10
 * 출력 예) -5
 */
public class JO632 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int iVar1 = scan.nextInt();
		int iVar2 = scan.nextInt();
		int iVar3 = scan.nextInt();
		scan.close();
		int tools = (iVar1 > iVar2 ? iVar2 : iVar1);
		
		System.out.println(tools > iVar3 ? iVar3 : tools);
		
//		int min = 0;
//		if(iVar1 > iVar2) {
//			min = iVar2;
//		} else {
//			min = iVar1;
//		}
//		
//		if(min > iVar3) {
//			min = iVar3;
//		}
//		System.out.println(min);
	
	}//main

}//class
