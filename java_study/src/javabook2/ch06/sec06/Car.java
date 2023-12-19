package javabook2.ch06.sec06;

public class Car {
	// 필드 초기화 방법 1: 직접 입력
	String company;
	String model;
	int year;
	
	// 생성자
	// 필드 초기화 방법 2: 생성자 사용
	public Car(String company, String model) {
		this.company = company;
		this.model = model;
	}
	public Car(String company) {
		this.company = company;
		
	}
	public Car(int year) {
		this.year = year;
	}
	
}
