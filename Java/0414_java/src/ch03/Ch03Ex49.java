package ch03;

public class Ch03Ex49 {

	public static void main(String[] args) {

		for(int line = 10; line >= 1; line--) {
			
			//System.out.println(line);
			
			for(int star = 1; star <= line; star++) {
				System.out.print("☆");
			}//for
			System.out.println();
		}//for
		
	}//main

}//class
//☆☆☆☆☆☆☆☆☆☆
//☆☆☆☆☆☆☆☆☆
//☆☆☆☆☆☆☆☆
//☆☆☆☆☆☆☆
//☆☆☆☆☆☆
//☆☆☆☆☆
//☆☆☆☆
//☆☆☆
//☆☆
//☆