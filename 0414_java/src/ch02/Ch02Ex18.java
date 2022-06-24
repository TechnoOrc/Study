package ch02;

/*
 * replace : 문자열 바꾸기
 * 	- 본판 불변의 법칙 : replace로 변환한 결과는 저장하지 않으면 사라진다.
 */
public class Ch02Ex18 {

	public static void main(String[] args) {

		String str = "nice to meet you, too.";
		System.out.println("[원본]" + str);
		System.out.println();
		System.out.println("you를 u~~로 변경 : " + str.replace("you","u~~"));//일회성 변화
		System.out.println("[원본불변]" + str);//본래 데이터는 변하지 않는다.
		System.out.println();
		System.out.println("o를 A로 변경 : " +str.replace("o", "A"));//전부 바뀐다 //일회성변화
		System.out.println("o를 E로 변경 : " +str.replaceAll("o", "E"));//전부 바뀐다 //일회성변화
		System.out.println("[원본불변]" + str);//본래 데이터는 변화지 않는다.
		System.out.println();
		String str2 = str.replace("you","u~~");
		System.out.println("변경 저장본 : " + str2);
		
	}//main

}//class
