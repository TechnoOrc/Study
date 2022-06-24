package ch041;

public class Ch041Ex17 {
	
	public static void main(String[] args) {
		
		
		String [][] strArr1 = {{"hi"," hello"}
								,{"how ", "are ", "you"}
								,{"i"," am", " fine.","thank you"}};
		
		for (int i = 0; i < strArr1.length; i++) {
			for (int k = 0; k < strArr1[i].length; k++) {
				System.out.print(strArr1[i][k]);
			}//for
			System.out.println();
		}//for : 번지에 접근하는 것이 유리함
		
		for(String [] arr : strArr1) {// 우항의 값을 좌항에 넣는다.
			for(String str : arr) {
				System.out.print(str);
			}//forEach
			System.out.println();
		}//forEach : 값을 꺼내는 것이 유리함
		
	}//main

}//class
