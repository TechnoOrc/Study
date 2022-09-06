package ch02;

/*
 * Math : 수학 관련 class
 */
public class Ch02Ex22 {

	public static void main(String[] args) {

		System.out.println("ceil(0.1) : " + Math.ceil(0.1));// 올림
		System.out.println("floor(0.9) : " + Math.floor(0.9));// 내림
		System.out.println("Math.round(0.4) : " + Math.round(0.4));// 반올림
		System.out.println("Math.round(0.5) : " + Math.round(0.5));// 반올림
		System.out.println("===============================");
		System.out.println("max(100, 200) : " + Math.max(100, 200));
		System.out.println("min(100, 200) : " + Math.min(100, 200));
		System.out.println("===============================");
		System.out.println("pow(2, 5) : " + Math.pow(2, 5));// 2의5승
		//2 * 2 * 2 * 2 * 2
		System.out.println("sqrt(25) : " + Math.sqrt(25));// 25의 제곱근
		System.out.println("===============================");
		System.out.println("random : " + Math.random());
		//random : 무작위 수 구하기 // 0.0 ~ 0.999999999999999....
		System.out.println("random : " + Math.random());
		System.out.println("random : " + Math.random());
		//random : 수행할 때마다 다른 값을 가져 온다.
		System.out.println("random * 100 : " +Math.random() * 100); 
		//0 ~ 100 사이의 수 구하기
		System.out.println("random * 1000 : " + Math.random() * 1000);
		//0 ~ 1000 사이의 수 구하기
		System.out.println("random * 45 + 1 : " + Math.random() * 45 + 1);
		// random은 0.0~ 0.9999999  이기 때문에 1을 더해 0이나오면 1이 되게 세팅
		int jungsu = (int) (Math.random() * 45 + 1); //소수없는 로또번호 추출 Domotion
		System.out.println(jungsu);
		
	}//main

}//class
