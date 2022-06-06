package test;

import java.util.TreeSet;

import javax.swing.tree.DefaultTreeSelectionModel;

public class Ch07Ex08 {

	public static void main(String[] args) {

	TreeSet<Integer> set = new TreeSet<Integer>();
	set.add(5555);
	set.add(555);
	set.add(111);
	set.add(333);
	set.add(999);
	System.out.println(set);
	
	
	
	TreeSet<String> set2 = new TreeSet<String>();
	
	set2.add("i");
	set2.add("love");
	set2.add("APPLE");
	set2.add("apple");
	set2.add("girl");
	System.out.println(set2);
		
	}//main

}//class
