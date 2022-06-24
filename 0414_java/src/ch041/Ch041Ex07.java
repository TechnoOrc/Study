package ch041;

/*
 * 2차원 배열 : 배열의 배열
 *  - 1차원 배열 : 나 홀로 아파트 : 아파트 이름 + 호수 : 변수 이름 + index
 *  - 2차원 배열 : 아파트 단지 : 아파트 이름 + 동번호 + 호수 : 변수이름 + index + index 
 */
public class Ch041Ex07 {
	//

	public static void main(String[] args) {
		// 반복문은 array의 친구.
		// 배열은 index를 통한 순차(순서대로) 접근이 가능하다.
		// 1차원 배열은 기본적으로 반복문 1개.
		// 2차원 배열은 기본적으로 반복문 2개.(2중 반복문)
		int[][] iMultiArr = new int[10][10];
		for (int idx1 = 0; idx1 < iMultiArr.length; idx1++) {//각 동에 먼저 접근
			
			
			for (int idx2 = 0; idx2 < iMultiArr[idx1].length; idx2++) {// 각 동의 호수에 접근
				iMultiArr[idx1][idx2] = (idx1 + 1) * (idx2 + 1);
			} // for

		} // for 입력
		for (int idx1 = 0; idx1 < iMultiArr.length; idx1++) {//동 번호에 접근

			for (int idx2 = 0; idx2 < iMultiArr[idx1].length; idx2++) {//각 동의 호 번호에 접근
				System.out.printf("%d\t",iMultiArr[idx1][idx2]);
			} // for
			System.out.println();

		} // for 출력
	}// main

}// class
