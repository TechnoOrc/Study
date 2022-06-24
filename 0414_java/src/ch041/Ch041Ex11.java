package ch041;

public class Ch041Ex11 {

	public static void main(String[] args) {
		//String의 2차원 배열에 구구단 식을 넣어라.
		String [][] smArr = new String[10][10];
		
		for(int idx1 = 0; idx1 < smArr.length; idx1++) {
			
			for(int idx2 = 0; idx2 < smArr[idx1].length; idx2++) {
				smArr[idx1][idx2] 
						= (idx1+1) + " * " + (idx2 + 1) + " = " + ((idx1+1) * (idx2 + 1));
			}//for
		}//for : 입력
		for(int idx1 = 0; idx1 < smArr.length; idx1++) {
			for(int idx2 = 0; idx2 < smArr[idx1].length; idx2++) {
				System.out.print(smArr[idx1][idx2] + "\t");
			}//for
			System.out.println();
		}//for
		
	}//main

}//class
