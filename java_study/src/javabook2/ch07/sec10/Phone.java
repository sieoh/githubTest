package javabook2.ch07.sec10;
// 부모 클래스
public abstract class Phone {
	//필드
	String owner;		// 소유자
	//생성자	(필드 초기화와 함께)
	Phone(String owner){
		this.owner=owner;
	}
	//메서드
	void trunOn() {
		System.out.println("전원을 켜다");
	}
	void trunOff() {
		System.out.println("전원을 끄다");
	}
	
}
