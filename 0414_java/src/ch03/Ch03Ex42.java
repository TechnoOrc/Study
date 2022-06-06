package ch03;
/*
 * for : 반복문 : Loop Statement
 * - 초기식, 조건식, 증감식을 한 곳으로 모아 놓은 형태
 * - for(초기식; 조건식; 증감식) {수행 코드}
 */
public class Ch03Ex42 {

	public static void main(String[] args) {
		//구구단
		for(int dan = 2; dan <= 9;dan++) {
			System.out.println("=== " + dan + " 단 ===");
			
			for(int gop = 1; gop <= 9; gop++) {
				System.out.printf("%d * %d = %d\t",dan,gop,dan*gop);
				System.out.println();
				
			}//for
			
		}//for
		
	}//main

}//class