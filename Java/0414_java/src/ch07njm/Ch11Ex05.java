package ch07njm;

public class Ch11Ex05 {

	public static void main(String[] args) {
		System.out.println("main메소드");
		
		//해당 클래스안에 존재하는 메소드를 사용하기 위해서 해당 클래스를 객체로 만들었다.
		Ch11Ex05 test = new Ch11Ex05();
		test.add();
		System.out.println("add() 호출 후 ");
		int k = test.sub();
		System.out.println("sub() 호출 후 ");	
		System.out.println("sub()에서 return 된 값은 " + k + "입니다.");
	}//main

	public void add() {//void는 호출한 곳으로 되돌아가면서 값을 가지고 가지 않는다.
		System.out.println("합은 20 입니다.");
	}//add()
	
	public int sub() {//반환형은 호출한 곳으로 되돌아가면서 반환형에 맞는 데이터를 가지고 간다.
		int su = 20;
		//return 20;
		return su;
	}//sub()
	
}//class
