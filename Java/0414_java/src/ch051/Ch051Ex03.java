package ch051;

/*
 * Heterogeneous Collection : 이종 배열 : 상속 개념에서 다른 데이터 타입도 다 들어가는 배열
 * - 상속성과 다형성 관계에서만 성립한다.
 * - non same data type, group handling, java object
 */
/*
 * Homogeneous Collection : 전통적인 배열 개념
 *  - same data type, group handling, java object
 */
public class Ch051Ex03 {

	public static void main(String[] args) {
		
		Teacher [] tArr = new Teacher[3];
		tArr[0] = new Teacher();
		//tArr[1] = new Student();//error
		//tArr[2] = new People();//error
		
		Student [] sArr = new Student[3];
		//sArr[0] = new Teacher();//error
		sArr[1] = new Student();
		//sArr[2] = new People();//error
		
		People [] pArr = new People[3];
		pArr[0] = new Teacher();
		pArr[1] = new Student();
		pArr[2] = new People();
		
		/*
		 * * Heterogeneous Collection
		 *  - 부모 타입의 배열에는 자식 객체의 주소를 담을 수 있다.
		 */
		
	}//main

}//class
