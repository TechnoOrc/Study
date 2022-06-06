package ch03;

public class Ch03Ex41 {

	public static void main(String[] args) {
		//for 문장의 중첩
		//1 ~ 3학년, 각 10반까지 출력.
		for(int hak = 1; hak <= 3; hak++) {
			System.out.println("===== " + hak + " 학년=====");
			
			for(int ban = 1; ban <= 10; ban++) {
				//System.out.println(hak + "학년 " + ban + " 반");
				System.out.printf("%d 학년 %d 반\n",hak,ban);
			}//for
			
		}//for
		
	}//main

}//class
