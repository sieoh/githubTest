package javabook2.ch07.sec04;

// 실행 클래스
public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		
		sa.takeoff();
		
		sa.fly();
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode = SupersonicAirplane.NORMAL;
		sa.fly();
		
		sa.land();
		
		
	}

}
