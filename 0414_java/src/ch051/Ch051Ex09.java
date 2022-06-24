package ch051;

import java.util.Scanner;

public class Ch051Ex09 {

	public static void main(String[] args) {
		
		People [] Peoples = new People[10];//추가
		int arrayIndex = 0;//추가
		Scanner scan = new Scanner(System.in);
		int mainMenuNo = 0, subMenuNo = 0;
		while(true) {
			System.out.print("0:종료, 1:입력, 2:출력, 선택 : ");
			mainMenuNo = scan.nextInt();
			if(mainMenuNo == 0) {
				System.out.println("bye~~");
				scan.close();
				break;
				
			} else if(mainMenuNo == 1) {
				System.out.print("11:Teacher, 12:Student, 선택 : ");
				subMenuNo = scan.nextInt();
				if(subMenuNo==11) {
					//System.out.println("Teacher : 공사 중");//제거
					Teacher t = new Teacher();//추가
					System.out.println("familyName : ");//추가
					t.familyName = scan.next();//추가
					System.out.println("name : ");//추가
					t.name = scan.next();//추가
					System.out.println("address : ");//추가
					t.address = scan.next();//추가
					System.out.println("tel : ");//추가
					t.tel = scan.next();//추가
					System.out.println("subject : ");//추가
					t.subject = scan.next();//추가
					System.out.println("payAccount : ");//추가
					t.payAccount = scan.next();//추가
					Peoples[arrayIndex] = t;//추가
					//부모 타입의 변수는 자식 타입의 객체가 있는 메모리 주소를 가질 수 있다
					arrayIndex++;//추가
				} else if(subMenuNo==12) {
					System.out.println("Student : 공사 중");
				} else {
					System.out.println("wrong input. try again.");
				}
				
			} else if(mainMenuNo == 2) {
				//System.out.println("출력 : 공사 중");//제거
				for (int i = 0; i < arrayIndex; i++) {//추가
					Peoples[i].print();//추가
				}//추가
			} else{
				System.out.println("wrong input. try again.");
			}
		}//while
	}//main

}//class
