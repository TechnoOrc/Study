package ch052;

public class Ch052Ex18 {
	
	//local inner class는 메소드를 수행하기 위해 임시 class가 필요할 때 사용한다
	public void innerTest() {
		
		//public class LocalInnerA{}//error// 메소드 안에서는 default 제외하고 에러
		//public class LocalInnerB{}//error
		//public class LocalInnerC{}//error
		class LocalInner{
			public String inStr;
			public void printStr() {
				System.out.println("inStr : " + inStr);
			}
		}//class LocalInner
		
		LocalInner local = new LocalInner();
		local.inStr = "메소드에서 생성하고, 메소드가 종료되면 사라진다.";
		local.printStr();
		
	}//innerTest()
	
	
	
	
	
	public static void main(String[] args) {

		Ch052Ex18 test = new Ch052Ex18();
		test.innerTest();
		
		
	}//main

}//class
