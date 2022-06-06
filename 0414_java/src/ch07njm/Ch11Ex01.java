package ch07njm;
/*
 * 예외처리 : Exception, (try~catch문)
 * 	목적  : 비정상적인 종료를 정상적인 종료로 유도
 * 	try{
 * 		예외가 발생할 수 있는 문장들;
 * 		예외가 발생할 수 있는 문장들;
 * 	}cat(예외발생 객체 e){
 * 		예외 발생 시 처리하는 문장들;
 * }
 */
public class Ch11Ex01 {
	public static void main(String[] args) {
		try {
			int[] var = {10,20,30};
			for (int i = 0; i <= var.length; i++) {
				System.out.println("1");
				System.out.println("2");
				System.out.println("var[" + i + "] =" + var[i]);// 오류 발생부분
				System.out.println("4");
				System.out.println("5");
				System.out.println();
			}//for
			
		} catch (Exception e) {
			System.out.println("예외 발생");// 예외 발생시 실행할 문장
		
		}//catch
		
		System.out.println("프로그램을 종료합니다.");
	}//main
}//class
