package ch08;

import java.util.Arrays;
import java.util.Collection;

/*
 * Arrays.sort(), Arrays.toString()
 * Collections.sort(), Collection은 출력시 toString()은 자동.
 * Comparable - compareTo : 자동 정렬 기준.
 * 	- 나만의 클래스에 나만의 정렬 기준을 만드려면
 * 		-> implements Comparable
 * 			-> CompareTo 오버라이드 해야 한다.
 *  Collections 이게 무엇인가.??? 다시찾아보자.!
 */
 
public class Ch08Ex03 {

	public static void main(String[] args) {

		int [] iArr = {11111,2222,3,4444,555};
		System.out.println(Arrays.toString(iArr));
		Arrays.sort(iArr);//값의 크기로 오름차순
		System.out.println(Arrays.toString(iArr));
		//========================================
		String strArr[] = {"hi", "boy", "zombie", "airplane", "world"};
		//System.out.println(strArr[0]);
		//System.out.println(strArr); 한번 생각 해 볼 내용
		System.out.println(Arrays.toString(strArr));
		Arrays.sort(strArr);
		System.out.println(Arrays.toString(strArr));
		//========================================
		Ch08SortObj1 [] sArr1 = {new Ch08SortObj1("BBB"), new Ch08SortObj1("AAA")};
		System.out.println(Arrays.toString(sArr1));
		//Arrays.sort(sArr1);//error===========>> 여기서 에러가 나므로 Comparable 한다.
		//========================================
		Ch08SortObj2 [] sArr2 = {new Ch08SortObj2(11111,"11111"), 
				new Ch08SortObj2(2222,"2222"),new Ch08SortObj2(3,"3"), 
				new Ch08SortObj2(4444,"4444"), new Ch08SortObj2(555,"555")};
		System.out.println(Arrays.toString(sArr2));
		Arrays.sort(sArr2);
		System.out.println(Arrays.toString(sArr2));
		
	}//main

}//class

class Ch08SortObj1{
	String name;
	Ch08SortObj1(String str){
		name = str;
		
	}
	@Override
	public String toString() {
		
		return this.name;
	}
	
}//class


class Ch08SortObj2 implements Comparable<Ch08SortObj2>{//Comparable비교하는, implements로 봐서 인터페이스고 오버라이드 해야한다.
	int no;
	String name;
	Ch08SortObj2(int num, String str){
		no = num; // this.no로 쓰지않은 이유는 지역변수와 멤버변수의 이름이 달라서 this로 지칭 할 이유가 없다.
		name = str;
	}
	@Override
	public int compareTo(Ch08SortObj2 o) {
		//return type : int : -1(앞으로 이동) 0(자리 이동 없음) 1(뒤로 이동) 
		if(this.no > o.no) {
			return 1;//자리 바꿈 : 뒤로 이동.
		}else if(this.no < o.no) {
			return -1;//자리바꿈 : 앞으로 이동.
		}
		return 0;
	}//compareTo
	
	@Override
	public String toString() {
		
		return this.name;
	}//toString
}//class

