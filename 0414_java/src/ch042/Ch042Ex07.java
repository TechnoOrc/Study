package ch042;

//멤버 변수와 지역 변수의 이름이 같을 때, 지역 변수를 먼저 적용.

class Ch042Dummy2 {

	String memberVar = "멤버 변수";

	void print() {
		String memberVar = "지역 변수";
		System.out.println("memberVar : " + memberVar);
		System.out.println("this.memberVar : " + this.memberVar);
		/*
		 * this.memberVar
		 *  - . : ~의 안에 있다 : a.b -> a안에 b 있다
		 *  - this안에 memberVar라는 의미
		 *  - 그렇다면, this는? 현재 instance (Method 아님) (정확한 의미)
		 *  - 그렇다면, this는? 현재 class (이해를 돕기 위해)
		 */
	}//print

}//class

public class Ch042Ex07 {

	public static void main(String[] args) {

		Ch042Dummy2 dummy = new Ch042Dummy2();//instance
		dummy.print();

		Ch042Dummy2 dummy2 = new Ch042Dummy2();//instance
		dummy2.memberVar ="더미2 인스턴스";
		dummy2.print();

	}//main

}//class