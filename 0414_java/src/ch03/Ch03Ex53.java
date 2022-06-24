package ch03;

/*
 * continue
 * - 프로그램의 흐름을 건너 뛴다.
 * - 가장 가까운 반복문만 건너 뛴다.
 */
public class Ch03Ex53 {

	public static void main(String[] args) {

		for(int dan = 2; dan <= 9; dan++) {
			for(int gop = 1; gop <= 9; gop++) {
				if(gop == 5)continue;//특정 조건에서 수행하고 싶지 않을 때.
				System.out.printf("%d * %d = %d\t",dan,gop,dan*gop);
			}//for
			System.out.println();
		}//for
		;
	}//main

}//class
