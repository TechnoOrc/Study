package ch06;

/*
 * Exception의 상속
 *  -> Polymorphism이 적용된다
 *  -> 부모 타입 Exception은 자식 타입의 Exception을 처리할 수 있다
 *  -> 주의 !!! 부모 타입 Exception은 자식 타입의 Exception을 함께 사용할 때는
 *  	-> 부모 타입 Exception을 자식 타입의 Exception을 아래에 배치!!!
 */
public class Ch06Ex04 {

	public static void main(String[] args) {

		int[]iArr = new int[2];//index는 오직 0과 1뿐.
		try {
			System.out.println(iArr[5]);
		}
		catch (StringIndexOutOfBoundsException e) {
			System.out.println("String 길이 문제");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("array 길이 문제");
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println("IndexOutOfBoundsException");
		}
		catch (RuntimeException e) {
			System.out.println("IndexOutOfBoundsException의 부모");
		}
		catch (Exception e) {
			System.out.println("RuntimeException의 부모");
		}

	}//main

}//class 
