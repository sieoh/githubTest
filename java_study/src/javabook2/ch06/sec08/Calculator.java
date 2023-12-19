package javabook2.ch06.sec08;

// 계산기 설계도: 라이브러리 클래스
// 기능: 켜기, 더하기, 나누기, 끄기
public class Calculator {
	// 필드
	// 생성자
	// 메서드
	
	// 켜기
	public void powerOn() {
		System.out.println("전원을 켭니다");
		System.out.println("디스플레이를 표시합니다");
		return;
	}
	// 나누기
	public int divide(int x, int y) {
		int result = x / y;
		return result;
	}
	// 더하기
	public int add(int x, int y) {
		int result = x + y;
		return result;
	}
	
	// 끄기
	public void powerOff() {
		System.out.println("전원을 끕니다");
	}
}
