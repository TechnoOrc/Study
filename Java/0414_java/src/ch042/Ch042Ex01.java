package ch042;
/*
 * 멤버 변수 : class 내부에 선언된 변수
 * 지역 변수 : 메소드 내부에 선언된 변수
 */
/*

/*
 * class : 현실 세계를 모델링한 결과를 프로그램의 세계에 적용하기 위하여 만든 자바 설계도.
 * ~.java 파일 내부에 있는 class 선언은 new를 통해 메모리에 load 된다.(메모리에 올라 간다)
 * 메모리에 올라간 class를 instance라고 부른다.
 * class는 붕어빵 틀, instance는 붕어빵.
 * 하나의 class는 무한대의 instance 생성 가능.
 * String s1 = new String("hi"); String s2 = new String("hi"); String s3, s4, s5.....
 * 자바에서 현실 세계 모델링 -> class 파일을 설계하는 것.
 * 그래서 class 파일의 구성 요소들을 알아야 한다.
 * - package, import, 멤버 변수, 멤버 메소드, 생성자(특수한 메소드).
 */
/*
 * 메소드란?
 *  - 멤버 변수는 정적인 data 부분을 의미
 *  - 멤버 메소드는 동적인 수행을 담당.
 *  - 접근 제한자 + 리턴 타입 + 메소드 이름 + 파라미터(arguments)
 *  - 리턴 타입 : 이 메소드의 수행 결과 나오는 데이터가 어떤 변수 타입인지 알려주는 기능 : 자판기의 제목 목록
 *  - (arguments) : 이 메소드를 수행하기 위해 필요한 데이터를 입력 받는 공간. : 자판가의 돈 투입구
 *  - return : 메소드의 수행 결과를 준다 : 자판기의 제품 출구
 *  - 어떤 목적을 수행하기 위해, class의 내부에 선언된 코드 블럭
 */

public class Ch042Ex01 {
/*	
	public String name;
	public int age;
	public double height;
	public double weight;
	public char bltye; //멤버 변수 : 멤버 메소드와 함께 class의 구성 요소.
*/	
	
	public static void main(String[] args) {
		//static이 선언된 부분은 즉시 메모리에 load.
		//main은 static이기 때문에 new 없이 메모리 load
		//System.out.println("test");

		//print();//error//print()가 메모리에 올라가지 않았다.
		//class가 메모리에 올라가기 위해서는 new를 받아야한다.
		
		Ch042Ex01 test = new Ch042Ex01();
		String str1 = new String("kkkk");
		System.out.println(str1);
		test.print();
		test.plus(777, 8);
		boolean imsi = test.compareStringLength("hi", "hello");
		
		System.out.println(imsi);
	}//main
	
	public void print() {
		//void : 없다 : 리턴 타입이 없음 : 실행만 할 뿐, 나에게 값을 돌려주지 않는다.
		System.out.println("출력 메소드");
	}//print
	
	public void plus(int iVar1, int iVar2) {
		//arguments : 메소드가 수행하기 위해 필요한 데이터를 받는 곳.
		System.out.println(iVar1 + iVar2);
	}//plus
	
	public boolean compareStringLength(String str1, String str2) {
		if(str1.length() == str2.length()) return true;
		else return false;
	}//compareStringLength
	
}//class
