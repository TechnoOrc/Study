package ch03;

public class Ch03Ex36 {

	public static void main(String[] args) {
		//0부터 10까지 출력
		int loopCount = 0;//초기식 : 0부터
		while(loopCount <= 10) {//조건 비교식 : 10까지
			System.out.print(loopCount + " ");///t : 탭 크기만큼 공백을 넣자.
			loopCount++;//증감식 - 증가
		}//while
		
		System.out.println();
		System.out.println();
		//10부터 0까지 출력
		loopCount = 10;//초기식 : 10부터
		while(loopCount >= 0) {//조건 비교식 : 0까지
			System.out.print(loopCount + " ");
			loopCount--;//증감식 - 감소
		}//while
		
	}//main

}//class
