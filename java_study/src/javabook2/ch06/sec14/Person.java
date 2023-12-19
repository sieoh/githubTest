package javabook2.ch06.sec14;

// 실행 클래스
public class Person {

	public static void main(String[] args) {
		
//		Car myCar = new Car("벤츠","검정색");	// 내차 출고
		Car myCar = new Car();
		

		myCar.setModel("벤츠");
//		myCar.setColor("red");
		myCar.setColor("black");
		myCar.setSpeed(10);
		myCar.setStop(false);

		System.out.println("모델: "+myCar.getModel());
		System.out.println("생상: "+myCar.getColor());
		System.out.println("속도: "+myCar.getSpeed());
		System.out.println("정지여부: "+myCar.isStop());
		
		
		
		System.out.println("================");
		
//		Car broCar = new Car("자전거","네발");	// 동생차 출고
		Car broCar = new Car();
		broCar.setModel("자전거");
		broCar.setStop(false);

		System.out.println("모델: "+broCar.getModel());
		System.out.println("생상: "+broCar.getColor());
		System.out.println("속도: "+broCar.getSpeed());
		System.out.println("정지여부: "+broCar.isStop());
		
	}

}
