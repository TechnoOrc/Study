// 한 줄 주석
/*
 * 여러 줄 주석
 * 자바는 공백과 주석을 무한이 허용 → 컴파일에서 제거
 * 주석과 공백을 최대한 활용하여 가독성 높은(readable, 읽기 쉬운) 코드를 만들어야한다.
 * 
 */

/*
 * 작성일 : 2022.04.15.
 * 잘성자 : 김세민
 * 클래스 개요: 오버뷰를 확인한다.
 * 요청자 : 임팀장
 * 요청근거 : email, 공문 XX기관 2022-04001호
 */

package ch01;
/*
 * package
 * 소스는 소스끼리, 컴파일 결과 생성되는 class파일은 class파일끼리 묶어라.
 * 패키지 이름은 소문자로...
 * 지켜지지 않아도 에러는 발생되지 않으나, 현장에서는 용납되지 않음.
 */

public class Ch01Ex01 {
	/*
	 * public : 보안 등급 : 누구나 접근가능
	 * public - protected - default - private 
	 */
	/*
	 * class : 설계도
	 * 프로그램 : 진행 계획, 진행순서.
	 * 프로그래머 : 진행 계획이나 진행순서를 계획하는 사람.
	 * class : 우리가 계획하는 진행 계획이나 진행 순서를 설계해 놓는 문서.
	 * {} 중괄호 : 영역표시
	 * { : 영역 시작
	 * } : 영역 종료
	 * 모든 자바의 코딩은 class 내부에 하여야 함
	 * 예외는 package, import의 단 두개.
	 */
	/*Ch1Ex01 : 이름이 오는 자리
	 *프로그래머 마음대로 생성가능. 단, 큐칙이 있음.
	 *class 이름을 만드는 규칙 (명명 규칙) - 파스칼 표기법 (pascal case)
	 * - 첫 문자는 대문자
	 * - 이어지는 단어의 첫 문자도 대문자
	 * - 나머지는 소문자
	 * - 숫자 가능하지만, 맨 앞은 안됨.
	 * - 특수문자는 $와 _만 가능하지만, 권장 X
	 * - 파일 이름과 class의 이름이 대소문자 포함하여 완전히 일치해야한다.
	 * - 지켜지지 않아도 에러는 발생되지 않으나, 현장에서는 용납되지 않음.
	 */

	/*
	 * class의 member (구성 요소)
	 * - variable (변수) : data. 정적이다.
	 * - method : 동작. 동적이다.
	 * 
	 */
	public static void main(String[] args) {
		
		/*
		 * public static void main(String[] args) - 시작 점
		 * void : 없다
		 * main : 메소드 이름 - 시작 메소드의 이름은 반드시 main.
		 * 현재 클래스를 실행하면, main의 첫 줄 에서 마지막 줄까지를 한 줄씩 순서대로 수행.
		 * 이것이 시작 메소드의 의미
		 */
		// Sysout 입력 후  ctrl + space 자동완성
		System.out.println(123);
		System.out.print(456);
		System.out.println(789);
		/*
		 * system 
		 * 	- jdk(java se software development Kit : 자바 개발도구)가 제공하는 class
		 * 	- 이 코드가 실행되는 컴퓨터를 지칭.
		 * . : ~의 내부에.
		 * out
		 * 	- jdk가 제공.
		 * 	- 이 코드가 실행되는 컴퓨터의 out buffer(출력메모리)를 지칭.
		 * print : 화면에 출력.
		 * println : 화면에 출력한 다음에 줄 바꿈을 해라. print + line new.
		 * print() : ()안의 내용을 출력해라.
		 * ; : semicolon : 한 줄의 끝을 표시. 안 쓰면 에러발생.
		 * 저장되어있는 위치 C:\Users\김세민\eclipse-workspace
		 */
		

	}// end of main//main

}// end of class//class
