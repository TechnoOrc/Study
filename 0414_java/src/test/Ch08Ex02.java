package test;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class Ch08Ex02 {

	public static void main(String[] args) {

		
		System.out.println("math.random() : " + Math.random());
		
		Random rand = new Random();
		System.out.println(rand.nextBoolean());
		System.out.println(rand.nextDouble());
		System.out.println(rand.nextInt());
		
		System.out.println((int) (Math.random() * 45 + 1));
		System.out.println(rand.nextInt(45) + 1);
		
		HashSet<Integer> lotto = new HashSet<Integer>();
		while(lotto.size() < 6) {
			lotto.add(rand.nextInt(45) + 1);
			
		}//while
		System.out.println(lotto);
		
		TreeSet<Integer> lotto2 = new TreeSet<Integer>();

		while(lotto2.size() < 6){
			lotto2.add(rand.nextInt(45) + 1);
		}
		
		System.out.println(lotto2.size());
		System.out.println(lotto2);
		
		
	}//main

}//class
