package ch051;

/*
 * super : 부모를 지칭하는 키워드
 *	- 자식에서 부모의 변수를 호출하고 싶을 때 : super.변수;
 *	- 자식에서 부모의 메소드를 호출하고 싶을 때 : super.부모메소드();
 *	- super가 자식의 생성자에서 ()와 함께 쓰이면, 부모의 생성자를 호출
 *		- super()는 생성자의 첫째 라인에서만 사용될 수 있다.
 * */

class Ch051Parent3 {
	
	String memVar = "parent memVar";
	
	public Ch051Parent3(){
		System.out.println("부모 클래스의 생성자가 호출되었습니다.");
	}
	
	public Ch051Parent3(String s){
		System.out.println(s);
		
	}
	
	void print() {
		System.out.println("Ch051Parent3의 print 메소드");
	}
	
}

class Ch051Child3 extends Ch051Parent3 {
	
	String memVar = "child memVar";
	
	public Ch051Child3() {
		//super();
		super("부모 생성자 호출"); //super() :부모의 생 
	}
	
	void print() {
		System.out.println("  ====>  Ch051Child3의 print 메소드");
		super.print();//자식에서 부모를 호출하고 싶을 때 : super
		System.out.println("memVar : " + memVar);
		System.out.println("super.memVar : " + super.memVar);
	}
	
}//class

public class Ch051Ex12 {

	public static void main(String[] args) {
		Ch051Parent3 p = new Ch051Child3();//특수한 메서드의 실행후에 아래 p.print() 실행된다.
		p.print();//method override에 의해 자식의 print() 호출
		
	}//main

}//class
