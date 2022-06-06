package ch041;

public class Ch041Ex16 {

	public static void main(String[] args) {

		String [] strArr1 = {"nice"," to meet"," you,"," too."};
		for (int i = 0; i < strArr1.length; i++) {
			System.out.print(strArr1[i]);
		}//for
		
		System.out.println();
		
		for(String s : strArr1) { // 데이터를 바로 뽑아 내는게 목적 일 경우 사용// 우항의 값을 좌항에 넣는다.
			System.out.print(s);
		}//forEach
		
	}//main

}//class
