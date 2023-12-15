package javabook2.ch06.sec01;

// 라이브러리 클래스
// (누구나 볼수 있는) 자동차 설계도
public class Car {
//	문제: 자동차 설계도를 작성하시오
//		자동차가 가지는 속성을 하나 필드로 작성하시오
//		자동차가 가지는 기능을 하나 메서드로 작성하시오
	
//	1. 필드(속성)
	int windowNum = 4;
	
//	2. 생성자
	Car() {
//		System.out.println("창문의 개수는: "+windowNum);
//		open();
	}
	
//	3. 매서드(동작, 기능)
	void open() {
		System.out.println("창문을 내립니다");
	}
	// 1
	String company = "현대자동차";
	String model = "tusan";
	int maxSpeed = 300;
	// 2
	
	// 3
	void run() {
		System.out.println("자동차를 주행한다");
	}
	void displaySpeed() {
		System.out.println("속도를 표시하다");
		System.out.println("최고속도: "+maxSpeed);
	}
	
}
