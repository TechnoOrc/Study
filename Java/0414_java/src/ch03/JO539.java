package ch03;

import java.util.Scanner;

public class JO539 {

	public static void main(String[] args) {
		//정수를 계속 입력받다가//힌트 : 정수, 반복문, 입력
		//100 이상의 수가 입력이 되면 마지막 입력된 수를 포함하여//힌트 : 종료 조건 - 100 이상의 수 입력
		//합계와 평균을 출력하는 프로그램을 작성하시오.//힌트 : 합계, 평균
		//(평균은 반올림하여 소수 첫째자리까지 출력한다.)
		Scanner scan = new Scanner(System.in);
		int userInput = 0, sum = 0, inputCnt = 0;
		double avg = 0.0;

		while(true) {
			userInput = scan.nextInt();
			sum = sum + userInput;
			inputCnt++;
			if(userInput >= 100) break;
		}//while

		System.out.println(sum);//합계
		avg = sum / (double) inputCnt; //inputCnt를 int형에서 double형으로 변환
		avg = avg * 10; // 구해진 형균을 소수점 1자리 업
		avg = Math.round(avg); // 그 뒤에 반올힘
		avg = avg / 10; // 반올림 한 수를 다시 원복하여 소수자리수의 반올림을 마무리 한다.
		System.out.println(avg);//평균

	}//main

}//class