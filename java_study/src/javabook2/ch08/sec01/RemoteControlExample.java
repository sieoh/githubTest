package javabook2.ch08.sec01;
// 실행 클래스
public class RemoteControlExample {

	public static void main(String[] args) {
//		리모컨의 기능을 활용하여 tv를 켜다
//		=> 인터페이스의 메서드를 활용하여 클래스의 메서드를 수행한다
		
		RemoteControl rc = new Televsion();
		rc.trunOn();
		rc.trunOff();
		rc.setVolume(5);
		System.out.println("================");
		RemoteControl rc1 = new Radio();
		rc1.trunOn();
		rc1.trunOff();
		rc1.setVolume(4);
		
	}
}
