package javabook1.loop;

public class WhileDemo {

	public static void main(String[] args) {
//		// 문제: Coding Everbody를  무한 반복해서 출려하시오.
//		System.out.println("문제1 ===============================");
//		while(true) {
//			System.out.println("Coding Everbody");
//		}
		System.out.println("문제2 ==============================");
		// 문제2: 다음과 같이 출력하는 프로그램을 작성하시오. (while 문)
//		출력: 
//		Coding Everbody0
//		Coding Everbody1
//		Coding Everbody2
//		Coding Everbody3
//		Coding Everbody4

		int i=0;
		while(i<5) {
			System.out.println("Coding Everbody" + i);
			i++;
		}
		
	}

}
