package ch03;

/*
 * break : stop을 명령할 때.
 * - 프로그램의 흐름을 종료 시킨다.
 * - 가장 가까운 반복문만 종료.
 */
public class Ch03Ex52 {

	public static void main(String[] args) {

		for(int dan = 2; dan <= 9; dan++) {
			for(int gop = 1; gop <= 9; gop++) {
				if(gop == 5) break;//현재 break가 사용된 반복문만을 중지한다.
				System.out.printf("%d * %d = %d\t",dan,gop,dan*gop);
			}//for
			System.out.println();
		}//for
		
	}//main

}//class


