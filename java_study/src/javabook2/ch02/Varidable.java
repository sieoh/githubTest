package javabook2.ch02;

public class Varidable {

	public static void main(String[] args) {
		// 주의사항!
		// 1. 변수명은 중복될 수 없다.(단, 재할당은 가능)
		// 2. 실수 타입은 연산시 오차가 있다.(부동 소수점 방식 오차)
		
		//타입 변수명;
		//변수명 = 값;
		//타입 변수명 = 값;
		int a;						// 변수 선언 = 공간을 할당
		a = 100;					// 변수 할당 = 값을 할당
		
		int b = 200;				// 변수 선언과 할당
		
		char c;						// 문자 타입 변수 선언
		c = 'a';					// 문자 타입 변수 할당
		char c1 = 'a';				
		
		short s = 2;
		long l = -10;
		
		float f1 = 0.1f;
		double d1 = 0.245;
		
		boolean b1 = true;
		b1 = false;
		boolean b2 = false;
		
		int x = 1;
		// 타입 변수병 = (값);
		boolean b3 = (x == 2);	//거짓
		System.out.println(b3);
		
		// 문자열 데이터 타입
		String s1 = "ab";
		
		// 이스케이프 문자
		String str1 = "\"안녕하세요?\"";
		String str2 = "반갑습니다.";
		String str3 = "안녕하세요?\s반갑습니다.";
		String str4 = "안녕하세요?\t반갑\s습니다.";
		String str5 = "안녕하세요?\n반갑습니다.";
		
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);


	}

}
