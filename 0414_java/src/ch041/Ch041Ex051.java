package ch041;

public class Ch041Ex051 {

	public static void main(String[] args) {

		int [] iArr = {99, 88, 77, 66, 55};
		
		for(int i = 0; i < iArr.length; i++) {
			
			if(iArr[i] % 3 == 0) {
				System.out.println("3으로 나눈 나머지가 0인 수 : " + iArr[i]);
				
			}//if
		}//for
		
	}//main

}//class
