package ch03;
/*
 * while : ~하는 동안 : 반복문 : Loop Statement
 * while(반복 조건) {수행 코드}
 *  - (반복 조건)이 true인 동안, {수행 코드}를 반복해서 계속 수행.
 *  - (반복 조건)은 true/false를 나타내는 표현식이 들어간다.
 */
public class Ch03Ex33 {

	public static void main(String[] args) {

		/*while(false) {// -> 실행 X false -> 실행 X
			System.out.println("여기는 false.");
		}*///while
		
		while(true) {// 무한 LOOP -> 강제종료
			System.out.println(1);
			System.out.println(2222222);
			System.out.println(333333333333L);
		}//while
		
		
		
	}//main

}//class
