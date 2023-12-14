package javabook2.CH05.array;

public class ArrayCreate {
	
	//main 메서드
	public static void main(String[] args) {
		
		int[] iArr1 = null;						// 배열 선언 1
		int iArr2[] = {1,2,3};					// 배열 선언 2
		
		String[] sArr1=null;					// 1. null로 초기화
		String sArr2[]= {"홍길동","임꺽정"};	// 2. 값으로 초기화
		
//		3. new 연산자로 초기화
//		타입[] 변수명 = new 타입[길이];
//		int[] iArr = new int[2];				// 배열 선언	
		int[] iArr = new int[] {10,20};		// 배열 초기화(선언+할당)

		System.out.println(iArr[0]);
		System.out.println(iArr[1]);
		System.out.println("==============");
		
		iArr[0] = 30;							// 배열 값 할당
		iArr[1] = 40;
//		iArr[2] = 30;
		System.out.println(iArr[0]);
		System.out.println(iArr[1]);
		System.out.println("==============");
		
		printName();							// 함수 호출(사용)
	}
	
	public static void printName() {
		System.out.println("입력도 없고, 출력(반환)도 없는 함수입니다.");
	}
	
	
//***   메서드(함수) 선언(만들기)
		// void : 반환(리턴) 값이 없음.
//		리턴 타입 메서드명(타입 변수명1, 타입 변수명2){
//		리턴 타입 => void, int, ...등
//		[return 값]
//	}
	
	// 함수 형태 1 : 입력 X, 반환 X
	void add() {
		System.out.println("더하기");
	}
	
	// 함수 형태 2 : 입력 O, 반환 X
	void sum(int a, int b) {
		System.out.println("a 더하기 b");
	}
	
	// 함수 형태 3 : 입력 O, 반환 O
	int avg(int a, int b) {
		System.out.println("a와 b의 평균 구하기");
		return (a+b)/2;
	}
	
	
	

}
