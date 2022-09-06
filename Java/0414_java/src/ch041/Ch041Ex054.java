package ch041;

public class Ch041Ex054 {

	public static void main(String[] args) {

		int [] lotto = new int[6];
		//for문을 통해 로또 번호 6개를 반드시오.
		for(int i = 0; i < lotto.length; i++) {// i : 0 1 2 3 4 5 
			int tmp = (int) (Math.random() * 45 + 1);
			if(i == 0) lotto[i] = tmp;// 최초의 값 : 0번지의 값은 그냥 입력 : 비교 대상 없음.
			boolean flag = false; //판단 깃발
			for(int k = 0; k < i; k++) {//k : 0 1 2 3 4 
				if(tmp == lotto[k]) {
					flag = true;
					break;
				}//if
				
			}//for 배열의 기존 값과 비교 : 중복 제거 하려고
			//중복 여부에 따라 값을 입력
			if(!flag) {//flag가 true가 아니면// 순차적으로 보면 위 flag = false 인데 !false 는 true 아닌가?
				lotto[i] = tmp;
			} else {//중복
				i--;// 중복이 발생한 번호에 값을 입력하지 않고 지나가지 않도록
			}
		}//for 입력
		
		for (int i = 0; i < lotto.length; i++) {
			for(int k = i +1; k < lotto.length; k++) {
				if(lotto[i] > lotto[k]) {
					int tmp = lotto[k];
					lotto[k] = lotto[i];
					lotto[i] = tmp;
					
					
					
				}//if
			}//for
		}//for 정렬
		
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i]+ "\t");
		}//for 출력
		
	}//main

}//class
