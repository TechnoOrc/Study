package ch041;

public class Ch041Ex10 {

	public static void main(String[] args) {
		//String 배열 : class type의 배열
		String [] strArr = new String[6];
		strArr[0] = new String("hi");
		strArr[1] = new String("hello");
		strArr[2] = new String("how are you");
		strArr[3] = new String("fine, thank you");
		strArr[4] = new String("and you?");
		strArr[5] = new String("i am fine too");
		for(int idx = 0; idx < strArr.length; idx++){
			System.out.println(strArr[idx]);
		}//for
		
	}//main

}//class
