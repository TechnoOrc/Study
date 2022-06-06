package ch042;

/*
 * 지역 변수 : local variable
 *  - 특정한 지역에서만 의미를 갖는 변수
 *  - 주로 메소드 내부에 선언되는 변수를 의미함
 *  - () 내부에서 선언된 변수
 *  - 클래스 중괄호{}가 아닌 다른 중괄호{}들에서 선언된 변수
 */
public class Ch042Ex05 {

	public static void main(String[] args) {

		String localStr1 = "지역 변수";

		{
			//String localStr1 = "지역 변수";
			//error//같은 지역 변수 이름이 두 번 사용된 예//같은 이름은 피해라
			String localStr2 = "지역 변수 이름은 같지 않도록 노력 하세요";
		}

		String localStr2 = "19 line의 localStr2는 20 line에서 효력 소멸";

		for(int idx = 0; idx <= 1; idx++) {
			System.out.println("idx도 지역 변수");
			//int idx = 5;//error//같은 지역 변수 이름이 두 번 사용된 예
		}//for

		for(int idx = 0; idx <= 1; idx++) {
			System.out.println("24 line의 idx는 27 line에서 효력 소멸");
		}//for

	}//main

}//class 
