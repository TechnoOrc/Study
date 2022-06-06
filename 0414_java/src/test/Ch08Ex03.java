package test;

import java.util.ArrayList;
import java.util.Arrays;

import ch08.Ch08SortObj1;

public class Ch08Ex03 {

	public static void main(String[] args) {

		int [] iArr = {11111,222,3,4444,555};
		System.out.println(Arrays.toString(iArr));
		Arrays.sort(iArr);
		System.out.println(Arrays.toString(iArr));
		
		String strArr[] = {"hi", "boy", "zombie", "airplane", "world"};
		System.out.println(Arrays.toString(strArr));
		Arrays.sort(strArr);
		System.out.println(Arrays.toString(strArr));
		
		Ch08SortObj1 [] sArr1 = {"BBB", "AAA"};
		System.out.println(Arrays.toString(sArr1));
		
		
		
	}//main

}//class


class Ch08SortObj1{
	String name;
	Ch08SortObj1(String str){
		name = str;
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}
}