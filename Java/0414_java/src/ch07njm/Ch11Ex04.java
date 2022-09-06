package ch07njm;

import java.util.Scanner;

/*
 * finally : 예외처리와 상관없이 반드시 실행해야 되는 문장을 처리할 때 사용
 * 				(DB, I/O, 네트워크에서 주로 사용)
 * try{
 * 		예외 발생 가능한 문장들;
 * }catch(예외객체 e){
 * 		예외 발생 시 처리할 문장들;
 * }catch(예외객체 e){
 * 		예외 발생 시 처리할 문장들;
 * } finally{
 * 		예외처리와 상관없이 무조건 실행해야 하는 문장들;
 * 메소드는 모두 자기를 호출된곳으로 return된다 
 * void return 없는 것이 아니라 return값을 가져가지 않는다는 의미
 * void에서 return이 붙으면 종료인데 finally는 실행된다.
 * 그렇기 때문에 return으로 종료하더라도 finally에 마무리해야하는 작업을 추가하여 프로그램 마무리한다.(DB close.. 등등)
 * }
 */
public class Ch11Ex04 {

	public static void main(String[] args) {
		
		int k = 100;
		Scanner sc = new Scanner(System.in); // Scanner 생성
		
		try {
			int var = 50;
			System.out.print("정수 입력 : ");
			int su = sc.nextInt();
			System.out.println("정답 : " + (var / su));
			k = k + 10;
			return; // return을 만나
		} catch (ArithmeticException e) {
			System.out.println("0으로는 나눌 수가 없습니다.");
			k = k + 1000;
			return;
		} catch (Exception e) {
			System.out.println("정상적입 입력을 해주세요 : " + e);
			k = k + 100;
			return;
		}finally {
			System.out.println("반드시 실행해야될 문장");
		}//finally
		
		//System.out.println("k = " + k); //return 이후에는 실행문이 있으면 안된다.
		//System.out.println("수고하셨습니다.");
		
		
	}//main

}//class
