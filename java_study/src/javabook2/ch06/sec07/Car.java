package javabook2.ch06.sec07;

public class Car {
	// 필드
	String model;
	String color;
	int maxSpeed;
	
	// 생성자
	public Car(String model) {
//		this(model,"검정색");
		this(model,"검정색",250);
	}
	public Car(String model,String color) {
		this.model = model;
		this.color = color;
	}
	public Car(String model,String color,int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	// 메서드
	void run() {
		System.out.println("주행하다");
	}
	void run1(String driverName) {
		System.out.println(driverName+"주행하다");
	}
	String run2(String driverName) {
		System.out.println("주행하다");
		return driverName;
	}

}
