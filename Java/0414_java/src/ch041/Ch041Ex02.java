package ch041;

public class Ch041Ex02 {

	public static void main(String[] args) {
		//배열의 선언, 생성, 초기화.
		int [] iArr1; //배열의 선언
		int iArr2 []; //베열의 선언
		iArr1 = new int[3];//배열을 생성할 때, 크기(길이)를 반드시 정해야 함.
		//iArr2 = new int[];//크기(길이) 없으면 에러
		
		iArr1[0] = 777;
		System.out.println(iArr1[0]);
		System.out.println(iArr1[1]);
		//primitive data type 배열을 생성하면 기본 값으로 초기화가 이루어 짐.
		
		int [] iArr3 = new int [10];//선언과 생성을 한 번에.
		int [] iArr4 = {1,2,3,4,5};//선언과 동시에 초기화
		//중괄호를 사용하여, 5칸 짜리 배열을 생성하며, 값을 초기화 할수 있다.
		System.out.println(iArr4[2]);
		
		int [] iArr5;
		//iArr5 = {6,7,8,9,};//error//선언 이후에 중괄호 사용불가.
		
	}//main

}//class

