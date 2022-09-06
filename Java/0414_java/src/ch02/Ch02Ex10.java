package ch02;

/*
 * WrapperClass : Float, Double
 * - primitive data type은 소문자
 * - WrapperClass는 첫 글자가 대문자
 */
public class Ch02Ex10 {

	public static void main(String[] args) {

		System.out.println("Float의 최소 최대 값 : " + Float.MIN_VALUE + ":" + Float.MAX_VALUE);
		//1.4E-45 : 3.4028235E38 //1.4 * 10의 45승 : 3.4 * 10의 38승
		System.out.println("Double의 최소 최대 값 : " + Double.MIN_VALUE + ":" + Double.MAX_VALUE);
		//4.9E-324:1.7976931348623157E308
		//4.9 * 10의-324승 : 1.7 * 10의 308승
		System.out.println("---------------------------------");
		double dVar = 3.14;//double은 64bit
		//double의 bit 구성 : 부호비트 1, 지수비트 11개, 가수소수점)비트 52개
		//int iVar = dVar;//int는 32bit
		//long longVar = dVar;//실수와 정수간의 충돌
		System.out.println("3.14를 double형으로 표현하면 : " + dVar);// 3.14의 double형 출력시
		int iVar = (int)dVar;//강제적, 명시적 변경
		System.out.println("3.14를 double형에서 int형으로 Demotion 하면 : " + iVar);
		System.out.println("---------------------------------");
		
		Double wVar = new Double(3.14);
		System.out.println("3.14를 Wrapper Class Double형으로 출력하면 : " +wVar);
		int iVar2 = wVar.intValue();
		System.out.println("위 Wrapper Class Double형을 intValue 하면 : " +iVar2);
		
	}//main

}//class
