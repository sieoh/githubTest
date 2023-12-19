package javabook2.ch06.sec14;

// 라이브러리 클래스
public class Car {
	// 필드(속성)
	private String model;
	private String color;
	private int speed = 0;
	private boolean stop = true;
	
	// 생성자
//	private Car(String model, String color) {
//		this.model = model;
//		this.color = color;
//	}
	
	// 메서드
	// Setter: [set변수명]으로 생성된 메서드
	// Getter: [get변수명] 또는 [is변수명]으로 생성된 메서드
	// 특징: 1. 필드명에 private 설정 / 2. 메서드 명에 public 설정

	// 속도
	public int getSpeed() {
		System.out.println("속도: "+ speed);
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed>0) {
			this.speed = speed;
		}
	}
	// 모델
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		if(model.equals("자전거")) {
			System.out.println("모델을 잘 못 설정했음");
		} else {
			this.model = model;
		}
	}
	// 컬러
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		if(color.equals("red")) {
			System.out.println("빨간차 안됨");
		} else if(color.equals("borwn")){
			System.out.println("갈색차 안됨");
		} else {
			this.color = color;
		}
	}
	// 정지여부
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	public boolean isStop() {
		return stop;
	}
	
}
