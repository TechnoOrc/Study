package ch02;

/*
 * 변수의 생성
 * 	- 선언과 초기화로 구성
 * 	- 변수의 선언 : 변수의 형태와 이름을 정하는 것.
 * 	- 변수의 초기화 : 변수에 최초의 값을 넣는 것. (맨 처음의 값으로 되돌리는 의미가 아니고 , 대입하는 행위이다.)
 * 	- 이 예제에서는 정수 타입의 데이터 int를 사용.
 * 	- int : 자바에서 정수를 변수로 사용하는 방법 중의 하나.
 */
public class Ch02Ex03 {
	
	public static void main(String[] args) {
		
		int data1;
		/*
		 * int data1; //변수의 선언. 
		 * 	- 메모리에 정수를 담는 공간 하나를 만들고, 그 공간의 이름은 data1로 지정해라.
		 */
		data1 = 9876;
		/*
		 * data1 = 9876; // 변수의 초기화.
		 * 	- data1이라고 이름 붙은 공간에 9876을 넣어라.
		 * 	- equal 기호(=)은 같다는 말이 아니다.
		 *  - equal 기호(=)는 대입 연산자.
		 * 	- equal 기호(=)는 우항의 값을 좌항에 넣어라.
		 */
		int data2 = 8765;//선언과 초기화를 한번에 할 수도 있다.
		
		int a=1,b=2,c=3,d=4,e=5; //여러 개 동시 처리 가능. 
		
		System.out.println(data1);
		System.out.println(data2);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}//main

}//calss
