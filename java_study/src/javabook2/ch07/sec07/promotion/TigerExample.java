package javabook2.ch07.sec07.promotion;

public class TigerExample {

	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		
		// 자동 타입 변환:  큰타입 변수명 = 작은타입객체;
		Animal animal = tiger;
		
		animal.sleep();		// 호출 가능
		animal.eat();		// 호출 가능(오버라이딩 된 경우, 자식 메서드 동작)
		
//		animal.sound();		// 호출 불가능
		
	}

}
