package javabook2.ch04.sec_switch;

public class SwitchDice {

	public static void main(String[] args) {
		// 문제: 주사위 프로그램 구현
		//		-> 임의의(1 부터 6 까지) 정수 출력(random)
		// Math.random(): 랜덤 실수 생성
		// 		-> 실수 생성 범위: 0.0 <= [실수] < 1.0
		// (Math.random()*[최대 값]+[최소 값]);
		
		int num = (int)(Math.random()*6+1);
//		System.out.println(num);
		System.out.println("던져진 주사위 값: ");
		switch(num) {
			case 1:
				System.out.println("1");
				break;
			case 2:
				System.out.println("2");
				break;
			case 3:
				System.out.println("3");
				break;
			case 4:
				System.out.println("4");
				break;
			case 5:
				System.out.println("5");
				break;
			default:
				System.out.println("6");
				break;
		}
	}
}
