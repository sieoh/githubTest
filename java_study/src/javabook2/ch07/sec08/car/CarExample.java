package javabook2.ch07.sec08.car;
// 실행 클래스
public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();
		
		System.out.println("===============");
		myCar.tire = new HankookTire();
		myCar.run();
		System.out.println("===============");
		myCar.tire = new kumgoTire();
		myCar.run();
	}

}
