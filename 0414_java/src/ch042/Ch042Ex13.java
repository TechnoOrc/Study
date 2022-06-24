package ch042;

/*
 * this를 통한 생성자 접근(호출)// 클래스 이름이 같아야 한다.
 *  - 생성자 내부에서 this가 ()와 함께 사용되면,
 *  - 현재 객체 내부의 또 다른 생성자를 호출한다. 
 *  - 반드시 생성자의 첫 라인에서 호출해야 한다.
 */
class Ch042Dummy7{
	
	public Ch042Dummy7(){
		//System.out.println();// this()를 통한 생성자 호출은 반딋 생성자의 첫 라인에서!!!!
		this("HOW ");// -> 16라인 호출 // this.(지금의 인스턴스)이라고 생각하면 쉽다.
	}
	
	public Ch042Dummy7(String str1) {
		this(str1,"ARE ");// -> 20라인 호출 //this(문자 2개 받을 수 있는 것을 호출) (String str1, String str2)
	}
	
	public Ch042Dummy7(String str1, String str2) {
		this(str1, str2, "you?");// -> 24라인 호출
	}
	
	public Ch042Dummy7(String str1, String str2, String str3) {
		System.out.println(str1 + str2 + str3);
	}
}//class

public class Ch042Ex13 {

	public static void main(String[] args) {

		Ch042Dummy7 dummy = new Ch042Dummy7();
		
		
	}//main

}//class
