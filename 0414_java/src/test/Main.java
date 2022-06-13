package test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int intVar1 = scan.nextInt();
		int intVar2 = scan.nextInt();
		System.out.println(intVar1 + " * " + intVar2 + " = " + intVar1 * intVar2);
		System.out.print(intVar1 + " / " + intVar2 + " = " + intVar1 / intVar2);
		
	}

}
