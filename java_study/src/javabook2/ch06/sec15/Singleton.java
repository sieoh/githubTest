package javabook2.ch06.sec15;
// 라이브러리 클래스
public class Singleton {
	
//	1. [생성자]	외부에서 new 연산자로 생성자를 호출할 수 없도록 private 설정
//	2. [필드]	자신의 클래스 타입으로 정적 필드를 선언하고 private 설정 및 객체 생성
//	3. [메서드]	외부에서 호출할 수 있는 정적 getInstance()선언
	
	// 필드
	private static Singleton single = new Singleton();
	
	// 생성자
	private Singleton() {
		
	}
	
	// 메서드
	public static Singleton getInstance() {
		return single;
	}
	
}
