package ch07njm;

public class Ch11Ex02 {

	public static void main(String[] args) {

		String year = "1994";
		int age = 2002 - Integer.parseInt(year);//문자열  year을 int형으로 변환
		System.out.println("나이 : " + year);
		System.out.println("===============");
		
		try {
			String year2 = "1994년";
			int age2 = 2002 - Integer.parseInt(year2);//문자열  year을 int형으로 변환
			System.out.println("나이 : " + year2);
			
		} catch (NumberFormatException e) {
			System.out.println("숫자만 넣어주세요");
		}//catch
			
		System.out.println("수고하셨습니다.");
	}//main

}//class
