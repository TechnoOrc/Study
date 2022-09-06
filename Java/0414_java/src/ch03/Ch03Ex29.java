package ch03;

public class Ch03Ex29 {
	
	public static void main(String[] args) {
	//byte, short, int, long, char, String만 switch 가능
		
//		switch(3.14) {
//		case 3.14 : System.out.println("실수는 switch case 불가능.");
//		}
//		
//		switch(true) {
//		case true : System.out.println("boolean은 switch case 불가능.");
//		}
		
		switch('H') {
		case 'h' : System.out.println("char는 switch case 가능.- 소문자"); break; 
		case 'H' : System.out.println("char는 switch case 가능.- 대문자"); break;
		}
		
		switch("Hello") {//문자열도 switch case 가능
		case "hello" : System.out.println("소문자."); break;
		case "Hello" : System.out.println("첫문자만 대문자.");break;
		case "HELLO" : System.out.println("대문자.");break;
		}
		
		
	}//main
	
}//class
