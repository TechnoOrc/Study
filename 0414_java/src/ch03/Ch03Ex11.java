package ch03;

/*
 *  제어문 : 분기문(경우를 나누는 문법) + 반복문(반복).
 *  분기문 : if, if~else, if~ else if~ else, switch~case.
 *  반복문 : for(~하는 동안), while(~하는 동안).
 *  break(중단), continue(건너뛰다).
 */
public class Ch03Ex11 {
	
	public static void main(String[] args) {
		//분기문 branch statement : 가지를 나누는 문법.
		//조건에 따라 프로그램의 흐름을 나누는 문법.
		//분기문 if(만약 ~하면){} : ()안의 조건을 만족할 때만 수행하는 {}(코드 블럭).
		//if(수행 조건){수행 코드}
		//(수행 조건)은 true/false를 나타내는 표현이 온다.
		//(수행 조건)이 true면 {수행 코드} 실행, false면 {수행 코드} 실행 안함.
		int iVar = 5;
		if(iVar < 10) {
			System.out.println("10보다 작다");
		}//if
		
	}//main

}//class
