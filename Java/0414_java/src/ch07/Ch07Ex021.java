package ch07;

import java.util.Vector;

/*
 * List
 *  - interface : 객체 생성(new) 불가.
 *  - 자료 저장 구조에 대한 정의.
 *  - 순서 있음 : 순서에 따라 저장하고, 순서에 따라 출력.
 *  - 저장 내용의 중복을 허용함.
 *  - 길이 개념은 size()
 *  - 주소 개념은 0부터 시작, size()-1에서 종료.
 *  - sub class : ArrayList, LinkedList, Vector...
 * Vector
 *  - 최근 추세는 Generic이 대세.
 */
public class Ch07Ex021 {

	public static void main(String[] args) {
		//Vector : 특별한 배열 : 처음 만들 때 5칸, 6번째 칸이 필요할 때, 5칸 더 만든다.
		Vector vec1 = new Vector(5,5);
		vec1.add(1);
		vec1.addElement(3.14);
		System.out.println("size : " + vec1.size());//size : 저장된 데이터 개수
		System.out.println("capacity : " + vec1.capacity());//capacity : 저장 가능한 공간의 갯수
		vec1.add('A');
		vec1.add(true);
		vec1.add("hi");
		vec1.add("hi");
		System.out.println("size : " + vec1.size());//size : 저장된 데이터 개수
		System.out.println("capacity : " + vec1.capacity());//capacity : 저장 가능한 공간의 갯수
		
		System.out.println("get(3) : " + vec1.get(3));//get : data 추출.
		//contains : 특정 데이터가 저장되어 있는지 확인
		System.out.println("contains(\"hi\") : " + vec1.contains("hi"));
		//elementAt(1) : 1번지의 데이터 확인
		System.out.println("elementAt(1) : " + vec1.elementAt(1));
		//indexOf : 앞에서 부터 검색
		System.out.println("indexOf(\"hi\") : " + vec1.indexOf("hi"));
		//lastIndexOf : 뒤에서 부터 검색
		System.out.println("lastIndexOf(\"hi\") : " + vec1.lastIndexOf("hi"));
		System.out.println("firstElement : " + vec1.firstElement());//첫번째 저장 데이터를 검색.
		System.out.println("lastElement : " + vec1.lastElement());//마지막 저장 데이터를 검색.
		
		Vector vec2 = (Vector) vec1.clone();//clone : 복제.(원래 Object Type 이기 때문에 Casting)
		System.out.println("isEmpty : " + vec2.isEmpty());//isEmpty : 데이터가 없는가?
		Object [] objArr = vec2.toArray();//toArray : 벡터를 어레이로 변경.
		System.out.println("objArr[1] : " + objArr[1]);
		System.out.println("vec2 : " + vec2);
		vec2.clear();
		System.out.println("clear 후, vec2 : " + vec2);
		
		System.out.println("vec1 : " + vec1);//[1, 3.14, A, true, hi, hi]
		vec1.insertElementAt(777, 2);//insertElementAt : 특정 번지에 데이터 끼워 넣기.
		System.out.println("vec1 : " + vec1);//[1, 3.14, 777, A, true, hi, hi]
		vec1.setElementAt("수정 데이터", 2);//setElementAt : 특정 번지의 데이터 수정.
		System.out.println("vec1 : " + vec1);//[1, 3.14, 수정 데이터, A, true, hi, hi]
		vec1.removeElementAt(5);//removeElementAt : 특정 번지의 데이터 삭제. 
		System.out.println("vec1 : " + vec1);//[1, 3.14, 수정 데이터, A, true, hi]
		vec1.remove(3);//remove : 번지나 데이터를 기준으로 삭제.
		vec1.remove(true);
		System.out.println("vec1 : " + vec1);//[1, 3.14, 수정 데이터, hi]
		vec1.removeElement("수정 데이터");//removeElement : 데이터를 기준으로 삭제.
		System.out.println("vec1 : " + vec1);
		vec1.removeAllElements();//removeAllElements : 모두 삭제
		System.out.println("vec1 : " + vec1);
		System.out.println("size : " + vec1.size());//size : 저장된 데이터 개수
		System.out.println("capacity : " + vec1.capacity());//capacity : 저장 가능한 공간의 개수

	}//main

}//class