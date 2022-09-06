package ch041;

import java.util.Arrays;

public class Ch041Ex14 {

	public static void main(String[] args) {//9 * 9단
		
		int [][]strArr = new int[10][10];//index 0 ~ 8 // 1 ~ 9
		
		for (int i = 1; i < strArr.length; i++) {
			
			for(int k = 1; k < strArr.length; k++) {// 처음 시작을 1로부터 시작하여 헷갈림을 방지 [0][0]은 안쓰는걸로
				strArr[i][k] = i*k;
			
			}//for
			
			
		}//for
		
		for (int i = 0; i < strArr.length; i++) {
			
			System.out.println(Arrays.toString(strArr[i]));
		}//for
		
	}//main

}//class
