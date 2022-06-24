package ch051.access;

/*
 * Access Modifiers : 접근 제한자
 *  - class, 변수, 메소드에 대해서 접근 권한(보안) 등을 제한하는 역활
 *  - class의 경우는 public, default만 가능
 *  - 변수, 메소드의 경우는 public, protected, default, private 모두 가능
 *  - public : 누구나 접근 가능
 *  - protected : 같은 패키지(폴더) 안의 class에서만 + 상속 관계의 class에서만 접근 가능
 *  - default : 같은 패키지(폴더) 안의 class에서만 접근 가능
 *              접근 제한자 자리에 아무 것도 없는 것
 *  - private : 같은 class 내부에서만 접근 가능
 */
/*
 * private : 같은 class 내부에서만 접근 가능
 * 사용 이유?
 *  - 외부로부터 보호 하려는 변수나 메소드를 지정하는 의미
 *  - 값을 함부로 바꾸면 안되는 변수 등을 보호
 *  - 현재 클래스에서만 의미가 있는 메소드 (비공개 메소드)
 *  private 변수는 변수에 접근 가능한 방법(메소드)을 제공 : set변수명, get변수명
 *  - set변수명 : 변수에 값을 넣을 때 사용
 *  - get변수명 : 변수의 값을 가져올 때 사용
 *  - 직접적인 변수 접근을 차단 -> set/get 메소드만을 사용해서 접근하도록 제한
 */

public class Access1Private {

	public static void main(String[] args) {

		PrivateObject obj = new PrivateObject();
		//obj.age = 25;//error//직접 접근 불가
		//obj.privatePrint();//error//직접 접근 불가
		obj.setAge(25);//간접 접근 방법 제공
		System.out.println("나이 : " + obj.getAge());//간접 접근 방법 제공

	}//main

}//class






