package javabook2.ch06.sec01;

// 라이브러리 클래스
public class SportsCar {
	
//	1. 필드 (속성)
	int wheelNum = 4;		// 필드 초기화(선언+할당), 바퀴 수
	
//	2. 생성자(기본 생성자)
	SportsCar() {
		System.out.println("바퀴개수: " + wheelNum);	// 필드 사용
		run();											// 메서드 호출(사)
	}
	
//	3. 메서드 (기능)
//	기능: [주행하다.]를 출력하다
	void run() {
		System.out.println("바퀴개수: " + wheelNum);	// 필드 사용
		System.out.println("주행하다.");
	}
	
//	System.out.println("바퀴개수: " + wheelNum);	// 불가능
}

// 클래스 선언
class Tire {
	
	
}