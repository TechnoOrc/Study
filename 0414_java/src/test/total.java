package test;

import java.util.Scanner;

public class total {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int k = scan.nextLine();
		
		for(int i = 2; i <= 9; i++){
			
			for(int k = 1; k <= 9; k++) {
				System.out.println(i + " * " + k + " = " + i*k);
			}//for
			System.out.println();
			
		}//for
		
		
		
	}//main
	
	
	
}//class
