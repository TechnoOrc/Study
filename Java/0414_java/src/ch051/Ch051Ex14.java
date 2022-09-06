package ch051;
/*
 * Encapsulation : 은형성 : 개념
 *  - 데이터의 의도하지 않은 변경을 막으려는 개념
 *  - data hidden : data 은닉
 *  - 보호하려는 data를 private으로 선언
 *  - private data에 접근하는 메소드(set메소드/ get메소드)를 만들어 주는 개념
 *  - set메소드/ get메소드 : public 선언이 기본
 *  - set메소드 : data를 입력하는 개념
 *  - get메소드 : data를 출력하는 개념
 */

class RegistProduct {//상품 등록 
	private String productName;
	private int price;
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		if(productName.length() <= 0) return;//종료
		if(productName.trim().equals(""))return;//공백으로 잘랐을때 공백이면 종료
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price <= 0) return;//종료
		this.price = price;
	}
	public void print() {
		System.out.println(productName);
	}
	
}//class
public class Ch051Ex14 {

	public static void main(String[] args) {

		RegistProduct test = new RegistProduct();
		test.setProductName("씽크패드");
		//test.productName = "ThinkPad";//error// 접근 안됨
		test.print();
	}//main

}//class
