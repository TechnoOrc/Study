package ch03;

public class Ch03Ex56 {
	
	public static void main(String[] args) {
		//홀수 출력, 짝수 출력, 배수 출력.
		// 1에서 100까지 홀수 출력
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 1) System.out.printf("%d\t",i);
		}//for
		System.out.println();
		
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 1) continue;
			System.out.printf("%d\t",i);
		}//for
		System.out.println();
		
		//0에서 200까지 13의 배수 출력
		for(int i = 0; i<= 200; i++) {
			if(i %13 == 0) System.out.printf("%d\t",i);
		}//for
		
	}//main
	
}//class
