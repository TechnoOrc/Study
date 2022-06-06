package ch051;

import ch051.access.ProtectedObject;

public class Access3Protected2 {

	public static void main(String[] args) {

		ProtectedObject.obj = new ProtectedObject();
		//System.out.println(obj.protectedStr);//protected 변수는 다른 폴더에서는 접근 불가능
		//obj.protectedStr();//protected 메소드도 다른 폴더에서는 접근 불가능
		
	}//main

}//class
