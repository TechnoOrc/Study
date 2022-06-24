package ch041;

public class Ch041Ex052 {

	public static void main(String[] args) {

		int [] lotto = new int[6];
		//for문을 통해 로또 번호 6개를 반드시오.
		
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45 + 1);
		
		}//for 입력
		
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i]+ "\t");
		}//for 출력
		
	}//main

}//class
