package ch052;

import ch052.Ch052Ex15.InnerA;

public class Ch052Ex16 {

	public static void main(String[] args) {

		Ch052Ex15 test = new Ch052Ex15();
		InnerA inA = test.new InnerA();
		// 다른 class의 Inner Class 사용하려면 import 필요함!!!
		System.out.println(inA.getInIVar());
		
		
	}//main

}//class
