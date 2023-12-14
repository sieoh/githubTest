package javabook2.ch04.sec_for;

public class ForStatement {

	public static void main(String[] args) {
//		System.out.println(0);
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		System.out.println(4);
//		System.out.println(5);
		
//		int i = 0;				// 변수를 선언과 할당을 한꺼번에 하는걸 초기화식이라고 한다
//		i = i + 1;				// 증감식
//		System.out.println(i);	
//		i = i + 1;
//		i++;
//		++i;
//		System.out.println(i);	
		for(int i=0;i<6;i++) {
			System.out.println(i);
		}
		System.out.println("=================");
		// 문제1: 숫자를 출력하려고 함.
		// 5 -> 4 -> 3 -> 2 -> 1 -> 0
		for(int i=5;i>=0;i--) {
			System.out.println(i);
		}
		System.out.println("=================");
		// 문제2: 다음과 같이 숫자를 출력하시오.
		// 0 2 4 6 8
		for(int i=0;i<10;i=i+2) {
			System.out.println(i);
		}
		System.out.println("=================");
		// 문제3 : 1부터 5까지 합을 구하는 프로그램을 작성하시오.
		int sum = 0;
		for(int i=1;i<6;i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
