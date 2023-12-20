package javabook2.ch07.sec05;

import javabook2.ch07.sec04.Airplane;

public class LightAircraftExample {

	public static void main(String[] args) {
		Airplane ap = new Airplane();
		// 사용 불가(다른 패키지에 protected 가 선언된 필드이므로)
//		System.out.println(ap.passengerNum);
		
		LightAircraft la = new LightAircraft();
		la.takeoff();
	}

}
