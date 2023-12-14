package javabook2.CH05.memory;

// 프로세스(process): 실행중인 프로그램
// 스레드(thread): 프로세스 내에서 실제 작업을 수행하는 주체

// 1. 메소드 영역에 클래스가 저장
public class Memory {

	// 2. main 스레드 생성
	public static void main(String[] args) {

		// 3. 스택 영역에 기본 타입 변수 저장
		char v1 = 'A';

		if (v1 == 'A') {
			int v2 = 100;
			double v3 = 3.14;
		}
		boolean v4 = true;

		// 4. 스택 영역에 참조 타입 변수 저장
//		참조타입: String(문자열), Class, Array(배열)
		String str1 = "Computer"; // 5. 힙 영역에 참조 타입 변수 값("Computer") 저장
		String ste2 = null;

		int v5 = 3;
		int v6 = 2;
		int sum = add(3, 2);
		System.out.println(sum);

	}

	// 2. add 스레드 생성
	// 덧셈 메서드: a와 b값을 입력받아 a+b값을 반환
	public static int add(int a, int b) {
		return a + b;

	}

}
