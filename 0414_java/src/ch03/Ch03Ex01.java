package ch03;

/*
 * 연산자 : +, -, *, /, %(나머지)
 */
public class Ch03Ex01 {

	public static void main(String[] args) {

		int firstNumber = 123, secondNumber = 4;
		System.out.printf("%d + %d = %d\n"
				,firstNumber,secondNumber,firstNumber + secondNumber);
		System.out.printf("%d - %d = %d\n"
				,firstNumber,secondNumber,firstNumber - secondNumber);
		System.out.printf("%d * %d = %d\n"
				,firstNumber,secondNumber,firstNumber * secondNumber);
		System.out.printf("%d / %d = %d\n"
				,firstNumber,secondNumber,firstNumber / secondNumber);
		System.out.printf("%d / %d 나머지 = %d\n"
				,firstNumber,secondNumber,firstNumber % secondNumber);
		
	}//main

}//class
