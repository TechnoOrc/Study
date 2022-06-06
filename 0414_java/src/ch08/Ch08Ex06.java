package ch08;

/*
 * StringBuffer : String은 동적 변경이 안된다.
 * 	- String은 동적 변경이 안된다.
 */

public class Ch08Ex06 {

	public static void main(String[] args) {

		String str = new String("서울시");
		str.concat(" 마포구");//일시적 적용 -> str은 변화가 없다.
		System.out.println(str);
		//System.out.println(str.concat(" 마포구"));
		
		StringBuffer buffer = new StringBuffer("Seoul");
		buffer.append(" mapogu");//문자열의 동적 변화
		System.out.println(buffer);
		
		buffer.reverse();
		System.out.println(buffer);
		
		buffer.deleteCharAt(0);//ugopam luoeS
		System.out.println(buffer);
		
		buffer.insert(5, " city" );//gopam luoeS
		System.out.println(buffer);
		
		buffer.substring(0,5);//gopam city luoeS
		System.out.println(buffer);//String의 subString과 같은 결과
		System.out.println(buffer.substring(0,7));
		
		
		
	}//main

}//class
