package ch041;

public class Ch041Ex13 {

	public static void forFor(String [][] tmpArr, int workFlag) {
		for(int i = 0; i < tmpArr.length; i++) {
			for(int k = 0; k < tmpArr[i].length; k++) {
				if(workFlag == 1) {//입력
					tmpArr[i][k]
							= (i + 1) + " * " + (k + 1) + " = " + ((i+1) * (k+1));
				} else if(workFlag == 2) {//출력
					System.out.print(tmpArr[i][k] + "\t");
				}//if
			}//for
			if(workFlag == 2) System.out.println();
		}//for
	}//forFor

	public static void main(String[] args) {
		//String의 2차원 배열에 구구단 식을 넣어라.
		String [][] smArr = new String [10][10];

		forFor(smArr, 1);//for : 입력

		forFor(smArr, 2);//for : 출력

	}//main

}//class