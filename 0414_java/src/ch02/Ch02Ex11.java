package ch02;

public class Ch02Ex11 {

	public static void main(String[] args) {

		float fVar;//32bit 실수 타입의 공간을 만들어라 + 이름은 fVar
		fVar = 3.14F;//우항의 값을 좌항에 담아라
		double dVar;//64bit 실수 타입의 공간을 만들어라 + 이름은 dVar
		dVar = fVar;//32->64 // ->ok /자동 변수 타입 변경
		System.out.println("float형의 3.14가 double형으로 형 변환 뒤 : " + dVar);
		
		
		double dVar2;//642bit 실수 타입의 공간을 만들어라 + 이름은 dVar2
		dVar2 = 3.14F;
		float fVar2;//32bit 실수 타입의 공간을 만들어라 + 이름은 fVar2
		//fVar2 = dVar2;//64->32//java가 거부
		fVar2 = (float) dVar2;//강제적 명시적 변경
		System.out.println("double형의 3.14가 float형으로 형 변환 뒤 : " + fVar2);
		
		
	}//main

}//class
