package ch07;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/*
 * Overview
 * Collection API : 집합 : 자료 저장 구조
 * 	- Set, Map, List : 자료 저장 창고의 유형
 * 	- 배열은 크기를 동적으로 확장 불가.
 * 	- Collection API는 크기를 동적으로 확장 가능.
 * Set 
 * 	- (단건 데이터 저장)
 *	- 중복 없음, 순서 없음. 
 *	- 중복된 데이터를 베제하고 싶을 때 사용
 *	- HashSet을 많이 사용 : class HashSet implements Set
 * List 
 * 	- (단건 데이터 저장)
 * 	- 중복 가능, 순서 있음.
 * 	- 데이터를 꺼낼 때, 순서 번호(index)로 꺼낸다.
 * 	- ArrayList을 많이 사용 : class ArrayList implements List
 * Map  
 * 	- (이름표(key)와 내용물(value)의 한 쌍으로 저장)
 * 	- key 중복 없음, value는 중복이 가능.
 * 	- 순서 없음.
 * 	- 데이터를 꺼낼 때, 이름으로 꺼낸다. 
 * 	-  HashMap을 많이 사용 : class HashMap implements Map
 */

public class Ch07Ex01 {

	public static void main(String[] args) {
		
		HashSet set = new HashSet();
		set.add("data1");
		set.add("data1");
		set.add(1);
		set.add(1);
		
		Object [] obs = set.toArray(); //set.add 한 값을 배열로 생성?
		System.out.println(obs.length);//중복 저장 안됨
		
		HashMap map = new HashMap();
		map.put("kim", 777);
		map.put("kim", 888);
		System.out.println(map.get("kim"));//두번째 값이 남음. 
		
		ArrayList list = new ArrayList();
		list.add("data1");//.add 값을 입력
		list.add("data1");//.add 값을 입력
		list.add(777);
		list.add(777);
		System.out.println(list); //add:더하기, put:끼워넣기, get:가저오기 ??
//		for (int i = 0; i < list.size(); i++) {
//			
//			System.out.println(list.get(i)); //add:더하기, put:끼워넣기, get:가저오기 ??
//		}//for
//		

	}//main

}//class
