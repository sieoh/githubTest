package javabook2.ch06.sec10;

// 사람 실행 클래스
// 관계: 사람 [사용] 계산기
public class Preson {

	public static void main(String[] args) {
		
		// 정적 멤버 사용
		System.out.println(Calculator.pi);
		
		Calculator.getCircleArea(3);
		
		
		// 인스턴스 멤버 사용
		Calculator myCal = new Calculator();
		
		System.out.println(myCal.color);
		myCal.getInfo();
	}

}
