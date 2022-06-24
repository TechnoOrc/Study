package ch08;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

//Random : 랜덤 : 임의의 무작위 값 발생.

public class Ch08Ex02 {

	public static void main(String[] args) {
		//Math.random()은 항상 double 발생.
		System.out.println("Math.random() : " + Math.random());
		
		//Random은 boolean, double, int를 선택 가능.
		 Random rand = new Random();
		 System.out.println("rand.nextBoolean() : " + rand.nextBoolean());
		 System.out.println("rand.nextDouble() : " + rand.nextDouble());
		 System.out.println("rand.nextInt() : " + rand.nextInt());
		
		 //Math.random()의 로또 발생
		 System.out.println((int)(Math.random() * 45)
				 + 1);
		 System.out.println("Random lotto : " + (rand.nextInt(45)+1));//1 부터 45 까지
		 
		 
		 HashSet<Integer> lotto = new HashSet<Integer>();// HashSet 중복값 허용안되며, 데이터 정렬 안됨
		 while(lotto.size() < 6) {
			 lotto.add(rand.nextInt(45)+1);
		 }//while
		 System.out.println(lotto);
		 
		 
		 
		 TreeSet<Integer> lotto2 = new TreeSet<Integer>();//TreeSet 중복값 허용안되며, 데이터 정렬 됨 
		 System.out.println("=======");
		 while(lotto2.size() < 6) {
			// lotto2.add(rand.nextInt(45)+1);
			 lotto2.add((int) (Math.random() * 45)+1);
		 }//while
		 System.out.println(lotto2);
		 
		 
		 
	}//main

}//class
