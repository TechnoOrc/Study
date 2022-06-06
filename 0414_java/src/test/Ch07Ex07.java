package test;



class ch07MyClass{
	String compareStand;
	ch07MyClass(){}
	ch07MyClass(String str){
		this.compareStand = str;
		
	}
		
	@Override
	public boolean equals(Object obj) {
		ch07MyClass imsi = (ch07MyClass) obj;
		
		return (this.compareStand == imsi.compareStand);
		
	}//equals
		
		@Override
		public String toString() {
			
			return "객체에 대한 안내문 입니다.\n\'" + compareStand + "\'가 저장된 데이터 입니다.\n감사합니다.";
			
		}//toString


}//class



public class Ch07Ex07 {

	public static void main(String[] args) {

		ch07MyClass test1 = new ch07MyClass("hello");
		ch07MyClass test2 = new ch07MyClass("hello");
		ch07MyClass test3 = new ch07MyClass("hello?");
		
		System.out.println(test1.equals(test2));
		System.out.println(test1.equals(test3));
		System.out.println(test1.toString());
		
		
		
		
	}//main

}//class
