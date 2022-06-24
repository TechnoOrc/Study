package ch03;

//삼항 연산자
// ? 와 : 으로 구성
// ? 앞에 항이 하나, ? 와 : 사이에 항이 하나, : 뒤에 항이 하나 -? 3항
// ? 앞에는 질문, ? 와 : 사이에는 참인 경우의 값, : 뒤에는 거짓인 경우의 값이 옵니다.
// 1 > 10 ? true : false -> false
// 10 < 100 ? true : false -> true
// ? 앞에는 질문 반드시 참, 거짓을 판별하는 문장이 와야 한다.
public class Ch03Ex06 {
	
	public static void main(String[] args) {
		
		System.out.println("1 > 10 ? true : false의 결과는 " + (1 > 10 ? true : false));//false
		System.out.println("10 < 100 ? true : false의 결과는 " + (10 < 100 ? true : false));//true
		System.out.println();
		int iVar1 = 5;
		System.out.println("5 >= 5 ? 올림 : 내림 결과는   " + (iVar1 >= 5 ? "올림" : "내림"));//반올림의 원리.
		
		iVar1 = 4;
		System.out.println("4 >= 5 ? 올림 : 내림 결과는   " + (iVar1 >= 5 ? "올림" : "내림"));//반올림의 원리.
		
		int iVar5 = 7;
		System.out.println("7 >= 8 ? 올림 : 내림 결과는   " + (iVar5 >= 8 ? "올림" : "내림"));
		
		// a ? b : c
		// a에는 참 거짓을 판별하는 문장이 온다.
		// a가 참이면 b를 수행
		// a가 거짓이면 c를 수행
	}//main
}//class
