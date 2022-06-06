package ch051.access;

public class DefaultObject {

	String defaultStr = "string of default modifiers";//생략//default//같은 패키지(폴더) 안의 class에서만 접근 가능

	public String defaultStr2 = "string of public modifiers";//누구나 접근가능

	void defaultPrint() {
		System.out.println("defaultStr : " + defaultStr);//생략//default//같은 패키지(폴더) 안의 class에서만 접근 가능
	}

	public void defaultPrint2() {
		System.out.println("defaultStr2 : " + defaultStr2);//누구나 접근가능
	}

}//class