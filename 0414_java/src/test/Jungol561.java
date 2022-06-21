package test;

import java.util.Scanner;

public class Jungol561 {

	public static void main(String[] args) {
		
		int iArr [] = new int [10];
		int min = 10000, max = 0;
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < iArr.length; i++) {
			iArr[i] = scan.nextInt();
			if(iArr[i] < 100)
			{
				if(max <= iArr[i]) {
					max = iArr[i];
				}
			} else if(iArr[i] >= 100){
				if(min > iArr[i])
				min = iArr[i];
			}//if
		}//for
		if(max == 0) {
			max = 100;
		} else if (min == 10000) min = 100;
			
		System.out.print(max + " " + min);
	
		
	}//main

}//class
