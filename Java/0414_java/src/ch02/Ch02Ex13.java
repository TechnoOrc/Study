package ch02;

/*
 * char는 정수와 호환이 가능.
 * ascii code와 호환.
 */
public class Ch02Ex13 {

	public static void main(String[] args) {

		char chVar1;//문자 하나를 저장하는 공간을 만들고 + 이름은 chVar1
		chVar1 = 'A';//65
		System.out.println("A를 char형으로 출력 : " + chVar1);
		int iVar1 = chVar1; 
		System.out.println("A를 int형으로 출력 : " + iVar1);
		System.out.println("=======================");
		
		char chVar2 = 36;
		System.out.println("36을 char(문자)형으로 출력 : " + chVar2);
		int iVar2 = chVar2;
		System.out.println("36을 int(정수)형으로 출력 : " + iVar2);
		System.out.println("=======================");
		
		
		int iVar3;//32bit 정수공간 + 이름은 iVar3
		iVar3 = 'H';//72//자동 타입 변경
		System.out.println("H를 int(정수) 형으로 출력 : " + iVar3);
		System.out.println("=======================");
		
		int iVar4 = 88;//X
		char chVar3;//16bit 공간
		//chVar3 = iVar4;//16bit에 32bit 저장//자바 거부
		chVar3 = (char) iVar4;//강제적 명시적 타입 변경
		System.out.println("88을 int(정수) 형으로 출력 : " +iVar4);
		
		System.out.println("int형(32bit) 88을 char형 (16bit) 강제 변환했을 시 : " +chVar3);

	}//main

}//class