package ch052;

/*
 * 상속 구조 ==========>Ch052Ex14 참고!!!!!!!!!
 * 	- 이미 extends를 통해 상위 클래스를 상속 받는 class 들에게 
 * 		-> implements를 통해 interface를 상속가능
 */
//자동차는 바퀴가 필요해서 extends로 상속 받았는데 추가로 엔진이 필요하다 추가 상속을 위해 implements 사용
//상속 후에는 빨간색으로 클래스 명이 마크업 되는데 {} 사이에 Ctrl + enter 로 오버라이딩 강제적으로 해줘야 에러가 없다.

public interface Engine {
	
	public void startEngine();
	
	public void stopEngine();
	

}//interface

class Wheel {}
class Wing {}
class FloatWater {}

class Car extends Wheel implements Engine {
	@Override
	public void startEngine() {
		System.out.println("Car - startEngine");
	}
	@Override
	public void stopEngine() {
		
	}
}

class Airplane extends Wing implements Engine {
	@Override
	public void startEngine() {
		System.out.println("Airplane - startEngine");
		
	}
	@Override
	public void stopEngine() {
		// TODO Auto-generated method stub
		
	}
}
class Ship extends FloatWater implements Engine {
	@Override
	public void startEngine() {
		System.out.println("Ship - startEngine");
		
	}
	@Override
	public void stopEngine() {
		// TODO Auto-generated method stub
		
	}
	
}

//자동차는 바퀴가 필요해서 extends로 상속 받았는데 추가로 엔진이 필요하다 추가 상속을 위해 implements 사용
// 상속 후에는 빨간색으로 클래스 명이 마크업 되는데 {} 사이에 Ctrl + enter 로 오버라이딩 강제적으로 해줘야 에러가 없다.

