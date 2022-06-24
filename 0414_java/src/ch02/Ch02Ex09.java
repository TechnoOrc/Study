package ch02;

//정수 primitive data type casting(변경)
public class Ch02Ex09 {

	public static void main(String[] args) {

		byte byteVar;//변수 선언 //메모리에 8bit 정수 공간 만들어라 + 이름은 byteVar
		byteVar = 127;//변수 초기화 // 우항의 값을 좌항에 넣음 // 127을 byteVar에 넣는다
		
		int intVar;//메모리에 32bit 정수 공간 만들어라 + 이름은 intVar
		intVar = byteVar;//작은 그릇의 정수를 큰 그릇으로 옮겨라 -> ok
		//->ok : 문제없이 되니까, 자동으로 data type 변경
		//Auto Casting, 묵시적 Casting(COM에게 요청하지 않아도 변경 됨), Promotion
		
		long longVar;//메모리에 64bit 정수 공간 만들어라 + 이름은 longVar
		longVar = 2200000000L;
		
		short shortVar;//메모리에 16bit 정수 공간 만들어라 + 이름은 shortVar
		//shortVar = longVar;//큰 그릇의 정수를 작은 그릇으로 옮겨라 -> 자바 거부
		// -> 자바 거부 : 강제적으로 변경, 코딩에 변경을 강제 명령함(명시함).
		shortVar = (short)longVar;//쇼트로 바꿔!!!/바꾸려는 data type을 적어주기!!!
		//강제 Casting, 명시적 Casting, Demotion
				
		byte bVar1 = 1, bVar2 = 2, bVar3;
		//bVar3 = bvar1 + bvar2;//정수형 변수의 연산은 int로 처리된다.//정수형 변수 기본은  int
		bVar3 = (byte)(bVar1 + bVar2);//강제적, 명시적 casting
		
		
	}//main

}//class
