
package ch052;

/*
 * interface Engine 예제에서 
 * 	- Car, Airplane, Ship은 조상이 다른 class
 * 		-> 서로 연관성이 없는 class !!!
 * 그런데!!!
 * interface Engine을 통해서!!! 
 * 	-> 서로 연관성이 없는 클래스들을 Polymorphism(다형성)으로 묶을 수 있다.
 * interface를 통해서 상속과 다형성의 모든 개념을 사용할 수 있다.
 */
public class Ch052Ex14 {

	
	
	public static void main(String[] args) {
		
		Engine [] ride = new Engine[3]; //Heterogeneous Collection // 이종 배열
		ride[0] = new Car();
		ride[1] = new Airplane();
		ride[2] = new Ship();
		
		reportEngine(ride[0]);
		reportEngine(ride[1]);
		reportEngine(ride[2]);

	}//main
	
	public static void reportEngine(Engine e) {//Polymorphic Arguents ()에 부모변수 넣으면 자식변수 데이터 불러올수있음
		e.startEngine();
		//=================
		//Object Data Type Caseing & instanceof 가능
		if(e instanceof Car) {
			Car c = (Car) e;
		} else if(e instanceof Airplane) {
			Airplane C = (Airplane) e;
		} else if(e instanceof Ship) {
			Ship C = (Ship) e;
		}
		
	}//reportEngine

}//class
