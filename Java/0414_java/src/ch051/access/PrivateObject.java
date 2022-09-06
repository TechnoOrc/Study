package ch051.access;

public class PrivateObject {

	private int age;//2.set메소드가 의미 있으려면, 변수는 private이어야 한다.

	public int getAge() {//3.변수가 private이니까, 변수 값을 받아가는 메소드도 필요.
		return age;
	}

	public void setAge(int age) {//1.변수 보호를 위해 set 메소드 제공
		if(age < 0) return;//void + return은 메소드 종료.

		this.age = age;
	}

	private void privatePrint() {
		//private 메소드는 현재 class 내부에서만 사용하려는 용도로 만들어진 메소드
		System.out.println(age);
	}

}//class