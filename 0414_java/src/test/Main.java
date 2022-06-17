package test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int jungArr [] = new int [10];
		int min = 1000;
		int max = 0;
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < jungArr.length; i++) {
			jungArr [i] = scan.nextInt();
			
		}//for
		
		for (int i = 0; i < jungArr.length; i++) {
			if (jungArr [i] < min) {
				min = jungArr[i];
			} else if (jungArr [i] > min) continue;
		}		
		
		System.out.print(min);
	}//main

}//class
