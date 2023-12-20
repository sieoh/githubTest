package javabook2.ch07.sec05;
import javabook2.ch07.sec04.Airplane;
// 자식 클래스
// 경비행기
public class LightAircraft extends Airplane {
	// 필드
//	int passengerNum = 4;	// 승객수
	
	// 생성자
	public LightAircraft() {
		// 사용 불가(다른 패키지에 protected 가 선언된 필드이므로)
		System.out.println(this.passengerNum);
	}
	// 메서드
	void takeoff() {
		System.out.println("빨리 이륙하다");
	}
	
}
