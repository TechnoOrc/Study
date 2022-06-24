package ch07;

//생성자를 통해 T의 값을 대입
class Ch07Ex13Test<T>{
	private T var;
	Ch07Ex13Test(T t){//생성자에서의 Generic.
		this.var = t;
	}
	@Override
	public String toString() {
		return this.var.toString();
	}
}//class




public class Ch07Ex13 {

	public static void main(String[] args) {

		Ch07Ex13Test<Integer> test1 = new Ch07Ex13Test<Integer>(777);
		System.out.println(test1.toString());
		
		Ch07Ex13Test<String> test2 = new Ch07Ex13Test<String>("nice Shot!!!");
		System.out.println(test2.toString());
		
		Ch07Ex13Test<Ch07MyGObj> test3 = new Ch07Ex13Test<Ch07MyGObj>(new Ch07MyGObj("Good day!"));
		System.out.println(test3.toString());
		
		
	}//main

}//class
