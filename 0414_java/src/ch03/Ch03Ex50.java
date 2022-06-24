package ch03;

public class Ch03Ex50 {

	public static void main(String[] args) {

		int line = 0;
		while(line <= 10) {
			
			int gong = 10;
			while(gong >= line) {
				System.out.print(" ");
				gong--;
			}//while
			
			int star = 0;
			while(star <= line) {
				System.out.print("☆");
				star++;
			}//while
			System.out.println();
			line++;
		}//while
			
	
		
	}// main

}// class

//         ☆
//        ☆☆
//       ☆☆☆
//      ☆☆☆☆
//     ☆☆☆☆☆
//    ☆☆☆☆☆☆
//   ☆☆☆☆☆☆☆
//  ☆☆☆☆☆☆☆☆
// ☆☆☆☆☆☆☆☆☆
//☆☆☆☆☆☆☆☆☆☆

