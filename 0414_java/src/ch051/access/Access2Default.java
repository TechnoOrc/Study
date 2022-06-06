package ch051.access;

public class Access2Default {

	public static void main(String[] args) {

		DefaultObject obj = new DefaultObject();
		System.out.println(obj.defaultStr);//같은 폴더에서 접근 가능
		obj.defaultPrint();//같은 폴더에서 접근 가능

	}//main

}//class