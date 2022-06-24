package ch041;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Ch041Ex055 {

	public static void main(String[] args) {
/*
		int [] iArr = {34, 16, 20, 11, 7, 14};//i=0; k=1; 34와 16 비교
		int [] iArr = {16, 34, 20, 11, 7, 14};//i=0; k=2; 16과 20 비교
		int [] iArr = {16, 34, 20, 11, 7, 14};//i=0; k=3; 16과 11 비교
		int [] iArr = {11, 34, 20, 16, 7, 14};//i=0; k=4; 11과 7 비교
		int [] iArr = {7, 34, 20, 16, 11, 14};//i=0; k=5; 7과 14 비교
		int [] iArr = {7, 34, 20, 16, 11, 14};//i=1; k=2; 34과 20 비교
		int [] iArr = {7, 20, 34, 16, 11, 14};//i=1; k=3; 20과 16 비교
		int [] iArr = {7, 16, 34, 20, 11, 14};//i=1; k=4; 16과 11 비교
		int [] iArr = {7, 11, 34, 20, 16, 14};//i=1; k=4; 16과 11 비교
		int [] iArr = {7, 11, 34, 20, 16, 14};//i=2; k=3; 34과 20 비교
		int [] iArr = {7, 11, 20, 34, 16, 14};//i=2; k=4; 20과 16 비교
		int [] iArr = {7, 11, 16, 34, 20, 14};//i=2; k=5; 16과 14 비교
		int [] iArr = {7, 11, 14, 34, 20, 16};//i=2; k=5; 16과 14 비교
		int [] iArr = {7, 11, 14, 34, 20, 16};//i=3; k=4; 34과 20 비교
		int [] iArr = {7, 11, 14, 20, 34, 16};//i=3; k=4; 34과 20 비교
		int [] iArr = {7, 11, 14, 16, 34, 20};//i=3; k=5; 20과 16 비교
		int [] iArr = {7, 11, 14, 16, 34, 20};//i=4; k=5; 34과 20 비교
		int [] iArr = {7, 11, 14, 16, 20, 34};
*/
		int [] iArr = {34, 16, 20, 11, 7, 14};

		for (int i = 0; i < iArr.length; i++) {
			for (int k = i+1; k < iArr.length; k++) {
				if(iArr[i] < iArr[k]) {
					int tmp = iArr[i];
					iArr[i] = iArr[k];
					iArr[k] = tmp;
				}//if
			}//for
		}//for

		for (int i = 0; i < iArr.length; i++) {
			System.out.print(iArr[i] + "\t");
		}
		System.out.println();
/*
		for (int i : iArr) {
			System.out.print(i + "\t");
		}
		System.out.println();
*/
		int [] iArr2 = {34, 16, 20, 11, 7, 14};
		System.out.println(Arrays.toString(iArr2));
		Arrays.sort(iArr2);
		System.out.println("Arrays.sort" + Arrays.toString(iArr2));

		Integer[] iArr3 = new Integer[6];
		iArr3[0] = new Integer(34);
		iArr3[1] = new Integer(16);
		iArr3[2] = new Integer(20);
		iArr3[3] = new Integer(11);
		iArr3[4] = new Integer(7);
		iArr3[5] = new Integer(14);
		Arrays.sort(iArr3, Collections.reverseOrder());
		System.out.println("Integer array : " + Arrays.toString(iArr3));

		//자료 저장 구조 기초 방법론 제시 -> array
		//array + OOP 설계 방법론 -> set, Map, List
		//set, Map, List - 기본 자료 저장 구조 - HashSet, HashMap, ArrayList
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(34); list.add(16); list.add(20);
		list.add(11); list.add(7); list.add(14);
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("list : " + list);
		Collections.sort(list);
		System.out.println("list : " + list);

	}//main

}///class