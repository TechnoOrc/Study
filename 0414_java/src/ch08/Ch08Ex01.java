package ch08;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/*
 * 달력과 날짜, 시간.
 * Calendar
 * Date
 * DateFormat
 */
public class Ch08Ex01 {

	public static void main(String[] args) {
		
		//Calendar cal1 = new Calendar();//error
		Calendar cal1 = new GregorianCalendar();
		//System.out.println( cal1 ); 
		System.out.println( "Calendar.YEAR : " + cal1.get(Calendar.YEAR) );
		System.out.println( "Calendar.MONTH : " + cal1.get(Calendar.MONTH + 1 ));//month : 0 ~ 11
		System.out.println( "Calendar.DAY_OF_MONTH : " + cal1.get(Calendar.DAY_OF_MONTH) );
		System.out.println( "Calendar.DAY_OF_WEEK : " + cal1.get(Calendar.DAY_OF_WEEK) );//1(일) 2 3 4(수) 5 6 7(토)
		System.out.println( "Calendar.AM_PM : " + cal1.get(Calendar.AM_PM) );//0:오전, 1:오후.
		System.out.println( "Calendar.HOUR : " + cal1.get(Calendar.HOUR) );
		System.out.println( "Calendar.MINUTE : " + cal1.get(Calendar.MINUTE) );
		System.out.println( "Calendar.SECOND : " + cal1.get(Calendar.SECOND) );
		
		Calendar cal2 = Calendar.getInstance();// 현재 컴퓨터 시간
		System.out.println(cal2);
		Date date = new Date();// 현재 컴퓨터의 시간
		System.out.println(date);//Wed May 04 12:02:38 KST 2022
		//System.out.println(date.getYear());//1900년도 기준인가.?
		//System.out.println(date.getMonth()+1);//month : 0 ~ 11.
		//System.out.println(date.getDate());
		//System.out.println(date.getDay());//0(일) 1(월) 2(화) 3(수) 4(목) 5(금) 6(토)
		//System.out.println(date.getTime());
		//System.out.println(date.getMinutes());
		//System.out.println(date.getHours());
		//System.out.println(date.getSeconds());
		
		//java.text.SimpleDateFormat; 찾아보기 java.text.SimpleDateFormat
		DateFormat dateFom = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		System.out.println(dateFom.format(date));
		
		DateFormat dateFom2 = new SimpleDateFormat("YYYY-MM-dd");
		System.out.println(dateFom2.format(date));
	}//main
}//class
