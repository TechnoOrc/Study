package ch03;

import java.util.Scanner; //Scanner 입력 후 [Ctrl] +[Space bar]로 추가
//import : 가져와라 : 왜? 내가 필요하니까.
//java.utill.Scanner : Scanner class file 위치
//java 폴더 안에 utill 폴더 안에 Scanner class file 위치

public class Ch03Ex13 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//Scanner : 손쉽게 키보드 입력을 받아 준다.
		//System.in : 입력 버퍼 : 키보드에서 입력된 값 들이 대기하는 곳.
		//scan.nextInt() : 정수 가져오기
		//scan.nextDouble() : 실수 가져오기
		//scan.next() : 단어 가져오기
		//scan.nextLine() : 문장 가져오기 : 엔터 값을 가져온다 : 버려진 엔터 값도 가져온다.
		
		System.out.println("정수(0~21억) 입력 : ");
		int iVar = scan.nextInt();
		System.out.println("your input : " + iVar);
		//예를 들어 31숫자를 입력할 시 3,1, enter 3개의 입력값이 있으나 scan.nextLine()는 엔터값을 받는 특성이 있음
		
		scan.nextLine();// 버려진 엔터값을 받아서 사라지는 문장을 추가.
		System.out.println("문장 입력 : ");
		String sentens = scan.nextLine();
		System.out.println("sentens : [" + sentens + "]");
		
		scan.close();//반드시 close.		
		
	}//main

}//class
