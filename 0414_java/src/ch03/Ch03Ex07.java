package ch03;

public class Ch03Ex07 {

		public static void main(String[] args) {
			// ! : 논리 부정, NOT의 의미
			System.out.println(true);//true
			System.out.println(!true);//false
			System.out.println(!!true);//true
						
			// +, - : 부호 연산자
			System.out.println(10);//양수
			System.out.println(-10);//음수
			System.out.println(-(-10));//양수
			
			// ~ : 1의 보수
			// 1의 보수 : -128 ~ 127 -> 0의 대칭점은?? -1
			// -3 -2 -1   기준    0 1 2
			System.out.println( ~ 0 );
			System.out.println( ~ 1 );
			System.out.println( ~ 2 );
			
			//2의 보수 : 1의 보수 + 1 : ~ 1 + 1
			// -3 -2 -1   0기준    1 2 3
			System.out.println( ~ 0 +1 );//0
			System.out.println( ~ 1 +1 );//-1
			System.out.println( ~ 2 +1 );//-2
			
		}
}
