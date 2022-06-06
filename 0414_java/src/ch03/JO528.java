package ch03;

import java.util.Scanner;

public class JO528 {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		int iVar = scan.nextInt();
		scan.close();
		
		System.out.println(iVar);
		if(iVar < 0) {
			System.out.println("minus");
		}//if
		
	}//main

}//class
