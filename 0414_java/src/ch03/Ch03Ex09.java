package ch03;

/*
 * shift 연산자
 * 	- 일종의 비트 연산.
 * 	- 사용 이유 : 작은 메모리 활용.
 *            부호  64 32 16  8  4  2  1  
 *  4       :  0   0  0  0  0  1  0  0  
 *  4 >> 2  :  0   0  0  0  0  0  0  1  
 *  4 << 2  :  0   0  0  1  0  0  0  0 
 * -4 >> 2  :  1   0  0  0  0  0  0  1 
 * >> : right shift : 새로운 자리는 0으로 채움
 * >>> : unsigned right shift : 새로운 자리는 부호비트(음/양)로 채움
 * << : left shift : 새로운 자리는 0으로 채움
 */
public class Ch03Ex09 {
	
	public static void main(String[] args) {
		
		 System.out.println( 4 >> 2);//1
		 System.out.println( 4 << 2);//16
		 System.out.println( -4 >> 2);//1
		 System.out.println( -4 << 2);//16
		 
	}//main
}//class
