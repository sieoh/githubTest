package javabook2.ch07.sec02;

// 스마트폰 예제 실행 클래스
public class SmartPhoneExample {
	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("Iphone16","SpaceBlue","내사진","naver.com","김동률-감사");
		
		myPhone.powerOn();
		
		System.out.println(myPhone.model);
		System.out.println(myPhone.color);
		
		System.out.println(myPhone.image);
		myPhone.listenMusic("이적-왼손잡이");
		
		myPhone.sendVoice("잘 지내니? 나 kenneth야");
		
		myPhone.powerOff();
	}

}
