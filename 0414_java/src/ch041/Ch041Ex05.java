package ch041;

public class Ch041Ex05 {

	public static void main(String[] args) {
		//반복문은 array의 친구.
		//배열은 index를 통한 순차(순서대로) 접근이 가능하다.
		
		int [] iArr1 = new int [9];
		//iArr1.length == 9 //iArr1.index : 0 ~ 8
		
		for(int i = 0; i < iArr1.length; i++) {
			iArr1[i] = (i +1) * 2;
		}//for문을 이용한 배열 입력//구구단 2단 입력
		
		for(int i = 0; i < iArr1.length; i++) {
			System.out.printf("%d\t",iArr1[i]);
		}//for문을 이용한 배열 출력
		
	}//main

}//class
