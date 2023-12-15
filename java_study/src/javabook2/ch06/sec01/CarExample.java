package javabook2.ch06.sec01;

// 실행 클래스
// (누구나 볼수 있는) 자동차예제 설계도
public class CarExample {
	
//	1. 필드(속성)
	
//	2. 생성자
	
//	3. 매서드(동작, 기능)
	
	// main 함수(메서드)
//	기능: 프로그램이 처음 동작을 시작하는 곳
	public static void main(String[] args) {
		
		Car window = new Car();
	
		System.out.println("창문의 개수는: "+window.windowNum);
		window.open();
		
		System.out.println("==================");
		Car mycar = new Car();
		Car momcar = new Car();
		
		mycar.run();
		mycar.displaySpeed();
		
		System.out.println("내 차량 회사: "+mycar.company);
		System.out.println("내 차량 모델: "+mycar.model);
		System.out.println("내 차량 최고속도: "+mycar.maxSpeed);
		System.out.println("==================");
		momcar.run();
		momcar.displaySpeed();
		
		System.out.println("엄마 차량 회사: "+momcar.company);
		System.out.println("엄마 차량 모델: "+momcar.model);
		System.out.println("엄마 차량 최고속도: "+momcar.maxSpeed);
	}
}
