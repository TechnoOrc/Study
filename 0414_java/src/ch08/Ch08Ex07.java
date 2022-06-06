package ch08;

/*
 * StringBuilder
 * 	- StringBuffer와 마찬가지로 문자열을 동적 변경한다.
 */
public class Ch08Ex07 {

	public static void main(String[] args) {
		
		StringBuilder builder = new StringBuilder("seoul");
		builder.append(" mapogu");
		System.out.println(builder);
		
		builder.insert(5, "<city>");//seoul mapogu
		System.out.println(builder);
		
		builder.setCharAt(5, ' ');//seoul<city> mapogu
		System.out.println(builder);
		
		builder.setLength(20);//seoul city> mapogu
		System.out.println("[" + builder + "]");
		
		
		builder.subSequence(0, 7);//[seoul city> mapogu
		System.out.println(builder.subSequence(0, 7));
		
	}//main
}//class
