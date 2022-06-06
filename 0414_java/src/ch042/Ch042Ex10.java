package ch042;

/*
 * JRE가 자바 프로그램을 실행 시킨다.
 * 그렇다면, JRE는 메소드를 어떻게 구분하는가?
 *  - 메소드 이름 + arguments로 구분한다.
 *     -> 이름 또는 arguments가 다르면 -> 다른 메소드다.
 *  - 메소드의 이름이 같아도, arguments가 다르면, 다른 메소드로 인식한다.
 *  - 메소드의 이름과 arguments가 같으면 error
 * Method Overload, Method Overloading// 상속아님 오버 라이딩 아님
 *  - 하나의 class에 arguments가 다르고, 이름은 동일한 메소드를 여러 개 선언 가능하다.
 *  - 기능적으로는 같으나, 수행을 위해 받는 데이터가 다른 경우.
 *  - 예)System.out.println("문자열");System.out.println(123);
 *  - 동일한 기능을 수행 한다면, 다루는 데이터가 다르더라도
 *    하나의 통일된 이름으로 접근하는 것이 복잡도를 낮춘다(편리하다). 
 */

class Ch042Dummy4{
	
	int intPlus() {
		return 1;
	}//
	
	//void intPlus() {}//error
	
	int intPlus(int iVar) {
		return 1 + iVar;
	}//
	
	int intPlus(int iVar1, int iVar2) {
		return iVar1 + iVar2;
	}//
	
	int intPlus(int [] iArr) {
		return iArr[0] + iArr[0];
	}//
	
	
}//class

public class Ch042Ex10 {

	public static void main(String[] args) {

		
		
	}//main

}//class
