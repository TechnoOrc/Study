package ch03;

public class Ch03Ex47 {

	public static void main(String[] args) {

		
		for(int line = 1; line <= 10; line++) {
			//System.out.print(line);
			
			for(int star = 1; star <= line; star++) {
				System.out.print("☆");
				if(star == line) break;
				
			}//for
			System.out.println();
		}//for
		
		
	}//main

}//class
//별찍기
//☆
//☆☆
//☆☆☆
//☆☆☆☆
//☆☆☆☆☆
//☆☆☆☆☆☆
//☆☆☆☆☆☆☆