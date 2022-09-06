package ch02;


/*
 * 정수 타입의 변수 - byte(8bit)
 * 	- 부호비트(양수/음수 판별 비트)를 제외한 7bit로 수를 표현
 * 	- 수의 표현 범위 : -2의7승 ~ 2의7승-1까지의 수를 표현 : -128 ~ 127
 * 		[부호비트] [2의6승] [2의5승] [2의4승] [2의3승] [2의2승] [2의1승] [2의0승]
 * 		[+    ] [ 64 ] [ 32 ] [ 16 ]  [ 8  ]  [ 4  ] [ 2  ] [ 1  ] 
 * 		[+    ] [ 1  ] [  1 ] [ 1  ]  [ 1  ]  [ 1  ] [ 1  ] [ 1  ] = 127
 * 
 * 정수 타입의 변수 - short (16bit)
 * 	- 부호비트(양수/음수 판별 비트)를 제외한 15bit로 수를 표현
 * 	- 수의 표현 범위 : -2의15승 ~ 2의15승-1까지의 수를 표현
 * 
 * 정수 타입의 변수 - int (32bit)
 * 	- 부호비트(양수/음수 판별 비트)를 제외한 31bit로 수를 표현
 * 	- 수의 표현 범위 : -2의31승 ~ 2의31승-1까지의 수를 표현
 * 	- 정수 변수의 기본형은 int. (아무 생각 없이 코딩하면 다 int가 된다.) <!!!!!>
 * 	- 단점 : 21억 정도만을 표현한다.
 * 
 * 정수 타입의 변수 - long (64bit)
 * 	- 부호비트(양수/음수 판별 비트)를 제외한 63bit로 수를 표현
 * 	- 수의 표현 범위 : -2의63승 ~ 2의63승-1까지의 수를 표현
 * 	- 수를 대입할 때 영문자 L 또는 l을 사용해야 한다.
 * 	- 22억 이상의 수를 표현한다.
 */
/*
 * 변수와 메소드의 이름을 만드는(명명) 규칙 - 카멜(Camel) 표기법
 * 	- 첫 문자는 소문자
 * 	- 이어지는 단어의 첫 문자는 대문자
 * 	- 나머지는 소문자
 * 	- 숫자는 가능하지만 맨 앞은 안됨
 * 	- 특수문자 사용은 권장하지 않음
 */
public class Ch02Ex05 {
	
	public static void main(String[] args) {
		
		byte byteVar1 = 1, byteVar2 = 2;
		//byte byteVar3 = byteVar1 + byteVar2;//왜 에러일까?
		// ->정수 변수의 기본형은 int. (아무 생각 없이 코딩하면 다 int가 된다.) <!!!!!>
		// byte 타입 변수 byteVar3에 int 타입의 변수가 들어가야하는데 데이터 크가 작으므로 들어갈 수 없다.
		// ->연산을 할 때 int형으로 변화가 발생.
		
		byte byteVar4 = 1 + 2;
		byte byteVar5 = byteVar1;
		System.out.println(byteVar5);
		
		short shortVar1 = 1, shortVar2 = 2;
		
		//short shortVar3 = shortVar2 - shortVar1; //왜 에러일까?
		// ->정수 변수의 기본형은 int. (아무 생각 없이 코딩하면 다 int가 된다.) <!!!!!>
		// short 타입 변수 byteVar3에 int 타입의 변수로 변한 값들이 데이터 크가 작으므로 들어갈 수 없다.
		//해결방법은 아래 ↓↓↓↓↓↓↓↓
		short shortVar3 = (short) (shortVar2 - shortVar1); //해결방법
		
		// ->정수 변수의 기본형은 int. (아무 생각 없이 코딩하면 다 int가 된다.) <!!!!!>
		////// short 타입 변수 byteVar3에 int 타입의 변수가 들어가야하는데 데이터 크가 작으므로 들어갈 수 없다.
		System.out.println(shortVar3);
		
		short shortVar4 = 1 + 2;
		short shortVar5 = shortVar1;
		
		long longValue1 = 1L, longValue2 = 2L;
		long longValue3 = longValue1 * longValue2;
		System.out.println(longValue3);
		
	}//main

}//class



