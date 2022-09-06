package ch052;

/*
 * final : 최종적인 : 변경 불가능 : 수정 불가
 *  - final variable : 변경 불가능한 변수 : 상수
 *  - final method : 변경 불가능한 메소드 : override 불가
 *  - final class : 변경 불가능한 클래스 : 상속 불가
 */
/*
 * final method : 변경 불가능한 메소드 : override 불가
 */
class Ch052Parent1 {
	public final void finalMethod() {
		System.out.println("finalMethod");
	}
}

class Ch052Child1 extends Ch052Parent1 {
	//public final void finalMethod() {}//error : override 불가
}

public class Ch052Ex02 {

	public static void main(String[] args) {

	}//main

}//class 
