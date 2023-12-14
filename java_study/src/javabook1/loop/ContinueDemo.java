package javabook1.loop;

public class ContinueDemo {

	public static void main(String[] args) {
		// 문제: 다음과 같이 출력하도록 프로그램을 작성하시오 (Continue 문 사용)
//		출력 결과:
//		Coding Everybody0
//		Coding Everybody1
//		Coding Everybody2
//		Coding Everybody4
		for(int i=0;i<5;i++) {
			if(i==3) {
				continue;
			}
			System.out.println("Coding Everybody"+i);
		}
		
		
	}

}
