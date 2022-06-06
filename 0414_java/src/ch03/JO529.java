package ch03;

import java.util.Scanner;

public class JO529 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int height = scan.nextInt();
		int weight = scan.nextInt();
		scan.close();
		
		int res = weight + 100 - height;
		if(res > 0) {
			System.out.println(res);
			System.out.println("obesity");
		} 
		
		
	}//main

}//class
