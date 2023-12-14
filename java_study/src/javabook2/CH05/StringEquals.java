package javabook2.CH05;

public class StringEquals {

	public static void main(String[] args) {
		// 기본 타입 값 비교
		int i1=1;				// 변수 초기화(선언+할당)
		int i2=2;
		
		if(i1==i2) {
			System.out.println("같다.");
		}
		if(i1!=i2) {
			System.out.println("같지않다");
		}
		
		// 참조 타입 값 비교
		String str1="홍길동";
		String str2="홍길동";
		String str3="임꺽정";
		
		// 번지수는 같지만 값이 같은지는 알수없음
		if(str1==str2) {				// 번지는 같다
			System.out.println("같다.");
		}
		if(str1!=str2) {
			System.out.println("같지않다");
		}
		System.out.println("=====================");
		// 번지수는 같지만 값이 같은지는 알수 없음
		if(str1==str3) {				// 번지는 같다
			System.out.println("같다.");
		}
		if(str1!=str3) {
			System.out.println("같지않다");
		}
		System.out.println("=====================");
		// new : 객체를 새로 생성 연산자
		String str4 = new String("홍길동");
		if(str1==str4) {				// 번지는 같다
			System.out.println("같다.");
		}
		if(str1!=str4) {
			System.out.println("같지않다");
		}
		System.out.println("=====================");
//		변수명.equals(값) => 참조 타입 변수의 값을 비교
		if(str1.equals(str4)) {				// 번지는 같다
			System.out.println("값이 같다.");
		} else {
			System.out.println("값이 같지않다");
		}
		System.out.println("=====================");
		String str5 = new String("홍길동");
		
		
	}

}
