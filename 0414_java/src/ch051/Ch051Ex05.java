package ch051;

/*
 * instanceof 연산자 : 누구의 instance인가? : 어느 class 형태의 메모리인가? : 판별
 *  - true, false만을 리턴
 *  - 당신이 만약에 Object Data type Casting를 해야 한다면,
 *     -> 먼저 instanceof 연산부터 해라 -> 당신의 기억력을 믿지마
 */
public class Ch051Ex05 {

	public static void main(String[] args) {

		People p1 = new Student();
		if(p1 instanceof Student) {
			System.out.println("p1은 Student 객체");
		} else if(p1 instanceof Teacher) {
			System.out.println("p1은 Teacher 객체");
		}

	}//main

}//class