package javabook1.loop;

public class BreakDemo {

	public static void main(String[] args) {
		// [문제] 다음과 같이 출력하도록 프로그램을 수정하시오.(break문 사용)
//		출력 결과:
//		Coding Everybody 3
//		Coding Everybody 6
//		Coding Everybody 9
		
		for(int i=3;i<13;i+=3) {
			if(i==12) {
				break;
			}
			System.out.println("Coding Everybody "+ i);
			
		}
		

	}

}
