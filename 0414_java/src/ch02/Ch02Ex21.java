package ch02;

/*
 * Integer.parseInt, Double.parseDouble...
 *  - 문자열로 만들어진 숫자를 정수, 실수로 바꾸기
 *  - 문자열에서 숫자를 추출한다.
 */
public class Ch02Ex21 {

	public static void main(String[] args) {

		String str1 = "777";
		System.out.println(str1 + 10);//문자열과 숫자는 + 연산이 되지않는다.
		int iVar1 = Integer.parseInt(str1);
		System.out.println(iVar1 + 10);
		
		String str2 = "777.77";
		System.out.println(str2 + 10);//문자열과 숫자는 + 연산이 되지않는다.
		double dVar1 = Double.parseDouble(str2);
		System.out.println(dVar1 + 10.0);
		
		String str3 = "9876+8765";
		String str31 = str3.substring(0,4);
		String str32 = str3.substring(5);
		int iVar2 = Integer.parseInt(str31);
		int iVar3 = Integer.parseInt(str32);
		System.out.println(iVar2 + iVar3);
		
		String str4 = "9876-8765";
		String [] sArray = str4.split("-");
		int iVar4 = Integer.parseInt(sArray[0]);
		int iVar5 = Integer.parseInt(sArray[1]);
		System.out.println(iVar4 - iVar5);
		
		
	}//main

}//class
