package ch041;

/*
 * 2차원 배열 : 배열의 배열
 *  - 1차원 배열 : 나 홀로 아파트 : 아파트 이름 + 호수 : 변수 이름 + index
 *  - 2차원 배열 : 아파트 단지 : 아파트 이름 + 동번호 + 호수 : 변수이름 + index + index 
 */
public class Ch041Ex08 {

	public static void main(String[] args) {
		// 2차원 배열의 길이 개념

		int[][] iMultiArr = new int[10][10];
		for (int idx1 = 0; idx1 < iMultiArr.length; idx1++) {

			for (int idx2 = 0; idx2 < iMultiArr[idx1].length; idx2++) {

				iMultiArr[idx1][idx2] = (idx1 + 1) * (idx2 + 1);

			} // for

		} // for

		for (int idx1 = 0; idx1 < iMultiArr.length; idx1++) {

			for (int idx2 = 0; idx2 < iMultiArr[idx1].length; idx2++) {
				
				System.out.print(iMultiArr[idx1][idx2]+ " ");

			} // for
			System.out.println();
		} // for

	}// main

}// class
