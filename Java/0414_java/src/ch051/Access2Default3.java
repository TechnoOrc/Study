package ch051;

import ch051.access.DefaultObject;

public class Access2Default3 extends DefaultObject {

	public static void main(String[] args) {

		Access2Default3 test = new Access2Default3();
		//System.out.println(test.defaultStr);//default 변수는 상속해도 접근 불가능
		//test.defaultPrint();//default 메소드도 상속해도 접근 불가능

	}//main

}//class