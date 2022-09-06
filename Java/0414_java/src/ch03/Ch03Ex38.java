package ch03;

public class Ch03Ex38 {

	public static void main(String[] args) {
		//구구단
		int dan = 2;//초기식 : 2단 부터
		while(dan <= 9) {//조건 비교식 : 9단까지
			System.out.println("===== " + dan + " 단 =====");
			
			int gop = 1;//초기식 : 1부터
			while(gop <= 9){//조건 비교식 : 9단까지
				System.out.printf("%d * %d = %d \t",dan, gop, dan * gop);
				System.out.println();
				gop++;//증감식
			}//while
				
			System.out.println();
			dan++;//증감식
		}//while
		
	}//main

}//class
