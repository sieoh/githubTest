package javabook2.ch06.sec07;

public class CarExample {

	public static void main(String[] args) {
//		Car myCar = new Car();	// 기본 생성자 호출
		System.out.println("내 차 ===================");
		Car myCar = new Car("현대");	// 생성자 호출
		System.out.println(myCar.model);
		
		myCar.run();
		myCar.run1("홍길동");
		String name;					
//		name = myCar.run1("홍길동");	// 반환 값 사용 불가
		name = myCar.run2("강호동");	// 반환값 사용 가능
		
		
		
		System.out.println("동생 차 ===================");
		Car broCar = new Car("현대","흰색");	// 생성자 호출
		System.out.println(broCar.model);
		System.out.println(broCar.color);
		
		System.out.println("엄마 차 ===================");
		Car momCar = new Car("현대","빨간색",300);	// 생성자 호출
//		System.out.println(momCar.model);
//		System.out.println(momCar.color);
//		System.out.println(momCar.maxSpeed);
	}
}
