package javabook2.ch07.sec04;
// 자식 클래스
public class SupersonicAirplane extends Airplane {
	// 필드
	static final int NORMAL = 1;		// 상수
	static final int SUPERSONIC = 2;	// 상수
	public int flyMode = NORMAL;
	// 생성자
	
	// 메서드
	// 초음속 비행하다
	@Override	// 부모 대신 자식을 재정의 한다
	void fly () {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행하다");
		} else {
//			System.out.println("비행하다");
			super.fly();
		}
		
		
	}
	
	
	
}
