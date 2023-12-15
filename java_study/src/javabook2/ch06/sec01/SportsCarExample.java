package javabook2.ch06.sec01;

// 실행 클래스
public class SportsCarExample {

	public static void main(String[] args) {
		// 생성자를 사용하여 객체 생성
//		SportsCar 설계도에 따라 내차(myCar)를 생성
		
		SportsCar myCar = new SportsCar();	// 생성자 사용
		
		// 다른 클래스에서 사용하는 경우
//		내 차의 바퀴개수를 출력. 내 차의 기능인 주행을 수행
		System.out.println(myCar.wheelNum);
		myCar.run();			// 메서드 호출(사용)
		
	}
}
