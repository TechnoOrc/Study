package ch02;

/*
 * Data Type Casting : 데이터의 형태를 바꾼다.
 * 	- int -> long 또는 int -> short.
 * promotion, 자동 형태 변환, 묵시적 형태 변환
 * 	- 작은 데이터 타입이 큰 타입에 들어갈 때,
 * 	- 자동으로 데이터 타입을 변경해 주는 것
 * 	- byte를 int에 담을 때.
 * 	- 부작용이 없으므로 자동으로 변환.
 * Demotion, 강제 형태 변환, 명시적 형태 변화
 * 	- 큰 데이터 타입을 작은 타입에 넣을 때, 
 * 	- 형태 변환 표현을 만들어서 강제로 형태를 변환 하는 것.
 * 	- int를 byte에 담을 때.
 * 	- 데이터가 손실될 수 있는 부작용을 각오해야 한다.
 */
public class Ch02Ex08 {

	public static void main(String[] args) {

		byte byteVar1 = 1, byteVar2 = 2;
		int intVar1 = byteVar1;
		System.out.println(intVar1);

		byte byteVar3 = (byte) intVar1;
		System.out.println(byteVar3);
		byte byteVar4 = (byte) (byteVar1 + byteVar2);
		// 연산을 하면 자동으로 int로 변경되어 (byte) 기입하여 강제로 byte로 변경.
		System.out.println(byteVar4);

		int intVar2 = 129;
		byte byteVar5 = (byte) intVar2;
		System.out.println(byteVar5);
		// byte의 최대값이 -128 ~ 127 까지 이나, 그 보다 큰 값을 강제로 넣을 경우 데이터 손실발생

	}// main

}// class


