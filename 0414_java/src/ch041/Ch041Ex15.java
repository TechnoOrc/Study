package ch041;

public class Ch041Ex15 {

	public static void main(String[] args) {//9 * 9eks

		String [][] strArr = new String[10][10];
		
		for(int i = 0; i < strArr.length; i++) {
			
			for(int k = 0; k < strArr.length; k++) {
				strArr[i][k] = i + " * " + k + " = " + i*k;
				
			}//for
			
		}//for
		
		for(int i = 0; i < strArr.length; i++) {
			
			for(int k = 0; k < strArr.length; k++) {
			System.out.print(strArr[i][k] + "\t");
			if(k == 5) {
				System.out.println();
			}
			}//for
			System.out.println();
			System.out.println();
		}//for
		
	}//main

}//class
