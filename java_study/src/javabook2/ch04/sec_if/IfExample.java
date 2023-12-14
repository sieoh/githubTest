package javabook2.ch04.sec_if;

public class IfExample {

	public static void main(String[] args) {
		
		// 제어문(조건문) : if 문
//		int score;			// 변수 선언
//		score = 90;			// 변수 할당
		
//		if(score>=90) {
//			System.out.println("A등급");
//		}
//		
//		if(score>=80 && score<90) {
//			System.out.println("B등급");
//		}
//		
//		if(score>=70 && score<80) {
//			System.out.println("C등급");
//		}
		
//		System.out.println("===================");
//		
//		if(score>=90) {
//			System.out.println("자동차를 선물로 받음");
//		} else {
//			System.out.println("어머니께 용돈 100만원을 드림");
//		}
		
		System.out.println("===================");
		int score;			// 변수 선언
		score = 89;			// 변수 할당
		
		
		if(score>=90) {
			System.out.println("자동차를 선물로 받음");
		} else if(score>=80) {
			System.out.println("핸드폰을 선물로 받음");
		} else if(score>=30) {
			System.out.println("맛있는 음식을 사줄께");
		} else {
			System.out.println("어머니께 용돈을 100만원 드림");
		}
		// else if 는 여려개 사용 가능
		// else 는 위의 모든 조건이 다 거짓일 경우만 실행
		
	}

}
