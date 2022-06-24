package ch03;

import java.util.Scanner;

public class Ch03Ex26 {

	public static void main(String[] args) {
		//국어 영어 수학 점수를 입력 받는다.
		//평균을 구하여, 90이상은 A,
		//80이상은 B, 70 이상은 C,
		//60이상은 D, 나머지는 F.
		int kor, eng, math, sum, avg;

		Scanner scan = new Scanner(System.in);
		System.out.print("국어 점수 입력 : ");
		kor = scan.nextInt();
		System.out.print("영어 점수 입력 : ");
		eng = scan.nextInt();
		System.out.print("수학 점수 입력 : ");
		math = scan.nextInt();
		scan.close();

		sum = kor + eng + math;
		avg = sum / 3;

		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);

/* avg = 99; 이면, 아래 4개의 각각 독립된 if문을 모두 수행.
		if(avg >= 90) {
			System.out.println("Grade A.");
		}
		if (avg >= 80) {
			System.out.println("Grade B.");
		}
		if (avg >= 70) {
			System.out.println("Grade C.");
		}
		if (avg >= 60) {
			System.out.println("Grade D.");
		}
*/

		//avg = 99; 이라도, 조건에 부합하는 if(수행 조건) 하나를 수행하고 나머지 if문은 무시된다.
		if(avg >= 90) {
			System.out.println("Grade A.");
		} else if (avg >= 80) {
			System.out.println("Grade B.");
		} else if (avg >= 70) {
			System.out.println("Grade C.");
		} else if (avg >= 60) {
			System.out.println("Grade D.");
		} else {
			System.out.println("Grade F.");
		}

	}//main

}//class