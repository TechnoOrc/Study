package ch03;

public class Ch03Ex05 {

	public static void main(String[] args) {

		int iVar1 = 8;
		int res1 = --iVar1 * 3;
		System.out.println("--8 * 3 : " + res1);//21
		
		int iVar2 = 8;
		int res2 = iVar2-- * 3;
		System.out.println("8-- * 3 : " + res2);//24
		
		
	}//main

}//class

/*
int iVar1 = 8;
int res1 = --iVar1 * 3;//연산자 3개
//증감 전위 연산 : iVar1을 먼저 --하고 * , = 수행
// iVar1이 7이 되어, 7 * 3 수행.

int iVar2 = 8;
int res2 = iVar2-- * 3;//연산자 3개
//증감 후위 연산 : *, = 수행하고 iVar2를 --한다.
// 8 * 3 처리 후, iVar2는 7이 된다.
*/