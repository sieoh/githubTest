package javabook2.ch04;

public class ContinueExample {

	public static void main(String[] args) {
//		=======================================
//		for(int i=0;i<10;i++) {
//			
//			System.out.println(i);
////			만약, i 5가 되면 잠깐 멈춰서 이후 코드를 실행하지 않고
////			반복문의 앞으로 돌아가라.
//			if(i==5) {
//				continue;
//			}
//			System.out.println(i);
//		}
//		=========================================
//		[문제] 짝수일 때만 특정 코드를 실행하고 싶다.
		
		for(int i=0;i<10;i++) {
			// 실행될 코드
//			System.out.println(i);
			if(i%2==1) {				// 홀수인 경우,
				continue;				// 뒷 코드를 실행하지 않고 반복의 처음로 돌아가라
			}
			// 홀수인 경우 실행안될 코드
			System.out.println(i);
		}
		
	}

}
