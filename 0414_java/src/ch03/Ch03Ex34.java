package ch03;
/*
 * while : 반복문 : Loop Statement
 * while(반복 조건) {수행 코드}
 *  - (반복 조건)이 true인 동안, {수행 코드}를 계속 수행.
 *  - (반복 조건)은 true/false를 나타내는 표현식이 들어간다.
 */
public class Ch03Ex34 {

	public static void main(String[] args) {
		//변수를 사용하여, 무한 루프 없이 종료되는 반복문을 만들자.
		
		int endPoint = 0;//while의 초기식.
		while(endPoint < 3) {// while의 (조건비교식).// 0 1 2
			System.out.println("endPoint : " + endPoint);
			endPoint++;//while의 증감식.//증감식의 위치 : while이 끝나기 전에 사용.
		}//while
		
		
	}//main

}//class
