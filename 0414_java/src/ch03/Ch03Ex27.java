package ch03;
/*
 * switch ~ case : 분기문 : branch statement
 *  - 단순 비교
 *  - swith(비교하려는 값) {case 값 : 같으면 수행;}
 *  - (비교하려는 값)에는 byte, short, int, long, char, String만 들어감
 */
public class Ch03Ex27 {

	public static void main(String[] args) {
		
		//switch ~ case의 개념.
		switch(1) {
		case 0 : System.out.println("switch의 값과 case의 값이 다르다");
		case 1 : System.out.println("switch의 값과 case의 값이 같다");
		}//switch
		
	}//main

}//class
