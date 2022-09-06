package ch03;

public class Ch03Ex39 {

	public static void main(String[] args) {
		// 구구단
		int dan = 2;// 초기식 : 위치는 while문장 바로 위 : 2단부터
		while (dan <= 9) {// 조건 비교식 : true인 동안 반복 : 9단까지
			System.out.println("==== " + dan + "단 ====");
			
			int gop = 1;// 초기식 : 위치는 while문장 바로 위 : 1부터
			while (gop <= 9) {// 조건 비교식 : true인 동안 반복 : 9까지
				System.out.printf("%d * %d = %d\t", dan, gop, dan * gop);
				if(gop % 3 == 0) System.out.println();
				gop++;// 증값식
			} // while

			System.out.println();//줄만 한 번 변경
			dan++;//증감식 : 위치는 while문장 종료 직전 

		} // while

	}// main

}// class
