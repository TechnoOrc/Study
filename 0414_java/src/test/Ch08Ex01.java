package test;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ch08Ex01 {

	public static void main(String[] args) {

		Calendar call = new GregorianCalendar();
		System.out.println(call.get(Calendar.YEAR));//년도
		System.out.println(call.get(Calendar.MONTH) +1);//월
		System.out.println(call.get(Calendar.DAY_OF_MONTH));//월중에 몇일인가?
		System.out.println(call.get(Calendar.DAY_OF_WEEK));//주일중 몇일인가?
		
		
		
	}//main

}//class


