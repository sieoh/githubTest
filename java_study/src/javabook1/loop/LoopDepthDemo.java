package javabook1.loop;

public class LoopDepthDemo {

	public static void main(String[] args) {
		// 문제: 구구단 2단을 출력하는 프로그램을 작성하시오.
		//for 문
//		for(int i=1;i<10;i++) {
//			System.out.println("2 x "+i+" = "+i*2);
//		}
//		//while 문
//		System.out.println("=======================");
//		int j=1;
//		while(j<10) {
//			System.out.println("2 x "+j+" = "+j*2);
//			j++;
//		}
//		System.out.println("=======================");
		// 문제2: 2단부터 9단까지 출력하는 프로그램을 작성하시오
		for(int i=2;i<10;i++) {
			System.out.println(i+"단");
			System.out.println("===========");
			for(int j=1;j<10;j++) {
				System.out.println(i+" x "+j+" = "+i*j);
			}
			System.out.println("===========");
		}
		System.out.println("[while 문] ==============");
		int q=2;
		int w=1;
		while(q<10) {
			System.out.println(q+"단");
			System.out.println("===========");
			while(w<10) {
				System.out.println(q+" x "+w+" = "+q*w);
				w++;
			}
			System.out.println("===========");
			q++;
			w = 1;
		}
		
	}

}
