package javabook2.ch08.sec01;
// 인터페이스 선언(정의)
public interface RemoteControl {
	// 상수 (속성, 명사)
//	[public static final]은 생략 가능
	static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	// 인터페이스 선언에서 정의된 추상메서드는 구현클래스에서 재정의 한다
	// 추상 메서드 (기능, 동사)
	abstract void trunOn();
	
//	[public abstract]는 생략 가능
	abstract void trunOff();
	
	void setVolume(int Volume);
	
	// 디폴트 메서드 (기능, 동사)
	// 정적 메서드 (기능, 동사)
	
	
}
