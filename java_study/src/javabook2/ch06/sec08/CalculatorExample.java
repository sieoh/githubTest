package javabook2.ch06.sec08;

// 계산기 예제 설계도: 실행 클래스
public class CalculatorExample {
	// 필드
	static String country = "한국";
	
	// 메서드
	public static void main(String[] args) {
		Calculator myCal = new Calculator();
		myCal.powerOn();
		
		int result = myCal.divide(12, 2);
		System.out.println(result);
		
		// 20 더하기 7
		int result1 = myCal.add(20, 7);
		System.out.println(result1);

		myCal.powerOff();
	}

}
