package ch03;

public class Ch03Ex57 {
	
	public static void main(String[] args) {
		//1에서 100 까지 홀수 출력 1.
		for(int i = 0; i <= 100; i++) {

			if(i % 2 == 1) System.out.print(i + "\t");
			
		}//for
		System.out.println();
		//1에서 100 까지 홀수 출력 2.
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) continue;
			System.out.print(i + "\t");
		}//for
		System.out.println();
		
		//1에서 100 까지 짝수 출력 1.
		for(int i = 0; i <= 100; i++) {
			if(i % 2 == 0)System.out.print(i + " \t");
		}//for
		System.out.println();
		
		//1에서 100 까지 짝수 출력 2.
		for(int i = 0; i <= 100; i++) {
			if(i % 2 == 1)continue;
			System.out.print(i + "\t");
		}
		
	}//main
	
}//class
