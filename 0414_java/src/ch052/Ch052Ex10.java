package ch052;

/*
 * abstract Inheritance & Polymorphism 의 모든 개념 적용 가능
 */
abstract class AbstractA {
	abstract void abstractMethod();
}//abstract class abstractA

abstract class AbstractB extends AbstractA{
	//abstract도 상속이 된다.
}//abstract class abstractB

class AbstractChild1 extends AbstractB {// Abstract 를 상속받은 클래스 들은 받으시 강제로 오버라이드 해야한다.///
	@Override
	void abstractMethod() {
		// TODO Auto-generated method stub
		
	}
}

class AbstractChild2 extends AbstractB {
	String hello = "반갑습니다.";
	@Override
	void abstractMethod() {
		System.out.println(hello);
	}
	
}

public class Ch052Ex10 {//abstract도 Polymorphism 적용 가능
	
	static AbstractA [] arr = new AbstractA[2];//Heterogeneous Collection

	public static void main(String[] args) {
		arr[0] = new AbstractChild1();//arr[0] : 부모 타입의 변수를 Arguments에 넣음
		arr[1] = new AbstractChild2();//
		printAbstract(arr[0]);
		printAbstract(arr[1]);
		
	}//main
	
	public static void printAbstract(AbstractA abs) {//Polymorphic Arguments
		abs.abstractMethod();
		//===================
		//Object Data Type Casting & instanceof 가능
		if(abs instanceof AbstractChild1) {
			AbstractChild1 one = (AbstractChild1) abs;
		} else if(abs instanceof AbstractChild2) {
			AbstractChild2 two = (AbstractChild2) abs;
			
		}
		
	}//printAbstract
}//class
