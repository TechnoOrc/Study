package ch07;

/*
 * Ch07Ex11Test의 장점
 * 	- 어떤 형태의 객체도 변수가 될 수 있다.
 * Ch07Ex11Test의 단점
 * 	- 아무 형태의 객체도 변수가 될 수 있다.
 * Ch07Ex11Test의 단점 극복
 * 	- T를 제한 하자!!!
 * 
 * <T extends 특정클래스>
 * 	- 특정클래스를 상속 받은 클래스들만 <>에 들어갈 수 있다.
 */
class Ch07Person{
	String name;
	Ch07Person(String name){
		this.name = name;
	}
	@Override
		public String toString() {
			return this.name;
		}
}//class

class Ch07Male extends Ch07Person {
	Ch07Male(String name){
		super(name);
	}
}//class

class Ch07FeMale extends Ch07Person {
	Ch07FeMale(String name){
		super(name);
	}
}//class

class Ch07Ex12Test<T extends Ch07Person> {// new Ch07Ex11Test<>();
	//클래스를 new통해 사용할때 변수타입을 지정한다.
	private T name;
	private String str;
	public T getName() {
		return name;
	}
	public void setName(T name) {
		this.name = name;
	}
}//class
public class Ch07Ex12 {

	public static void main(String[] args) {
		
		//Ch07Ex12Test<Integer> test1 = new Ch07Ex12Test<Integer>();//error
		//Ch07Ex12Test<String> test2 = new Ch07Ex12Test<String>();//error
		Ch07Ex12Test<Ch07Person> test3 = new Ch07Ex12Test<Ch07Person>();
		Ch07Ex12Test<Ch07Male> test4 = new Ch07Ex12Test<Ch07Male>();
		Ch07Ex12Test<Ch07FeMale> test5 = new Ch07Ex12Test<Ch07FeMale>();
		
	}//main

}//class
