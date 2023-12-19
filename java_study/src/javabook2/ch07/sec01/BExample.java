package javabook2.ch07.sec01;

public class BExample {

	public static void main(String[] args) {
		B b = new B();
		
		b.field2 = "자식 필드";
		b.method2();			// 자식 메서드
		
		b.field1 = 1234; 		// 부모 필드
		b.method1();			// 부모 메서드
		
	}

}
