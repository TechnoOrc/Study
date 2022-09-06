package ch06;

import java.util.Scanner;

class Ch06Member2{
	String id;
	String pwd;
	Ch06Member2(String id, String pwd){
		this.id = id;
		this.pwd = pwd;
	}
	
}//Ch06Member2

public class Ch06Ex081 {

	static Ch06Member2 [] members = new Ch06Member2[3];
	
	public static void main(String[] args) {
		members[0] = new Ch06Member2("kang", "1111");
		members[1] = new Ch06Member2("kim", "2222");
		members[2] = new Ch06Member2("lee", "3333");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("ID 입력 : ");
		String str1 = scan.next();
		System.out.print("PWD 입력 : ");
		String str2 = scan.next();
		scan.close();
		//	[0]	|	[1]	|	[2]
		//	kang|	kim	|	lee
		//	1111|	2222|	3333
		
		boolean isMember = false;//isMember : 회원입니까?
		int whereIsMember = 0;//whereIsMember : 회원은 어느 index에 있는가?
		
		for (int i = 0; i < members.length; i++) {
			if(str1.equals(members[i].id)) {
				isMember = true;//System.out.println("회원 입니다.");
				whereIsMember = i;
				break;
				
			}//if
		}//for
		if(isMember == false) {//회원아니다.
			System.out.println("회원 아닙니다.");
			return;//회원이 아니면, 더 이상 진행하지 않는다.
			
		}//if
		
		if(members[whereIsMember].pwd.equals(str2)) {
			System.out.println(members[whereIsMember].id + "님 환영 합니다.");
		} else {
			System.out.println("비밀 번호 틀렸습니다.");
		}//else
	}//main

}//class
