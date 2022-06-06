package ch02;

/*
 * 길이값 : length
 * 위치값 : index
 * 예) hello - 길이값은? 5, 길이(length)는 1부터 시작
 * 예) hello - o의 위치값은? 4, 위치(index)는 0부터 시작
 */
public class Ch02Ex16 {

	public static void main(String[] args) {
		
		String str = "nice to meet you, too.";
		System.out.println("["+str+"]" + " 의 길이 length는 : "+ str.length());//22
		System.out.println("["+str+"]" + " 에서 .의 위치 값 index는 : "+ str.indexOf("."));//21
		//작은 따옴표는 문자 하나(char data type)
		//큰 따옴표는 문자열(String type)
		//글자의 갯수와 상관없이 큰 따옴표면 무조건 문자열
		System.out.println("======================================================");
		
		System.out.println("["+str+"]" + " 에서 e를 좌에서 우로 검색 str.indexOf 하면 : " + str.indexOf("e"));//3
		//indexOf : 좌에서 우로 검색
		System.out.println("["+str+"]" + " 에서 e를 우에서 좌로 검색 str.lastIndexOf 하면 : " + str.lastIndexOf("e"));//10 총길이 22 21 20 19 순으로..
		//lastIdexOf : 우에서 좌로검색
		System.out.println("======================================================");
		
		
		//charAt : 특정 위치값의 문자를 가져온다
		
		System.out.println("["+str+"]" + " 에서 특정 위치값의 문자를 가져오는 str.charAt(1) 하면 : " + str.charAt(1));//i
		
		System.out.println("["+str+"]" + " 에서 턱정 문자의 위치값을 가져오는 str.indexOf(\"you\") 하면 : " + str.indexOf("you"));//
		
	}//main
	
}//class
