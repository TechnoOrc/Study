package ch041;

public class Ch041Ex03 {

	public static void main(String[] args) {
		//베열은 resize 불가, 길이(크기) 변경 불가.
		int [] iArr1 = new int [3];
		iArr1[0] = 7;
		iArr1[1] = 8;
		iArr1[2] = 9;
		System.out.println(iArr1[2]);
		
		iArr1 = new int [5];
		//기존의 7,8,9가 담긴 3칸짜리 배열은 버려지고, 으로 초기화된 5칸짜리가 새로 연결된다. 기존 만들어진 공간에 덧붙여 질 수 없다.
		System.out.println(iArr1[2]);
		
	}//main

}//class

/*
 * Gabage Collector -> Gabage Collection
 * - 자바에서 사용하던 메모리 중에서, 더 이상 사용하지 않는 메모리를 회수(해제). 
 */
