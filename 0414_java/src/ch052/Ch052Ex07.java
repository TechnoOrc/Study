package ch052;

/*
 * static initializer
 * 	- static은 class load 할 때, 최초의 1번만 실행된다
 * 	- class load 할 때, 최초의 1번만 실행하고 싶은 부분이 있다면? 
 *    class load -> 다음에 메모리에 올리는 시점(instance화 하는 시점) 생성자를 쓰면 되므로
 *    메모리에 올리는 시점에 할 작업이 아니면 굳이 필요없다.
 * 		-> static initializer를 사용해라
 * 주의!!!
 * 	-> 서버 프로그램에서 static의 존재는 서버를 끄기 전까지 살아있음
 * 		-> 남발하면 서버 성능 저하
 */
public class Ch052Ex07 {
	
	public static int staticInt1;
	public static int staticInt2;
	
	
	static {
		staticInt1 = 777;
		System.out.println("Ch052Ex07의 class가 load 되고 있습니다.");
	}//static
	
	public static void main(String[] args) {
		System.out.println(staticInt1);
		System.out.println(staticInt2);
		
		
	}//main

}//class
