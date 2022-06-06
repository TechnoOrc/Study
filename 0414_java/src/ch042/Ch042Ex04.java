package ch042;

/*
 * 멤버 변수	: class를 구성하는 변수 : class의 속성 : 예) 사람(class)의 이름(멤버 변수)처럼.
 * 지역 변수	: 메소드의 작업에 필요한 변수 : (), {}내부에 존재하는 변수
 * 			: 메소드가 실행될 때만 만들어 졌다가, 메소드가 종료되면 사라진다.
 * 			: 지역변수는 선언된 (), {} 밖에서는 접근이 안된다.
 *  - 멤버 변수와 지역 변수는 같은 이름을 사용할 수 있으나, 일반적으로 같은 변수명은 피함.
 *  - 멤버 변수와 지역 변수의 이름이 같을 때, 지역 변수를 먼저 적용.
 */

class LoclaVarTest{

	int memberInt = 999;

	void print() {
		int localInt = 333;//print() 실행 시에만 생성되는 지역 변수.
		System.out.println("localInt : " + localInt);
		int memberInt = 555;
		System.out.println("local memberInt : " + memberInt);//지역 변수 우선
		System.out.println("this.memberInt : " + this.memberInt);//this : 현재 instance를 지칭.
	}//print

}//class

public class Ch042Ex04 {

	public static void main(String[] args) {

		{
			int iVar1 = 777;//지역 변수 : 자신을 선언한 {} 밖에서는 접근 안됨.
			System.out.println("main의 지역 변수 : " + iVar1);
		}
		//System.out.println(iVar1);
		LoclaVarTest test = new LoclaVarTest();
		test.print();

	}//main

}//main 
