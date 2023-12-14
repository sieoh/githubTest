package javabook1.loop;

public class ForDemo {

	public static void main(String[] args) {
		// 문제: 다음과 같이 출력되는 프로그램을 작성하시오. (for 문 사용)
//		출력 결과: 
//		Coding Everybody 3
//		Coding Everybody 6
//		Coding Everybody 9
//		Coding Everybody 12
//		===================================================
		System.out.println("1번 =====================");
		for(int i=1;i<14;i++) {
			if(i%3==0) {
				System.out.println("Coding Everybody " + i);
			}
		}
		System.out.println("2번 ======================");
		for(int t=3;t<13;t+=3) {
			System.out.println("Coding Everybody " + t);
		}
		
	}

}
