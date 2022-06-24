package ch07;

import java.util.ArrayList;

/*
 * List
 * 	- interface : 객체 생성(new) 불가
 * 	- 자료 저장 구조에 대한 정의
 * 	- 순서 있음 : 순서에 따라 저장하고, 순서에 따라 출력
 * 	- 저장 내용 중복을 허용함.
 * 	- 길이 개념은 size()
 * 	- 주소 개념은 0부터 시작 size() -1 에서 종료.
 * 	- sub class : ArrayList, LinkedList, Vector...
 * 	
 * ArrayList
 * 	- 최근 추세는 Generic이 대세.
 * 	- Generic의 탄생 배경을 알려면, Generic 없는 ArrayList를 알아야 함.
 */
public class Ch07Ex02 {

	public static void main(String[] args) {

		ArrayList<String> listGStr = new ArrayList<String>();//Generic Type <>은 입력되는 데이터의 타입을 이야기한다.
		//listGStr.add(1);//error
		//listGStr.add(3.14);//error
		//listGStr.add('A');//error
		//listGStr.add(true);//error
		listGStr.add("hi");
		/*
		 * ArrayList의 일반적인 사용법은 다양한 데이터를 담을 수 있지만,
		 * 원하지 않는 데이터가 섞일 수 있는 의도치 않은 상황이 발생할 수도 있다
		 * 	->  Generic Type의 탄생배경
		 * Generic Type은 저장할 수 있는 형태를 제한한 용법.
		 */
		ArrayList list1 = new ArrayList();// 여러 데이터 타입을 담을 수 있다.
		list1.add(1);//add : data를 추가.
		list1.add(3.14);//소수
		list1.add('A');//문자
		list1.add(true);//boolean
		list1.add("hi");//String
		System.out.println("size : " + list1.size());//size : ArrayList의 길이.
		System.out.println("get(0) : " + list1.get(0));//get : data 추출.
		System.out.println("get(4) : " + list1.get(4));
		//====================================================================
		
		/* 복사. 결과물이 Object 이기 때문에 Object에 담아준다.
		   왜 Object로 변하는가? 먼저 ArrayList는 왜 모든 타입의 데이터를 담을 수 있는것인가. Object Type 이기때문에
		   java.lang.object // 모든 class는 Object를 자동 상속받는다.
		   Object 하위 클래스에는 (String, Interger, Ch06Tesst...)
		   Object[] 부모타입 변수에는 Ch06Test[0], String[1], Integer[2]
		   Collection API : 자료 저장 창고는 최상위 class Type으로 만들어 졌다.
		   HeteroGeneous Collection
		   ArrayList : Object[0]
		   object[0] = new String("hi")
		   String str = (String) object[0]; 
		 * 
		 */
		
		Object obj = list1.clone();
		ArrayList list2 = (ArrayList) obj; // data type casting
		Object [] objArr = list2.toArray();//toArray : 배열로 변환
		//ArrayList list2 = (ArrayList) list1.clone(); 위 2줄을 한줄로 바꿈
		
		System.out.println("objArr[4] : " + objArr[4]);
		//isEmpty : 비어있는 ArrayList인가?
		System.out.println("list2.isEmpty() : " + list2.isEmpty()); // 비워있으면 true, 비워있지 않으면 false
		
		list2.clear();//clear : 비워라
		System.out.println("clear after isEmpty() : " + list2.isEmpty());
		
		//indexof : 특정 값의 index 위치.(앞에서 검색)
		System.out.println("indexOf : " + list1.indexOf('A'));
		//lastIndexof : 특정 값의 index 위치.(뒤에서 검색)
		System.out.println("lastIndexOf : " + list1.lastIndexOf(3.14));//indexof : 특정 값의 위치.(앞에서 검색)
		
		System.out.println("remove 전 : " + list1);
		list1.remove(3); //remove(3) : 3번지 삭제.
		list1.remove(3.14); //remove(3.14) : 3.14 삭제.
		System.out.println("remove 후 : " + list1);
		
	
		
	}//main

}//main
