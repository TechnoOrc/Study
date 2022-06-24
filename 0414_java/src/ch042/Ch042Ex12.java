package ch042;

class Ch042Dummy6 {

	String memStr;

	public Ch042Dummy6() {
	}

	public Ch042Dummy6(String memStr) {
		this.memStr = memStr;
		// 생성자 안에서도 this를 사용하여 자기 자신의 instance에 접근 가능하다.
	}

	public String getMemStr() {
		return memStr;
	}

	public void setMemStr(String memStr) {
		this.memStr = memStr;
	}

}// class

public class Ch042Ex12 {

	public static void main(String[] args) {

	}// main

}// class