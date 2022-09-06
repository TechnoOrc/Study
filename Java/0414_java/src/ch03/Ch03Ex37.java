package ch03;

public class Ch03Ex37 {

	public static void main(String[] args) {
		//while문의 중첩 : 기억할 점 : 위치(초기식, 증감식, 조건비교식)를 꼭 기억하라!
		int hak = 1;//학년//초기식.
		while(hak <= 3) {//조건 비교식.
			System.out.println(hak + " 학년");
			//학년별 10반까지
			int ban = 1;//초기식 : 반부터
			while(ban <= 10) {//조건 비교식 : 10반까지
				System.out.println("\t" + ban + "반");
				ban++;
			}//while
			
			hak++;//증감식.
		}//while
		
	}//main

}//class
