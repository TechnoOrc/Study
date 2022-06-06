package ch03;

/*
 * do ~ while
 *  - while문은 flase이면 수행 안함.
 *  - do ~ while문은 flase이어도 최초 1회 수행하는 문장.
 */
public class Ch03Ex54 {

	public static void main(String[] args) {
		
		/*while(false) {
			System.out.println("실행 불가 코드");
		}*///while
		
		do {
			System.out.println("최초 1회 실행 후, (조건 비교) 실행");
		} while(false);
		
		
		
	}//main

}//class
