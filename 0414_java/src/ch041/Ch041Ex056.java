package ch041;

import java.util.Arrays;

public class Ch041Ex056 {

	public static void main(String[] args) {

		int [] lotto = new int [6];
		for(int i = 0; i < lotto.length; i++) {
			int tmp = (int) (Math.random() * 45 + 1);	//중복을 제거 로직 필요.
			if(i == 0)lotto[i] = tmp;//i=0;//중복 비교 대상 없으므로 그냥 입력.
			//i=1;//k = 0번지와 비교.
			//i=2;//k = 0, 1번지와 비교.
			//i=3;//k = 0, 1, 2번지와 비교.
			//i=4;//k = 0, 1, 2, 3번지와 비교.
			//i=5;//k = 0, 1, 2, 3, 4번지와 비교.
			String duplication = "no";
			
			for(int k = 0; k < i; k++) {
				if(lotto[k] == tmp) {//지금 발생한 tmp는 이미 있는 값이다.//중복
					duplication = "yes";
					break;// 입력안하고 지나간다.
				}//if
			}//for
			
			if(duplication.equals("no")) {//비교 결과, 같은 값이 없으면 대입
				lotto[i] = tmp;
				
			} else {//비교 결과, 같은 값이 있으면 pass. -> 대입 안했는데, i는 증가. -> i--;
				i--;
			}
			
			}//for
			
			Arrays.sort(lotto);
			System.out.println(Arrays.toString(lotto));
		
	}// main

}// class
