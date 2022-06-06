package ch07;

class Ch07Ex14Test<K,V>{
	private K key;
	private V value;
	@Override
	public String toString() {
		return key + " : " + value;
	}
	
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	
	
	
}//class


public class Ch07Ex14 {

	public static void main(String[] args) {

		Ch07Ex14Test<Integer, String> test = new Ch07Ex14Test<Integer, String>();
		test.setKey(1);
		test.setValue("first data");
		System.out.println(test.toString());
		System.out.println(test);
		
		
	}//main

}//class
