package javabook2.ch04.sec_while;

public class WhileStatement {

	public static void main(String[] args) {
		// 문제: 숫자를 0부터 9까지 출력하시오

		System.out.println("====1.for문 사용하지 않고 작성====");
		System.out.println(0);
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		
		// 문제: for 문 사용하여 작성
		System.out.println("====2.for 사용하여 작성====");
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
		
		// 문제 break를 사용해서 0~7까지 출력하도록 수정하기
		System.out.println("====\n\n3.break를 사용해서 0~7까지 출력하도록 수정\n\n====");
		for(int i=0;i<10;i++) {
			System.out.println(i);
			if(i==7) {
				break;
			}
		}
		System.out.println("====\n\n while 문 \n\n====");
		// while 문
		int i=0;
		while(i<10) {
			System.out.println(i);
//			i=11;				// 반복 종료 코드 => 증감식;
			i++;
		}
		
		System.out.println("====\n\n 문제: break를 사용하여 0부터 5까지 출력 \n\n====");
		int u=0;
		while(u<10) {
			System.out.println(u);
			u++;
			if(u==6) {
				break;
			}
		}
		
		
	}
}
