package ch02;

/*
 * substring : 문자열 자르기
 * 	 - 본판 불변의 법칙 : 변환한 결과는 저장하지 않으면 사라진다.
 * split : 문자열 나누기
 */
public class Ch02Ex19 {

	public static void main(String[] args) {

		String str = "nice to meet you too.";
		System.out.println("원본 데이터 : " + str);
		System.out.println("str.substring(6) : " +str.substring(6));//6번지에서 끝까지 잘라라.
		System.out.println("str.substring(6,14) : " + str.substring(6,14));//6번지에서 14번지 앞까지 잘라라.
		//substring(6,14) : 6번지 포함, 14번지 불포함 : 앞번지 포함, 뒷번지 불포함.
		System.out.println("원본 : " + str);//본래 데이터는 변하지 않는다
		
		String[] sArray = str.split(" ");//""(공백)을 기준으로 나눔
		System.out.println(sArray.length);//길이를 구할 수 있다.//5
		System.out.println(sArray[0]);
		System.out.println(sArray[1]);
		System.out.println(sArray[2]);
		System.out.println(sArray[3]);
		System.out.println(sArray[4]);
		System.out.println("원본 : " + str);//본래 데이터는 변하지 않는다

	}//main

}//class
