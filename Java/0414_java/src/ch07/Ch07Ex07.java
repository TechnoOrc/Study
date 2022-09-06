package ch07;

/*
 * Object를 상속받아 나만의 toString()과 equal()을 만들어 보자
 * 	- 모든 class의 최상위 class : Object
 */
class Ch07MyClass{
	String compareStand;//비교 기준
	Ch07MyClass(){}
	Ch07MyClass(String str){
		this.compareStand = str;
	}//Ch07MyClass
	
	@Override
		public boolean equals(Object obj) {
			Ch07MyClass imsi = (Ch07MyClass)obj;
			//equals를 조작하여, 나만의 비교 메소드를 만들 수 있다.
			return (this.compareStand == imsi.compareStand);
			
		}//equals
	@Override
	public String toString() {
	// toString() 메소드를 오버라이드 하여, 나만의 메세지 출력 문을 만들 수 잇다.
		return "객체에 대한 안내문 입니다.\n\'" + compareStand + "\'가 저장된 데이터 입니다.\n감사합니다.";
	}//toString

}//class Ch07MyClass

public class Ch07Ex07 {

	public static void main(String[] args) {

		Ch07MyClass test1 = new Ch07MyClass("hello");
		Ch07MyClass test2 = new Ch07MyClass("hello");
		Ch07MyClass test3 = new Ch07MyClass("hello?");
		System.out.println(test1.equals(test2));
		System.out.println(test1.equals(test3));
		System.out.println(test1.toString());
		
	}//main

}//class
