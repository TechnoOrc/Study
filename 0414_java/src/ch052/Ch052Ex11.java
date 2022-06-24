package ch052;

/*
 * interface : 특별한 class : class의 한 종류
 * - abstract method로만 이루어진 특별한 class
 * - class 대신 interface 선언을 사용한다
 * 	- 예) public interface Saram{} //
 * - 변수는 final static 변수만 사용한다
 * - 정상적인 일반 메소드는 사용 못한다.
 * - 메소드는 오직 abstract method만 사용 가능하다
 * - new를 통한 instance 생성이 불가능하다
 * - interface를 상속받는 클래스에게 abstract method의 구현을 강제한다
 */
/*
 * interface의 탄생 배경
 * - abstract 메소드를 상속 시켜서
 *   상속 받는 클래스에게 메소드 구현을 강제하고 싶은데
 * 	 자바는 단일 상속만 가능
 * - 기능적으로는 abstract class와 같고
 * - 이미 상속을 받는 클래스에게 interface를 상속시켜서
 *   상속 받는 클래스에게 메소드 구현을 강제 하기위해 만들어졌다
 */

interface InterTest1 { //접근제한자가 default됨 
	public int iVar1 = 777;// final static저 iVar1의 글씨체로도 구분가능
	public final static int iVar2 = 888;//final static
	
	//public void nomalMethod() {}//error 정상적인 일반 메소드={}가 있는 메소드 사용불가
	
	public abstract void abstractMethod1();//{}가 없음 // 자동으로 abstract method1
	
	public void abstractMethod2();//{}가 없음 // interface 안에서는 abstract 안써도 {}가 없으면 생략가능
	
	
}//interface
public class Ch052Ex11 {

	public static void main(String[] args) {

		
		
	}//main

}//class
