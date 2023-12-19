package javabook2.ch07.sec02;

// 전화기 라이브러리 클래스(부모)
public class Phone {
	//필드(속성)
	String model;
	String color;
	
	//[부모]생성자 => super()
	Phone(){
	}
	Phone(String model, String color){
		this.model = model;
		this.color = color;
	}
	
	//메서드(기능)
	void powerOn() {
		System.out.println("전원 켜다");
	}
	void powerOff() {
		System.out.println("전원 끄다");
	}
	void sendVoice(String msg) {
		System.out.println("송신메세지: "+msg);
	}
	void receiveVoice() {
		System.out.println("음성 수신하다");
	}
	
	
}
