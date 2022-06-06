package ch07njm;

import java.util.Scanner;

/*
 * throws 예약어 : (예외양도, 예외전가)
 * - 예외가 발생하면 예외처리를 하지 않고, 자신을 호출한 곳으로 예외 객체를 전달하는 것
 * - 반환형(void) 메소드(인자)throws 예외객체 {}
 * - 나중에라도 예외처리(try~catch)를 하는 것이 좋다.
 */
public class Ch11Ex06 {
	
	public void setData(String msg)throws NumberFormatException{
		if(msg.length() >= 1) {
			String str = msg.substring(0,1);
				prnData(str);
//			try {
//				
//			} catch (Exception e) {
//				System.out.println("첫글자는 숫자여야 한다.");
//			}//catch
				
		}//if
	}//setData
	
	public void prnData(String str) throws NumberFormatException{
		int dan = Integer.parseInt(str);
		System.out.println(dan + "단");
		for (int i = 0; i < 10; i++) {
			System.out.println(dan + " * " + i + " = " + (dan*i));
		}//for
		
	}//prnData
	public static void main(String[] args){
		Ch11Ex06 test = new Ch11Ex06();
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 >> ");
		String msg = sc.next();
		try {
		test.setData(msg);
		}catch (Exception e) {
			System.out.println("메인에서 try ~catch로 해결되었습니다.!!!");
		}
	
	}//main

}//class



