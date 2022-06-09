package ch051;

import ch051.access.DefaultObject;

public class Access2Default {

	public static void main(String[] args) {

		DefaultObject obj = new DefaultObject();

		//System.out.println(obj.defaultStr);//default 변수는 다른 폴더에서는 접근 불가능
		//obj.defaultPrint();//default 메소드는 다른 폴더에서는 접근 불가능

		System.out.println(obj.defaultStr2);//public 변수는 접근 가능
		obj.defaultPrint2();//public 메소드는 접근 가능

	}//main

}//class